package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

func main() {
	scanner := bufio.NewScanner(os.Stdin)

	var count int
	fmt.Scan(&count)
	var result []int

	for i := 0; i < count; i++ {
		scanner.Scan()
		s := scanner.Text()
		ss := strings.Split(s, " ")
		n, _ := strconv.Atoi(ss[1])
		result = append(result, pisanoPeriod(n))
	}

	for i, v := range result {
		fmt.Println(i+1, v)
	}
}

/**
k(2**n) = 3×2**(n-1)
k(5**n) = 4×5**n
k(2×5**n) = 6n
n > 2라면, k(10**n) = 15×10**(n-1)
 */
func pisanoPeriod(n int) int {
	f1 := 0
	f2 := 1
	var result int
	for i := 1; i <= n*n-1; i++ {
		prevF1 := f1
		//f2 %= n
		f1 = f2
		f2 = (prevF1 + f2) % n
		if f1 == 0 && f2 == 1 {
			result = i
			break
		}
	}
	return result
}

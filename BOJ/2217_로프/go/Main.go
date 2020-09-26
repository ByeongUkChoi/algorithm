package main

import (
	"bufio"
	"fmt"
	"os"
	"sort"
	"strconv"
)

func main() {
	scanner := bufio.NewScanner(os.Stdin)
	scanner.Scan()
	count, _ := strconv.Atoi(scanner.Text())
	var weights []int
	for i := 0; i < count; i++ {
		scanner.Scan()
		n, _ := strconv.Atoi(scanner.Text())
		weights = append(weights, n)
	}
	sort.Ints(weights)
	max := 0
	for i := 0; i < count; i++ {
		if weights[i] * (count-i) > max {
			max = weights[i] * (count-i)
		}
	}
	fmt.Print(max)
}


package main

import (
	"fmt"
	"strconv"
)

func main() {
	var n int
	fmt.Scan(&n)
	result := result(n)
	fmt.Print(result)
}
func result(n int) int {
	if n <= 10 {
		return 0
	}
	for i := 10; i < n; i++ {
		strNum := strconv.Itoa(i)
		sum := i
		for j := 0; j < len(strNum); j++ {
			k, _ := strconv.Atoi(string(strNum[j]))
			sum += k
		}
		if sum == n {
			return i
		}
	}
	return 0
}


package main

import "fmt"

func main() {
	var n, k int
	fmt.Scan(&n, &k)
	var min int
	if n - k < k {
		min = n - k
	} else {
		min = k
	}
	result := multipleDecreasing(n, min) / fact(min)
	fmt.Print(result)
}
func multipleDecreasing(n int, count int) int {
	var result int = 1
	for i := 0; i < count; i++ {
		result *= n - i
	}
	return result
}
func fact(n int) int {
	if n > 1 {
		return fact(n - 1) * n
	} else {
		return 1
	}
}
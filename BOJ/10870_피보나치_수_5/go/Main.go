package main

import "fmt"

func main() {
	var n int
	fmt.Scan(&n)
	result := fibonacci(n)
	fmt.Print(result)
}
func fibonacci(n int) int{
	if n <= 1 {
		return n
	}
	return fibonacci(n - 1) + fibonacci(n - 2)
}


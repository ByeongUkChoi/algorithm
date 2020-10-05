package main

import "fmt"

func main() {

	var n int
	fmt.Scan(&n)
	if n <= 1 {
		fmt.Print(n)
		return
	}
	fibonacci := make([]int, n)
	fibonacci[1] = 1
	for i := 2; i < n; i++ {
		fibonacci[i] = fibonacci[i-1] + fibonacci[i-2]
	}
	result := fibonacci[n-1] + fibonacci[n-2]
	fmt.Print(result)
}

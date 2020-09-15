package main

import "fmt"

func main() {
	var n int
	fmt.Scan(&n);
	result := minBasket(n)
	fmt.Print(result)
}

func minBasket(n int) int {
	var leftWeight int
	// 3키로로 0부터 빼봄
	for i := 0; i <= n / 3; i++ {
		leftWeight = n - i * 3
		if leftWeight % 5 == 0 {
			return i + leftWeight / 5
		}
	}
	return -1
}


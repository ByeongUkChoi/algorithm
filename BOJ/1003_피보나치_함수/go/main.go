package main

import "fmt"

func main() {
	// 피보나치수 배열 만들기 0부터 40까지
	var fibonacciArr [41]int

	for i := 0; i <= 40 ; i++ {
		if i <= 1 {
			fibonacciArr[i] = i
		} else {
			fibonacciArr[i] = fibonacciArr[i - 1] + fibonacciArr[i - 2]
		}
	}
	var count int
	fmt.Scan(&count)

	// 크기가 count인 슬라이스 생성
	inputs := make([]int, count)
	for i := 0; i < count; i++ {
		fmt.Scan(&inputs[i])
	}

	for i := 0; i < count; i++ {
		if inputs[i] == 0 {
			fmt.Println("1 0")
		} else {
			fmt.Println(fibonacciArr[inputs[i] - 1], fibonacciArr[inputs[i]])
		}
	}
}


package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
)

/**
1 1
2 2
3 4
4 7
5 13
*/
func main() {
	scanner := bufio.NewScanner(os.Stdin)
	scanner.Scan()
	count, _ := strconv.Atoi(scanner.Text())
	maxNum := 0
	var inputs []int
	// 입력값 저장하고 입력값 중 최대값 구하기
	for i := 0; i < count; i++ {
		scanner.Scan()
		n, _ := strconv.Atoi(scanner.Text())
		if n > maxNum {
			maxNum = n
		}
		inputs = append(inputs, n)
	}
	// 최대값까지 답 배열 만들기
	var result []int
	result = append(result, 1, 1, 2)
	for i := 3; i <= maxNum; i++ {
		result = append(result, result[i-1] + result[i-2] + result[i-3])
	}
	// 정답 출력
	for i := 0; i < count; i++ {
		fmt.Println(result[inputs[i]])
	}
}

// 2번째 방법
//func main() {
//	scanner := bufio.NewScanner(os.Stdin)
//	scanner.Scan()
//	count, _ := strconv.Atoi(scanner.Text())
//	var result []int
//	for i := 0; i < count; i++ {
//		scanner.Scan()
//		n, _ := strconv.Atoi(scanner.Text())
//		result = append(result, plusOneTwoThree(n))
//	}
//
//	for i := 0; i < count; i++ {
//		fmt.Println(result[i])
//	}
//
//}
//func plusOneTwoThree(n int) int {
//	if n == 0 || n == 1 {
//		return 1
//	} else if n == 2 {
//		return 2
//	}
//	return plusOneTwoThree(n - 1) + plusOneTwoThree(n - 2) + plusOneTwoThree(n - 3)
//}


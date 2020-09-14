package main

import "fmt"

func main() {

	var n int
	fmt.Scan(&n)

	i := num(n)
	fmt.Println(i)
}

func num(n int) int {
	// 1 ~ 99
	if n < 100 {
		return n
	} else if n == 1000 {
		return 144
	}
	result := 99
	for i := 100; i <= n; i++ {

		// 3자리수 구하기
		var nums [3]int
		tmp := i
		for j := 0; j < 3; j++ {
			nums[j] = tmp % 10;
			tmp /= 10
		}
		if nums[0] - nums[1] == nums[1] - nums[2] {
			result++
		}
	}
	return result
}


package main

import "fmt"

func main() {

	var cnt, total int
	var coins []int
	var coin int
	fmt.Scan(&cnt, &total)
	for i := 0; i < cnt; i++ {
		fmt.Scan(&coin)
		coins = append(coins, coin)
	}
	result := 0
	sum := 0
	for i := cnt - 1; i >= 0; {
		left := total - sum
		if left >= coins[i] {
			sum += coins[i]
			result++
		} else {
			i--
		}
	}
	fmt.Println(result)
}


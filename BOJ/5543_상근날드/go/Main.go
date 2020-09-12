package main

import "fmt"

func main() {
	var buggerPrices [3]int
	var drinkPrices [2]int
	for i := 0; i < 3; i++ {
		fmt.Scan(&buggerPrices[i])
	}
	for i := 0; i < 2; i++ {
		fmt.Scan(&drinkPrices[i])
	}

	minSetPrice := Min(buggerPrices[:]) + Min(drinkPrices[:]) - 50
	fmt.Println(minSetPrice)
}

func Min(values []int) int{
	min := values[0]
	for _, v := range values {
		if v < min {
			min = v
		}
	}
	return min
}


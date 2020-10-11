package main

import "fmt"

func main() {

	var price int
	fmt.Scan(&price)
	value := 1000 - price

	var money = []int{500,100,50,10,5,1}

	result := 0
	for _, v := range money {
		for value >= v {
			result++
			value -= v
		}
	}

	fmt.Print(result)
}

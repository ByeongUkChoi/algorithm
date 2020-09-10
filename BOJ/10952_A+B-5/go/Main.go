package main

import "fmt"

func main() {
	var results []int
	for i := 0; ; i++ {
		var a, b int
		fmt.Scan(&a, &b)
		if a == 0 && b == 0 {
			break
		}
		results = append(results, a + b)
	}

	for _, i2 := range results {
		fmt.Println(i2)
	}
}

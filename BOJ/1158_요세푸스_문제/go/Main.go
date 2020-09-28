package main

import "fmt"

func main() {
	var n, k int
	fmt.Scan(&n, &k)

	var inputs []int
	for i := 1; i <= n; i++ {
		inputs = append(inputs, i)
	}
	var result []int
	var pop int
	for i := 0; len(inputs) > 0; i++ {
		pop = inputs[0]
		inputs = inputs[1:]
		if (i + 1) % k == 0 {
			result = append(result, pop)
		} else {
			inputs = append(inputs, pop)
		}
	}
	fmt.Print("<",result[0])
	for i := 1; i < len(result); i++ {
		fmt.Print(", ",result[i])
	}
	fmt.Print(">")
}


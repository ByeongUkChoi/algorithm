package main

import "fmt"

func main() {
	var n int
	var str string
	fmt.Scan(&n)
	fmt.Scan(&str)
	// S = 83, L = 76
	result := 1		// 맨 처음 + 맨 끝
	isCoupleSeat := true
	hasCoupleSeat := false
	for i := 0; i < n - 1; i++ {
		if str[i] == 83 {
			result++
		} else if str[i] == 76 {
			hasCoupleSeat = true
			if str[i + 1] == 76 {
				if isCoupleSeat {
					isCoupleSeat = false
				} else {
					isCoupleSeat = true
					result++
				}
			} else {
				result++
				isCoupleSeat = true
			}
		}
	}
	if hasCoupleSeat {
		result++
	}
	fmt.Print(result)
}


package main

import (
	"fmt"
)

func main() {
	var t int
	fmt.Scan(&t)

	timers := [3]int{5*60, 1*60, 10}
	var result [3]int

	for i, timer := range timers {
        result[i] = t / timer
        t %= timer
	}

	if t > 0 {
		fmt.Println(-1)
		return
	}

    for _, v := range result {
        fmt.Print(v, " ")
    }
}

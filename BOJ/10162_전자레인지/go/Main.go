package main

import (
	"fmt"
	"strings"
)

func main() {
	var t int
	fmt.Scan(&t)

	timers := [3]int{5*60, 1*60, 10}
	var result [3]int

	for i, timer := range timers {
		for timer <= t{
			t -= timer
			result[i]++
		}
	}

	if t > 0 {
		fmt.Println(-1)
		return
	}

	r := strings.Trim(strings.Join(strings.Fields(fmt.Sprint(result)), " "), "[]")
	fmt.Print(r)
}


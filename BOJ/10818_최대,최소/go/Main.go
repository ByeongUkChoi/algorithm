package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	var n int
	fmt.Scan(&n)

	min := 1000000
	max := -1000000
	var input int

	r := bufio.NewReader(os.Stdin)
	for i := 0; i < n; i = i + 1 {
		fmt.Fscan(r, &input)
			if input > max {
				max = input
			}
			if input < min {
				min = input
			}
	}
	fmt.Print(min, max)
}

package main

import (
	"fmt"
	"os"
)

func main() {
	max := 0
	maxIndex := 1
	for i := 1; i <= 9; i = i + 1 {
		var input int
		fmt.Fscan(os.Stdin, &input)
		if input > max {
			max = input
			maxIndex = i
		}
	}
	fmt.Println(max)
	fmt.Println(maxIndex)
}

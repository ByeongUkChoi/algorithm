package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
)

func main() {
	scanner := bufio.NewScanner(os.Stdin)
	var count int
	var stack []int
	total := 0
	fmt.Scan(&count)
	for i := 0; i < count; i++ {
		scanner.Scan()
		input, _ := strconv.Atoi(scanner.Text())
		if input == 0 {
			lastIndex := len(stack)-1
			total -= stack[lastIndex]
			stack = stack[:lastIndex]
		} else {
			stack = append(stack, input)
			total += input
		}
	}
	fmt.Print(total)
}


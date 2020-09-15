package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	scanner := bufio.NewScanner(os.Stdin)
	var inputs []string
	tmp := ""
	for scanner.Scan() {
		input := scanner.Text()
		if input == "." {
			break
		}
		tmp += input
		if input[len(input)-1:] == "." {
			inputs = append(inputs, tmp)
			tmp = ""
		}
	}
	for _, input := range inputs {
		if checkBalance(input) {
			fmt.Println("yes")
		} else {
			fmt.Println("no")
		}

	}
}

func checkBalance(str string) bool {
	var stack []string

	for i := 0; i < len(str); i++ {
		switch str[i:i + 1] {
		case "(":
			fallthrough
		case "[":
			stack = append(stack, str[i:i+1])
		case ")":
			if len(stack) == 0 || stack[len(stack)-1] != "(" {
				return false
			}
			stack = stack[:len(stack)-1]
		case "]":
			if len(stack) == 0 || stack[len(stack)-1] != "[" {
				return false
			}
			stack = stack[:len(stack)-1]
		}
	}

	return len(stack) == 0
}

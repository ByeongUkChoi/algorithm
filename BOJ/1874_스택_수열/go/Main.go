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
	var array []int
	fmt.Scan(&count)
	for i := 0; i < count; i++ {
		scanner.Scan()
		input, _ := strconv.Atoi(scanner.Text())
		array = append(array, input)
	}
	result := stackSequence(array)
	if result == nil {
		fmt.Println("NO")
		return
	}
	for _, v := range result {
		fmt.Println(v)
	}

}
func stackSequence(array []int) []string {
	n := 1
	var stack []int
	var result []string
	for _, v := range array {
		for n <= v {
			stack = append(stack, n);
			result = append(result, "+")
			n++
		}
		for i := 0; i < len(stack); i++ {
			lastElement := stack[len(stack)-1]
			stack = stack[:len(stack)-1]
			result = append(result, "-")
			if lastElement == v {
				break
			} else if lastElement < v {
				return nil
			}
		}

	}
	return result
}


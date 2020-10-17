package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

func main() {
	scanner := bufio.NewScanner(os.Stdin)
	scanner.Scan()
	n, _ := strconv.Atoi(scanner.Text())
	scanner.Scan()
	var people []int
	for _, v := range strings.Split(scanner.Text(), " ") {
		intV, _ := strconv.Atoi(v)
		people = append(people, intV)
	}
	var result []int
	for i := n - 1; i >= 0; i-- {
		result = insert(result, i + 1, people[i])
	}
	for _, v := range result {
		fmt.Print(v, " ")
	}
}
func insert(array []int, element int, index int) []int {
	result := append(array, element)
	copy(result[index+1:], result[index:])
	result[index] = element
	return result
}
//func insert(array []int, element int, i int) []int {
//	return append(array[:i], append([]int{element}, array[i:]...)...)
//}


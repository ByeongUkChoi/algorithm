package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
)

func main() {
	scanner := bufio.NewScanner(os.Stdin)
	scanner.Scan()
	n, _ := strconv.Atoi(scanner.Text())
	var score []int
	for i := 0; i < n; i++ {
		scanner.Scan()
		s, _ := strconv.Atoi(scanner.Text())
		score = append(score, s)

	}
	result := 0
	for i := n - 2; i >= 0; i-- {
		for score[i] >= score[i + 1] {
			result++
			score[i]--
		}
	}
	fmt.Print(result)
}


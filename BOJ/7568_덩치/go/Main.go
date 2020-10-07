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
	var n int
	fmt.Scan(&n)
	var input = make([][2]int, n)

	for i := 0; i < n; i++ {
		scanner.Scan()
		s := strings.Split(scanner.Text(), " ")
		input[i][0], _ = strconv.Atoi(s[0])
		input[i][1], _ = strconv.Atoi(s[1])
	}

	for i, v := range input {
		rank := 1
		for j := 0; j < n; j++ {
			if i == j {
				continue
			}
			if v[0] < input[j][0] && v[1] < input[j][1] {
				rank++
			}
		}
		fmt.Print(rank, " ")
	}
}


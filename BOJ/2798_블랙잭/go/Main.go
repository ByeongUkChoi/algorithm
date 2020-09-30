package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

func main() {

	var n, m int
	fmt.Scan(&n, &m)
	cards := make([]int, n)

	scanner := bufio.NewScanner(os.Stdin)
	scanner.Scan()
	text := scanner.Text()
	for i, v := range strings.Split(text, " ") {
		cards[i], _ = strconv.Atoi(v)
	}

	max := 0
	for i := 0; i < n; i++ {
		for j := i + 1; j < n; j++ {
			for k := j + 1; k < n; k++ {
				tmpSum := cards[i] + cards[j] + cards[k]
				if tmpSum <= m && tmpSum > max{
					max = tmpSum
				}
			}
		}
	}
	fmt.Print(max)
}


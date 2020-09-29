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
	var count int
	fmt.Scan(&count)
	var paths [][]int
	paths = make([][]int, count)
	for i := 0; i < count; i++ {
		scanner.Scan()
		input := scanner.Text()
		inputIntSlice := strings.Split(input, " ")
		for _, v := range inputIntSlice {
			element, _ := strconv.Atoi(v)
			paths[i] = append(paths[i], element)
		}
	}
	max := 0
	for i := 1; i < count; i++ {
		for j := 0; j <= i; j++ {
			if j == 0 {				// 맨 왼쪽
				paths[i][j] += paths[i-1][j]
			} else if j == i {		// 맨 오른쪽
				paths[i][j] += paths[i-1][i-1]
			} else {
				if paths[i-1][j-1] > paths[i-1][j] {
					paths[i][j] += paths[i-1][j-1]
				} else {
					paths[i][j] += paths[i-1][j]
				}
			}
			if i + 1 == count {
				if paths[i][j] > max {
					max = paths[i][j]
				}
			}
		}
	}
	fmt.Print(max)
}


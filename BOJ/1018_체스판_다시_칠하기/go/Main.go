package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	scanner := bufio.NewScanner(os.Stdin)

	var b = []string {
		"BWBWBWBW",
		"WBWBWBWB",
		"BWBWBWBW",
		"WBWBWBWB",
		"BWBWBWBW",
		"WBWBWBWB",
		"BWBWBWBW",
		"WBWBWBWB",
	}
	var w = []string {
		"WBWBWBWB",
		"BWBWBWBW",
		"WBWBWBWB",
		"BWBWBWBW",
		"WBWBWBWB",
		"BWBWBWBW",
		"WBWBWBWB",
		"BWBWBWBW",
	}

	var n, m int
	fmt.Scan(&n, &m)

	var resultB [][]int
	var resultW [][]int
	resultB = make([][]int, n - 8 + 1)
	resultW = make([][]int, n - 8 + 1)
	for i := 0; i <= n - 8; i++ {
		resultB[i] = make([]int, m - 8 + 1)
		resultW[i] = make([]int, m - 8 + 1)
	}

	var square []string
	for i := 0; i < n; i++ {
		scanner.Scan()
		square = append(square, scanner.Text())
	}

	for i := 0; i <= n - 8; i++ {
		for j := 0; j <= m - 8; j++ {
			for k := 0; k < 8; k++ {
				for l := 0; l < 8; l++ {
					if b[k][l] != square[i + k][j + l] {
						resultB[i][j]++
					}
					if w[k][l] != square[i + k][j + l] {
						resultW[i][j]++
					}
				}
			}
		}
	}
	min := 32
	for i := 0; i <= n - 8; i++ {
		for j := 0; j <= m - 8; j++ {
			if min > resultB[i][j] {
				min = resultB[i][j]
			}
			if min > resultW[i][j] {
				min = resultW[i][j]
			}
		}
	}
	fmt.Println(min)
}


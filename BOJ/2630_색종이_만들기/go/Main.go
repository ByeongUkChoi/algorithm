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

	var papers [][]int
	papers = make([][]int, n)

	for i := 0; i < n; i++ {
		scanner.Scan()
		papers[i] = make([]int, n)
		for j, v := range strings.Split(scanner.Text(), " "){
			papers[i][j], _ = strconv.Atoi(v)
		}
	}
	zeroSquare, oneSquere := countSquare(papers)

	fmt.Println(zeroSquare)
	fmt.Println(oneSquere)
}
func countSquare(square [][]int) (zeroSquare int, oneSquare int) {
	length := len(square)
	if length == 1 {
		return 1 - square[0][0], square[0][0]
	}
	var oneQuadrant [][]int
	var twoQuadrant [][]int
	var threeQuadrant [][]int
	var fourQuadrant [][]int
	oneQuadrant = make([][]int, length/2)
	twoQuadrant = make([][]int, length/2)
	threeQuadrant = make([][]int, length/2)
	fourQuadrant = make([][]int, length/2)

	var sum int
	for i, x := range square {
		for _, y := range x {
			sum += y
		}
		// 1,2 사분면
		if i < length / 2 {
			oneQuadrant[i] = make([]int, length/2)
			twoQuadrant[i] = make([]int, length/2)
			oneQuadrant[i] = x[length/2:]
			twoQuadrant[i] = x[:length/2]
		} else {	// 3, 4 사분면
			threeQuadrant[i-length/2] = make([]int, length/2)
			fourQuadrant[i-length/2] = make([]int, length/2)
			threeQuadrant[i-length/2] = x[:length/2]
			fourQuadrant[i-length/2] = x[length/2:]
		}
	}
	if sum == length * length {
		return 0, 1
	} else if sum == 0 {
		return 1, 0
	}
	z1, o1 := countSquare(oneQuadrant)
	z2, o2 := countSquare(twoQuadrant)
	z3, o3 := countSquare(threeQuadrant)
	z4, o4 := countSquare(fourQuadrant)

	zeroSquare = z1 + z2 + z3 + z4
	oneSquare = o1 + o2 + o3 + o4
	return
}


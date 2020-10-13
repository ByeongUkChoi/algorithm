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

	var image [][]int
	image = make([][]int, n)

	for i := 0; i < n; i++ {
		scanner.Scan()
		image[i] = make([]int, n)
		for j, v := range strings.Split(scanner.Text(), ""){
			image[i][j], _ = strconv.Atoi(v)
		}
	}

	fmt.Println(compress(image))
}
func compress(image [][]int) string {
	length := len(image)

	if length == 1 {
		return strconv.Itoa(image[0][0])
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
	for i, x := range image {
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
		return strconv.Itoa(1)
	} else if sum == 0 {
		return strconv.Itoa(0)
	}
	return "(" + compress(twoQuadrant) + compress(oneQuadrant) + compress(threeQuadrant) + compress(fourQuadrant) + ")"
}


package main

import (
	"bufio"
	"fmt"
	"os"
	"sort"
	"strconv"
	"strings"
)

func main() {

	var scanner = bufio.NewScanner(os.Stdin)
	scanner.Scan()
	count, _ := strconv.Atoi(scanner.Text())
	var times [][]int
	for i := 0; i < count; i++ {
		scanner.Scan()
		s := strings.Split(scanner.Text(), " ")
		var a, b int
		a, _ = strconv.Atoi(s[0])
		b, _ = strconv.Atoi(s[1])
		var r []int
		r = append(r, a, b)
		times = append(times ,r)
	}

	sort.Slice(times, func(i, j int) bool {
		return times[i][0] < times[j][0]
	})
	sort.Slice(times, func(i, j int) bool {
		return times[i][1] < times[j][1]
	})

	result := 0
	lastEndTime := 0
	for _, v := range times {
		if v[0] >= lastEndTime {
			lastEndTime = v[1]
			result++
		}
	}
	fmt.Print(result)
}


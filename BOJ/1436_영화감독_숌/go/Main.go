package main

import (
	"fmt"
	"strconv"
	"strings"
)

func main() {
	var n int
	fmt.Scan(&n)

	cnt := 0
	var result int
	for i := 666;; i++ {
		if strings.Contains(strconv.Itoa(i), "666") {
			cnt++
			if cnt == n {
				result = i
				break
			}
		}
	}
	fmt.Println(result)
}


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
	var x int
	scanner.Scan()
	s := strings.Split(scanner.Text(), " ")
	x, _ = strconv.Atoi(s[1])

	scanner.Scan()
	for _, v := range strings.Split(scanner.Text(), " "){
		num, _ := strconv.Atoi(v)
		if num < x {
			fmt.Print(num, " ")
		}
	}
}


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
	w       := bufio.NewWriter(os.Stdout)
	defer w.Flush()

	var n int
	fmt.Scan(&n)
	var queue []int

	for i := 0; i < n; i++ {
		scanner.Scan()
		s := strings.Split(scanner.Text(), " ")
		command := s[0]
		switch command {
		case "push":
			num, _ := strconv.Atoi(s[1])
			queue = append(queue, num)
		case "pop":
			if len(queue) == 0 {
				w.WriteString("-1\n")
			} else {
				w.WriteString(strconv.Itoa(queue[0])+"\n")
				queue = queue[1:]
			}
		case "size":
			w.WriteString(strconv.Itoa(len(queue))+"\n")
		case "empty":
			if len(queue) > 0 {
				w.WriteString("0\n")
			} else {
				w.WriteString("1\n")
			}
		case "front":
			if len(queue) == 0 {
				w.WriteString("-1\n")
			} else {
				w.WriteString(strconv.Itoa(queue[0])+"\n")
			}
		case "back":
			if len(queue) == 0 {
				w.WriteString("-1\n")
			} else {
				w.WriteString(strconv.Itoa(queue[len(queue)-1])+"\n")
			}
		}
	}
}


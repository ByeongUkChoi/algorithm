package main

import (
	"bufio"
	"fmt"
	"os"
	"sort"
	"strconv"
)

func main() {
	scanner := bufio.NewScanner(os.Stdin)
	var count int
	var array []int
	fmt.Scan(&count)
	for i := 0; i < count; i++ {
		scanner.Scan()
		input, _ := strconv.Atoi(scanner.Text())
		array = append(array, input)
	}
	sort.Ints(array);
	for _, v := range array {
		fmt.Println(v)
	}
}


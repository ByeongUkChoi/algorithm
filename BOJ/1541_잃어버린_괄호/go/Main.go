package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
)

func main() {
	scanner := bufio.NewScanner(os.Stdin)
	scanner.Scan()
	input := scanner.Text()

	result := 0
	tmp := 0
	plusOperator := true
	for _, s := range input {
		// 문자가 숫자일 경우 tmp에 더해줌
		if i, err := strconv.Atoi(string(s)); err == nil {
			tmp = tmp * 10 + i
			continue
		}

		if plusOperator {
			result += tmp;
		} else {
			result -= tmp;
		}
		tmp = 0
		if plusOperator == true && s == '-' {
			plusOperator = false
		}
	}
	if plusOperator {
		result += tmp;
	} else {
		result -= tmp;
	}
	fmt.Print(result)
}


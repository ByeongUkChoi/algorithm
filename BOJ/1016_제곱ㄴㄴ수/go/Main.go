package main

import "fmt"

func main() {
	var min, max int
	fmt.Scan(&min, &max)
	result := noSquareRootCount(min, max)
	fmt.Println(result)
}
func noSquareRootCount(min, max int) int {
	// 배열 크기 (min부터 max까지)
	size := max - min + 1
	// min부터 max까지 나타낼 배열 모두 false (제곱근으로 나누어지는 수는 true 처리 할 예정)
	nums := make([]bool, size)
	// 제곱근을 반복 (2*2, 3*3, 4*4,,,)
	for i := 2; i * i <= max ; i++ {
		// 제곱근
		pow := i * i
		// 제곱근 * i 중 min보다 같거나 큰 제일 작은 수의 i값 구하기
		// 예) case 1) min : 9, 제곱근 : 4, i = 3. case 2) min : 8, 제곱근 : 4, i = 2
		// 나머지가 있을 경우 i는 몫 + 1, 나머지가 없을 경우 i는 몫
		var start int
		// 나머지가 없는 경우
		if (min / pow) * pow == min {
			start = min / pow
		} else {	// 나머지가 있는 경우
			start = min / pow + 1
		}
		// 제일 작은 i값부터 1씩 증가하면서 min~max 값들을 true처리 (제곱근으로 나누어지는 수)
		for j := start; j * pow <= max; j++ {
			nums[j * pow - min] = true
		}
	}
	// true인 값 개수
	count := 0
	for j := 0; j < size; j++ {
		if !nums[j] {
			count++
		}
	}
	return count
}


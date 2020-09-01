package main

import "fmt"

func main() {
	var totalScore int = 0
	var count int = 5
	var score int
	for i := 1; i <= count; i++ {
		// 5명의 점수를 입력 받는다
		fmt.Scan(&score)
		// 모두 더한다. (단 40점 미만은 40점으로 한다.)
		if score < 40 {
			score = 40
		}
		totalScore += score
	}
	// 평균을 구한다.
	var averageScore int = totalScore/count
	fmt.Print(averageScore)
}

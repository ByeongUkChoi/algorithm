package main

import "fmt"

func main() {
	var i, j, k int
	//fmt.Scanf("%d %d %d", &i, &j, &k)
	//fmt.Printf("%d %d %d", i, j, k)

	fmt.Scan(&i, &j, &k)

	//slice := []int{i, j, k}
	//sort.Sort(sort.Reverse(sort.IntSlice(slice)))
	//
	//fmt.Printf("%d", slice[1])

	if (i >= j && j >= k) || (k >= j && j >= i) {
		fmt.Printf("%d", j)
	} else if (i >= k && k >= j) || (j >= k && k >= i) {
		fmt.Printf("%d", k)
	} else if (j >= i && i >= k) || (k >= i && i >= j) {
		fmt.Printf("%d", i)
	}
}

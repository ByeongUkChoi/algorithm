package main

import "fmt"

func main() {
	mod := 1000000
	pisanoPeriod := 15 * mod / 10
	var n int
	fmt.Scan(&n)
	if n < 2 {
		fmt.Print(n)
		return
	}
	n %= pisanoPeriod
	f1, f2 := 0, 1
	for i := 2; i < n; i++ {
		prevF1 := f1
		f1 = f2
		f2 = (prevF1 + f1) % mod
	}
	fmt.Print((f1 + f2) % mod)
}


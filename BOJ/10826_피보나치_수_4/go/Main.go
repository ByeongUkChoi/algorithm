package main

import (
	"fmt"
	"math/big"
)

func main() {

	var n int
	fmt.Scan(&n)

	if n < 2 {
		fmt.Print(n)
		return
	}

	f1 := new(big.Int)
	f2 := new(big.Int)
	f1.SetString("0", 10)
	f2.SetString("1", 10)

	for i := 2; i < n; i++ {
		// copy value f1 to prevF1
		prevF1 := new(big.Int).Set(f1)
		//f1 = f2
		f1 = f1.Set(f2)
		//f2 = prevF1 + f1
		f2.Add(prevF1, f1)
	}
	fmt.Print(new(big.Int).Add(f1, f2))
}


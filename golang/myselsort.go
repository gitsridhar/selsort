package main

import "fmt"

// RecursiveSelectionSort finds the minimum and places it at the start index.
func recursiveSelectionSort(arr []int, start int) {
	n := len(arr)

	// Base case: if start index reaches the last element, sorting is complete
	if start >= n-1 {
		return
	}

	// 1. Find the index of the minimum element in the range [start, n-1]
	minIndex := start
	for i := start + 1; i < n; i++ {
		if arr[i] < arr[minIndex] {
			minIndex = i
		}
	}

	// 2. Swap the minimum element with the element at the start index
	if minIndex != start {
		arr[start], arr[minIndex] = arr[minIndex], arr[start]
	}

	// 3. Recursively call for the rest of the slice
	recursiveSelectionSort(arr, start+1)
}

func main() {
	data := []int{64, 25, 12, 22, 11}
	fmt.Printf("Original slice: %v\n", data)

	// Start recursion from the first index
	recursiveSelectionSort(data, 0)

	fmt.Printf("Sorted slice:   %v\n", data)
}

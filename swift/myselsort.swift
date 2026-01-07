import Foundation

/**
 Recursively sorts an array using the Selection Sort algorithm.
 - Parameters:
   - array: The array to be sorted (passed by reference).
   - startIndex: The current index to find the minimum for.
 */
func recursiveSelectionSort<T: Comparable>(_ array: inout [T], _ startIndex: Int) {
    let n = array.count
    
    // Base case: If startIndex reaches the end, the array is sorted
    if startIndex >= n - 1 {
        return
    }
    
    // 1. Find the index of the minimum element in the range [startIndex, n-1]
    var minIndex = startIndex
    for i in (startIndex + 1)..<n {
        if array[i] < array[minIndex] {
            minIndex = i
        }
    }
    
    // 2. Swap the found minimum element with the element at the current startIndex
    if minIndex != startIndex {
        array.swapAt(startIndex, minIndex)
    }
    
    // 3. Recursively sort the remaining unsorted part of the array
    recursiveSelectionSort(&array, startIndex + 1)
}

// MARK: - Main Execution
func main() {
    var data = [64, 25, 12, 22, 11]
    
    print("Original Array: \(data)")
    
    // Start recursion from the first index
    recursiveSelectionSort(&data, 0)
    
    print("Sorted Array:   \(data)")
}

// Invoke the driver code
main()

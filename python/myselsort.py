def recursive_selection_sort(arr, start_index=0):
    """
    Recursively sorts a list using the Selection Sort algorithm.
    :param arr: The list to be sorted.
    :param start_index: The index where the current unsorted portion begins.
    """
    n = len(arr)

    # Base case: If start_index reaches the end, the list is sorted
    if start_index >= n - 1:
        return

    # 1. Find the index of the minimum element in the unsorted part [start_index...n-1]
    min_index = start_index
    for i in range(start_index + 1, n):
        if arr[i] < arr[min_index]:
            min_index = i

    # 2. Swap the found minimum element with the element at start_index
    arr[start_index], arr[min_index] = arr[min_index], arr[start_index]

    # 3. Recursively sort the rest of the list
    recursive_selection_sort(arr, start_index + 1)

def main():
    """Driver code to test the algorithm."""
    data = [64, 25, 12, 22, 11]
    
    print(f"Original Array: {data}")
    
    # Selection Sort modifies the list in-place
    recursive_selection_sort(data)
    
    print(f"Sorted Array:   {data}")

if __name__ == "__main__":
    main()

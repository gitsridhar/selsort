/// Recursively sorts a slice using the Selection Sort logic.
/// T must implement PartialOrd for comparison and Clone for swapping.
fn recursive_selection_sort<T: PartialOrd + Clone>(slice: &mut [T]) {
    // Base case: If the slice has 1 or 0 elements, it's already sorted
    if slice.len() <= 1 {
        return;
    }

    // 1. Find the index of the minimum element in the current slice
    let mut min_index = 0;
    for i in 1..slice.len() {
        if slice[i] < slice[min_index] {
            min_index = i;
        }
    }

    // 2. Swap the minimum element with the first element of the slice
    if min_index != 0 {
        slice.swap(0, min_index);
    }

    // 3. Recursively sort the remaining part of the slice (from index 1 onwards)
    // We pass a mutable sub-slice to the next recursive call
    recursive_selection_sort(&mut slice[1..]);
}

fn main() {
    let mut data = vec![64, 25, 12, 22, 11];
    
    println!("Original array: {:?}", data);

    // Call the recursive function on the entire slice
    recursive_selection_sort(&mut data);

    println!("Sorted array:   {:?}", data);
}

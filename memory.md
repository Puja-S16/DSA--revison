### Java 2D Array Memory Notes

- **Definition:** In Java, 2D arrays are "Arrays of Arrays."
- **Allocation:**
  - **Stack:** Stores the reference variable.
  - **Heap:** Stores the row-container array and individual row objects.
- **Memory Layout:** - Not a single contiguous block.
  - Each row is a separate object on the heap.
- **Indexing:** `array[row][col]`
  - `array.length` returns the number of rows.
  - `array[0].length` returns the number of columns in the first row.
- **Jagged Arrays:** Since rows are independent objects, they can have different lengths.
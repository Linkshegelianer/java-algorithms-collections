### Big-O Complexity Table
| Type | Name | Explanation | Status | Example |
| ---- |------| ------|  ------| ------| 
| `O(1)` | Constant Time | Algorithm is executed the same number of times each time, regardless of the size of the input |  Excellent | Search in a hash table by key |
| `O(log n)` | Logarithm Time | The execution time increases very slowly compared to the increase in the size of the input data | Excellent | Binary Search |
| `O(n)` | Linear Time | The execution time is linearly proportional to the size of the input data | Good | Brute Force Search |
| `O(n log n)` | Quasilinear Time | As the input size increases, the number of divisions required to solve the problem increases slowly due to the logarithmic growth | Bad | Merge Sort, Heap Sort |
| `O(n^2)` | Quadratic Time | Involves nested iterations or comparisons for each element | Horrible | Selection Sort |
| `O(2^n)` | Exponential Time | Involves exhaustive search or enumeration of all possible combinations of the input, execution time increases exponentially | Horrible | TSP (dynamic programming)
| `O(n!)` | Factorial Time | Involves exhaustive search or enumeration of all possible combinations of the input, execution time increases factorially | Horrible | TSP (brute force)
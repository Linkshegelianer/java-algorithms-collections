# Java algorithms and collections

Custom collection of data for technical interview for junior java developer role. 

## Algorithms
* **Searches**
  * [Linear search](https://github.com/Linkshegelianer/java-algorithms-collections/blob/main/algorithms/searches/LinearSearch.java) 
  * [Binary search](https://github.com/Linkshegelianer/java-algorithms-collections/blob/main/algorithms/searches/BinarySearch.java)
  * [Breadth First Search](https://github.com/Linkshegelianer/java-algorithms-collections/blob/main/algorithms/searches/BreadthFirstSearch.java)
  * [Depth First Search](https://github.com/Linkshegelianer/java-algorithms-collections/blob/main/algorithms/searches/DepthFirsthSearch.java)
  * [Fibonacci search](https://github.com/Linkshegelianer/java-algorithms-collections/blob/main/algorithms/searches/FibonacciSearch.java)
  * [Exponential search](https://github.com/Linkshegelianer/java-algorithms-collections/blob/main/algorithms/searches/ExponentialSearch.java)
  * [Jump search](https://github.com/Linkshegelianer/java-algorithms-collections/blob/main/algorithms/searches/JumpSearch.java)
* **Sorting**
  * [Quick sort](https://github.com/Linkshegelianer/java-algorithms-collections/blob/main/algorithms/sorting/QuickSort.java)  
  * [Merge sort](https://github.com/Linkshegelianer/java-algorithms-collections/blob/main/algorithms/sorting/MergeSort.java) 
  * [Heap sort](https://github.com/Linkshegelianer/java-algorithms-collections/blob/main/algorithms/sorting/HeapSort.java) 
  * [Bubble sort](https://github.com/Linkshegelianer/java-algorithms-collections/blob/main/algorithms/sorting/BubbleSort.java)
  * [Insertion sort](https://github.com/Linkshegelianer/java-algorithms-collections/blob/main/algorithms/sorting/InsertionSort.java)   
  * [Selection sort](https://github.com/Linkshegelianer/java-algorithms-collections/blob/main/algorithms/sorting/SelectionSort.java)  
  * [Bucket sort](https://github.com/Linkshegelianer/java-algorithms-collections/blob/main/algorithms/sorting/BucketSort.java)
  * [:sparkles: Miracle sort](https://github.com/Linkshegelianer/java-algorithms-collections/blob/main/algorithms/sorting/MiracleSort.java)
* **Math**
  * [Fib numbers](https://github.com/Linkshegelianer/java-algorithms-collections/blob/main/algorithms/math/FibNumbers.java)
  * [Pascal's triangle](https://github.com/Linkshegelianer/java-algorithms-collections/blob/main/algorithms/math/PascalsTriangle.java)
  * [Power of three](https://github.com/Linkshegelianer/java-algorithms-collections/blob/main/algorithms/math/PowerOfThree.java)
* **Arrays**
  * [Swap elements in array](https://github.com/Linkshegelianer/java-algorithms-collections/blob/main/algorithms/arrays/SwapElementsInArray.java)
  * [Calculate sum in array](https://github.com/Linkshegelianer/java-algorithms-collections/blob/main/algorithms/arrays/CaltucaleSumInArray.java)
  * [Split array into chunks](https://github.com/Linkshegelianer/java-algorithms-collections/blob/main/algorithms/arrays/SplitArrayIntoChunks.java)
  * [Continuous sequence array](https://github.com/Linkshegelianer/java-algorithms-collections/blob/main/algorithms/arrays/ContinuousSequenceArray.java)
  * [Find and replace strings in array](https://github.com/Linkshegelianer/java-algorithms-collections/blob/main/algorithms/arrays/FindAndReplaceStringsInArray.java)
  * [Get same parity in array](https://github.com/Linkshegelianer/java-algorithms-collections/blob/main/algorithms/arrays/GetSameParityInArray.java)
* **Matrices**
  * [Mirror matrix](https://github.com/Linkshegelianer/java-algorithms-collections/blob/main/algorithms/arrays/matrices/MirrorMatrix.java)
  * [Multiply matrix](https://github.com/Linkshegelianer/java-algorithms-collections/blob/main/algorithms/arrays/matrices/MultiplyMatrix.java)
  * [Rotate Matrix](https://github.com/Linkshegelianer/java-algorithms-collections/blob/main/algorithms/arrays/matrices/RotateMatrix.java)
* **Common interview questions**
  * [Add digits from int](https://github.com/Linkshegelianer/java-algorithms-collections/blob/main/algorithms/common-interview-questions/AddDigitsFromInt.java)
  * [Balanced parens](https://github.com/Linkshegelianer/java-algorithms-collections/blob/main/algorithms/common-interview-questions/BalancedParens.java)
  * [FizzBuzz](https://github.com/Linkshegelianer/java-algorithms-collections/blob/main/algorithms/common-interview-questions/FizzBuzz.java)
  * [Hamming weight of int](https://github.com/Linkshegelianer/java-algorithms-collections/blob/main/algorithms/common-interview-questions/HammingWeightOfInt.java)
  * [Reverse Linked List](https://github.com/Linkshegelianer/java-algorithms-collections/blob/main/algorithms/common-interview-questions/ReverseLinkedList.java)
* **Strings**
  * [Reverse string](https://github.com/Linkshegelianer/java-algorithms-collections/blob/main/algorithms/strings/ReverseString.java)
  * [Palindrome predicate](https://github.com/Linkshegelianer/java-algorithms-collections/blob/main/algorithms/strings/IsPalindrome.java)


# Big O notation
* **Time Complexity**: estimation of the number of operations or steps an algorithm needs to run as a function of the input size.
* **Space Complexity**: maximum amount of auxiliary memory that an algorithm needs to allocate or use during its execution as a function of the input size.
  * **Auxiliary Space** is the extra space or temporary space used by an algorithm.

`n` in Time Complexity -- the number of elements in the input.
`n` in Space Complexity -- input size in units of bits needed to represent the input.

### Big-O Time Complexity Table
| Type | Name | Explanation | Status | Example |  
| ---- |------| ------|  ------| ------| 
| `O(1)` | Constant Time | Algorithm is executed the same number of times each time, regardless of the size of the input |  Excellent | Search in a hash table by key |  
| `O(log n)` | Logarithm Time | The execution time increases very slowly compared to the increase in the size of the input data | Excellent | Binary Search (Average) |  
| `O(n)` | Linear Time | The execution time is linearly proportional to the size of the input data | Good | Brute Force Search | 
| `O(n + k)` | Combined/Additive Time | Combined complexity of two separate inputs | Good | Counting Sort | 
| `O(n log n)` | Quasilinear Time | As the input size increases, the number of divisions required to solve the problem increases slowly due to the logarithmic growth | Bad | Merge Sort, Heap Sort |  
| `O(n^2)` | Quadratic Time | Involves nested iterations or comparisons for each element | Horrible | Selection Sort |  
| `O(2^n)` | Exponential Time | Involves exhaustive search or enumeration of all possible combinations of the input, execution time increases exponentially | Horrible | TSP (dynamic programming) | 
| `O(n!)` | Factorial Time | Involves exhaustive search or enumeration of all possible combinations of the input, execution time increases factorially | Horrible | TSP (brute force)

### Big-O Space Complexity Table
| Type | Name | Explanation | Status | Example |  
| ---- |------| ------|  ------| ------| 
| `O(1)` | Constant Space | Algorithm requires a fixed amount of additional memory, regardless of the input size |  Excellent | Heap Sort | 
| `O(log n)` | Logarithmic Space | The space usage increases slowly compared to the increase in the size of the input data | Excellent | Quick Sort | 
| `O(n)` | Linear Space | The space usage scales linearly with the input size | Good | Merge Sort |
| `O(n + k)` | Combined/Additive Space | The space usage scales linearly with the sum of `n` and `k` | Bad | Radix Sort |


## Java collections classes
* **Collection**
  * **Set**
    * [HashSet](https://github.com/Linkshegelianer/java-algorithms-collections/blob/main/collections/sets/SETS.md#hashset)
    * [LinkedHashSet](https://github.com/Linkshegelianer/java-algorithms-collections/blob/main/collections/sets/SETS.md#linkedhashset)
      * **SortedSet**
      * **NavigableSet**
        * [TreeSet](https://github.com/Linkshegelianer/java-algorithms-collections/blob/main/collections/sets/SETS.md#treeset)
  * **List**
    * [ArrayList](https://github.com/Linkshegelianer/java-algorithms-collections/blob/main/collections/lists/LISTS.md)
    * [LinkedList](https://github.com/Linkshegelianer/java-algorithms-collections/blob/main/collections/lists/LISTS.md#linkedlist)
    * **Vector**
      * Stack
  * **Queue**
    * Priority Queue
      * **Deque**
        * ArrayDequeue
* **Map**
  * [HashTable](https://github.com/Linkshegelianer/java-algorithms-collections/blob/main/collections/maps/MAPS.md#hashtable)
  * [HashMap](https://github.com/Linkshegelianer/java-algorithms-collections/blob/main/collections/maps/MAPS.md#hashmap)
  * [LinkedHashMap](https://github.com/Linkshegelianer/java-algorithms-collections/blob/main/collections/maps/MAPS.md#linkedhashmap)
    * **SortedMap**
    * **NavigableMap**
      * [TreeMap](https://github.com/Linkshegelianer/java-algorithms-collections/blob/main/collections/maps/MAPS.md#treemap)

### Definitions
| Term | Definition | Examples |  
| ---- |------| ------| 
| Abstract Data Type (ADT) | Represents a high-level description of a data type, focusing on its behavior and operations rather than the specific implementation details | stack, queue, dictionary, sequence, set |  
| Data Structure | Technique or strategy for implementing a particular data type, organizing and storing data in a specific way to facilitate efficient operations | array, linked list, hash table, trees (binary search tree, heap, red/black trees |  
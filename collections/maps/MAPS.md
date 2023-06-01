# Maps

In the Collections framework hierarchy, Map interface, which is an implementation of an **associative array**, is set aside since it does not inherit from either Collection or Iterable interfaces.

|  | `HashMap` |  `LinkedHashMap` | `TreeMap`  | `HashTable` |
| ---- |------|  ------|------------------------------------------|  ------| 
| Implementation | Array of nodes inside bucket | Doubly-linked list of nodes inside bucket  | Reb-Black Tree                           | Array of linked lists inside bucket |  
| Time complexity | `O(1)` | `O(1)` | `O(log(n))`                              | `O(1)` |
| Interfaces | Map | Map | SortedMap -> NavigableMap -> Map         | Map |
| Iteration Order | Not guaranteed | Insertion order  | Sorted according to the natural ordering | Not guaranteed |
| Null values/keys | Allowed | Allowed  | Only values                              | Prohibited |
| Synchronization | Not synchronized by default | Not synchronized by default | Not synchronized by default              | Synchronized |


## [HashMap](https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html)

`HashMap` is a specific implementation of the Map collection based on a data structure called a hash table.

* **Hash table** is a data structure implementing an associative array interface that provides fast insertion and deletion of elements.

* **Hashing** is a process of transforming input data into a fixed-size output for data integrity verification or quick data retrieval.

**HashMap structure**:

* Each node (object of the Node class) in HashMap contains hashCode (int), key, value and pointer to the next ```Node <K, V>```
* The procedure for adding an element to a HashMap is described [here (RU)](https://habr.com/ru/articles/128017/)
* A **collision** is a situation when a node has the same hash code as the existing one:
    *  If the keys of the nodes are equal through ```equals()```, the value will be overwritten.
    *  If the keys are not equal, the first node will point to the added node, forming a linked list.


**Time complexity**

| Access by index | Search by value | Insert element | Remove element |     
| ---- |------| ------| ------|    
|   `O(1)`* |   `O(n)`** |   `O(1)`* |   `O(1)`* |

*Assuming a good hash function and a well-distributed set of keys. In the worst case, when there are many collisions, the time complexity can degrade to O(n).

**Requires iterating through all the entries to find a matching value.



<hr>  

```equals()``` and ```hashCode()```  methods of the ```Object``` class:
* ```equals()``` is used to determine the equality of objects
* ```hashCode()``` converts the object data to int

|  | ```a.equals(b)``` |  ```a.hashCode() == b.hashCode()``` |     
| ---- |------|  ------|
| True | ```a.hashCode() == b.hashCode()``` |  No information about equality of the objects |
| False | No information about the hash codes |  Objects are not equal |    


## [LinkedHashMap](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedHashMap.html)

Unlike `HashMap`, `LinkedHashMap` takes into account the order of adding elements, since nodes have a pointer to the previous and next node, creating a doubly linked list.

## [TreeMap](https://docs.oracle.com/javase/8/docs/api/java/util/TreeMap.html)

Elements will be sorted thanks to RB-tree features. 

**Red-black tree** is a special type of self-balancing binary search tree, which marks its nodes red or black depending on the balancing strategy. 
  * **Tree** is a data structure representing a hierarchical structure of nodes connected by edges or branches.
  * **Binary tree** is a tree in which each node has at most two children (left and right).
  * **Binary search tree** is a binary tree that satisfies binary search property for efficient searching, insertion and deletion operations: 
    * Each node has at most two children
    * The value of the key in each node must be greater that all the keys in its left subtree and less than all the keys in its right subtree
  * **Self-balancing tree** guarantees that after adding/removing elements the tree will stay balanced. 


## [HashTable](https://docs.oracle.com/javase/8/docs/api/java/util/Hashtable.html)

Provides similar functionality to `HashMap` but with some important differences:

|                       | HashMap                         | HashTable | 
|-----------------------|---------------------------------|-----------| 
| Synchronization       | Not synchronized                | Synchronized |
| Null values and keys  | Allows                          | Prohibits |
| Performance           | Faster in single-threaded cases | Thread-safety affects efficiency |

* Better use `HashMap` for saving efficiency and `ConcurrentHashMap` for working in a multithreaded environment.
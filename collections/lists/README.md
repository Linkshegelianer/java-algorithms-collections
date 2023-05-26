# Lists
## [ArrayList](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html)
ArrayList is an implementation of List interface, utilizing a dynamically resizable array. It is a regular array with capacity and size.

**Differences from a regular array**
|  | Insert element | Remove element | Type of operation |
| ---- |------| ------| ------|  
| Regular Array | Manually shifting the elements one by one to make space, explicit coding by the developer | The necessary elements must be shifted to the left to fill the gap created by the removal | Manually |
| ArrayList | A new array is allocated, the existing elements are transferred to the new array, and then the length is adjusted to free up space automatically | Internal mechanism of ArrayList manages the removal process, requires `trimToSize()` to adjust the capacity to match the number of elements | Automatically |


**Time complexity**  
| Access by index | Search by value | Insert element | Remove element |   
| ---- |------| ------| ------|  
| `O(1)` | `O(n)` | `O(n)` | `O(n)` |

## [LinkedList](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html)

A linked list is a chain of cells called nodes in random memory addresses. Each cell has a pointer to the next cell, which together represent a sequence.

**Types of linked lists**  
| Type | Explanation |
| ---- |------|
| Singly Linked List | Each node contains a data element and a reference (link) to the next node in the sequence. The last node's reference points to NULL |
| Doubly Linked List | Each node contains a data element and references (links) to both the next and previous nodes in the sequence |
| Circular Linked List | The last node points back to the first node (singly circular linked list) or the last node points to the first node, and the first node's previous reference points to the last node (doubly circular linked list) |

**Time complexity**  
| Access by index | Search by value | Insert element | Remove element |   
| ---- |------| ------| ------|  
| `O(n)` | `O(n)` | `O(1)` | `O(1)` |


**Difficulty comparison between ArrayList and LinkedList**  
| Operation | ArrayList | LinkedList |   
| ---- |------| ------|
| Access by index | `O(1)` | `O(n)` |
| Search by value | `O(n)` | `O(n)` |
| Insert element | `O(n)` | `O(1)` |
| Remove element | `O(n)` | `O(1)` |
**ArrayList**: better at operations involving accessing elements by index or iterating through the collection.
**LinkedList**: better at insertion and deletion operations, especially at the beginning or end of the list.

In addition to using LinkedList as a List, it can also be used as a Queue or Stack, imposing certain rules on adding and removing items.
* **Stack** is an abstract data structure obeying LIFO (Last in First Out) rules.
  ```Queue<String> queue = new LinkedList<>();```
  Push: ```add()``` - appends the specified element to the end of this list.
  Pop: ```removeLast()``` - removes and returns the last element from this list

* **Queue** is an abstract data structure obeying FIFO (first in first out) rules.
  ```Deque<String> stack = new LinkedList<>();```
  Enqueue: ```add()``` - appends the specified element to the end of this list.
  Dequeue: ```remove()``` - retrieves and removes the head (first element) of this list
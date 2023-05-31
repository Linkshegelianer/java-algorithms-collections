# Sets
**Set** is a mathematical model and an abstract data type for a collection of different things.
* In java, **Set** is a collection which doesn't contain duplicates -> set of unique elements which are not equivalent through ```equals()```

Operations on sets:
* **Union of Sets**:  A ∪ B, all elements present in both sets.
* **Intersection of Sets**: A ∩ B, only elements present in each set.
* **Difference of sets**: A − B = A ∩ B’, set which consists of elements present in A but not in B.
* **Symmetric difference of Sets**: (A – B) ∪ (B – A) = A △ B, set of all those elements which belongs either to A or to B but not to both.

|  | `HashSet` | `LinkedHashSet` | `TreeSet` |  
|----|----|-----|----|-----|
| Implementation | HashMap | LinkedHashMap | TreeMap |
| Time complexity | `O(1)`* | `O(1)`* | `O(log(n))` |   
| Interfaces | Set | Set  | SortedSet -> NavigableSet -> Set |
| Iteration Order | Not guaranteed | Insertion order | Sorted according to the natural ordering |   
| Null values/keys | Allowed | Maximum one null element | Prohibited |

*Assuming a good hash function and a well-distributed set of keys. In the worst case, when there are many collisions, the time complexity can degrade to O(n).

## [HashSet](https://docs.oracle.com/javase/8/docs/api/java/util/HashSet.html)

`HashSet` is the implementation of the `Set` interface based on hash table. It is implemented via `HashMap`, the keys of which are the elements of the set, and the values are a constant object  `PRESENT` of the `Object` class.


## [LinkedHashSet](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedHashSet.html)

`LinkedHashSet` is an implementation of the `Set` interface that combines the functionality of a `HashSet` with a linked list to maintain the insertion order of its elements. It is implemented using a `LinkedHashMap`, where the keys represent the elements of the set, and the values are a constant object  `PRESENT` of the `Object` class.

## [TreeSet](https://docs.oracle.com/javase/8/docs/api/java/util/TreeSet.html)

* **SortedSet** is a collection (interface) that embodies the concept of a set and guarantees the order of the elements. In order to be able to establish the order, the elements must be comparable to each other.
    * There are two ways to ensure this: through `Comparable` and `Comparator`.
* **NavigableSet** is a collection (interface) that extends `SortedSet` with methods that allow you to find the closest element to some predefined one. This collection can be traversed both in ascending and descending order.

`TreeSet` is a collection implementing `Set` interface (`SortedSet`, `NavigableSet`). It is based on `TreeMap` collection and embodies a red-black tree.  
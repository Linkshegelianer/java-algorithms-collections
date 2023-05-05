# Lists
**[ArrayList](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html)**

Initialization:
```java
List<Type> list1 = new ArrayList<>();
List<Type> list2 = new ArrayList<>(100); // initial capacity: 100
List<Type> list3 = new ArrayList<>(list2); // copy another list
```

Content:
```java
list.add(<Type> value);
list.add(int index, <Type> value);
list.addAll(Collection<? extends E> c); // add collection to the end of the list
list.addAll(int index, Collection<? extends E> c); // add collection starting at the index
list.get(int index);        
list.remove(int index);
list.remove(<Type> value);
list.removeAll(Collection<?> c); // remove elements from list that are contained in the given collection
list.clear();
list.size();
list.indexOf(Object o);
list.isEmpty();
```

Iterator:
```java
ArrayList<Type> list = new ArrayList<>();
Iterator<Type> it = list.iterator();
while (it.hasNext()) {
    Type element = it.next();
    // do something with the element...
}
```

Conversion:
```java
Object[] array = list.toArray();
List<Type> newList = Arrays.asList(array);
```

**[LinkedList](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html)**


**[Stack](https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html)**
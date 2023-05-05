package exercise;

// import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
//        //array list
//        List<String> list = new ArrayList<>();
//        System.out.println(list);
//
//        list.add("1");
//        list.add(null);
//        list.add(null);
//        list.add("2");
//        list.add("3");
//        list.add("3");
//        System.out.println(list);
//
//        list.remove(0);
//        System.out.println(list);
//
//        list.remove("3");
//        list.remove("4");
//        System.out.println(list);
//
//        System.out.println(list.size());
////
//        List<String> insertedList = new ArrayList<>();
//        insertedList.add("1");
//        insertedList.add("2");
//        insertedList.add("7");
//        insertedList.add("7");
//        System.out.println(insertedList);
//
//        list.addAll(2, insertedList);
//        System.out.println(list);
//
//        System.out.println(list.indexOf("7"));
//        System.out.println(list.get(3));
//        System.out.println(list.isEmpty());
//        System.out.println(list.contains("2"));
//        System.out.println(list.contains("11"));

//
//        for (String s: list) {
//            System.out.println("element of list: " + s);
//        }
//
//        ArrayList<String> arrayList = (ArrayList<String>) list;
//        arrayList

//        // LinkedList
//        List<Integer> list = new LinkedList<>();
//        list.add(1);
//        list.add(2);
//        list.add(null);
//        list.add(3);
//        list.add(4);
//        list.remove(1);
//
//        list.add(null);
//
//        System.out.println(list);
//
//        System.out.println(list.size());
//        System.out.println(list.get(0));
//        System.out.println(list.indexOf(3));
//
//        LinkedList<Integer> linkedList = (LinkedList<Integer>) list;
//        System.out.println(linkedList.peek());
//        System.out.println(list);
////
//        System.out.println(linkedList.poll());
//        System.out.println(linkedList);
////
//        linkedList.addFirst(3);
//        System.out.println(linkedList);
//
//        LinkedList<Integer> list = new LinkedList<>();
//
//        List<Integer> l = doSmth(list);
//        System.out.println(l.getClass());

//        for (Integer num: linkedList) {
//            System.out.println("int: " + num);
//        }
    }

    /**
     * Method for hidden specific logic of LinkedList realisation.
     * @param list Input list.
     * @return Changed list.
     */
    public static List<Integer> doSmth(List<Integer> list) {
        LinkedList<Integer> linkedList;
        if (list instanceof LinkedList) {
            linkedList = (LinkedList<Integer>) list;
        } else {
            linkedList = new LinkedList<>(list);
        }
        linkedList.peek();
        return linkedList;
    }
}

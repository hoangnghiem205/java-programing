package com.java.lesson12;

import java.util.*;

public class Main {


    public static void main(String[] args) {

        List<Integer> list = new ArrayList();
        list.add(111111);
        list.add(10);
        list.add(100);
        list.add(1000);
//        int num = Integer.parseInt(list.get(3)+"");

//        System.out.println(list.get(2) + 1);


//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

//        for (int a : list) {
//            System.out.println(a);
//        }
//
//        boolean f = list.contains(101);
//        System.out.println(f);
//
//        int index = list.indexOf(100);
//        System.out.println(index);
//
//        boolean check = list.isEmpty();
//        System.out.println(check);



//        list.remove(new Integer(100));
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        for (int a : list) {
            System.out.println(a);
        }
        System.out.println("======+VECTOR+=======");

        Vector<Student> vec = new Vector<>();
        vec.addElement(new Student(1, "Hoang"));
        vec.addElement(new Student(2, "Cao"));
        vec.addElement(new Student(3, "Anh"));


        vec.sort(new Student());

//        vec.clear();
//        int capacity = vec.capacity();
//        System.out.println(capacity);
        for (Student s : vec) {
            System.out.println(s);
        }

        System.out.println("======+LINKEDLIST+=======");
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addFirst("HOANG");
        linkedList.addLast("VU");
        linkedList.addFirst("MAI");
        String first = linkedList.getFirst();
//        System.out.println(first);

        

        for (String s :
                linkedList) {
            System.out.println(s);
        }

    }




}

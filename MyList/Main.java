package com.company;

public class Main {

    public static void main(String[] args) {
        MyList<String> myList = new MyList((a, b) -> a.getValue().toString().compareTo(b.getValue().toString()));
        Randomizer.randomString(myList, 100);
        System.out.println(myList.tostring());
        myList.swap(0,3);
        System.out.println(myList.tostring());
        myList.sort();
        System.out.println(myList.tostring());
    }
}

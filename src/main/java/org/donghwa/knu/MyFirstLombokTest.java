package org.donghwa.knu;

public class MyFirstLombokTest {
    public static void main(String[] args) {
        MyFirstLombok myFirstLombok = new MyFirstLombok();
        myFirstLombok.setAge(23);
        myFirstLombok.setName("donghwa");
        System.out.println("Name: " + myFirstLombok.getName() + "\nAge: " + myFirstLombok.getAge());
    }
}

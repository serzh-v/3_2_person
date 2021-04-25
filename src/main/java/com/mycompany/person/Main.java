package com.mycompany.person;

/**
 * реализуем метод fio
 */
public class Main {
    
    public static void main(String args[]) {
        Person p1 = new Person("Иванов", "Алексей", "Борисович");
        System.out.println(p1.fio());
        Person p2 = new Person("Иванов", "Алексей", "");
        System.out.println(p2.fio());
        Person p3 = new Person("Иванов", "", "");
        System.out.println(p3.fio());
    }
}

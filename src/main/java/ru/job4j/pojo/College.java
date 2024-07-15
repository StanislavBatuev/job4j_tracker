package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Batuev Stanislav Vladimirovich");
        student.setGroup(11);
        student.setDate(new Date());
        System.out.println(student.getFullName() + " " + student.getGroup() + " " + student.getDate());
    }
}
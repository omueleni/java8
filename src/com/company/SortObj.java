package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by kogbe on 21/08/2018.
 */
public class SortObj {

    public static void main (String[] args){

        List<Student> studentList = new ArrayList<Student>();

        studentList.add( new Student(1001,23,"John Smith"));
        studentList.add( new Student(1005,26,"Steve Holand"));
        studentList.add( new Student(1009,39,"Adrian Conte"));
        studentList.add( new Student(1006,90,"Vivek Gupta"));
        studentList.add( new Student(1011,42,"Stanford Kamau"));

        List<Student> sortList = studentList.stream()
                                 .sorted()
                                 .collect(Collectors.toList());


        sortList.forEach(student -> System.out.println(student.getId() + " " + student.getAge() + " " + student.getName()));
    }
}

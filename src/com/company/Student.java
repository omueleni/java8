package com.company;

/**
 * Created by kogbe on 21/08/2018.
 */
public class Student implements Comparable<Student> {


    private int age;

    private String name;

    private int id;

    public int getId() {
        return id;
    }

    public Student(int id, int age, String name ){
        this.id = id;
        this.age = age;
        this.name = name;
    }


    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        return  name.compareTo(o.getName());
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null){
            return false;
        }

        if (!(obj instanceof Student)){
            return  false;
        }

        return this.getId() == ((Student)obj).getId();
    }

    @Override
    public int hashCode() {
        return id;
    }
}
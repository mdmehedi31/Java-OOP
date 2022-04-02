package com.pondit.CollectionFramework;

import java.util.Objects;

public class Student implements Comparable<Student> {

    private String name;

    public Student(String name){
        this.name= name;
    }

    @Override
    public String toString(){
        return name;
    }

    @Override
    public  boolean equals(Object o) {
        if (this == o) return true;
        if (this == o || getClass() != o.getClass())
            return false;
    Student student= (Student) o;

    return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode(){
        return Objects.hash(name);
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }
}

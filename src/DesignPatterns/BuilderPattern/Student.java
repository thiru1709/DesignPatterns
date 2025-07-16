package DesignPatterns.BuilderPattern;

import java.util.List;


public class Student {

    private int rollNo;
    private int age;
    private String name;
    private String fatherName;
    private String motherName;
    List<String> subjects;

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", subjects=" + subjects +
                '}';
    }

    public Student(StudentBuilder studentBuilder){
        this.rollNo = studentBuilder.rollNo;
        this.age = studentBuilder.age;
        this.name = studentBuilder.name;
        this.fatherName = studentBuilder.fatherName;
        this.motherName = studentBuilder.motherName;
        this.subjects = studentBuilder.subjects;
    }
}

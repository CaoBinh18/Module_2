package com.codegym;

public class TestStaticMethod {
    public static void main(String args[]) {
        Student.change(); //calling change method

        //creating objects
        Student s1 = new Student(111, "Đạt");
        Student s2 = new Student(222, "Phước");
        Student s3 = new Student(333, "Sơn");

        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}

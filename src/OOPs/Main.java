package OOPs;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    }
}
        class Student{
        int roll;
        String name;
        float marks;

        Student(){
            //this is how you call another constructor with "this" keyword
            //internally it is like new Student(13,"default",21.8f);
        this(13,"default",21.8f);
        }
        Student(int roll, String name, float marks){
            this.roll = roll;
            this.name = name;
            this.marks = marks;
        }
        }
class A{
    final int num=10;
    String name;
    public A(String name) {
        this.name=name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("obj is destroyed .");
    }
}
package in.saurabh.springbootdemo;

import org.springframework.stereotype.Component;

@Component
public class Student {
    private String name;
    private int age;


    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }



    public Student(){

    }

    public Student(int age, String name){
        this.age = age;
        this.name = name;
    }
}

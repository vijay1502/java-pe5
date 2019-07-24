package com.stackroute.pe5;

import java.util.*;

public class Student {
    private int id;
    private int age;
    private String name;

    public int getId() {
        return id;
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

    public Student(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }
}

class StudentSorter implements Comparator<Student>{
    public int compare(Student student1,Student student2) {
        if(student1.getAge()>student2.getAge())
        {
            return student1.getAge()-student2.getAge();
        }
        else if(student1.getName().equals(student2.getName())&&student1.getAge()==student2.getAge())
        {
            return student1.getName().compareToIgnoreCase(student2.getName());
        }
        else
        {
            return student1.getId()-student2.getId();
        }
    }


}

class MainTest{
    public static void main(String[] args) {


        Student student1=new Student(1425,22,"Vijay");
        Student student2=new Student(1539,34,"Aditya");
        Student student3=new Student(1421,23,"Vishnu");
        Student student4=new Student(1352,25,"Rakesh");
        Student student5=new Student(1626,26,"Manish");
        List<Student> list=new ArrayList<Student>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        Collections.sort(list,new StudentSorter());
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i).getId() + " " + list.get(i).getName() + " " + list.get(i).getAge());

        }
    }
};


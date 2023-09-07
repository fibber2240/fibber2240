package Immutable;

import java.util.Date;

public class ImmutableLessons {
    public static void main(String[] args) {
        Student student = new Student(32, "Иван", new Date());
        int i = student.getAge();
        String s = student.getName();
        Date d = student.getDate();
        i = 33;
        s = "Борис";
        d.setTime(0);
        System.out.println(student.getAge());
        System.out.println(student.getName());
        System.out.println(student.getDate());
    }
}

final class Student {
    private int age;
    private String name;
    private Date date;

    public Student(int age, String name, Date date) {
        this.age = age;
        this.name = name;
        this.date = date;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return (Date) date.clone();
    }
}



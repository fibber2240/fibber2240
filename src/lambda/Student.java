package lambda;

public class Student {
    int number;
    String name;
    String surname;
    int age;
    int course;

    public Student(int number, String name, String surname, int age, int course) {
        this.number = number;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", course=" + course +
                '}';
    }
}

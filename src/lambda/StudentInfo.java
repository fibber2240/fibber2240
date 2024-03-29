package lambda;

import java.util.ArrayList;

public class StudentInfo {
    void testStudents(ArrayList<Student> al, StudentChecks sc) {
        for (Student s : al) {
            if (sc.check(s)) {
                System.out.println(s);
            }
        }
    }

    //    void printStudentsOverAge(ArrayList<Student> al, int age) {
//        for (Student s : al) {
//            if (s.age > age) {
//                System.out.println(s);
//            }
//        }
//    }
//
//    void printStudentsUnderNumber(ArrayList<Student> al, int number) {
//        for(Student s: al){
//            if(s.number == number){
//                System.out.println(s);
//            }
//        }
//    }
//
//    void printStudentsMixConditions(ArrayList<Student> al, int course, int number) {
//        for (Student s: al) {
//            if(s.course < course && s.number > number){
//                System.out.println(s);
//            }
//        }
//    }
    public static void main(String[] args) {
        Student st1 = new Student(1, "Ivan", "Ivanov", 30, 4);
        Student st2 = new Student(2, "Petr", "Petrov", 31, 4);
        Student st3 = new Student(3, "Sidr", "Sidorov", 40, 5);
        Student st4 = new Student(4, "Vlad", "Vladov", 45, 5);
        Student st5 = new Student(5, "Igor", "Igorov", 32, 3);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

           StudentInfo info = new StudentInfo();
//        info.testStudents(students, new CheckOverAge());
//        System.out.println("-------------------------------------");
//        // анонимный класс
//        info.testStudents(students, new StudentChecks() {
//            @Override
//            public boolean check(Student s) {
//                return s.age < 35;
//            }
//        });
        info.testStudents(students, (Student s) -> {return s.age > 30 && s.course > 2;});
        System.out.println("-------------------------------------");
        info.testStudents(students, (Student s) -> {return s.course > 3;});
        System.out.println("-------------------------------------");
        // лямбда выражение (сложная запись)
        info.testStudents(students, (Student s) -> {return s.age < 35;});

//        info.printStudentsMixConditions(students,5,3);
//        System.out.println("-------------------------------------");
//        info.printStudentsOverAge(students,31);
//        System.out.println("-------------------------------------");
//        info.printStudentsUnderNumber(students,5);
    }
}
// Функциональный интерфейс
interface StudentChecks {
    boolean check(Student s);
}

class CheckOverAge implements StudentChecks {
    @Override
    public boolean check(Student s) {
        return s.age > 35;
    }
}
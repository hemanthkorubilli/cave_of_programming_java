public class classesExample {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Hemanth";
        student1.age = 22;
        student1.percent = 74.5;
        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.percent);

    }
}

class Student {
    String name;
    int age;
    double percent;
}

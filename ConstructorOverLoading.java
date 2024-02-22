public class ConstructorOverLoading {
    public static void main(String[] args) {
        Ece student1 = new Ece("hemanth", 22, 86.3f);
        Ece student2 = new Ece("Chandu", 21, 85.5f);
        Ece student3 = new Ece();
        System.out.println(student1.name);
        System.out.println(student2.name);
        System.out.println(student3.name);
    }
}

class Ece {
    String name;
    int age;
    float percentage;

    Ece() {
        this.name = "uday";
        this.age = 21;
        this.percentage = 70.0f;
    }

    Ece(String name, int age, float percentage) {
        this.name = name;
        this.age = age;
        this.percentage = percentage;
    }
}

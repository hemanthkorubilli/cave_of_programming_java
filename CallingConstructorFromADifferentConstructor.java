public class CallingConstructorFromADifferentConstructor {
    public static void main(String[] args) {
        Ece student1 = new Ece("hemanth", 22, 86.3f);
        Ece student2 = new Ece("Chandu", 21, 85.5f);
        Ece random = new Ece();
        System.out.println(student1.name);
        System.out.println(student2.name);
        System.out.println(random.name);

    }
}

class Ece {
    String name;
    int age;
    float percentage;

    Ece() {
        this("default name", 20, 50.0f);
    }

    Ece(String name, int age, float percentage) {
        this.name = name;
        this.age = age;
        this.percentage = percentage;
    }
}

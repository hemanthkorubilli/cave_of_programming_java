public class thisconstructor {
    public static void main(String[] args) {
        Ece student1 = new Ece("hemanth", 22, 86.3f);
        Ece student2 = new Ece("Chandu", 21, 85.5f);
        System.out.println(student1.name);
        System.out.println(student2.name);
    }
}

class Ece {
    String name;
    int age;
    float percentage;

    Ece(String name, int age, float percentage) {
        this.name = name;
        this.age = age;
        this.percentage = percentage;
    }
}

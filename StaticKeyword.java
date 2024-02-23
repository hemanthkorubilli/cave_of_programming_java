package mainpakage;

public class StaticKeyword {
    public static void main(String[] args) {
        Human one = new Human("hemanth", 22, 14000);
        Human two = new Human("prakash", 40, 250000);
        System.out.println("Name of first person:\n" + one.name);
        System.out.println("Name of second person:\n" + two.name);
        System.out.println("Total population:\n"+Human.population);

    }
}

class Human {
    String name;
    int age;
    int salary;
    static int population;

    Human(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        Human.population += 1;

    }
}

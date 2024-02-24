package Inheritance;

public class Main {
    public static void main(String[] args) {
        Childclass child1box = new Childclass();
        System.out.println(child1box.l + " " + child1box.b + " " + child1box.w);
        Childclass child2box = new Childclass(2, 4, 6);
        System.out.println(child2box.l + " " + child2box.b + " " + child2box.w);
        child1box.example();
    }

}

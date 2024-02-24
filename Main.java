package Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        System.out.println(box1.l + " " + box1.b + " " + box1.w);
        Box box2 = new Box(2, 4, 6);
        System.out.println(box2.l + " " + box2.b + " " + box2.w);
        box1.example();
    }

}

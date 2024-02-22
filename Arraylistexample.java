import java.util.ArrayList;
import java.util.Scanner;

public class Arraylistexample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        int i = 1;
        char value;
        do {
            System.out.println("Enter username " + i);
            String str = sc.next();
            list.add(str);
            i++;
            System.out.println("Do you still want to continue?(y/n)");
            char ch = sc.next().charAt(0);
            value = ch;
        } while (value == 'y');
        System.out.println("The Names entered are:");
        for (int j = 0; j < list.size(); j++) {
            System.out.println(list.get(j));
        }
    }
}

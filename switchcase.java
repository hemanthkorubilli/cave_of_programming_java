import java.util.*;
class swithcase{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        switch(a){
            case 1:
                System.out.print("Monday");
                break;
            case 2:
                System.out.print("Tuesday");
                break;

                default:
                    System.out.print("nothig");
                    break;
        }
    }
}
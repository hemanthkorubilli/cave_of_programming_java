import java.util.*;
class dowhile{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=0;
        do{
            System.out.println("Enter value:");
            a=sc.nextInt();
        }while(a!=10);
        System.out.print("Got number 10");
    }
}
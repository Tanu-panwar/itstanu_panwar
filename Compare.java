import java.util.Scanner;
public class Compare {
    public static void main(String ar[]){
        Scanner s1 = new Scanner (System.in);
        System.out.println("Enter two number:");
        int a = s1.nextInt();
        int b = s1.nextInt();
        if(a>b)
        System.out.println(a+" is greater than "+b);
        else if(b>a)
        System.out.println(b+" is greater than "+a);
        else
        System.out.println("Both are equal...");
    }
}

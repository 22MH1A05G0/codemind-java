import java.util.*;
public class fun{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = (a*a)+(b*b);
        double d = Math.sqrt(c);
        System.out.printf("%.2f",d);
    }
}
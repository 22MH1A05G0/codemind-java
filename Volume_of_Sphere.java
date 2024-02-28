import java.util.*;
public class fun{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double r = sc.nextInt();
        double volume = (4*(3.14)*r*r*r)/3;
        System.out.printf("%.2f",volume);
    }
}
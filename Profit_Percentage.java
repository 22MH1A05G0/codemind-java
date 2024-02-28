import java.util.*;
public class fun{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double sp = sc.nextInt();
        double cp = sc.nextInt();
        double profit = cp-sp;
        double profitp = (profit/sp)*100;
        System.out.printf("%.2f",profitp);
    }
}
import java.util.*;
public class fun{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double cp = sc.nextInt();
        double sp = sc.nextInt();
        double loss = cp-sp;
        double lp = (loss/cp)*100;
        System.out.printf("%.2f",lp);
    }
    
}
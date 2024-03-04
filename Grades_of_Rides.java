import java.util.*;
public class fun{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int HurlFactor = sc.nextInt();
        int SpinFactor = sc.nextInt();
        int SpeedFactor = sc.nextInt();
        if(HurlFactor>50 && SpinFactor>60 && SpeedFactor>100){
            System.out.println("10");
        }
        else if(HurlFactor>50 && SpinFactor>60){
            System.out.println("9");
        }
        else if(SpinFactor>60 && SpeedFactor>100){
            System.out.println("8");
        }
        else if(HurlFactor>50 && SpeedFactor>100){
            System.out.println("7");
        }
        else if(HurlFactor>50 || SpinFactor>60 || SpeedFactor>100){
            System.out.println("6");
        }
        else {
            System.out.println("5");
        }
    }
}
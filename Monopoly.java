import java.util.*;
public class fun{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a>b+c || b>a+c || c>b+a){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
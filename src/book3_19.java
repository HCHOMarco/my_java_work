import java.util.Scanner;
public class book3_19 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        double a=kb.nextDouble(),b=kb.nextDouble(),c=kb.nextDouble();
        if((a+b>c)&&(a+c>b)&&(b+c>a)){
            System.out.println(a+b+c);
        }else{
            System.out.println("Error");
        }

    }
}

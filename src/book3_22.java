import java.util.Scanner;
public class book3_22 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.print("Enter a point with two coordinates:");
        double x=kb.nextDouble(),y=kb.nextDouble();
        System.out.print("Point ("+x+", "+y+") ");
        if(x*x+y*y-100<=0){
            System.out.println("is in the circle");
        }else{
            System.out.println("is not in the circle");
        }
    }
}

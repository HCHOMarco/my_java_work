import java.util.Scanner;
public class book3_23 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.print("Enter a point with two coordinates:");
        double x=kb.nextDouble(),y=kb.nextDouble();
        System.out.print("Point ("+x+", "+y+") ");
        if(x>=-5&&x<=5&&y>=-2.5&&y<=2.5)
            System.out.println("is in the rectangle");
        else System.out.println("is not in the rectangle");
    }
}

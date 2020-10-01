import java.util.Scanner;
public class book3_27 {
    public static void main(String[] args) {
        System.out.print("Enter a point's x- and y-coordinates:");
        Scanner kb=new Scanner(System.in);
        double x=kb.nextDouble();
        double y=kb.nextDouble();

        if(x>0&&y>0&&(2*y+x-200<0)){
            System.out.println("The point is in the triangle");
        }else{
            System.out.println("The point is not in the triangle");
        }

    }
}

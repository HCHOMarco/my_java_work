import java.util.Scanner;
public class book3_29 {
    public static void main(String[] args) {
        Scanner kba=new Scanner(System.in);
        System.out.print("Enter circle1's center x-,y-coordinates,and radius:");
        double x1=kba.nextDouble(),y1=kba.nextDouble(),r1=kba.nextDouble();
        System.out.print("Enter circle2's center x-,y-coordinates,and radius:");

        //Scanner kbb=new Scanner(System.in);
        double x2=kba.nextDouble(),y2=kba.nextDouble(),r2=kba.nextDouble();
        double dis=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        if(Math.abs(r1-r2)>=dis){
            System.out.println("circle2 is inside circle1");
        }else if(r1+r2>dis){
            System.out.println("circle2 is overlap circle1");
        }else if(dis>r1+r2){
            System.out.println("circle2 is not overlap circle1");
        }

    }
}

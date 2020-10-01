import java.util.Scanner;
public class book3_28 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.print("Enter r1's center x-, y-coordinates, width, and height:");
        double x1=kb.nextDouble(),y1=kb.nextDouble(),w1=kb.nextDouble(),h1=kb.nextDouble();
        System.out.print("Enter r2's center x-, y-coordinates, width, and height:");
        double x2=kb.nextDouble(),y2=kb.nextDouble(),w2=kb.nextDouble(),h2=kb.nextDouble();
        double XL=x1-w1/2,XR=x1+w1/2,YD=y1-h1/2,YU=y1+h1/2;
        double x=x2+w2/2;
        double y=y2+h2/2;
        int cnt=0;

        if(x>=XL&&x<=XR&&y>=YD&&y<=YU)cnt+=1;

        y=y2-h2/2;
        if(x>=XL&&x<=XR&&y>=YD&&y<=YU)cnt+=1;

        x=x2-w2/2;
        if(x>=XL&&x<=XR&&y>=YD&&y<=YU)cnt+=1;

        y=y2+h2/2;
        if(x>=XL&&x<=XR&&y>=YD&&y<=YU)cnt+=1;

        if(cnt==0)System.out.println("r2 does not overlap r1");
        else if(cnt<4)System.out.println("r2 overlaps r1");
        else System.out.println("r2 is inside r1");
    }
}

import java.util.Scanner;
public class book3_21 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.print("Enter year:");
        int year=kb.nextInt();
        System.out.print("Enter month:");
        int m=kb.nextInt();
        if(m==1||m==2){
            m+=12;
            year--;
        }
        System.out.print("Enter the day of the month:");
        int q=kb.nextInt();
        int j=year/100,k=year%100;
        int h=(q+(26*(m+1)/10)+k+k/4+j/4+5*j)%7;
        System.out.print("Day of the week is ");
        if(h==0)System.out.println("Saturday");
        else if(h==1)System.out.println("Sunday");
        else if(h==2)System.out.println("Monday");
        else if(h==3)System.out.println("Tuesday");
        else if(h==4)System.out.println("Wednesday");
        else if(h==5)System.out.println("Thursday");
        else System.out.println("Friday");
    }
}

import java.util.Scanner;
public class book3_9 {
    public static void main(String[] args) {
        System.out.println("Enter the first 9 digits of an ISBN as integer:");
        Scanner kb=new Scanner(System.in);
        String str=kb.nextLine();
        int len=str.length();
        int tot=0;
        for(int i=0;i<len;i++){
            int n=str.charAt(i)-'0';
//            System.out.println(n);
            tot+=n*(i+1);
        }
        tot%=11;
        System.out.print("The ISBN-10 number is "+str);
        if(tot!=10)System.out.println(tot);
        else System.out.println("X");

    }
}

import java.util.Random;
import java.util.Scanner;
public class book3_24 {
    public static void main(String[] args) {
        String[] str_a={"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        String[] str_b={"Clubs","Diamonds","Hearts","Spades"};
        Random r=new Random();
        int x=r.nextInt(13);
        int y=r.nextInt(4);
        System.out.println("The card you picked is "+str_a[x]+" of "+str_b[y]);
    }
}

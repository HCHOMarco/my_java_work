import java.util.Scanner;
public class book3_15 {
    public static void main(String[] args) {
        int n=(int)(Math.random()*(999-100+1))+100;
        int[] a=new int[10];
        System.out.println(n);

        int x=n;
        for(int i=0;i<3;i++){
            a[i]=n%10;
            n/=10;
        }

        Scanner kb=new Scanner(System.in);
        System.out.println("Please enter a number");
        int num=kb.nextInt();
        int y=num;
//        int a=num/100;
//        int b=num/10%10;
//        int c=num%10;

        int[] b=new int[10];
        for(int i=0;i<3;i++){
            b[i]=num%10;
            num/=10;
        }


        int tot=0;
        if(x==y) tot+=10000;
        else{
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    if(a[i]==b[i]){
                        tot+=1000;
                        break;
                    }
                }
            }
        }
        System.out.println("Money of you get:"+tot);

    }
}

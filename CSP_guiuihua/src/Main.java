import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        double []a=new double[n];
        double []f=new double[n];
        double aver=0,D=0;
        for(int i=0;i<n;i++) {
            a[i] = scanner.nextDouble();
            aver+=a[i];
        }
        aver=aver/n;
        for(int i=0;i<n;i++)
            D+=(a[i]-aver)*(a[i]-aver);
        D=D/n;
        for(int i=0;i<n;i++)
         f[i]=(a[i]-aver)/sqrt(D);

        for(int i=0;i<n;i++)
            System.out.println(f[i]);
    }
}
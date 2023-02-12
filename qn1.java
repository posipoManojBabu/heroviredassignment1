import java.util.Scanner;
public class qn1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N;
        N=sc.nextInt();
        int [] A=new int[N];
        for(int i=0;i<N;i++)
        {
            A[i]=sc.nextInt();
        }
        int a=A[N-1];
        int c=0;
        int [] B=new int[a];
        for(int i=0;i<a;i++)
        {
            B[i]=i+1;
        }
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<N;j++)
            {
                if(A[j]==B[i])
                c++;
            }
            if(c==0)
            {
                System.out.print(B[i]+" ");
            }
            c=0;
        }
    }
}

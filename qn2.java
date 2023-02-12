import java.util.Scanner;
import java.util.ArrayList;

public class qn2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N;
        N=sc.nextInt();
        int [] A=new int[N];
        for(int i=0;i<N;i++)
        {
            A[i]=sc.nextInt();
        }
        ArrayList<Integer>L=new ArrayList<Integer>(N);
        for(int i=0;i<N;i++)
        {
           L.add(A[i]);
        }
        for(int i=0;i<L.size();i++)
        {
            
            for(int j=0;j<L.size();j++)
            {
                if(L.get(i)==L.get(j) && i!=j)
                {
                    L.remove(j);
                }
            }
            
        } 
        for(int i=0;i<L.size();i++)
        {
            System.out.print(L.get(i)+" ");
        } 
        sc.close(); 
    }
}

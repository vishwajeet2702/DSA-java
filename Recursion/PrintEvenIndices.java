import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
      
        int n = sc.nextInt();
        if(n==0)
        return;
      
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        one(0,n,a);
        }
public static void one(int i,int n,int a[]) {
        if(i==n){
            return;
        }
  
        int j=i+1;
        one(j,n,a);
        if(i%2==0){
            System.out.print(a[i]+" ");
        }
    }
}
  

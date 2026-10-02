import java.util.*;

public class Square_sum_search{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        long sum=0;

        for(int i=0;i<n;i++){
            sum+=sc.nextLong();
        }

        long left=0;
        long right=10000000;
        boolean check=false;

        while(left<=right){
            long mid=left+(right-left)/2;
            long square=mid*mid;

            if(square==sum){
                check=true;
                break;
            }
            else if(square<sum){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }

        if(check)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
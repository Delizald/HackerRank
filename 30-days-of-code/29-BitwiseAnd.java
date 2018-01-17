import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        
        int N = scan.nextInt();
        
        for(int i=0; i<N; i++){
            int n1 = scan.nextInt();
            int n2 = scan.nextInt();
            
            int result = doWork(n1,n2);
            
            System.out.println(result);
        }
        scan.close();
    }
    
    static int doWork(int n1, int n2){
        int result = 0;
        for(int i = 1; i <= n1;i++){
            for(int j = i +1; j <= n1; j++){
                int meh = i & j;
                if(meh > result && meh < n2){
                    result = meh;
                }
            }
        }
        return result;
    }
    
}
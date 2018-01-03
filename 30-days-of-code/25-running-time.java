import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanning = new Scanner(System.in);
        
        int numbah = scanning.nextInt();
        
        for(int i=0; i < numbah; i++){
            int n = scanning.nextInt();
            boolean isPrime = isThisPrime(n);
            System.out.println(isPrime ? "Prime" : "Not prime");
        }
    }
    
    public static boolean isThisPrime(int n){
        if(n < 2)
          return false;
        
        for (int i = 2; i * i <= n; i++) {
		  if (n % i == 0) {
		      return false;
		  }
		}
        
        return true;
    }
}
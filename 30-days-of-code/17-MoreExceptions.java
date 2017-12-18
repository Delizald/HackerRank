import java.util.*;
import java.io.*;
//Write your code here
class Calculator{
	int power(int x ,int y) throws Exception{
		if( x < 0 || y < 0){
			throw new Exception("n and p should be non-negative");
        }
        
        if(y == 0){
            return 1;
        }else{
            int power = 1;
            for (int i = 0; i < y; i++) {
			 power *= x;
		    }
            return power;
        }
    }
}

class Solution{

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}

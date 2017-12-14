import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
		
        int secInt;
        double secDouble;
        String secString;
        
        secInt = scan.nextInt();
        secDouble = scan.nextDouble();
        scan.nextLine();
        secString = scan.nextLine();
        
        System.out.println(Integer.toString(secInt + i));
        System.out.println(Double.toString(secDouble + d));
        
		System.out.println(s + secString);
        scan.close();
    }
}

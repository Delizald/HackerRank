import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        
        int aDay = scan.nextInt();
        int aMonth = scan.nextInt();
        int aYear = scan.nextInt();
        int eDay = scan.nextInt();
        int eMonth = scan.nextInt();
        int eYear = scan.nextInt();
        scan.close();
        
        int fine = 0;
        if (aYear > eYear) {
			fine = 10000;
		} else if (aMonth > eMonth && (aYear >= eYear)) {
			fine = 500 * (aMonth - eMonth);
		} else if (aDay > eDay && (aMonth >= eMonth) && (aYear >= eYear)) {
			fine = 15 * (aDay - eDay);
		} else {
			fine = 0;
		}
        
        System.out.println(fine);
    }
}
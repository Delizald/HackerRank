import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] arrayString = new String[n];
        
        
        Pattern pattern = Pattern.compile("[a-z]+@gmail.com");  
        ArrayList<String> arrList = new ArrayList();
        Matcher match;
        
        for(int i =0; i < n; i++){
            String fName = scan.next();
            String email = scan.next();
            match = pattern.matcher(email);
            if(match.find())
                arrList.add(fName.toLowerCase());
        }
        
        Collections.sort(arrList);
        
        for(String s : arrList){
            System.out.println(s);
        }
    }
}
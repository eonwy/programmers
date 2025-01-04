import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result = "";
        
        for(char c : a.toCharArray()) {
            result += Character.isLowerCase(c) ? Character.toUpperCase(c) : Character.toLowerCase(c);
        }
        
        System.out.println(result);
    }
}
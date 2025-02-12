import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int three = a * (b % 10);
        int four = a * ((b % 100) / 10);
        int five = a * (b / 100);
        int six = a * b;
        
        System.out.println(three);
        System.out.println(four);
        System.out.println(five);
        System.out.println(six);
        
        sc.close();
    }
}
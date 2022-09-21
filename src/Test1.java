import java.util.*;
public class Test1 {
    public static void main(String[] args) {
        System.out.println("This is a workshop!");
        System.out.println("Enter x and y");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(x + y);
        System.out.println(x * y);
        System.out.println(y / x);
        int total = (x + y) * 1000;
        System.out.println(total + "$");
    }
}

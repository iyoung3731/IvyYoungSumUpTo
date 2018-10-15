package IvyYoung;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int sum = 0;
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}

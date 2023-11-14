import java.util.*;
import java.lang.*;

class calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num of subjects");
        int n = sc.nextInt();
        int i, total = 0;
        int temp;
        int avg;
        for (i = 1; i <= n; i++) {
            System.out.println("Enter the mark of sub" + i);
            temp = sc.nextInt();
            total = total + temp;

        }
        System.out.println("The total mark you have obtained " + total);
        avg = total / n;
        if (avg >= 90) {
            System.out.println("Your grae is: O");
        } else if (avg >= 80 && avg < 90) {
            System.out.println("Your grae is: A");
        }
         else if (avg >= 70 && avg < 80) {
            System.out.println("Your grae is: B");
        }
         else if (avg >= 60 && avg < 70) {
            System.out.println("Your grae is: C");
        }
         else if (avg >= 50 && avg < 60) {
            System.out.println("Your grae is: D");
        }
         else if (avg >= 40 && avg < 50) {
            System.out.println("Your grae is: F");
        }
        else{
            System.out.println("You need to work hard...");
        }

    }
}
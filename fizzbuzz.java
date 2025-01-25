
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class fizzbuzz {
    public static List<String> fizzBuzz(int n) {
        int[] primaryhold = new int[n];
        List<String> v = new ArrayList<>();
        while (n != 0) {
            primaryhold[n - 1] = n;
            n--;
        }
        for (int i = 0; i < primaryhold.length; i++) {
            if (primaryhold[i] % 3 == 0 && primaryhold[i] % 5 == 0) {
                v.add("FizzBuzz");
            } else if (primaryhold[i] % 3 == 0) {
                v.add("Fizz");
            } else if (primaryhold[i] % 5 == 0) {
                v.add("Buzz");
            } else {
                v.add(String.valueOf(primaryhold[i]));
            }
        }
        return v;

    }

    public static void main(String[] args) {
        Scanner ax = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int x = ax.nextInt();
        System.out.println(fizzBuzz(x));
    }

}
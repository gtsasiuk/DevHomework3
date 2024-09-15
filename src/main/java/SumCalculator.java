import java.util.Scanner;

public class SumCalculator {
    public int sum(int n) {
        if(n <= 0) {
            throw new IllegalArgumentException();
        }
        int s = 0;
        for (int i=1; i<=n; i++) {
            s += i;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = in.nextInt();
        SumCalculator sumCalculator = new SumCalculator();
        System.out.println(sumCalculator.sum(n));
    }

}

import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
      	n=n/10;
        n=n%10;
      System.out.println(n);
	}
}
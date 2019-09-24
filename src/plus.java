import java.util.Scanner;

public class plus {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int x = 0;
		for (int i=1;i<=num;i++) {
			x += i;
		}
		System.out.println(x);
	}

}

import java.util.Scanner;

public class calculate {

	public static final void main (String[] args) {

		Integer c = 0;
		Scanner sc = new Scanner(System.in);
		Integer a = sc.nextInt();
		String op = sc.next();
		Integer b = sc.nextInt();

		switch(op) {
			case "+": {
				c = a + b;
			} break;
			case "-": {
				c = a - b;
			} break;
			case "*": {
				c = a * b;
			} break;
			case "/": {
				c = a / b;
			} break;
			default: {
				System.out.println("I can't do it");
				System.exit(0);
			}
		}
		sc.close();
		System.out.print(c);
	}
}
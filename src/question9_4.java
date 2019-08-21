import java.util.Random;

public class question9_4 {

	public static void main(String[] args) {

	Random randomNumber = new Random(1000);

		for (int i = 0; i < 50; i++) {
			if (i % 9 == 0)
				System.out.print("    " + randomNumber.nextInt(100) + "\n\n");
			else
				System.out.print("    " + randomNumber.nextInt(100));
		}
	}

}

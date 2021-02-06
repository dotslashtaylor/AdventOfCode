import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;

public class ComboBreakerDay25 {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("./inputs/input25"));
		
		int cardPublicKey = in.nextInt();
		int doorPublicKey = in.nextInt();

		int encryptionKey = PartOne(cardPublicKey, doorPublicKey);
		System.out.println("The solution to part one is " + encryptionKey);

	}

	public static int calculateLoops(int key, int constant) {

		int value = 1;
		int loopSize = 0;

		int subject = 7;

		while (value != key) {
			value = value * subject;
			value = value % constant;
			loopSize++;
		} 

		return loopSize;
	}

	public static int PartOne(int cardPublicKey, int doorPublicKey) {

		boolean flag = false;
		int encryptionKey = 0;
		int cardLoops = 0;
		int doorLoops = 0;
		BigInteger cardValue = new BigInteger("1");
		BigInteger doorValue = new BigInteger("1");
		final int constant = 20201227;

		cardLoops = calculateLoops(cardPublicKey, constant);
		doorLoops = calculateLoops(doorPublicKey, constant);
			
		for (int i = 0; i < cardLoops; i++) {
			doorValue = doorValue.multiply(BigInteger.valueOf(doorPublicKey));
			doorValue = doorValue.remainder(BigInteger.valueOf(constant));
		}
		
		return doorValue.intValue();
	}

}

package ch14;

import java.util.function.IntSupplier;

public class SupplierExample {
	public static void main(String[] args) {
		IntSupplier intSupplier = () -> {
			int num = (int) (Math.random() * 10) + 1;
			return num;
		};
		int randomNum = intSupplier.getAsInt();
		System.out.println(randomNum);
	}
}

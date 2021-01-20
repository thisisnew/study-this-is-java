package Ch05;

import java.util.Arrays;

public class ArrayCopyExample {

	public static void main(String[] args) {
		int[] oldArray = {1, 2, 3};
		int[] newArray = new int[5];
		
		System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
		
		System.out.println(Arrays.toString(newArray));
	}

}

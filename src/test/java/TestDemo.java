
public class TestDemo {

	public static void main(String[] args) {

		int givenNumbers[] = { 22, 12, 65, 47, 999 };

		System.out.println(getNumber(givenNumbers));
	}

	private static int getNumber(int[] myNumbers) {

		int maxNum = 0;
		int secondMax = 0;

		for (int i = 0; i < myNumbers.length; i++) {
			if (myNumbers[i] > maxNum) { 
				maxNum = myNumbers[i];
			}
			else if(myNumbers[i] > secondMax && secondMax < maxNum ){
				secondMax = myNumbers[i] ;
			}
		}
		
		System.out.println(secondMax);
		
		return maxNum;
	}

}

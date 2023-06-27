import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestDemo1 {

	public static void main(String[] args) {
	   int numbers[]  = {4, 2,3,4, 5,2,3};
	   
	   for(int i=0; i < numbers.length ; i++) {
		   for(int j=i+1; j < numbers.length ; j++) {
			   if(numbers[i] == numbers[j]) {
				   System.out.println(numbers[i]);
				   break;
			   }
		   }
	   }
	   
	   String text = "Thoudishetti";
	   
	   char[] myArray = text.toCharArray();
	   Set myUniqData  =  new HashSet();
	   
	   for(Character ch : myArray) {
		   myUniqData.add(ch.toLowerCase(0));
	   }
	   
	   System.out.println(myUniqData);
	   
	}

}

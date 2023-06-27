
public class SampleDemo {

	public static void main(String[] args) {
		  String input = "Try  to  remove   extra   spaces.";
		  String myStringArray[] = input.split(" ");
		  String finalstring[] = new String[myStringArray.length];
		  
		  for(int i=0 ; i < myStringArray.length ;  i++){
		   finalstring[i] = myStringArray[i].trim();
		  }
		  
		   for(int j=0 ; j < finalstring.length ;  j++){
		   System.out.print(finalstring[j]);
		   System.out.print(" ");
		  }
		  
		   System.out.println();
		   System.out.print(input);
	}

}

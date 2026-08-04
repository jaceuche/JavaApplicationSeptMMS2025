import java.util.Arrays;

public class UsingArrayClass{
	public static void main(String[] args) {
		int [] numbers = {5,8,3,9,4,1,6,7,10};
		
		Arrays.sort (numbers);
		System.out.println("The elements of the array are");
		
		for(int number : numbers){
			System.out.printf("%d%n",numbers);
		}
		System.out.println("Binary search");
		int index = Arrays.binarysearch(numbers,9);
		System.out.printf("The index number of the element 9 is %d%n,index");
		
		boolean isEqual = Array.equaps("a,b");
		System.out.print(The result is %b%n, is Equal;);
	}
}
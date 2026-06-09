public class StackFrame {
	public static void main (String[] args) {
		
	}
	public static void readMe (String story) {
		System.out.println("======Story=====");
		System.out.println("%s%n,Story");
		
		checkAge (20);
		
	}	
	
	public static void checkAge(int age) {
		if(age >= 18) {
			System.out.printf("Your age %d, you are an adult%n",age);
		}
		else{
			System.out.printf("you are %d, you are still a minor%n",age);
		}
		
		
	}
	
}

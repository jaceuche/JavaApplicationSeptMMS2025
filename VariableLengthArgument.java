public class VariableLengthArgument {
	public static void main(String[] args) {
		System.out.printf("The sum is %d%n",addition(5,6,8,9,3,2,1));
		System.out.printf("The sum is %d%n",addition(5,6,8,9,2,1));
		System.out.printf("The sum is %d%n",addition(6,8,9,2,1));
		System.out.printf("The sum is %d%n",addition(8,9,2,1));
		System.out.printf("The sum is %d%n",addition(9,2,1));
		System.out.printf("The sum is %d%n",addition(2,1));
		System.out.printf("The sum is %d%n",addition(5));
		System.out.printf("The sum is %d%n",addition());
	}
	
	public static int addition(int... numbers) {
		int sum =0;
		for(int number : numbers) {
			sum += numbers;
		}
		return sum;
	}
}
public class InstanceMethodInJava {
	//Method here
	public static void main(String [] args) {
		InstanceMethodInJava InstanceMethod = new InstanceMethodInJava();
		int sum = JavaMethod.add(70,50,80);
		
		System.out.println("The sum of all he numbers is %d%n",sum);
		
	}
	public int add(int num1, int nmu2, int num3) {
		
		int sum = num1 + num2 + num3;
		return sum;
		
	}
}
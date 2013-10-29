public class FizzBuzz{
	public static void main(String[]args){
		for (int i = 0; i <100; i++){
			System.out.println(i);
			if (i%5 == 0)
				System.out.println("Buzz");
			if (i%10 == 0)
				System.out.println("Cat");
		}
	}
}
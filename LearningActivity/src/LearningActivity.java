
public class LearningActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator c = new Calculator();
		System.out.println(c.Add(3,2));
	}

}

class Calculator{
	
	private int result; 
	
	public int Add(int a, int b) {
		result = a+b; 
		return result;
	}
}
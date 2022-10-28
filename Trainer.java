package programmBasics;

public class Trainer {
	
		String dept="Java";
		String institute="Payilagam";
		private int salary=10000;
		
		
	public Trainer(String dept, String institute) {
			// TODO Auto-generated constructor stub
		
		System.out.println("Constructor of Trainer class with two arguments");		
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Trainer trainerKumar=new Trainer("CSE", "Payilagam");
			trainerKumar.training();
	}
	public int getSalary()
	{
		return salary;
	}
	
	 void training()
	{
		System.out.println("Training Method");
	}

}

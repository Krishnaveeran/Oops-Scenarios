package programmBasics;

public class SQLTrainer extends Trainer {
	
	SQLTrainer()
	{
		super("CSE","Payilagam");
	}
	
	
	public static void main(String[] args) {
		SQLTrainer ram=new SQLTrainer();
		ram.training();
		System.out.println(ram.dept);
		System.out.println(ram.institute);
		System.out.println(ram.getSalary());
		
}
}

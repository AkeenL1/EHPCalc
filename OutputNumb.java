import java.util.Scanner;

public class OutputNumb {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			String run = sc.nextLine().toUpperCase();
			if(run.equals("BREAK"))break;
			else if(run.equals("ASH")){
				System.out.println("Input health,armor,and shields");
				Ash(sc.nextInt(), sc.nextInt(), sc.nextInt());
				run = sc.nextLine();
			}
			
		}

	}
	public static double Ash(double health,double armor, double shield) {
		double ehp = health*(1+(armor/300))+shield;
		System.out.println((int)ehp);
		return  ehp;
	}

}
/*
Health*(1+(Armor/300)+Shield.
*/
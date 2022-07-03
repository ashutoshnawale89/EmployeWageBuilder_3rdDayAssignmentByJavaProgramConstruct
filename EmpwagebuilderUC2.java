
public class EmpwagebuilderUC2 {
	
	public static void main(String [] args) {
		// Constant
		int IS_FULL_TIME =1;
		int EMP_RATE_PER_HOUR = 20;
		// Variables
		int emphrs = 0;
		int empwage = 0;
	
		// Computation
	     double empcheck = Math.floor(Math.random() * 10) % 2;
		if (empcheck == IS_FULL_TIME)
	      emphrs = 8;
		else
			emphrs = 0;
		empwage = emphrs * EMP_RATE_PER_HOUR ;
	
			System.out.println( "The salary of Employe is" + empwage );
	}
}


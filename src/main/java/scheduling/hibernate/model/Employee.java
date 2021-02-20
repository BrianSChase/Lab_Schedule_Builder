package scheduleing;

//import com.sun.org.apache.xpath.internal.operations.Bool;

public class Employee {
	private String fname;
	private String lname;
	//1 = day, 2 = evening, 3 = night
	private int shift;
	//1 = trained in department
	private boolean intake = false;
	private boolean chemistry = false;
	private boolean hematology = false;
	private boolean bloodbank = false;
	private boolean micro = false;
	
	//contructor
	public Employee(String fn, String ln, int s) {
		this.fname = fn;
		this.lname = ln;
		this.shift = s;
	}
	//updates departments trained in
	public void updateTraining(boolean i, boolean c, boolean h, boolean b, boolean m){
		this.intake = i;
		this.chemistry = c;
		this.hematology = h;
		this.bloodbank = b;
		this.micro = m;
	}
	//used to returned trained status on a chosen department
	public boolean checkTrained(String input){
		if(input == "intake")
			return this.intake;
		else if(input == "chemistry")
			return this.chemistry;
		else if(input == "hematology")
			return this.hematology;
		else if(input == "bloodbank")
			return this.bloodbank;
		else if(input == "micro")
			return this.micro;
		else
			return false;
		
		
	}
	
	
}

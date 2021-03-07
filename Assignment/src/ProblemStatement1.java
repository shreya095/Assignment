
class employee
{
	int empid;
	String empname;
	String Designation;
	double basic;
	double hra;
	void printDet(){
		System.out.println("Name of the employee:"+empname);
		System.out.println("Id of the employee:"+empid);
		System.out.println("Designation:"+Designation);
		System.out.println("Basic Salary of employee:"+basic);
		
		
	}
	employee(int empid,String empname,String Designation,double basic)
	{
		this.empid=empid;
		this.empname=empname;
		this.Designation=Designation;
		this.basic=basic;
	}
	void Calculate(String Designation,int empid,String empname,double basic,double hra){
		this.basic=basic;
		if (Designation == "Manager" ) {
			
			hra = (10*basic)/100;
			}
		if(Designation == "Officer") {
			hra = (12*basic)/100;

		}
		if(Designation == "clerk") {
			hra = (5*basic)/100;
			
		}
		
				this.hra=hra;
				System.out.println("hra is:"+hra);

	
	}
	
}
public class ProblemStatement1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee e=new employee(20,"shreya","Manager",2000);
		e.printDet();
		e.Calculate("Manager",20,"Shreya",2000, 00);
		System.out.println("*********************");
		employee e1=new employee(21,"shrey","Officer",20000);
		
		e1.printDet();
		
		e1.Calculate("Officer",21,"Shrey",20000, 00);
		
		
		
		
		
		

	}

}


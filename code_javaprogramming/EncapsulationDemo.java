/*
EncapsulationDemo
The wrapping up of data under a single unit. 
(a protective shield that prevents the data from being accessed by the code outside this shield)


We then add abstraction to this demo.
Which “hides” unnecessary details of an object from the user.
monthlySalary()


Compile: 
> javac EncapsulationDemo.java
Run:
> java EncapsTest

*/
public class EncapsulationDemo{
    private int nin;
    private String empName;
    private int empAge;

    // Getter and setter methods

    // Get method
    public int getEmpNIN(){
        return nin;
    }

    // Get method
    public String getEmpName(){
        return empName;
    }


    // Get method
    public int getEmpAge(){
        return empAge;
    }

    // Set method
    public void setEmpAge(int newValue){
        empAge = newValue;
    }

    // Set method
    public void setEmpName(String newValue){
        empName = newValue;
    }

    // Set method
    public void setEmpNIN(int newValue){
        nin = newValue;
    }


	/*
	Abstraction
	The monthlySalary() function hides unnecessary details of an object from the user,
	and simply returns the monthly salary without the user knowning how it is calculated.

	hides getHourlyRate() and getHoursWorked() private function and the formular
	used to calculate monthly salary.

	*/
	public int monthlySalary()
	{	
		return getHourlyRate() * getHoursWorked();	
	}

	private int getHourlyRate()
	{return 10;}

	private int getHoursWorked()
	{return 40;}


}



class EncapsTest{
    public static void main(String args[]){
         EncapsulationDemo obj = new EncapsulationDemo();
         obj.setEmpName("Mario");
         obj.setEmpAge(32);
         obj.setEmpNIN(112233);
         System.out.println("Employee Name: " + obj.getEmpName());
         System.out.println("Employee NIN:  " + obj.getEmpNIN());
         System.out.println("Employee Age:  " + obj.getEmpAge());

	 System.out.println("monthlySalary: " + obj.monthlySalary() );
    } 
} 

package week1.day2;

public class EmployeeDetails {
   public void  employeeName()   {
	 String EmployeeName = "iyappan";
	 int EmployeeId = 4563;
	 System.out.println("EmployeeName="+ EmployeeName);
	 System.out.println("employeeId="+ EmployeeId);
 } 
   public void  employeeAddress()   {
		 String EmployeeAddress = "dindigul";
		 System.out.println("EmployeeAddress="+ EmployeeAddress);
	 } 
   public void  employeeSalary()   {
		 double EmployeeSalary = 45678.443;
		  System.out.println("EmployeeSalary="+ EmployeeSalary);
	 } 
   public void  employeeMobileNumber()   {
		 long EmployeeMobileNumbe = 6748903456L;
		 System.out.println("EmployeeMobileNumbe="+ EmployeeMobileNumbe);
	 } 
 public static void main(String[] args) {
	EmployeeDetails detail=new EmployeeDetails();
	detail.employeeAddress();
	detail.employeeName();
	detail.employeeSalary();
	detail.employeeMobileNumber();
 }
 
}

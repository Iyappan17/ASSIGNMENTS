package week1.day2;

public class car {
   public void ApplyBreak() {
	  System.out.println("ApplyBreak"); 
   }
   public void ApplyGear() {
		  System.out.println("AppplyGear"); 
	   }
   public void switchOnAc() {
		  System.out.println("switchOnAc"); 
	   }
   public void ApplyAcclerate() {
		  System.out.println("ApplyAcclerate"); 
	   }
	public static void main(String[] args) {
		car action=new car();
		action.ApplyBreak();
		action.ApplyAcclerate();
		action.ApplyBreak();
		action.ApplyGear();
	}
	
}

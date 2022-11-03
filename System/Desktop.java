package System;

public class Desktop extends Computer {
    public void desktopSize() {
    	System.out.println("13.5 inch");
    }
    public static void main(String[] args) {
		Desktop pc=new Desktop();
		pc.computerModel();
		pc.desktopSize();
	}
}

package week1.day2;

public class calculator {
 public void addTwoNumbers(int a,int b) {
  int c=a+b;
  System.out.println(c);
}
 public void multipleTwoNumbers(int e,int f) {
	  int g=e*f;
	  System.out.println(g);
 }
 public void subTwoNumbers(int i,int j) {
	  int h=i-j;
	  System.out.println(h);
	}
 public void divisionTwoNumbers(int x,int y) {
	  int z=x/y;
	  System.out.println(z);
	}
 public static void main(String[] args) {
	calculator calc= new calculator();
	calc.addTwoNumbers(20,30);
	calc.divisionTwoNumbers(60, 20);
	calc.subTwoNumbers(566, 112);
	calc.multipleTwoNumbers(32, 14);
}
	}
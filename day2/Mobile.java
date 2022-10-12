package week1.day2;

public class Mobile {
  public void sentMessage()
  {
	System.out.println("sentMessage");
  }
  public void shareDOcument()
  {
	System.out.println("shareDOcument");
  }
  public void call()
  {
	System.out.println("call");
  }
  public static void main(String[] args) {
	Mobile action=new Mobile();
	action.call();
	action.sentMessage();
	action.shareDOcument();
  }
}

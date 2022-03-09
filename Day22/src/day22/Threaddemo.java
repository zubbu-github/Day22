package day22;

class A extends Thread {
	  public void run() {
		   {   
		  System.out.println("Thread " + Thread.currentThread().getId() + " is running");
	  }
  }
}
public class Threaddemo {

	public static void main(String[] args) {
		int  n= 8;
		  for(int i=0;i<11;i++) {
		 A a = new A();
		 a.start();
}
}
}
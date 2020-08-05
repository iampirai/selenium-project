import java.util.Scanner;

public class Main {
int i=10; int j=5;

	public int testMethod1() {
		return j ;
	}
	
	public String testMethod2() {
		return "fuck" ;
	}

	public static void main(String[] args) {

		Main obj= new Main();
	    int pirai = obj.testMethod1();
	    System.out.println(pirai);
	}
}

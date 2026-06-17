import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("tell me what's your name:");
		String name = in.next();
		System.out.print("How old are you:");
		int age = in.nextInt();
		System.out.println("Hello," + name);
		if(age < 18){
			System.out.println("oh,you are a kid");

		}else{

			System.out.println("you are a man");
		}
		


	}
}

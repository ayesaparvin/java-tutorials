import java.util.Scanner;

class apples {
	public static void main (String args[]) {
		/*Scanner rami = new Scanner(System.in);
		//System.out.println (rami.nextLine());
		double fnum, snum, answer;
		System.out.println("Enter the first num: ");
		fnum = rami.nextDouble();
		System.out.println("Enter the second num: ");
		snum = rami.nextDouble();
		System.out.println("Enter the first num: ");
		answer = fnum % snum;
		System.out.println (answer);
//increment operators		
		int tuna = 5;
		System.out.println(++tuna);//6--preincrement--variable value changes b4 it's used
		System.out.println(tuna);//6
		int fish = 8;
		System.out.println(fish++);//8--postincrement--variable value changes after it's used
		System.out.println(fish);//9 */
//logical operators		
		int x = 10, y = 50;
		if (x > 5 && y < 20) {
			System.out.println("you can enter");
			}
			else {System.out.println("you can't enter");
			}
//switch statement
		int age = 7;
		switch (age) {
		case 1: System.out.println("this is one");
		break;
		case 2: System.out.println("this is two");
		break;
		case 3: System.out.println("this is three");
		break;
		default: System.out.println("this is default");
		break;
		}
		
//while statement
		int counter = 0;
		while (counter<10) {
			System.out.println(counter);
			counter++;
		}
//Using multiple class + method with parameter
		tuna newTunaObj = new tuna();
		System.out.println("Please enter your name here:");
		Scanner inputtt = new Scanner(System.in);
		String name = inputtt.nextLine();
		newTunaObj.simpleMessage(name);
		
	}
}

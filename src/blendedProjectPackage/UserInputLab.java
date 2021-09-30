package blendedProjectPackage;
import java.util.Scanner;

public class UserInputLab {

	public static void main(String[] args) {
		int number;
		Scanner inputNum = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		number = inputNum.nextInt();
		for(int r=1; r<=5; r++) {
		for(int i=1; i<=3; i++)
		{
			System.out.print(number+" ");
			number+=2;
		}
		System.out.println();
		}
	}

}

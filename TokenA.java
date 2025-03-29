//This class is made to test how tokenizing works.
import java.util.Scanner;

public class TokenA

{

public static void main(String[]args)

{

	Scanner scanner = new Scanner(System.in);


	System.out.println("Enter a string of words, seperated by commas: ");

	String sentence = scanner.nextLine();

	Scanner scannerIn = new Scanner(sentence).useDelimiter(",");


	while(scannerIn.hasNext())
	{
		String text = scannerIn.next();
		System.out.println(text);
	}







}

}
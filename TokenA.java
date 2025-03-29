//This class is made to test how tokenizing works.
import java.util.Scanner;
import java.util.Arrays;
public class TokenA
{
	public static void main(String[]args)
	{
		Scanner scanner = new Scanner(System.in);
		String delimiter = ",";
		System.out.println("How many tokens do you want to read in (i.e. how many times do you want to enter): "); //assuming the user enters an integer.
		int times = scanner.nextInt();
		scanner.nextLine();
		System.out.println("What type of data type are you going to enter in?: ");//assuming the user enters the right data type.
		String sentence = scanner.nextLine().toLowerCase();
		System.out.println("Would you want a specific delimiter? If not, the default ',' will be used. (y/n)");
		String delimiterI = scanner.nextLine().toLowerCase();
		if(delimiterI.equals("y"))
		{
			System.out.println("What would you want your delimiter to be?: ");
			delimiter = scanner.nextLine();
		}

		if(sentence.equals("string"))
		{
			String[][] arrayString = new String[times][];
			System.out.println("How many tokens do you plan on entering?: ?"); //by 'plan' it is asking directly.
			int counter = scanner.nextInt();
			scanner.nextLine();
			String[] embeddedArrayString = new String[counter];
			for(int i =0; i<arrayString.length; i++)
			{

				scanner.nextLine();
				System.out.println("Enter your string:");
				String sentenceS = scanner.nextLine();
				Scanner scannerString = new Scanner(sentenceS).useDelimiter(delimiter);
				boolean hasNext = scannerString.hasNext();
				for(int j=0; j<embeddedArrayString.length; j++)
				{
					if(scannerString.hasNext())
					{
						embeddedArrayString[j] = scannerString.next();
					}
					
					
				}
				arrayString[i] = embeddedArrayString;
	
				
			}
			System.out.println("Working.");
			System.out.println("Below is a representation of your array");
			for(int i=0;i<arrayString.length;i++)
			{
				System.out.println(Arrays.toString(arrayString[i]));
			}

		}


}

}
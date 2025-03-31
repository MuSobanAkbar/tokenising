//This class is made to test how tokenizing works.
// 31st March 2025 Update 3 - allows user to see the represenation of the array that has stored their values.
import java.util.Scanner;

public class TokenA
{
	public static void main(String[]args)
	{
		Scanner scanner = new Scanner(System.in);
		String delimiter = ",";
		System.out.println("How much data are you going to add (this is how many tokens you want to read in): "); //assuming the user enters an integer.
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
			String[] arrayString = new String[times];
			System.out.println("Enter your string:");
			String sentenceS = scanner.nextLine();
			Scanner scannerString = new Scanner(sentenceS).useDelimiter(delimiter);
			boolean hasNext = scannerString.hasNext();

			for(int i =0; i<arrayString.length && hasNext; i++)
			{
				arrayString[i] = scannerString.next();
		
			}
			
			System.out.println("What would you like the format of your array to look like (array/list)?: ");
			String formatA = scanner.nextLine().toLowerCase();
				
			if(formatA.equals("array"))
			{
				System.out.print("[");
				for(int i=0;i<arrayString.length;i++)
				{
					System.out.print(arrayString[i] +"|");
				}
				System.out.print("]");

			}
			else
			{
				for(int i=0;i<arrayString.length;i++)
				{
					System.out.println(arrayString[i]);
				}
			}

		}
		else if(sentence.equals("int")||sentence.equals("integer"))
		{
			int[] arrayInteger = new int[times];
			System.out.println("Enter your integers:");
			String integerS = scanner.nextLine();
			Scanner scannerInteger= new Scanner(integerS).useDelimiter(delimiter);
			boolean hasNext = scannerInteger.hasNext();

			for(int i =0; i<arrayInteger.length && hasNext; i++)
			{
				arrayInteger[i] = scannerInteger.nextInt();
		
			}
			System.out.println("What would you like the format of your array to look like (array/list)?: ");
			String formatA = scanner.nextLine().toLowerCase();
				
			if(formatA.equals("array"))
			{
				System.out.print("[|");
				for(int i=0;i<arrayInteger.length;i++)
				{
					System.out.print(arrayInteger[i] +"|");
				}
				System.out.print("]");

			}
			else
			{
				for(int i=0;i<arrayInteger.length;i++)
				{
					System.out.println(arrayInteger[i]);
				}
			}
	
				
		}

	}
}





import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;

public class spell_checker 
{
	  	
	public static void main(String[] args) throws FileNotFoundException
	{
		
		
		System.out.println("Spell Checker");
		System.out.println("-------------");
		
		int[] intArray = new int[100]; 
		
		String wordlist[] = readFilePerfect("common-dictionary.txt");
	
		
	}	

	public static String[] readFilePerfect(String filename) throws FileNotFoundException	
	{
		Scanner file= new Scanner(new File(filename));
		Scanner spellCheck = new Scanner (new File(filename));
		
		String writeFile[] = readFilePerfect("personal-dictionary.txt");
		
		
		 //while(file.hasNextLine()) {
			//file.nextLine();
		// }
		file.close();
		
		
	return null;
		
		}
	
	
	public static void readFileOversize(String filename) throws FileNotFoundException, IOException
	{
	      String wordlist = new String ("common-dictionary.txt");
		
	      
	      File file = new File(filename);
	      file.createNewFile();
	
	
	 Scanner scan = new Scanner(System.in);
     boolean done = false;
     String input;
	
     
    
	
	
	while (true) {
		
        System.out.print("Enter a word or 'quit' to stop: ");
        input= scan.nextLine();
        
        if (input.equals("quit"))
        {
        	System.out.println("Goodbye!");
    		break;
    	
        }
        if (wordlist.contains(input)) {
            System.out.println("\n" + input + " is spelled correctly");
        } else {
            System.out.print("The word is not spelled not correctly.");}

            System.out.println("The word was not found in the dictionary.");
    		
    		System.out.println("Would you like to add it to your personal dictionary (yes/no)?");
    		
	}}
    		public static String[] PrintWriter(String filename) throws FileNotFoundException		
    		{
    		PrintWriter newList = new PrintWriter(new File(filename));

    		
    		return null;
    		}
    		
 
    		
	}

   


		
		
		
	
	
	


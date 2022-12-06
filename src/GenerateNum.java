
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GenerateNum {
	
	  static int[ ]  genList= new int[500];
	    
	    public static void gen()
	    {  
	    	Random rand = new Random();
	    	
	    	for(int i =0;  i< 500;  i++)
	    	{
	    		int genNum = rand.nextInt(500);
	    		genList[i] = genNum;
	    	}
	    	Arrays.sort(genList);
	    }


	public static void main(String[ ] args) {
		
		gen( );
		for(int  n : genList)
		{
			System.out.println(n);
		}
		try (Scanner sc = new Scanner(System.in))
		{
			System.out.println("Enter the Nth smallest number..");
			int  n = sc.nextInt();
			System.out.println("The"  +  n + "th smallest  number is :"  + genList[n - 1]);
		}
		
		
		
		
		
		
		

	}

}

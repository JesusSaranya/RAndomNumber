
public class Debugging {
	
	 public int Add(int firstOperand,  int secondOperand)
     {
   	  return (firstOperand+secondOperand);
     }
		
	 
	 public int Subtr(int firstOperand  ,  int secondOperand)
     {
   	     return (firstOperand- secondOperand);
     }
	 
	 
	 public int divide(int  firstOperand ,  int secondOperand)
	 {
		 if(secondOperand!=0)
		 {
			 return (firstOperand/secondOperand);
		 }
		 else
		 {
		return 0;
	 }
	 }	

	 public int Multiple(int firstOperand ,  int secondOperand)
	 {
		 return firstOperand*secondOperand;
	 }
	 
	 
	 public int GetMax(int[ ] values)
	 {
		 int max = values[0];
		 for(int i =0;  i < values.length;  i++)
		 {
			 if(values[i] > max)
			 {
				 max = values[i];
			 }
		 }
		 return max;
	 }
	 
	public static void main(String[ ] args) {
	
		Debugging  dg = new Debugging();
      
		System.out.println(dg.Add(100, 100));
		System.out.println(dg.Subtr(100, 50));
		System.out.println(dg.divide(100, 50));
		
		int[ ] intArray = {10,20,30,40,50,60,25,30};
		System.out.println(dg.GetMax(intArray));
		
		
	
		
		
		
	}

}

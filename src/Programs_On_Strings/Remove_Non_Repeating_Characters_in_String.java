package Programs_On_Strings;

public class Remove_Non_Repeating_Characters_in_String 
{
	    public static void main(String args[]) 
	    { 
	     /*   String inputStr ="Java";

	        for(char i :inputStr.toCharArray())
	        {
	        if ( inputStr.indexOf(i) == inputStr.lastIndexOf(i)) 
	          {
	            System.out.println("First non-repeating character is: "+i);
	            break;
	          }
	        }    */
	    	
	    	
	    	
	    		String str = "Shrikkanth";

	    		for (int i = 0; i < str.length(); i++)    
	    		{
	    			int temp = 0;
	    			for (int j = 0; j < str.length(); j++)   
	    			{
	    				// checking if two characters are equal
	    				if (str.charAt(i) == str.charAt(j) && i != j)    
	    				{
	    					temp = 1;
	    					break;
	    				}
	    			}
	    			if (temp == 0)
	    				System.out.print(str.charAt(i));
	    		}

	    }
}

package Linga;

public class RoughRun {
	
	  
	    public static void main(String[] args)
	    {
	    	String str = "samam";
	    	  
	        StringBuilder inp=new StringBuilder(str);
	    	  for (int i = 0; i < str.length()-1; i++) {
	    	   for (int j = i + 1; j < str.length(); j++) {
	    	    if (str.charAt(i) == str.charAt(j)) {
	    	     inp.deleteCharAt(j);
	    	    }
	    	   } 
	    	  }
	    	  System.out.println(inp);
	    }
	}


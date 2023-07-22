package ExercisesPlt;

import java.util.*;

public class PowerOfNum 
{
	public static void main(String args[])
	{
    	int base,exponent,power=1;
   		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the base");
		base=sc.nextInt();
    	System.out.println("Enter the exponent");
    	exponent=sc.nextInt();
    
    		while(exponent>0)
	    	{
	    	    power=power*base;
    	    	exponent--;
    		}
		System.out.println("The power of the no = "+power);
	}
}

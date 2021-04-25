package monpackage;

import java.util.Scanner;

public class quadraequa {

    private static Scanner s;

	public static void main(String[] args) {
    	
    	int a,b,c;
    	
    	double root1,root2, d;
    	
    	s = new Scanner(System.in);
    	
    	System.out.println("donne equation quadratique");
    	
    	System.out.print("Entre a:");
    	
    	a= s.nextInt();
   
    	System.out.print("Entre b:");

    	b= s.nextInt();

    	System.out.print("Entre c:");
    	
    	c= s.nextInt();
    	
    	System.out.print("Entre ");
    	
    	System.out.println("Operation quadratique:"+a+"x^2+"+b+"x+"+c);
    	
    	d= b * b - 4 * a *c;
    	
    	if(d>0)
    		
    	{
    		System.out.println("Les racines sont réelles et inégales");
    		
    		root1= (-b+Math.sqrt(d))/(2*a);
    		
    		root2 = (-b-Math.sqrt(d))/(2*a);
    		
    		System.out.println("Premiere racine est:"+root1);
    		System.out.println("Secondes racine est:"+root2);
    		
    	}
    	
    	else if (d==0)
    		
    	{
    		
    		System.out.println("les racines sont reelles et égales");
    		
    		root1 = (-b-Math.sqrt(d))/(2*a);
    		
    		
    		System.out.println("Racines:"+root1);
    		
    	}
    	
    	else
    		
    	{
    		
    	System.out.println("les racines sont imaginaires");
    	
    	}
    	
    }
    
 }
	


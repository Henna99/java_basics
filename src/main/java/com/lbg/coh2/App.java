package com.lbg.coh2;

import java.io.IOException;
import java.util.Scanner;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
      
       System.out.print( "Enter item cost:  " );
       Scanner console= new Scanner (System.in); 
       double cost=console.nextDouble();
       System.out.println("Enter VAT rate:  ");
       double vat=console.nextDouble();
       App app= new App();
       
       System.out.println("Total is " + app.VAT(cost,vat));
       
    }
    
    
    double VAT (double cost, double vat)
    {
    	return cost*(1+(vat/100));
    }
     
   
}

package NCEstatementDateCalculatorApplet;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class StatementLogic 
{
	
		public void performCalendarArithmetic(int d,int m,int y) 
     {
			
			      //Set calendar to account creation date
			
			      Calendar cal = new GregorianCalendar(y,m, d);
			      
			      //Incrementing 1 month from creation date
			      
			      cal.add(Calendar.MONTH, 0);
			      
			      //Define Format of date
			      SimpleDateFormat sdf = new SimpleDateFormat("d MMM yyyy");
			      String date = sdf.format(cal.getTime());
			      
			      //Printing the first statement date
			      System.out.println(" 1st statement date is =  "+date);
			      
			      //Adding the date to 20 days to find out the PDD date
			      cal.add(Calendar.DATE, 20);
			      
			      //This loop will give the next statement date and PDD till 24 months
			      
			          for (int i=1;i<=11;i++)
			          {
			        	  int j=0;
			        	  cal.add(Calendar.MONTH,1);
			        	  SimpleDateFormat sdf1 = new SimpleDateFormat("d MMM yyyy");
					      String NonLWIPDD = sdf1.format(cal.getTime());
					      //System.out.println(i+ "  PDD = "+  date1);
					      cal.add(Calendar.DATE,-20);
					      SimpleDateFormat NXT = new SimpleDateFormat("d MMM yyyy");
					      String NXT1 = NXT.format(cal.getTime());
					      int z=i+1;
					      System.out.println(z+"  Statement date = "+  NXT1);
					      
					      //To calculate LWI PDD
					      cal.add(Calendar.DATE,23);
					      SimpleDateFormat LPDD = new SimpleDateFormat("d MMM yyyy");
					      String LWIPDDDate = LPDD.format(cal.getTime());
					      
					      //To calculate Non LWI PDD
					      cal.add(Calendar.DATE,-3);
					      SimpleDateFormat NLPDD = new SimpleDateFormat("d MMM yyyy");
					      String NonLWIPDDDate = NLPDD.format(cal.getTime());
					      System.out.println(z+"  NXT PDD = "+  NonLWIPDDDate);
					      System.out.println(z+"  NXT PDD = "+  LWIPDDDate);
					      }
			          }
	}
	


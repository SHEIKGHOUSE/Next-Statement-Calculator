/*This package gives the calculation of Next statement date and PDD date based on the New NCE logic */

/* Logic : 

> Take the account creation or conversion date from input and add one calendar month to get first statement date. 
> Now generate the nextPaymentDueDate from there by adding 20 days for the Non LWI brands 23 days for the LWI brands and that is becoming the PDD for that account (this logic is applicable only during foundation).
>From 2nd statement, its statement date is calculated based on Payment due date what it is coming.

 */
package STDT;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class NxtDateCal_LWI {
public static void main(String[] args) 
	{
		
	   System.out.println("Enter the account creation date (DD)");           				// Input date
		Scanner Acdat=new Scanner(System.in);
		int AccountCreationDate=Acdat.nextInt();
		System.out.println("Enter the Month of the Account creation (MM) in numbers "); 	// Input month
		Scanner Acmon=new Scanner(System.in);
		int AccountCreationMonth=Acmon.nextInt();
		System.out.println("Enter the Account creation Year");								// Input Year
		Scanner Acyear=new Scanner(System.in);
		int AccountCreationYear=Acyear.nextInt();
		System.out.println("Please select the statement number");
		Scanner StN=new Scanner(System.in);
		int StatementNumber=StN.nextInt();
		System.out.println("please select 1=Non LWI 2=LWI");
		Scanner Brand=new Scanner(System.in);
		int BrandName=Brand.nextInt();
	     NxtDateCal_LWI calUsage = new NxtDateCal_LWI();
        calUsage.performCalendarArithmetic(AccountCreationDate,AccountCreationMonth,AccountCreationYear,BrandName,StatementNumber);
	}
	@SuppressWarnings("unused")
	public void performCalendarArithmetic(int d,int m,int y,int b,int StatementNumber) 
	{
		if(b==1)  
		{
			//Scanner StN=new Scanner(System.in);
			//int StatementNumber=StN.nextInt();
			    //Set calendar to account creation date
			
			      Calendar cal = new GregorianCalendar(y,m, d);
			      
			      //Incrementing 1 month from creation date
			      
			      cal.add(Calendar.MONTH, 0);
			      
			      //Define Format of date
			      SimpleDateFormat sdf = new SimpleDateFormat("d MMM yyyy");
			      String date = sdf.format(cal.getTime());
			      
			      //Printing the first statement date
			      //System.out.println(" 1st statement date is =  "+date);
			      
			      //Adding the date to 20 days to find out the PDD date
			      cal.add(Calendar.DATE, 20);
			      
			     // SimpleDateFormat sdf2 = new SimpleDateFormat("d MMM yyyy");
			      //String date1 = sdf2.format(cal.getTime());
			      
			      //to check the whether PDD falls on 29 or 30 or 31 of the month
			      
			      if(d==10 ||d==11 ||d==9)
			      {
			    	  //if date is 11
			    	  if(d==11)
			    	  {
			    		  if (m==4||m==6 || m==9 || m==11)					// if it falls on 30 days of the month
			    		  {
			    			  cal.add(Calendar.DAY_OF_MONTH, 1);
					    	  for (int i=StatementNumber;i==StatementNumber;i++)
					          {
					        	  int x=StatementNumber-1;
						        	  int j=0;
						        	  cal.add(Calendar.MONTH,x);
						        	  SimpleDateFormat sdf1 = new SimpleDateFormat("d MMM yyyy");
								      String NonLWIPDD = sdf1.format(cal.getTime());
								      //System.out.println(i+ "  PDD = "+  date1);
								      cal.add(Calendar.DATE,-20);
								      SimpleDateFormat NXT = new SimpleDateFormat("d MMM yyyy");
								      String NXT1 = NXT.format(cal.getTime());
								     // int z=StatementNumber+1;
								      System.out.println(StatementNumber+"  Statement date = "+  NXT1);
								      
								      //To calculate LWI PDD
								      cal.add(Calendar.DATE,23);
								      SimpleDateFormat LPDD = new SimpleDateFormat("d MMM yyyy");
								      String LWIPDDDate = LPDD.format(cal.getTime());
								      
								      //To calculate Non LWI PDD
								      cal.add(Calendar.DATE,-3);
								      SimpleDateFormat NLPDD = new SimpleDateFormat("d MMM yyyy");
								      String NonLWIPDDDate = NLPDD.format(cal.getTime());
								      System.out.println(StatementNumber+"  Non LWI NXT PDD = "+  NonLWIPDDDate);
								      System.out.println(StatementNumber+"  LWI NXT PDD = "+  LWIPDDDate);
								   
							     }	// end for
			    		  }	//end for 30 days in a month 
					    	  else										//if date is 11 and falls on 31 days of the month follow normal logic
					    	  {
					    		  for (int i=StatementNumber;i==StatementNumber;i++)
						          {
						        	  int x=StatementNumber-1;
							        	  int j=0;
							        	  cal.add(Calendar.MONTH,x);
							        	  SimpleDateFormat sdf1 = new SimpleDateFormat("d MMM yyyy");
									      String NonLWIPDD = sdf1.format(cal.getTime());
									      //System.out.println(i+ "  PDD = "+  date1);
									      cal.add(Calendar.DATE,-20);
									      SimpleDateFormat NXT = new SimpleDateFormat("d MMM yyyy");
									      String NXT1 = NXT.format(cal.getTime());
									     // int z=StatementNumber+1;
									      System.out.println(StatementNumber+"  Statement date = "+  NXT1);
									      
									      //To calculate LWI PDD
									      cal.add(Calendar.DATE,23);
									      SimpleDateFormat LPDD = new SimpleDateFormat("d MMM yyyy");
									      String LWIPDDDate = LPDD.format(cal.getTime());
									      
									      //To calculate Non LWI PDD
									      cal.add(Calendar.DATE,-3);
									      SimpleDateFormat NLPDD = new SimpleDateFormat("d MMM yyyy");
									      String NonLWIPDDDate = NLPDD.format(cal.getTime());
									      System.out.println(StatementNumber+"  Non LWI NXT PDD = "+  NonLWIPDDDate);
									      System.out.println(StatementNumber+"  LWI NXT PDD = "+  LWIPDDDate);
									   
								     }// end of for in else condition
					    	  }	//end of else condition 31 days in month
			    		  } ///end of if d=11
			    	
			    	  // start of if date falls on 10th of the month 
			    	  if(d==10)
			    	  {
			    		 if (m==4||m==6 || m==9 || m==11)					// if it falls on 30 days of the month
			    		  {
			    			  cal.add(Calendar.DAY_OF_MONTH, 2);
					    	  for (int i=StatementNumber;i==StatementNumber;i++)
					          {
					        	  int x=StatementNumber-1;
						        	  int j=0;
						        	  cal.add(Calendar.MONTH,x);
						        	  SimpleDateFormat sdf1 = new SimpleDateFormat("d MMM yyyy");
								      String NonLWIPDD = sdf1.format(cal.getTime());
								      //System.out.println(i+ "  PDD = "+  date1);
								      cal.add(Calendar.DATE,-20);
								      SimpleDateFormat NXT = new SimpleDateFormat("d MMM yyyy");
								      String NXT1 = NXT.format(cal.getTime());
								     // int z=StatementNumber+1;
								      System.out.println(StatementNumber+"  Statement date = "+  NXT1);
								      
								      //To calculate LWI PDD
								      cal.add(Calendar.DATE,23);
								      SimpleDateFormat LPDD = new SimpleDateFormat("d MMM yyyy");
								      String LWIPDDDate = LPDD.format(cal.getTime());
								      
								      //To calculate Non LWI PDD
								      cal.add(Calendar.DATE,-3);
								      SimpleDateFormat NLPDD = new SimpleDateFormat("d MMM yyyy");
								      String NonLWIPDDDate = NLPDD.format(cal.getTime());
								      System.out.println(StatementNumber+"  Non LWI NXT PDD = "+  NonLWIPDDDate);
								      System.out.println(StatementNumber+"  LWI NXT PDD = "+  LWIPDDDate);
								   
							     }	// end for
			    		  }	//end for 30 days in a month 
					    	  else										//if date is 10 and falls on 31 days of the month follow normal logic
					    	  {
					    		  cal.add(Calendar.DAY_OF_MONTH, 1);
						    	  for (int i=StatementNumber;i==StatementNumber;i++)
						          {
						        	  int x=StatementNumber-1;
							        	  int j=0;
							        	  cal.add(Calendar.MONTH,x);
							        	  SimpleDateFormat sdf1 = new SimpleDateFormat("d MMM yyyy");
									      String NonLWIPDD = sdf1.format(cal.getTime());
									      //System.out.println(i+ "  PDD = "+  date1);
									      cal.add(Calendar.DATE,-20);
									      SimpleDateFormat NXT = new SimpleDateFormat("d MMM yyyy");
									      String NXT1 = NXT.format(cal.getTime());
									     // int z=StatementNumber+1;
									      System.out.println(StatementNumber+"  Statement date = "+  NXT1);
									      
									      //To calculate LWI PDD
									      cal.add(Calendar.DATE,23);
									      SimpleDateFormat LPDD = new SimpleDateFormat("d MMM yyyy");
									      String LWIPDDDate = LPDD.format(cal.getTime());
									      
									      //To calculate Non LWI PDD
									      cal.add(Calendar.DATE,-3);
									      SimpleDateFormat NLPDD = new SimpleDateFormat("d MMM yyyy");
									      String NonLWIPDDDate = NLPDD.format(cal.getTime());
									      System.out.println(StatementNumber+"  Non LWI NXT PDD = "+  NonLWIPDDDate);
									      System.out.println(StatementNumber+"  LWI NXT PDD = "+  LWIPDDDate);
									   
								     }// end of for in else condition
					    	  }	//end of else condition 31 days in month
			    		  } ///end of if d=11
			    	  
			    	  //if select ed date is 9 of the month
			    	  
			    	  if(d==9)
			    	  {
			    		 if (m==4||m==6 || m==9 || m==11)					// if it falls on 30 days of the month
			    		  {
			    			  cal.add(Calendar.DAY_OF_MONTH, 3);
					    	  for (int i=StatementNumber;i==StatementNumber;i++)
					          {
					        	  int x=StatementNumber-1;
						        	  int j=0;
						        	  cal.add(Calendar.MONTH,x);
						        	  SimpleDateFormat sdf1 = new SimpleDateFormat("d MMM yyyy");
								      String NonLWIPDD = sdf1.format(cal.getTime());
								      //System.out.println(i+ "  PDD = "+  date1);
								      cal.add(Calendar.DATE,-20);
								      SimpleDateFormat NXT = new SimpleDateFormat("d MMM yyyy");
								      String NXT1 = NXT.format(cal.getTime());
								     // int z=StatementNumber+1;
								      System.out.println(StatementNumber+"  Statement date = "+  NXT1);
								      
								      //To calculate LWI PDD
								      cal.add(Calendar.DATE,23);
								      SimpleDateFormat LPDD = new SimpleDateFormat("d MMM yyyy");
								      String LWIPDDDate = LPDD.format(cal.getTime());
								      
								      //To calculate Non LWI PDD
								      cal.add(Calendar.DATE,-3);
								      SimpleDateFormat NLPDD = new SimpleDateFormat("d MMM yyyy");
								      String NonLWIPDDDate = NLPDD.format(cal.getTime());
								      System.out.println(StatementNumber+"  Non LWI NXT PDD = "+  NonLWIPDDDate);
								      System.out.println(StatementNumber+"  LWI NXT PDD = "+  LWIPDDDate);
								   
							     }	// end for
			    		  }	//end for 30 days in a month 
					    	  else										//if date is 09 and falls on 31 days of the month follow normal logic
					    	  {
					    		  cal.add(Calendar.DAY_OF_MONTH, 2);
						    	  for (int i=StatementNumber;i==StatementNumber;i++)
						          {
						        	  int x=StatementNumber-1;
							        	  int j=0;
							        	  cal.add(Calendar.MONTH,x);
							        	  SimpleDateFormat sdf1 = new SimpleDateFormat("d MMM yyyy");
									      String NonLWIPDD = sdf1.format(cal.getTime());
									      //System.out.println(i+ "  PDD = "+  date1);
									      cal.add(Calendar.DATE,-20);
									      SimpleDateFormat NXT = new SimpleDateFormat("d MMM yyyy");
									      String NXT1 = NXT.format(cal.getTime());
									     // int z=StatementNumber+1;
									      System.out.println(StatementNumber+"  Statement date = "+  NXT1);
									      
									      //To calculate LWI PDD
									      cal.add(Calendar.DATE,23);
									      SimpleDateFormat LPDD = new SimpleDateFormat("d MMM yyyy");
									      String LWIPDDDate = LPDD.format(cal.getTime());
									      
									      //To calculate Non LWI PDD
									      cal.add(Calendar.DATE,-3);
									      SimpleDateFormat NLPDD = new SimpleDateFormat("d MMM yyyy");
									      String NonLWIPDDDate = NLPDD.format(cal.getTime());
									      System.out.println(StatementNumber+"  Non LWI NXT PDD = "+  NonLWIPDDDate);
									      System.out.println(StatementNumber+"  LWI NXT PDD = "+  LWIPDDDate);
									   
								     }// end of for in else condition
					    	  }	//end of else condition 31 days in month
			    		  } ///end of if d=11
			    	  
			    	  }
			    //This loop will give the next statement date and PDD till 12 months
			      else 
			      {
			    	 for (int i=StatementNumber;i==StatementNumber;i++)
			          {
			        	  int x=StatementNumber-1;
				        	  int j=0;
				        	  cal.add(Calendar.MONTH,x);
				        	  SimpleDateFormat sdf1 = new SimpleDateFormat("d MMM yyyy");
						      String NonLWIPDD = sdf1.format(cal.getTime());
						      //System.out.println(i+ "  PDD = "+  date1);
						      cal.add(Calendar.DATE,-20);
						      SimpleDateFormat NXT = new SimpleDateFormat("d MMM yyyy");
						      String NXT1 = NXT.format(cal.getTime());
						     // int z=StatementNumber+1;
						      System.out.println(StatementNumber+"  Statement date = "+  NXT1);
						      
						      //To calculate LWI PDD
						      cal.add(Calendar.DATE,23);
						      SimpleDateFormat LPDD = new SimpleDateFormat("d MMM yyyy");
						      String LWIPDDDate = LPDD.format(cal.getTime());
						      
						      //To calculate Non LWI PDD
						      cal.add(Calendar.DATE,-3);
						      
						     int rdate=cal.get(Calendar.DAY_OF_MONTH);
						     if(rdate==29 ||rdate==30 || rdate==31)
						     {
						    	 cal.add(Calendar.MONTH, 0);
						    	 cal.setFirstDayOfWeek(1);
						    	 SimpleDateFormat NLPDD1 = new SimpleDateFormat("d MMM yyyy");
							      String NonLWIPDDDate1 = NLPDD1.format(cal.getTime());

						    	 System.out.println(NonLWIPDDDate1);
						     }
						      SimpleDateFormat NLPDD = new SimpleDateFormat("d MMM yyyy");
						      String NonLWIPDDDate = NLPDD.format(cal.getTime());
						      System.out.println(StatementNumber+"  Non LWI NXT PDD = "+  NonLWIPDDDate);
						      System.out.println(StatementNumber+"  LWI NXT PDD = "+  LWIPDDDate);
					  }			//end of for loop
				      
			      } //end of else
			
		}
		
		/////////////////////////logic for LWI account
		else if(b==2)
		{
			    Calendar cal = new GregorianCalendar(y,m, d);
			      
			      //Incrementing 1 month from creation date
			      
			      cal.add(Calendar.MONTH, 0);
			      
			      //Define Format of date
			      SimpleDateFormat sdf = new SimpleDateFormat("d MMM yyyy");
			      String date = sdf.format(cal.getTime());
			     //Adding the date to 20 days to find out the PDD date
			      cal.add(Calendar.DATE, 23);
			   //to check the whether PDD falls on 29 or 30 or 31 of the month
			      
			      if(d==6 ||d==7 ||d==8)
			      {
			    	  //if date is 11
			    	  if(d==6)
			    	  {
			    		  if (m==4||m==6 || m==9 || m==11)					// if it falls on 30 days of the month
			    		  {
			    			  
			    			  cal.add(Calendar.DATE, 3);
					    	  for (int i=StatementNumber;i==StatementNumber;i++)
					          {
					        	  int x=StatementNumber-1;
						        	  int j=0;
						        	  cal.add(Calendar.MONTH,x);
						        	  SimpleDateFormat NXT = new SimpleDateFormat("d MMM yyyy");
								      String NXT1 = NXT.format(cal.getTime());
								      //To calculate LWI PDD
								     
								      SimpleDateFormat LPDD = new SimpleDateFormat("d MMM yyyy");
								      String LWIPDDDate = LPDD.format(cal.getTime());
								      
								      //To calculate Non LWI PDD
								      cal.add(Calendar.DATE,-23);
								      SimpleDateFormat NLst = new SimpleDateFormat("d MMM yyyy");
								      String NonLWISt = NLst.format(cal.getTime());
								      System.out.println(StatementNumber+"   LWI St PDD = "+  NonLWISt);
								      System.out.println(StatementNumber+"  LWI NXT PDD = "+  LWIPDDDate);
								   
							     }	// end for
			    		  }	//end for 30 days in a month 
					    	  else										//if date is 11 and falls on 31 days of the month follow normal logic
					    	  {
					    		  cal.add(Calendar.DATE, 2);
					    		  for (int i=StatementNumber;i==StatementNumber;i++)
						          {
						        	  int x=StatementNumber-1;
							        	  int j=0;
							        	  cal.add(Calendar.MONTH,x);
							        	  SimpleDateFormat sdf1 = new SimpleDateFormat("d MMM yyyy");
									      String NonLWIPDD = sdf1.format(cal.getTime());
								          SimpleDateFormat LPDD = new SimpleDateFormat("d MMM yyyy");
									      String LWIPDDDate = LPDD.format(cal.getTime());
									      
									      //To calculate LWI Statement date
									      cal.add(Calendar.DATE,-23);
									      SimpleDateFormat LWST = new SimpleDateFormat("d MMM yyyy");
									      String LWIStatementdate = LWST.format(cal.getTime());
									      System.out.println(StatementNumber+"  State LWI NXT PDD = "+  LWIStatementdate);
									      System.out.println(StatementNumber+"  LWI NXT PDD = "+  LWIPDDDate);
									   
								     }// end of for in else condition
					    	  }	//end of else condition 31 days in month
			    		  } ///end of if d=6
			    	  /**********************************if date falls on 7th of month ***************************************** */
			    	  if(d==7)
			    	  {
			    		  if (m==4||m==6 || m==9 || m==11)					// if it falls on 30 days of the month
			    		  {
			    			  
			    			  cal.add(Calendar.DATE, 1);
					    	  for (int i=StatementNumber;i==StatementNumber;i++)
					          {
					        	  int x=StatementNumber-1;
						        	  int j=0;
						        	  cal.add(Calendar.MONTH,x);
						        	  SimpleDateFormat NXT = new SimpleDateFormat("d MMM yyyy");
								      String NXT1 = NXT.format(cal.getTime());
								      //To calculate LWI PDD
								     
								      SimpleDateFormat LPDD = new SimpleDateFormat("d MMM yyyy");
								      String LWIPDDDate = LPDD.format(cal.getTime());
								      
								      //To calculate Non LWI PDD
								      cal.add(Calendar.DATE,-23);
								      SimpleDateFormat NLst = new SimpleDateFormat("d MMM yyyy");
								      String NonLWISt = NLst.format(cal.getTime());
								      System.out.println(StatementNumber+"   LWI St PDD = "+  NonLWISt);
								      System.out.println(StatementNumber+"  LWI NXT PDD = "+  LWIPDDDate);
								   
							     }	// end for
			    		  }	//end for 30 days in a month 
					    	  else										//if date is 7 and falls on 31 days of the month follow normal logic
					    	  {
					    		  cal.add(Calendar.DATE, 1);
					    		  for (int i=StatementNumber;i==StatementNumber;i++)
						          {
						        	  int x=StatementNumber-1;
							        	  int j=0;
							        	  cal.add(Calendar.MONTH,x);
							        	  SimpleDateFormat sdf1 = new SimpleDateFormat("d MMM yyyy");
									      String NonLWIPDD = sdf1.format(cal.getTime());
								          SimpleDateFormat LPDD = new SimpleDateFormat("d MMM yyyy");
									      String LWIPDDDate = LPDD.format(cal.getTime());
									      
									      //To calculate LWI Statement date
									      cal.add(Calendar.DATE,-23);
									      SimpleDateFormat LWST = new SimpleDateFormat("d MMM yyyy");
									      String LWIStatementdate = LWST.format(cal.getTime());
									      System.out.println(StatementNumber+"  State LWI NXT PDD = "+  LWIStatementdate);
									      System.out.println(StatementNumber+"  LWI NXT PDD = "+  LWIPDDDate);
									   
								     }// end of for in else condition
					    	  }	//end of else condition 31 days in month
			    		  } ///end of if d=7
/***************************************************************************************************************************************************************************/
			    	  /**********************************if date falls on 7th of month ***************************************** */
			    	  if(d==8)
			    	  {
			    		  if (m==4||m==6 || m==9 || m==11)					// if it falls on 30 days of the month
			    		  {
			    			  cal.add(Calendar.DATE, 1);
			    			  
					    	  for (int i=StatementNumber;i==StatementNumber;i++)
					          {
					        	  int x=StatementNumber-1;
						        	  int j=0;
						        	  cal.add(Calendar.MONTH,x);
						        	  SimpleDateFormat NXT = new SimpleDateFormat("d MMM yyyy");
								      String NXT1 = NXT.format(cal.getTime());
								      //To calculate LWI PDD
								     
								      SimpleDateFormat LPDD = new SimpleDateFormat("d MMM yyyy");
								      String LWIPDDDate = LPDD.format(cal.getTime());
								      
								      //To calculate Non LWI PDD
								      cal.add(Calendar.DATE,-23);
								      SimpleDateFormat NLst = new SimpleDateFormat("d MMM yyyy");
								      String NonLWISt = NLst.format(cal.getTime());
								      System.out.println(StatementNumber+"   LWI St PDD = "+  NonLWISt);
								      System.out.println(StatementNumber+"  LWI NXT PDD = "+  LWIPDDDate);
								   
							     }	// end for
			    		  }	//end for 30 days in a month 
					    	  else										//if date is 8 and falls on 31 days of the month follow normal logic
					    	  {
					    		  cal.add(Calendar.DATE, 0);
					    		  for (int i=StatementNumber;i==StatementNumber;i++)
						          {
						        	  int x=StatementNumber-1;
							        	  int j=0;
							        	  cal.add(Calendar.MONTH,x);
							        	  SimpleDateFormat sdf1 = new SimpleDateFormat("d MMM yyyy");
									      String NonLWIPDD = sdf1.format(cal.getTime());
								          SimpleDateFormat LPDD = new SimpleDateFormat("d MMM yyyy");
									      String LWIPDDDate = LPDD.format(cal.getTime());
									      
									      //To calculate LWI Statement date
									      cal.add(Calendar.DATE,-23);
									      SimpleDateFormat LWST = new SimpleDateFormat("d MMM yyyy");
									      String LWIStatementdate = LWST.format(cal.getTime());
									      System.out.println(StatementNumber+"  State LWI NXT PDD = "+  LWIStatementdate);
									      System.out.println(StatementNumber+"  LWI NXT PDD = "+  LWIPDDDate);
									   
								     }// end of for in else condition
					    	  }	//end of else condition 31 days in month
			    		  } ///end of if d=11
/***************************************************************************************************************************************************************************/

			    	
}
			    //This loop will give the next statement date and PDD till 12 months
			      else 
			      {
			    	 for (int i=StatementNumber;i==StatementNumber;i++)
			          {
			        	  int x=StatementNumber-1;
				        	  int j=0;
				        	  cal.add(Calendar.MONTH,x);
				        	  SimpleDateFormat sdf1 = new SimpleDateFormat("d MMM yyyy");
						      String NonLWIPDD = sdf1.format(cal.getTime());
						      //System.out.println(i+ "  PDD = "+  date1);
						      cal.add(Calendar.DATE,-20);
						      SimpleDateFormat NXT = new SimpleDateFormat("d MMM yyyy");
						      String NXT1 = NXT.format(cal.getTime());
						     // int z=StatementNumber+1;
						      System.out.println(StatementNumber+"  Statement date = "+  NXT1);
						      
						      //To calculate LWI PDD
						      cal.add(Calendar.DATE,23);
						      SimpleDateFormat LPDD = new SimpleDateFormat("d MMM yyyy");
						      String LWIPDDDate = LPDD.format(cal.getTime());
						      
						      //To calculate Non LWI PDD
						      cal.add(Calendar.DATE,-3);
						      
						     int rdate=cal.get(Calendar.DAY_OF_MONTH);
						     if(rdate==29 ||rdate==30 || rdate==31)
						     {
						    	 cal.add(Calendar.MONTH, 0);
						    	 cal.setFirstDayOfWeek(1);
						    	 SimpleDateFormat NLPDD1 = new SimpleDateFormat("d MMM yyyy");
							      String NonLWIPDDDate1 = NLPDD1.format(cal.getTime());

						    	 System.out.println(NonLWIPDDDate1);
						     }
						      SimpleDateFormat NLPDD = new SimpleDateFormat("d MMM yyyy");
						      String NonLWIPDDDate = NLPDD.format(cal.getTime());
						      System.out.println(StatementNumber+"  Non LWI NXT PDD = "+  NonLWIPDDDate);
						      System.out.println(StatementNumber+"  LWI NXT PDD = "+  LWIPDDDate);
					  }			//end of for loop
				      
			      } //end of else
		}
		    	  
		    	  }		// end of method 
	
			    	    }	//end of main method
		    	  
		          
		      
		      
		       
		      
				      
		        	     
		          
		          
	
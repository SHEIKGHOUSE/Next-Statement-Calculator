package NCEstatementDateCalculatorApplet;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.UIManager;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Window.Type;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.ListSelectionModel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.Button;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.event.ActionEvent;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Cursor;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JEditorPane;
import java.awt.Label;
import javax.swing.JCheckBox;
import java.awt.SystemColor;

public class StatementDateCalculatorAppletVersion096 {

	private JFrame frmNceStatementForecast;
	private JTextField textField;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StatementDateCalculatorAppletVersion096 window = new StatementDateCalculatorAppletVersion096();
					window.frmNceStatementForecast.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StatementDateCalculatorAppletVersion096() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNceStatementForecast = new JFrame();
		frmNceStatementForecast.setTitle("NCE Statement Date Forecast Applet Version 0.97");
		frmNceStatementForecast.getContentPane().setForeground(new Color(0, 255, 0));
		frmNceStatementForecast.getContentPane().setFont(new Font("Calibri", Font.BOLD, 12));
		frmNceStatementForecast.getContentPane().setBackground(new Color(224, 255, 255));
		frmNceStatementForecast.setBounds(100, 100, 687, 472);
		frmNceStatementForecast.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNceStatementForecast.getContentPane().setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox.setToolTipText("DD");
		comboBox.setBackground(UIManager.getColor("ComboBox.disabledBackground"));
		comboBox.setBounds(227, 99, 45, 20);
		frmNceStatementForecast.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));
		comboBox_1.setBounds(325, 99, 45, 20);
		frmNceStatementForecast.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030"}));
		comboBox_2.setBounds(414, 99, 59, 20);
		frmNceStatementForecast.getContentPane().add(comboBox_2);
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","35","36","37","38","39","40","41","42","43","44","45","46","47","48"}));
		comboBox_3.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(199, 21, 133), new Color(255, 255, 0), new Color(0, 0, 205), new Color(255, 0, 0)));
		comboBox_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		comboBox_3.setForeground(new Color(0, 0, 0));
		comboBox_3.setBounds(453, 231, 45, 20);
		frmNceStatementForecast.getContentPane().add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBorder(UIManager.getBorder("RadioButton.border"));
		comboBox_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"LWI", "Non LWI"}));
		comboBox_4.setForeground(new Color(0, 0, 0));
		comboBox_4.setBounds(445, 151, 59, 20);
		frmNceStatementForecast.getContentPane().add(comboBox_4);
		
		JLabel lblNewLabel = new JLabel("Day");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 12));
		lblNewLabel.setBackground(UIManager.getColor("Label.foreground"));
		lblNewLabel.setBounds(191, 103, 38, 14);
		frmNceStatementForecast.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Month");
		lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD, 12));
		lblNewLabel_1.setBackground(UIManager.getColor("Label.foreground"));
		lblNewLabel_1.setBounds(282, 103, 46, 14);
		frmNceStatementForecast.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Year");
		lblNewLabel_2.setBackground(UIManager.getColor("Label.foreground"));
		lblNewLabel_2.setFont(new Font("Calibri", Font.BOLD, 12));
		lblNewLabel_2.setBounds(380, 103, 46, 14);
		frmNceStatementForecast.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("NCE Statement Date,Payment Due Date");
		lblNewLabel_3.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3.setForeground(new Color(138, 43, 226));
		lblNewLabel_3.setFont(new Font("Liberation Sans", Font.BOLD, 16));
		lblNewLabel_3.setBounds(179, 11, 357, 20);
		frmNceStatementForecast.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Please select the Account creation date of the Credit account");
		lblNewLabel_4.setFont(new Font("Goudy Old Style", Font.BOLD, 14));
		lblNewLabel_4.setForeground(new Color(255, 0, 0));
		lblNewLabel_4.setBounds(153, 62, 408, 14);
		frmNceStatementForecast.getContentPane().add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Forecast");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if(e.getActionCommand().equals("Forecast"))
				{
					
					String Brnd=(String) comboBox_4.getSelectedItem();
					String D=(String) comboBox.getSelectedItem();
					String M=(String) comboBox_1.getSelectedItem();
					int Month=Integer.parseInt(M);
					int Date=Integer.parseInt(D);
					String Y=(String) comboBox_2.getSelectedItem();
					String SN=(String) comboBox_3.getSelectedItem();
					int Year=Integer.parseInt(Y);
					int StatementNumber=Integer.parseInt(SN);
					//Set calendar to account creation date
					
				      Calendar cal = new GregorianCalendar(Year,Month,Date);
				      
				      //Incrementing 1 month from creation date
				      
				      cal.add(Calendar.MONTH, 0);
				      
				      //Define Format of date
				      SimpleDateFormat sdf = new SimpleDateFormat("d MMM yyyy");
				      String date = sdf.format(cal.getTime());
				      
				      //Printing the first statement date
				     // System.out.println(" 1st statement date is =  "+date);
				   //   textField.setText("1st Statement date= "+date);	//Non LWI statement date
				    //  textField_3.setText(StatementNumber+"   PDD = "+date);  //LWI State
				     
				      
				      //Adding the date to 20 days to find out the PDD date
				      cal.add(Calendar.DATE, 20);
				      
				      //This loop will give the next statement date and PDD till 24 months
				      
				    //to check the whether PDD falls on 29 or 30 or 31 of the month
				    
					if(Brnd.equals("Non LWI")) {
						
						//Sl.performCalendarArithmetic(Date, Month, Year);
						///////////////////////////////////////////////////////////////////////////
						  
					    //to check the whether PDD falls on 29 or 30 or 31 of the month
					      
					      if(Date==10 ||Date==11 ||Date==9)
					      {
					    	  //if date is 11
					    	  if(Date==11)
					    	  {
					    		  if (Month==4||Month==6 || Month==9 || Month==11)					// if it falls on 30 days of the month
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
										     // System.out.println(StatementNumber+"  Statement date = "+  NXT1);
										      textField.setText(StatementNumber+"  Statement date = "+NXT1);
										      
										      //To calculate LWI PDD
										      cal.add(Calendar.DATE,23);
										      SimpleDateFormat LPDD = new SimpleDateFormat("d MMM yyyy");
										      String LWIPDDDate = LPDD.format(cal.getTime());
										      
										      //To calculate Non LWI PDD
										      cal.add(Calendar.DATE,-3);
										      SimpleDateFormat NLPDD = new SimpleDateFormat("d MMM yyyy");
										      String NonLWIPDDDate = NLPDD.format(cal.getTime());
										     // System.out.println(StatementNumber+"  Non LWI NXT PDD = "+  NonLWIPDDDate);
										      textField_1.setText(StatementNumber+"   PDD = "+NonLWIPDDDate);
										      //System.out.println(StatementNumber+"  LWI NXT PDD = "+  LWIPDDDate);
										     // textField_2.setText(StatementNumber+"   PDD = "+LWIPDDDate);
										   
									     }	// end for
					    		  }	//end for 30 days in a month 
							    	  else if(Month!=2 ||Month!=1)										//if date is 11 and falls on 31 days of the month follow normal logic
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
											     // System.out.println(StatementNumber+"  Statement date = "+  NXT1);
											      textField.setText(StatementNumber+"  Statement date = "+NXT1);
											      
											      //To calculate LWI PDD
											      cal.add(Calendar.DATE,23);
											      SimpleDateFormat LPDD = new SimpleDateFormat("d MMM yyyy");
											      String LWIPDDDate = LPDD.format(cal.getTime());
											      
											      //To calculate Non LWI PDD
											      cal.add(Calendar.DATE,-3);
											      SimpleDateFormat NLPDD = new SimpleDateFormat("d MMM yyyy");
											      String NonLWIPDDDate = NLPDD.format(cal.getTime());
											      // System.out.println(StatementNumber+"  Non LWI NXT PDD = "+  NonLWIPDDDate);
											      textField_1.setText(StatementNumber+"   PDD = "+NonLWIPDDDate);
											     // System.out.println(StatementNumber+"  LWI NXT PDD = "+  LWIPDDDate);
											    //  textField_2.setText(StatementNumber+"   PDD = "+LWIPDDDate);
											   
										     }// end of for in else condition
							    	  }	//end of else condition 31 days in month
					    		  } ///end of if d=11
					    	
					    	  // start of if date falls on 10th of the month 
					    	  if(Date==10)
					    	  {
					    		 if (Month==4||Month==6 || Month==9 || Month==11)					// if it falls on 30 days of the month
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
										     // System.out.println(StatementNumber+"  Statement date = "+  NXT1);
										      textField.setText(StatementNumber+"  Statement date = "+NXT1);
										      
										      //To calculate LWI PDD
										      cal.add(Calendar.DATE,23);
										      SimpleDateFormat LPDD = new SimpleDateFormat("d MMM yyyy");
										      String LWIPDDDate = LPDD.format(cal.getTime());
										      
										      //To calculate Non LWI PDD
										      cal.add(Calendar.DATE,-3);
										      SimpleDateFormat NLPDD = new SimpleDateFormat("d MMM yyyy");
										      String NonLWIPDDDate = NLPDD.format(cal.getTime());
										     // System.out.println(StatementNumber+"  Non LWI NXT PDD = "+  NonLWIPDDDate);
										      textField_1.setText(StatementNumber+"   PDD = "+NonLWIPDDDate);
										     //System.out.println(StatementNumber+"  LWI NXT PDD = "+  LWIPDDDate);
										 //     textField_2.setText(StatementNumber+"   PDD = "+LWIPDDDate);
										   
									     }	// end for
					    		  }	//end for 30 days in a month 
							    	  else if(Month!=2 ||Month!=1)										//if date is 10 and falls on 31 days of the month follow normal logic
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
											     // System.out.println(StatementNumber+"  Statement date = "+  NXT1);
											      textField.setText(StatementNumber+"  Statement date = "+NXT1);
											      
											      //To calculate LWI PDD
											      cal.add(Calendar.DATE,23);
											      SimpleDateFormat LPDD = new SimpleDateFormat("d MMM yyyy");
											      String LWIPDDDate = LPDD.format(cal.getTime());
											      
											      //To calculate Non LWI PDD
											      cal.add(Calendar.DATE,-3);
											      SimpleDateFormat NLPDD = new SimpleDateFormat("d MMM yyyy");
											      String NonLWIPDDDate = NLPDD.format(cal.getTime());
											    //  System.out.println(StatementNumber+"  Non LWI NXT PDD = "+  NonLWIPDDDate);
											      textField_1.setText(StatementNumber+"   PDD = "+NonLWIPDDDate);
											    //  System.out.println(StatementNumber+"  LWI NXT PDD = "+  LWIPDDDate);
											   //   textField_2.setText(StatementNumber+"   PDD = "+LWIPDDDate);
											   
										     }// end of for in else condition
							    	  }	//end of else condition 31 days in month
					    		  } ///end of if d=11
					    	  
					    	  //if selected date is 9 of the month
					    	  if(Date==9)
					    	  {
					    		 if (Month==4||Month==6 || Month==9 || Month==11)					// if it falls on 30 days of the month
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
										     // System.out.println(StatementNumber+"  Statement date = "+  NXT1);
										      textField.setText(StatementNumber+"  Statement date = "+NXT1);
										      
										      //To calculate LWI PDD
										      cal.add(Calendar.DATE,23);
										      SimpleDateFormat LPDD = new SimpleDateFormat("d MMM yyyy");
										      String LWIPDDDate = LPDD.format(cal.getTime());
										      
										      //To calculate Non LWI PDD
										      cal.add(Calendar.DATE,-3);
										      SimpleDateFormat NLPDD = new SimpleDateFormat("d MMM yyyy");
										      String NonLWIPDDDate = NLPDD.format(cal.getTime());
										    //  System.out.println(StatementNumber+"  Non LWI NXT PDD = "+  NonLWIPDDDate);
										      textField_1.setText(StatementNumber+"   PDD = "+NonLWIPDDDate);
										    //  System.out.println(StatementNumber+"  LWI NXT PDD = "+  LWIPDDDate);
										    //  textField_2.setText(StatementNumber+"   PDD = "+LWIPDDDate);
										   
									     }	// end for
					    		  }	//end for 30 days in a month 
							    	  else if(Month!=2 ||Month!=1)										//if date is 09 and falls on 31 days of the month follow normal logic
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
											    //  System.out.println(StatementNumber+"  Statement date = "+  NXT1);
											      textField.setText(StatementNumber+"  Statement date = "+NXT1);
											      
											      //To calculate LWI PDD
											      cal.add(Calendar.DATE,23);
											      SimpleDateFormat LPDD = new SimpleDateFormat("d MMM yyyy");
											      String LWIPDDDate = LPDD.format(cal.getTime());
											      
											      //To calculate Non LWI PDD
											      cal.add(Calendar.DATE,-3);
											      SimpleDateFormat NLPDD = new SimpleDateFormat("d MMM yyyy");
											      String NonLWIPDDDate = NLPDD.format(cal.getTime());
											    //  System.out.println(StatementNumber+"  Non LWI NXT PDD = "+  NonLWIPDDDate);
											      textField_1.setText(StatementNumber+"   PDD = "+NonLWIPDDDate);
											    //  System.out.println(StatementNumber+"  LWI NXT PDD = "+  LWIPDDDate);
											    //  textField_2.setText(StatementNumber+"   PDD = "+LWIPDDDate);
											   
										     }// end of for in else condition
							    	  }	//end of else condition 31 days in month
					    		  } ///end of if d=11
					    	  
					    	  }
					    //This loop will give the next statement date and PDD till 12 months and it is general logic except above dates for LWI and Non LWI
					      else 
					      {
					    	 for (int i=StatementNumber;i==StatementNumber;i++)
					          {
					        	  int x=StatementNumber-1;
						        	  int j=0;
						        	  cal.add(Calendar.MONTH,x);
						        	  SimpleDateFormat sdf1 = new SimpleDateFormat("d MMM yyyy");
								      String NonLWIPDDDate = sdf1.format(cal.getTime());
								      //System.out.println(i+ "  PDD = "+  date1);
								      cal.add(Calendar.DATE,-20);
								      SimpleDateFormat NXT = new SimpleDateFormat("d MMM yyyy");
								      String Statementdate = NXT.format(cal.getTime());
								     // int z=StatementNumber+1;
								  //    System.out.println(StatementNumber+"  Statement date = "+  NXT1);
								    //Common statement date for both LWI and Non LWI
								  //    textField_3.setText(StatementNumber+"   Statement = "+Statementdate);	//LWI statement date
								      textField.setText(StatementNumber+"   Statement = "+Statementdate);		//Non LWI statement date
								     //To calculate LWI PDD
								      cal.add(Calendar.DATE,23);
								      SimpleDateFormat LPDD = new SimpleDateFormat("d MMM yyyy");
								      String LWIPDDDate = LPDD.format(cal.getTime());
								  //    textField_2.setText(StatementNumber+"   PDD = "+LWIPDDDate);			//LWI PDD date
								      
								      //To calculate Non LWI PDD
								      cal.add(Calendar.DATE,-3);
								      textField_1.setText(StatementNumber+"   PDD = "+NonLWIPDDDate);		// Non LWI PDD date
								      
								      
								     int rdate=cal.get(Calendar.DAY_OF_MONTH);
								     if(rdate==29 ||rdate==30 || rdate==31)
								     {
								    	 cal.add(Calendar.MONTH, 0);
								    	 cal.setFirstDayOfWeek(1);
								    	 SimpleDateFormat NLPDD1 = new SimpleDateFormat("d MMM yyyy");
									      String NonLWIPDDDate1 = NLPDD1.format(cal.getTime());
									      textField_1.setText(StatementNumber+"   PDD = "+NonLWIPDDDate);		// Non LWI PDD date
								    //	 System.out.println(NonLWIPDDDate1);
								     }
								      SimpleDateFormat NLPDD = new SimpleDateFormat("d MMM yyyy");
								      String NonLWIPDDDate1 = NLPDD.format(cal.getTime());
								    //  System.out.println(StatementNumber+"  Non LWI NXT PDD = "+  NonLWIPDDDate);
								   //   System.out.println(StatementNumber+"  LWI NXT PDD = "+  LWIPDDDate);
								      textField_1.setText(StatementNumber+"   PDD = "+NonLWIPDDDate1);		// Non LWI PDD date
								//      textField_2.setText(StatementNumber+"   PDD = "+LWIPDDDate);			//LWI PDD date
								      	
							  }			//end of for loop
						      
					      } //end of else
					      
					      

									}
/////////////////////////logic for LWI account
else if(Brnd.equals("LWI"))
{
	cal.add(Calendar.DATE, -20);
	cal.add(Calendar.DATE, 23);
	      
	      if(Date==6 ||Date==7 ||Date==8)
	      {
	    	  //if date is 11
	    	  if(Date==6)
	    	  {
	    		  if (Month==4||Month==6 || Month==9 || Month==11)					// if it falls on 30 days of the month
	    		  {
	    			  
	    			  cal.add(Calendar.DATE, 2);
			    	  for (int i=StatementNumber;i==StatementNumber;i++)
			          {
			        	  int x=StatementNumber-1;
				        	  int j=0;
				        	  cal.add(Calendar.MONTH,x);
				        	  SimpleDateFormat NXT = new SimpleDateFormat("d MMM yyyy");
						      String LWIStatementdate = NXT.format(cal.getTime());
						      //To calculate LWI PDD
						     
						  //    SimpleDateFormat LPDD = new SimpleDateFormat("d MMM yyyy");
						   //   String LWIPDDDate = LPDD.format(cal.getTime());
						      
						      //To calculate Non LWI PDD
						      cal.add(Calendar.DATE,-23);
						      SimpleDateFormat Lst = new SimpleDateFormat("d MMM yyyy");
						      String LWIPDDDate = Lst.format(cal.getTime());
						   //   System.out.println(StatementNumber+"   LWI St PDD = "+  NonLWISt);
						    //  System.out.println(StatementNumber+"  LWI NXT PDD = "+  LWIPDDDate);
						      textField_3.setText(StatementNumber+"   Statement = "+LWIStatementdate);
						      textField_2.setText(StatementNumber+"   PDD = "+LWIPDDDate);
						   
					     }	// end for
	    		  }	//end for 30 days in a month 
			    	  else	if(Month!=2 ||Month!=1)									//if date is 11 and falls on 31 days of the month follow normal logic
			    	  {
			    		  cal.add(Calendar.DATE, 3);
			    		  for (int i=StatementNumber;i==StatementNumber;i++)
				          {
				        	  int x=StatementNumber-1;
					        	  int j=0;
					        	  cal.add(Calendar.MONTH,x);
					        	  SimpleDateFormat sdf1 = new SimpleDateFormat("d MMM yyyy");
							      String LWIStatementdate = sdf1.format(cal.getTime());
						       //   SimpleDateFormat LPDD = new SimpleDateFormat("d MMM yyyy");
							    //  String LWIPDDDate = LPDD.format(cal.getTime());
							      
							      //To calculate LWI Statement date
							      cal.add(Calendar.DATE,-23);
							      SimpleDateFormat LWST = new SimpleDateFormat("d MMM yyyy");
							      String LWIPDDDate = LWST.format(cal.getTime());
							    //  System.out.println(StatementNumber+"  State LWI NXT PDD = "+  LWIStatementdate);
							    //  System.out.println(StatementNumber+"  LWI NXT PDD = "+  LWIPDDDate);
							      textField_3.setText(StatementNumber+"   Statement = "+LWIStatementdate);  //L
							      textField_2.setText(StatementNumber+"   PDD = "+LWIPDDDate);

							   
						     }// end of for in else condition
			    	  }	//end of else condition 31 days in month
	    		  } ///end of if d=6
	    	  /**********************************if date falls on 7th of month ***************************************** */
	    	  if(Date==7)
	    	  {
	    		  if (Month==4||Month==6 || Month==9 || Month==11)					// if it falls on 30 days of the month
	    		  {
	    			  
	    			  cal.add(Calendar.DATE, 1);
			    	  for (int i=StatementNumber;i==StatementNumber;i++)
			          {
			        	  int x=StatementNumber-1;
				        	  int j=0;
				        	  cal.add(Calendar.MONTH,x);
				        	  SimpleDateFormat NXT = new SimpleDateFormat("d MMM yyyy");
						      String LWIStatementdate = NXT.format(cal.getTime());
						      //To calculate LWI PDD
						     
						//      SimpleDateFormat LPDD = new SimpleDateFormat("d MMM yyyy");
						  //    String LWIPDDDate = LPDD.format(cal.getTime());
						      
						      //To calculate Non LWI PDD
						      cal.add(Calendar.DATE,-23);
						      SimpleDateFormat NLst = new SimpleDateFormat("d MMM yyyy");
						      String LWIPDDDate = NLst.format(cal.getTime());
						     // System.out.println(StatementNumber+"   LWI St PDD = "+  NonLWISt);
						     // System.out.println(StatementNumber+"  LWI NXT PDD = "+  LWIPDDDate);
						      textField_3.setText(StatementNumber+"   Statement = "+LWIStatementdate);  //L
						      textField_2.setText(StatementNumber+"   PDD = "+LWIPDDDate);
   
						   
					     }	// end for
	    		  }	//end for 30 days in a month 
			    	  else	if(Month!=2 ||Month!=1)									//if date is 7 and falls on 31 days of the month follow normal logic
			    	  {
			    		  cal.add(Calendar.DATE, 1);
			    		  for (int i=StatementNumber;i==StatementNumber;i++)
				          {
				        	  int x=StatementNumber-1;
					        	  int j=0;
					        	  cal.add(Calendar.MONTH,x);
					        	  SimpleDateFormat sdf1 = new SimpleDateFormat("d MMM yyyy");
							      String LWIPDDDate = sdf1.format(cal.getTime());
							      
						       //   SimpleDateFormat LPDD = new SimpleDateFormat("d MMM yyyy");
							    //  String LWIPDDDate = LPDD.format(cal.getTime());
							      textField_2.setText(StatementNumber+"   PDD = "+LWIPDDDate);	//
							      
							      //To calculate LWI Statement date
							      cal.add(Calendar.DATE,-23);
							      SimpleDateFormat LWST = new SimpleDateFormat("d MMM yyyy");
							      String LWIStatementdate = LWST.format(cal.getTime());
							    //  System.out.println(StatementNumber+"  State LWI NXT PDD = "+  LWIStatementdate);
							     // System.out.println(StatementNumber+"  LWI NXT PDD = "+  LWIPDDDate);
							      textField_3.setText(StatementNumber+"   Statement = "+LWIStatementdate);
							      

							   
						     }// end of for in else condition
			    	  }	//end of else condition 31 days in month
	    		  } ///end of if d=7
/***************************************************************************************************************************************************************************/
	    	  /**********************************if date falls on 7th of month ***************************************** */
	    	  if(Date==8)
	    	  {
	    		  if (Month==4||Month==6 || Month==9 || Month==11)					// if it falls on 30 days of the month
	    		  {
	    			  cal.add(Calendar.DATE, 1);
	    			  
			    	  for (int i=StatementNumber;i==StatementNumber;i++)
			          {
			        	  int x=StatementNumber-1;
				        	  int j=0;
				        	  cal.add(Calendar.MONTH,x);
				        	  SimpleDateFormat NXT = new SimpleDateFormat("d MMM yyyy");
						      String LWIStatementdate = NXT.format(cal.getTime());
						      //To calculate LWI PDD
						     
						   //   SimpleDateFormat LPDD = new SimpleDateFormat("d MMM yyyy");
						    //  String LWIPDDDate = LPDD.format(cal.getTime());
						      
						      //To calculate Non LWI PDD
						      cal.add(Calendar.DATE,-23);
						      SimpleDateFormat LWst = new SimpleDateFormat("d MMM yyyy");
						      String LWIPDDDate = LWst.format(cal.getTime());
						    //  System.out.println(StatementNumber+"   LWI St PDD = "+  NonLWISt);
						     // System.out.println(StatementNumber+"  LWI NXT PDD = "+  LWIPDDDate);
						      textField_3.setText(StatementNumber+"   Statement = "+LWIStatementdate);
						      textField_2.setText(StatementNumber+"   PDD = "+LWIPDDDate);	//

						   
					     }	// end for
	    		  }	//end for 30 days in a month 
			    	  else	if(Month!=2||Month!=1)									//if date is 8 and falls on 31 days of the month follow normal logic
			    	  {
			    		  cal.add(Calendar.DATE, 0);
			    		  for (int i=StatementNumber;i==StatementNumber;i++)
				          {
				        	  int x=StatementNumber-1;
					        	  int j=0;
					        	  cal.add(Calendar.MONTH,x);
					        	  SimpleDateFormat sdf1 = new SimpleDateFormat("d MMM yyyy");
							      String LWIStatementdate = sdf1.format(cal.getTime());
						     //     SimpleDateFormat LPDD = new SimpleDateFormat("d MMM yyyy");
							  //    String LWIPDDDate = LPDD.format(cal.getTime());
							      
							      //To calculate LWI Statement date
							      cal.add(Calendar.DATE,-23);
							      SimpleDateFormat LWST = new SimpleDateFormat("d MMM yyyy");
							      String LWIPDDDate = LWST.format(cal.getTime());
							   //   System.out.println(StatementNumber+"  State LWI NXT PDD = "+  LWIStatementdate);
							    //  System.out.println(StatementNumber+"  LWI NXT PDD = "+  LWIPDDDate);
							      textField_3.setText(StatementNumber+"   Statement = "+LWIStatementdate);
							      textField_2.setText(StatementNumber+"   PDD = "+LWIPDDDate);	//

							   
						     }// end of for in else condition
			    	  }	//end of else condition 31 days in month
	    		  } ///end of if d=11
/***************************************************************************************************************************************************************************/
	 

	    	
}
	     	//This loop will give the next statement date and PDD till 12 months and it is general logic except above dates for LWI and Non LWI
	      else 
	      {
	    	  
	    	 for (int i=StatementNumber;i==StatementNumber;i++)
	          {
	        	  int x=StatementNumber-1;
		        	  int j=0;
		        	  cal.add(Calendar.MONTH,x);
		        	  SimpleDateFormat sdf1 = new SimpleDateFormat("d MMM yyyy");
				      String NonLWIPDDDate = sdf1.format(cal.getTime());
				      //System.out.println(i+ "  PDD = "+  date1);
				      cal.add(Calendar.DATE,-23);
				      SimpleDateFormat NXT = new SimpleDateFormat("d MMM yyyy");
				      String Statementdate = NXT.format(cal.getTime());
				     // int z=StatementNumber+1;
				  //    System.out.println(StatementNumber+"  Statement date = "+  NXT1);
				    //Common statement date for both LWI and Non LWI
				      textField_3.setText(StatementNumber+"   Statement = "+Statementdate);	//LWI statement date
				//      textField.setText(StatementNumber+"   Statement = "+Statementdate);		//Non LWI statement date
				     //To calculate LWI PDD
				      cal.add(Calendar.DATE,23);
				      SimpleDateFormat LPDD = new SimpleDateFormat("d MMM yyyy");
				      String LWIPDDDate = LPDD.format(cal.getTime());
				      textField_2.setText(StatementNumber+"   PDD = "+LWIPDDDate);			//LWI PDD date
				      
				      //To calculate Non LWI PDD
				      cal.add(Calendar.DATE,-3);
				//      textField_1.setText(StatementNumber+"   PDD = "+NonLWIPDDDate);		// Non LWI PDD date
				      
				      
				     int rdate=cal.get(Calendar.DAY_OF_MONTH);
				     if(rdate==29 ||rdate==30 || rdate==31)
				     {
				    	 cal.add(Calendar.MONTH, 0);
				    	 cal.setFirstDayOfWeek(1);
				    	 SimpleDateFormat NLPDD1 = new SimpleDateFormat("d MMM yyyy");
					      String NonLWIPDDDate1 = NLPDD1.format(cal.getTime());
					      textField_1.setText(StatementNumber+"   PDD = "+NonLWIPDDDate);		// Non LWI PDD date
				    //	 System.out.println(NonLWIPDDDate1);
				     }
				      SimpleDateFormat NLPDD = new SimpleDateFormat("d MMM yyyy");
				      String NonLWIPDDDate1 = NLPDD.format(cal.getTime());
				    //  System.out.println(StatementNumber+"  Non LWI NXT PDD = "+  NonLWIPDDDate);
				   //   System.out.println(StatementNumber+"  LWI NXT PDD = "+  LWIPDDDate);
				   //   textField_1.setText(StatementNumber+"   PDD = "+NonLWIPDDDate1);		// Non LWI PDD date
				      textField_2.setText(StatementNumber+"   PDD = "+LWIPDDDate);			//LWI PDD date
				      	
			  }			//end of for loop
		      
	      } //end of else
	    				      
				      /***********************************************************************************************************************************************************/
				          }		//end of forecast button condition 
                /*********************************************************************************************
					**************End of the statement logic for both Non LWI and LWI*******************
			     *******************************************************************************************/
				}
				String DailyM;
				
				String dataupdate="select DAILY_METRICS from sdfus where METRICS_DATE like sysdate";
				//String data="update sdfus set DAILY_METRICS='"+i+"' where METRICS_DATE like sysdate;";
			Connection con;
			try {
				con = DriverManager.getConnection("jdbc:oracle:thin:@demodatabase.cbgl9osqgrde.us-east-2.rds.amazonaws.com:1521:ORCL","sheik","hello123");
				Statement st=(Statement) con.createStatement();
				PreparedStatement ps = con.prepareStatement(dataupdate);
				ResultSet rs = ps.executeQuery();
				if (!rs.isBeforeFirst() ) {    
					ps.executeQuery("insert into sdfus values (1,SYSDATE)");  
			    }
				if(rs.next())
				{
					DailyM=rs.getString("DAILY_METRICS");
					int DM=Integer.parseInt(DailyM);
					int i=DM+1;
					System.out.println(i);
					ps.executeQuery("update sdfus set DAILY_METRICS='"+i+"' where METRICS_DATE like sysdate");
					//PreparedStatement ps1 = con.prepareStatement("update sdfus set DAILY_METRICS='"+i+"' where METRICS_DATE like sysdate");
				}
				
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}

		});
		btnNewButton.setBackground(UIManager.getColor("Button.foreground"));
		btnNewButton.setFont(new Font("Calibri", Font.BOLD, 12));
		btnNewButton.setForeground(UIManager.getColor("Button.foreground"));
		btnNewButton.setBounds(283, 267, 89, 23);
		frmNceStatementForecast.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setForeground(new Color(153, 50, 204));
		textField.setSelectionColor(new Color(51, 153, 255));
		textField.setSelectedTextColor(new Color(255, 69, 0));
		textField.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null), new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))));
		textField.setFont(new Font("Calibri", Font.BOLD, 11));
		textField.setEditable(false);
		textField.setBounds(166, 315, 165, 23);
		frmNceStatementForecast.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setForeground(new Color(153, 50, 204));
		textField_1.setFont(new Font("Calibri", Font.BOLD, 11));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null), new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))));
		textField_1.setBounds(166, 362, 165, 23);
		frmNceStatementForecast.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setForeground(new Color(128, 0, 0));
		textField_2.setFont(new Font("Calibri", Font.BOLD, 11));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null), new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))));
		textField_2.setBounds(499, 362, 165, 23);
		frmNceStatementForecast.getContentPane().add(textField_2);
		
		Label label = new Label("Non LWI Statement Date");
		label.setBackground(UIManager.getColor("TextField.caretForeground"));
		label.setBounds(10, 316, 150, 22);
		frmNceStatementForecast.getContentPane().add(label);
		
		Label label_1 = new Label("Non LWI PDD Date");
		label_1.setBackground(Color.BLACK);
		label_1.setBounds(10, 363, 150, 22);
		frmNceStatementForecast.getContentPane().add(label_1);
		
		Label label_2 = new Label("LWI PDD Date");
		label_2.setBackground(Color.BLACK);
		label_2.setBounds(343, 362, 150, 22);
		frmNceStatementForecast.getContentPane().add(label_2);
		
		JLabel lblPleaseSelectThe = new JLabel("Please select any of the one Statement Number");
		lblPleaseSelectThe.setForeground(Color.RED);
		lblPleaseSelectThe.setFont(new Font("Goudy Old Style", Font.BOLD, 14));
		lblPleaseSelectThe.setBounds(153, 233, 290, 14);
		frmNceStatementForecast.getContentPane().add(lblPleaseSelectThe);
		
		JLabel lblNewLabel_5 = new JLabel("\u24D3 SHEIK GHOUSE LAZAM");
		lblNewLabel_5.setFont(new Font("Calibri", Font.BOLD, 10));
		lblNewLabel_5.setForeground(new Color(255, 51, 0));
		lblNewLabel_5.setBounds(537, 409, 358, 14);
		frmNceStatementForecast.getContentPane().add(lblNewLabel_5);
		
		Label label_3 = new Label("LWI Statement Date");
		label_3.setBackground(Color.BLACK);
		label_3.setBounds(343, 316, 150, 22);
		frmNceStatementForecast.getContentPane().add(label_3);
		
		textField_3 = new JTextField();
		textField_3.setForeground(new Color(128, 0, 0));
		textField_3.setFont(new Font("Calibri", Font.BOLD, 11));
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null), new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))));
		textField_3.setBounds(499, 315, 165, 23);
		frmNceStatementForecast.getContentPane().add(textField_3);
		
		JLabel lblPleaseSelectThe_1 = new JLabel("Please select the brand type of Credit account");
		lblPleaseSelectThe_1.setForeground(Color.RED);
		lblPleaseSelectThe_1.setFont(new Font("Goudy Old Style", Font.BOLD, 14));
		lblPleaseSelectThe_1.setBounds(152, 153, 290, 14);
		frmNceStatementForecast.getContentPane().add(lblPleaseSelectThe_1);
		
		
		
		JLabel lblNewLabel_6 = new JLabel("Non LWI brands are : Very ,Very Exlusive ,Little Woods");
		lblNewLabel_6.setForeground(Color.BLUE);
		lblNewLabel_6.setFont(new Font("Lucida Handwriting", Font.PLAIN, 10));
		lblNewLabel_6.setBounds(167, 179, 306, 20);
		frmNceStatementForecast.getContentPane().add(lblNewLabel_6);
		
		JLabel lblLwiBrand = new JLabel("LWI brand : Little Woods Ireland");
		lblLwiBrand.setForeground(Color.BLUE);
		lblLwiBrand.setFont(new Font("Lucida Handwriting", Font.PLAIN, 10));
		lblLwiBrand.setBounds(167, 202, 276, 20);
		frmNceStatementForecast.getContentPane().add(lblLwiBrand);
		
		
		
		
		
		
		
		
	}
}

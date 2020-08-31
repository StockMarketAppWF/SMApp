//package com.wellsfargo.stockexchange.company.entity;
//
//import javax.persistence.Entity;
//
//@Entity
//public class Admin {
//	  
//	private String AdminUsername = "qwerty";
//	private String Adminpassword = "12345";
//	private boolean getAdminStatus;
//	
//	public boolean isAdmin() {
//		return getAdminStatus;
//	}
//	
//	public void setGetAdminStatus(boolean getAdminStatus) {
//		this.getAdminStatus = getAdminStatus;
//	}
//	public void print(Object obj) {
//		System.out.print(obj);
//	}
//	public void start(String[] args){
//		   Admin credential = new Admin();      
//		   credential.getUserNamePassword();
//	}
//	
//	private void getUserNamePassword(){
////	      print("Please enter credentials"); 
////
////	      print("User ID: ", JLabel.RIGHT);
////	      JLabel passwordLabel = new JLabel("Password: ", JLabel.CENTER);
////	      final JTextField userText = new JTextField(6);
////	      final JPasswordField passwordText = new JPasswordField(6);      
////	      passwordText.setEchoChar('*');
////		  
////	      JButton loginButton = new JButton("Login");
////	      loginButton.addActionListener(new ActionListener() {
////		     public void actionPerformed(ActionEvent e) {     
////		        String password =  new String(passwordText.getPassword()); 
////		        boolean entry=false;
////				while(!entry) {
////					///Implemented for Admin for now. Can extend the same for general user.
////		            if(userText.getText().contains(AdminUsername) && password.contains(Adminpassword)) {
////		            	statusLabel.setText("Login successful");
////		            	entry=true;
////		            }
////		            else {
////		            	statusLabel.setText("Login failed, incorrect username or password");
////		            }
////				}
////		                
////		     }
////	      }); 
////	      controlPanel.add(namelabel);
////	      controlPanel.add(userText);
////	      controlPanel.add(passwordLabel);       
////	      controlPanel.add(passwordText);
////	      controlPanel.add(loginButton);
////	      mainFrame.setVisible(true);  
////	   
//		}
//	
//	
//
//}

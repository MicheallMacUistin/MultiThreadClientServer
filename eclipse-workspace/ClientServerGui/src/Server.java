import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.*;
import java.util.Date.*;

public class Server extends JFrame { //implements ActionListener,Runnable {
	
	//TEXT AREA FOR DISPLAYING CONTENTS
	private JTextArea jta = new JTextArea();
	
	 public static void main(String args[]) 
	 {
	  new Server();
	 }
	 
	 public Server()
	 {
		 //PLACE TEXT AREA ON THE FRAME
		 setLayout(new BorderLayout());
		 add(new JScrollPane(jta), BorderLayout.CENTER);
	  //Frame f = new Frame("Server Side Chatting");	//Frame for Server
	  //f.setLayout(new BorderLayout());//set layout
	  
	  setTitle("Server");
	  setSize(500,300);
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  setVisible(true);	//IT IS NECESSARY TO SHOW THE FRAME HERE
	  
//	  f.setBackground(Color.orange);//set background color of the Frame
//	  b1=new Button("Send");//Send Button
//	  b1.setBackground(Color.pink);
//	  b1.addActionListener(this);//Add action listener to send button.
//	  tf=new TextField(15);
//	  ta=new TextArea(12,20);
//	  ta.setBackground(Color.cyan);
//	  f.addWindowListener(new W1());//add Window Listener to the Frame
//	  f.add(tf);//Add TextField to the frame
//	  f.add(b1);//Add send Button to the frame
//	  f.add(ta);//Add TextArea to the frame
	  try{
	   ServerSocket ss=new ServerSocket(8000);	//Socket for server
	   
	   jta.append("Server started at " + new Date() + '\n');
	   
	   while(true) {
		   Socket s1=ss.accept();
		   myClient c = new myClient(s1);
		   c.start();
		  }
	  }
	  catch(IOException ex) {
		  System.err.println(ex);
	  }
	 }}	//END SERVER CONSTRUCT
	   
//	   //////////////////////////////////////////////////////////////////////////
//	   s=ss.accept();//accepts request from client
//	   System.out.println(s);
//	   //below line reads input from InputStreamReader
//	   br=new BufferedReader(new InputStreamReader(s.getInputStream()));
//	   //below line writes output to OutPutStream
//	   pw=new PrintWriter(s.getOutputStream(),true);
//	  }catch(Exception e)
//	  {
//	  }
//	  th=new Thread(this);//start a new thread
//	  th.setDaemon(true);//set the thread as demon
//	  th.start();
//	  setFont(new Font("Arial",Font.BOLD,20));
//	  f.setSize(200,200);//set the size
//	  f.setLocation(300,300);//set the location
//	  f.setVisible(true);
//	  f.validate();
//	 }
//
//	private static final long serialVersionUID = 1L;
////Declarations
// Button b1;
// TextField tf;
// TextArea ta;
// ServerSocket ss;
// Socket s;
// PrintWriter pw;
// BufferedReader br;
// Thread th;
// 
//
// //method required to close the Frame on clicking "X" icon.
// private class W1 extends WindowAdapter
// {
//  public void windowClosing(WindowEvent we) 
//  {
//   System.exit(0);
//  }
// }
// //This method will called after clicking on Send button.
// public void actionPerformed(ActionEvent ae)
// {
//  pw.println(tf.getText());//write the value of textfield into PrintWriter
//  tf.setText("");//clean the textfield
// }
// //Thread running as a process in background
// public void run()
// {
//  while(true)
//  {
//   try{
//    String s=br.readLine();//reads the input from textfield
//    ta.append(s+"\n");//Append to TextArea
//   }catch(Exception e)
//   {
//   }
//  } 
// }
// //Main method
//
//} 
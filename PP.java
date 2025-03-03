package p1;
import java.awt.*;
import java.awt.event.*;
import java.io.InputStream;
import java.net.*;

public class PP extends Frame implements ActionListener{
	//URL to get source code 
	TextField t1;
	TextArea t2;
	Button b1;
	Label l1;
	 PP(){
		 l1=new Label("ENTER URL :");
		 l1.setBounds(50,50,100,30);
		 
		 t1=new TextField();
		 t1.setBounds(150, 50, 250,30);
		 
		 b1=new Button("Get Source Code");
		 b1.setBounds(120,150,120,40);
		 b1.addActionListener(this);
		 
		 t2=new TextArea();
		 t2.setBounds(50, 200, 500, 580);
		 
		 add(l1);
		 add(t1);
		 add(b1);
		 add(t2);
		 setSize(600,800);
		 setLayout(null);
		 setVisible(true);
		 
	 }
	 public  void actionPerformed(ActionEvent e) {
		 String s=t1.getText();
		 if(s==null) {}
		 else {
			 try {
				 URL u=new URL(s);
				 URLConnection uc=u.openConnection();
				 
				 InputStream is=uc.getInputStream();
				 int i;
				 StringBuilder sb=new StringBuilder();
				 while((i=is.read())!=-1) {
					 sb.append((char)i);
					 
				 }
			 String source=sb.toString();
			 t2.setText(source);
			 }catch(Exception ex) {
				 System.out.println(e);
			 }
	 }
}
		public void windowClosing(WindowEvent e) {
			System.exit(0);}
	 public static void main(String args[]) {
		 new PP();
	 }}





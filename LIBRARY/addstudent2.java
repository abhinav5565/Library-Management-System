import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
class addstudent2  implements ActionListener
{
JTextField t1,t2,t3,t4,t5,t6,t7;
addstudent2(JTextField t1,JTextField t2,JTextField t3,JTextField t4,JTextField t5,JTextField t6,JTextField t7)
{
this.t1=t1;
this.t2=t2;
this.t3=t3;
this.t4=t4;
this.t5=t5;
this.t6=t6;
this.t7=t7;

}
public void actionPerformed(ActionEvent ae)
{
String s1=t1.getText();
String s2=t2.getText();
String s3=t3.getText();
String s4=t4.getText();
String s5=t5.getText();
String s6=t6.getText();
String s7=t7.getText();

try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abhinav","root","");
Statement stat=con.createStatement();
stat.executeUpdate("insert into student values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"')");
t1.setText("");
t2.setText("");
t3.setText("");
t4.setText("");
t5.setText("");
t6.setText("");
t7.setText("");
}
catch(Exception e)
{
System.out.println(e);
}
JOptionPane.showMessageDialog(null,"Student Added");
}
}

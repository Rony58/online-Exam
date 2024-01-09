import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

class DatabaseBean
{
Connection con1=null;

	public DatabaseBean( ) throws Exception
	{

con1=DriverManager.getConnection(
                "jdbc:ucanaccess://D:\\bank.accdb");
            



	    // Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	    // con1=DriverManager.getConnection("jdbc:odbc:dsnjsp","sa","");
	   }

	 public Connection getConnection( )
	{
		return con1;
		}
   }

public class NewClass extends JFrame
{
	JLabel label1,label2, label3;
	JLabel heading;

	JTextField text1,text2,text3;
	JButton but1;

	public NewClass( ){
	
		label1=new JLabel("From A/c Number");
		label2=new JLabel("To A/c Number");
		label3=new JLabel("Amount ");
		text1=new JTextField(5);
		text2=new JTextField(5);
		text3=new JTextField(5);
		
		heading=new JLabel("Money Transfer - using transaction ");
		heading.setFont(new Font("Curlz MT",Font.BOLD,12));
		but1=new JButton("Transfer");
		ButtonHandler handler1=new ButtonHandler( );
		but1.addActionListener(handler1);

		JPanel panel1=(JPanel)getContentPane( );
		panel1.setLayout(new FlowLayout( ) );
		panel1.add(heading);
		panel1.add(label1);
		panel1.add(text1);
		panel1.add(label2);
		panel1.add(text2);
		panel1.add(label3);
		panel1.add(text3);
		panel1.add(but1);
		setSize(420,120);
		setVisible(true);
		setLocation(200,200);
	
	}
	

class ButtonHandler implements ActionListener
{
	public void actionPerformed(ActionEvent ae)
	{
		int _acno1= Integer.parseInt( text1.getText( ));
		int _acno2= Integer.parseInt( text2.getText( ));
		float _amount= Float.parseFloat( text3.getText( ));

		DatabaseBean db1=null;

		try{
		db1 = new DatabaseBean( );
		java.sql.Connection con1=db1.getConnection( );

		con1.setAutoCommit(false);

		PreparedStatement st1=con1.prepareStatement("update accountholder set balance=balance-? where acno=?");
		st1.setFloat(1,_amount);
		st1.setInt(2,_acno1);
		st1.executeUpdate( );

		PreparedStatement st2=con1.prepareStatement("update accountholder set balance=balance+? where acno=?");
		st2.setFloat(1,_amount);
		st2.setInt(2,_acno2);
		st2.executeUpdate( );

		PreparedStatement st3=con1.prepareStatement("insert into TransferDetails(acno1,acno2,amount) values(?,?,?)");
		st3.setInt(1,_acno1);
		st3.setInt(2,_acno2);
		st3.setFloat(3,_amount);
		st3.executeUpdate( );

		PreparedStatement st4=con1.prepareStatement("select balance from accountholder where acno=?");
		st4.setInt(1,_acno1);
		ResultSet rs1=st4.executeQuery( );
		rs1.next( );

		if(rs1.getFloat(1)< 0)
		{
			con1.rollback();
			JOptionPane.showMessageDialog(null,"transaction failed");
			}
		else
		 {
			con1.commit( );
			JOptionPane.showMessageDialog(null,"transaction executed successfully");
			}

	   clearscreen( );
	   }catch(Exception ee)
		{
			System.out.println( ee.toString());
			JOptionPane.showMessageDialog(null,"excception caught");
	
			}

	}

void clearscreen( )
{
	text1.setText("");
	text2.setText("");
	text3.setText("");
	text1.requestFocus( );
	}
}
	public static void main(String[ ] args)
	{
		NewClass instance1= new NewClass ( );
		}
}

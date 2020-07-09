package 考试; 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 登入界面 extends JFrame {
	public 登入界面() {
		this.setTitle("登入界面");
		this.setBounds(100,100,800,800);
		this.setLayout(null);
		JLabel lblname=new JLabel("用户名");
		JTextField txtname=new JTextField(10);
		JLabel lblmi=new JLabel("密码");
		JTextField txtmi=new JTextField(10);
		JButton to=new JButton("登入");
		lblname.setBounds(100,100,80,60);
		lblmi.setBounds(100,200,80,60);
		txtname.setBounds(350,100,200,60);
		txtmi.setBounds(350,200,200,60);
		to.setBounds(200,300,100,60);
		add(lblname);
		add(lblmi);
		add(txtname);
		add(txtmi);
		add(to);
	}
	public static void main(String []args) {
		登入界面 a=new 登入界面();
		a.setVisible(true);	
	}
}

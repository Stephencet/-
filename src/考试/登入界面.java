package ����; 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ������� extends JFrame {
	public �������() {
		this.setTitle("�������");
		this.setBounds(100,100,800,800);
		this.setLayout(null);
		JLabel lblname=new JLabel("�û���");
		JTextField txtname=new JTextField(10);
		JLabel lblmi=new JLabel("����");
		JTextField txtmi=new JTextField(10);
		JButton to=new JButton("����");
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
		������� a=new �������();
		a.setVisible(true);	
	}
}

package GUI;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.*;
public class Login extends JFrame{
	//required fields
	Image backgroundImage;
	Font labelFont = new Font("Arial", Font.PLAIN, 20);
	JFrame frame=new JFrame();
	JLabel ulbl=new JLabel("USERNAME");
	JLabel paslbl=new JLabel("PASSOWRD");//
	JButton login=new JButton("LOGIN");//
	JButton signup=new JButton("SIGN UP");//
	JTextField utxtfld=new JTextField("",50);//
	JPasswordField passtxtfld=new JPasswordField("",50);//
	JLabel panel = new JLabel();
	Login()
	{
		setLayoutManager();
		AddComponentsToContainer();
		add(panel);
	}
	public void setLayoutManager() {
		//using grid bag layout
        panel.setLayout(new GridBagLayout());
        try {
            backgroundImage = ImageIO.read(new File("C:\\Users\\bharg\\eclipse-workspace\\SwingPoject\\src\\GUI\\bgimg.jpeg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        getContentPane().setBackground(Color.BLACK);
    }
	public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(backgroundImage, 0, 0, this);
    }
	public void AddComponentsToContainer()
	{
		//adding the components according to dimensions
		GridBagConstraints gdbc=new GridBagConstraints();
		gdbc.anchor=GridBagConstraints.WEST;
		gdbc.gridx=0;
		gdbc.gridy=0;
		gdbc.ipady=10;
		gdbc.insets=new Insets(10,10,10,10);
		ulbl.setFont(labelFont);
		ulbl.setForeground(Color.GREEN);
		panel.add(ulbl,gdbc);
		
		gdbc.gridx=0;
		gdbc.gridy=1;
		paslbl.setForeground(Color.GREEN);
		paslbl.setFont(labelFont);
		panel.add(paslbl,gdbc);
		
		gdbc.gridx=1;
		gdbc.gridy=0;
		utxtfld.setForeground(Color.GREEN);
		utxtfld.setBackground(Color.DARK_GRAY);
		utxtfld.setCaretColor(Color.GREEN);//used to set the color of blinking cursor
		panel.add(utxtfld,gdbc);
		
		gdbc.gridx=1;
		gdbc.gridy=1;
		passtxtfld.setForeground(Color.GREEN);
		passtxtfld.setBackground(Color.DARK_GRAY);
		passtxtfld.setCaretColor(Color.GREEN);
		panel.add(passtxtfld,gdbc);
		
		
		gdbc.gridx=0;
		gdbc.gridy=3;
		login.setForeground(Color.GREEN);
		login.setOpaque(false);
        login.setContentAreaFilled(false);
        login.setBorderPainted(false);
        login.setFont(labelFont);
        panel.add(login,gdbc);
        
        gdbc.gridx=1;
		gdbc.gridy=3;
		signup.setForeground(Color.GREEN);
		signup.setOpaque(false);
        signup.setContentAreaFilled(false);
        signup.setBorderPainted(false);
        signup.setFont(labelFont);
        panel.add(signup,gdbc);
	}
	public static void main(String[] args)
	{
		Login frame=new Login();
		frame.setSize(1080,1400);
		frame.setVisible(true);
		frame.setTitle("Login");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

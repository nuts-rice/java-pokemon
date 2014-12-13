import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;


public class GUI  {
	private static JFrame frame = null; 
	private static JTextField MessageTextBox;
	public static void main(String args[]) {
		frame = new JFrame(); 
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel MessagePannel = new JPanel();
		frame.getContentPane().add(MessagePannel, BorderLayout.SOUTH);
		
		MessageTextBox = new JTextField();
		MessagePannel.add(MessageTextBox);
		MessageTextBox.setColumns(10);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		
	}
}

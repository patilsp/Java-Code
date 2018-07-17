import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class LockPanel extends JPanel{
	
	private int combo;
	private JButton openB;
	private JTextField digitsF;
	private JButton changeB;
	private boolean isOpen;
	
	public LockPanel(int c)
	{
		combo = c;
		isOpen = true;
		
		openB = new JButton("Open/Close");
		openB.setBackground(Color.green);
		//if on a mac, setOpaque() may be need
		//openB.setOpaque(true);
		
		openB.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				if (isOpen)
				{
					isOpen = false;
					openB.setBackground(Color.red);
				}
				else
				{
					int digits = Integer.parseInt(digitsF.getText());
					if (digits == combo)
					{
						isOpen = true;
						openB.setBackground(Color.green);
					}
				}
			}
		});
		
		digitsF = new JTextField(""+c);
		
		changeB = new JButton("Change Combination");
		changeB.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				if (isOpen)
				{
					int digits = Integer.parseInt(digitsF.getText());
					combo = digits;
				}
			}
		});
		
		setLayout(new BorderLayout());
		add(openB, BorderLayout.NORTH);
		add(digitsF, BorderLayout.CENTER);
		add(changeB, BorderLayout.SOUTH);
	}
	
	public static void main(String[] args)
	{
		JFrame fr = new JFrame("Lock");
		
		LockPanel lp = new LockPanel(1234);
		fr.getContentPane().add(lp, BorderLayout.CENTER);
		fr.pack();
		fr.setVisible(true);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

//6.12.2023
//notes : 1 Alert DialogBox

import javax.swing.JFrame;
import javax.swing.JOptionPane;


class OptionPaneExample3
{

	JFrame f;
	OptionPaneExample3()
	{
		f=new JFrame();
		JOptionPane.showMessageDialog(f, " DTS 3093: Group A | Wednesday 2-5pm", "Alert", JOptionPane.WARNING_MESSAGE);
	}

public static void main (String[]args)
{
	new OptionPaneExample3();
	}
}


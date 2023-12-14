//6.12.2023
//notes : 1 InputBox + 1 OutputDialogBox

import javax.swing.JFrame;
import javax.swing.JOptionPane;


class OptionPaneExample4
{

	JFrame f;
	OptionPaneExample4()
	{
		f=new JFrame();
		String name=JOptionPane.showInputDialog(f,"Enter Name");
		JOptionPane.showMessageDialog(f, "Such beautiful name! \n" + name);
	}

public static void main (String[]args)
{
	new OptionPaneExample4();
	}
}


//6.12.2023
//notes : 3 Input Box + Output dalam Command Prompt

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.Scanner;

class OptionPaneExample6 {
	JFrame f;

    OptionPaneExample6() {
        Scanner scanner = new Scanner(System.in);
	f=new JFrame();
        String name=JOptionPane.showInputDialog(f,"Enter Name");
	String matric=JOptionPane.showInputDialog(f,"Enter matric ID");
	String course=JOptionPane.showInputDialog(f,"Enter Programme");
	System.out.println("\n" + name + "\nMatric ID: " + matric + "\nProgramme: " + course);
    }

    public static void main(String[] args) {
        new OptionPaneExample6();
    }
}

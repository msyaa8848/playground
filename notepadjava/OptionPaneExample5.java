//6.12.2023
//notes : 3 User Input dalam Command Prompt + 1 Output bentuk DialogBox

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.Scanner;

class OptionPaneExample5 {
	JFrame f;

    OptionPaneExample5() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Matric ID: ");
        String matric = scanner.nextLine();

        System.out.print("Enter Programme: ");
        String course = scanner.nextLine();
	
	f=new JFrame();
        JOptionPane.showMessageDialog(f,"Congrats! \n\nName:" + name + "\nMatric ID: " + matric + "\nProgramme: " + course);
    }

    public static void main(String[] args) {
        new OptionPaneExample5();
    }
}

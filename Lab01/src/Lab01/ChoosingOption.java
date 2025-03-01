package Lab01;

public class ChoosingOption {

	public static void main(String[] args) {
		int option = JOptionPane.showConfirmDialog(null,"Do you want to change to the first class ticket");
		
		JOptionPane.showMessageDialog(null,"You've chosen: "
				        +(option==JOptionPane.YES_OPTION?"Yes":"No"));
		System.exit(0);
	}

}
/* if  users choose "Cancel", the program will be"No"
/* Customize the options to users, only two options:"Yes" and "No", OR "I do" and "I dont"
import javax.swing.JOptionPane;

public class JOptionPaneExample {
    public static void main(String[] args) {
        Object[] options = { "I do", "I don’t" };

        int choice = JOptionPane.showOptionDialog(
                null,
                "Do you want to change to the first class ticket?",
                "Ticket Upgrade",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,  
                options[0] 
        );
        JOptionPane.showMessageDialog(null, "You've chosen: " + options[choice]);
    }
}

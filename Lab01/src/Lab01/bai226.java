import javax.swing.JOptionPane;
public class  bai226 {
	public static void main(String[] args) {
        String[] options = {"PT bac 1", "He PT bac 1", "PT bac 2"};
        int choice = JOptionPane.showOptionDialog(
            null,
            "Choose an option:", 
            "Option Selector", 
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.INFORMATION_MESSAGE, 
            null,
            options,
            options[0] 
        );
        String strResult;
        if (choice == 0) {
        	double num1 = Double.parseDouble(JOptionPane.showInputDialog("Nhap a"));
    		double num2 = Double.parseDouble(JOptionPane.showInputDialog("Nhap b"));
    		if(num1 == 0){
    			if(num2 == 0) strResult = "Vo so nghiem";
    			else strResult = "Vo nghiem";
    		}
    		else strResult = "Nghiem x = "+(-num2/num1);
    		JOptionPane.showMessageDialog(null,strResult);
        } else if (choice == 1) {
        	double a11 = Double.parseDouble(JOptionPane.showInputDialog("Enter a11"));
            double a12 = Double.parseDouble(JOptionPane.showInputDialog("Enter a12"));
            double b1 = Double.parseDouble(JOptionPane.showInputDialog("Enter b1"));
            double a21 = Double.parseDouble(JOptionPane.showInputDialog("Enter a21"));
            double a22 = Double.parseDouble(JOptionPane.showInputDialog("Enter a22"));
            double b2 = Double.parseDouble(JOptionPane.showInputDialog("Enter b2"));
            double dtmn = a11 * a22 - a12 * a21;
            if (dtmn == 0) {
            	if (a11 / a21 == a12 / a22 && b1 / b2 == a11 / a21) {
                    JOptionPane.showMessageDialog(null, "Vo so nghiem");
                } else {
                    JOptionPane.showMessageDialog(null, "Vo nghiem");
                }
            } else {              
                double x1 = (b1 * a22 - b2 * a12) / dtmn;
                double x2 = (a11 * b2 - a21 * b1) / dtmn;
                JOptionPane.showMessageDialog(null, "Nghiem:\n" + "x1 = " + x1 + "\n" +"x2 = " + x2);
            }
        	
        } else if (choice == 2) {
        	double a = Double.parseDouble(JOptionPane.showInputDialog("Nhap a"));
            double b = Double.parseDouble(JOptionPane.showInputDialog("Nhap b"));
            double c = Double.parseDouble(JOptionPane.showInputDialog("Nhap c"));
            if (a == 0) {
                if (b == 0) {
                    if (c == 0) {
                        JOptionPane.showMessageDialog(null, "Vo so nghiem");
                    } else {
                        JOptionPane.showMessageDialog(null, "Vo nghiem");
                    }
                } else {
                    double x = -c / b;
                    JOptionPane.showMessageDialog(null, "Nghiem x = " + x);
                }
            } else {
                double denta = b * b - 4 * a * c;
                if (denta > 0) {
                    double x1 = (-b + Math.sqrt(denta)) / (2 * a);
                    double x2 = (-b - Math.sqrt(denta)) / (2 * a);
                    JOptionPane.showMessageDialog(null, "Nghiem:\n" +"x1 = " + x1 + "\n" +"x2 = " + x2);
                } else if (denta == 0) {
                    double x = -b / (2 * a);
                    JOptionPane.showMessageDialog(null, "Nghiem x = " + x);
                } else {
                    JOptionPane.showMessageDialog(null, "Vo nghiem");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "No option chosen.");
        }
		
	}

}
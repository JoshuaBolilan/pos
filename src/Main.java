import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("My POS System");

        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JLabel label = new JLabel(
            "Welcome to My POS!",
            SwingConstants.CENTER
        );

        frame.add(label);

        frame.setVisible(true);
    }
}
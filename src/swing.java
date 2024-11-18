import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class swing extends JFrame {

        public swing() {
            // Set up the JFrame (main window)
            setTitle("Simple Swing Application");
            setSize(400, 200);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null); // Center the window

            // Create a label
            JLabel label = new JLabel("Hello, Livingston!", SwingConstants.CENTER);
            label.setFont(new Font("Arial", Font.BOLD, 40));

            // Create a button
            JButton button = new JButton("Click Me");
            button.setFont(new Font("Arial", Font.PLAIN, 15));

            // Add an action listener to the button to change the label text when clicked
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    label.setText("Button Clicked!");
                }
            });

            // Set up the layout and add components to the JFrame
            setLayout(new BorderLayout());
            add(label, BorderLayout.CENTER);
            add(button, BorderLayout.SOUTH);
        }

        public static void main(String[] args) {
            // Run the GUI application on the Event Dispatch Thread
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    new swing().setVisible(true);
                }
            });
        }
    }
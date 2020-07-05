package frontElement;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel succes;
    private JPanel panelFirst;

    public Login() {

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        userLabel = new JLabel("User");

        frame.setSize(350,200);
        frame.setTitle("Login");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);
        // placeComponents(panel);
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        button = new JButton("Login");
        button.setBounds(10, 80, 80, 25);
        button.addActionListener(new Login());
        panel.add(button);

        succes = new JLabel("");
        succes.setBounds(10, 110, 300, 25);
        panel.add(succes);

        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = passwordText.getText();

        dispose();
        SecondFrame frame = new SecondFrame();

//        if (user.equalsIgnoreCase("admin") && password.equalsIgnoreCase("password")) {
//            succes.setText("Login successful!");
//            dispose();
//            SecondFrame frame = new SecondFrame();
//        } else {
//            succes.setText("Invalid credentials");
//        }
    }

}

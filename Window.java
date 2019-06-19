import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

class Window extends JPanel {
    private JTextField length = new JTextField();
    private JTextField passwordField = new JTextField();
    private JButton button = new JButton("Generate");

    private final String NUMBERS = "1234567890";
    private final String UP_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final String DOWN_LETTERS = "abcdefghijklmnopqrstuvwxyz";

    Window() {
        setLayout(new GridLayout(9, 5, 5, 5));
        add(length);
        add(passwordField);
        add(button);

        Random random = new Random();

        String passwordChars = NUMBERS + UP_LETTERS + DOWN_LETTERS;

        button.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                String lengthStr = length.getText();
                int len = Integer.parseInt(lengthStr);
                char[] password = new char[len];

                if (len <= 32) {
                    for (int i = 0; i < len; i++) {
                        password[i] = passwordChars.charAt(random.nextInt(passwordChars.length()));
                    }

                    passwordField.setText(String.valueOf(password));
                } else {
                    passwordField.setText("The password must be <= 32 chars");
                }

            }
        });
    }
}

import javax.swing.*;

public class Main {

    private static void init() {
        JFrame frame = new JFrame("Password generator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setSize(400, 400);
        Window window = new Window();
        frame.add(window);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
       init();
    }
}

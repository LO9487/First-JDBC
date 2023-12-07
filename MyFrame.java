import javax.swing.*;
import java.awt.*;


public class MyFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My JFrame"); // Set the title
        frame.setSize(400, 300); // Set the size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set default close operation
        frame.setLayout(new FlowLayout()); // Set layout manager



        frame.setVisible(false); // Make the frame visible
    }
}
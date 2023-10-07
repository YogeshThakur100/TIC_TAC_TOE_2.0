package TicTacToe;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LaunchPage extends JFrame implements ActionListener{
    JFrame frame = new JFrame("Opening Window");
    JButton button = new JButton("YES");
    JButton button2 = new JButton("NO");
    JLabel label = new JLabel("Do you want to start the game?");

    LaunchPage() {

        button.setBounds(100 ,100 ,100 ,25);
        button.setFocusable(false);
        button.addActionListener(this);

        button2.setBounds(250 ,100 ,100 ,25);
        button2.setFocusable(false);
        button2.addActionListener(this);

        label.setBounds(90, 0 , 500 , 100);
        label.setForeground(Color.black);
        label.setFont(new Font("Canvas", Font.PLAIN, 20)); 

        frame.setSize(500, 200);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(button);
        frame.add(label);
        frame.add(button2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            TicTacToe frm = new TicTacToe();
            frame.dispose();
        }
        else if (e.getSource() == button2) {
            frame.dispose();
        }
    }
}


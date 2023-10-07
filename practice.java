package frm;
import javax.swing.JFrame;

public class practice extends JFrame{
    practice () {
        this.setSize(500 , 500);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JFrame();
    }
}
package TicTacToe;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class TicTacToe extends JFrame implements ActionListener {
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;

    JPanel panel1;
    JPanel panel2;
    JPanel panel3;
    JPanel panel4;
    JPanel panel5;
    JPanel panel6;
    JPanel panel7;
    JPanel panel8;
    JPanel panel9;
    JPanel panel11;
    JPanel panel12;
    JPanel panel13;
    JPanel panel14;
    JPanel panel15;
    JPanel panel16;
    JPanel panel17;
    JPanel panel18;
    JPanel panel19;
    int count = 1;
    TicTacToe() {

        Border border = BorderFactory.createLineBorder(Color.white , 3);

        button1 = new JButton();
        button1.setBounds(0 , 0 , 167 , 150);
        button1.setFocusable(false);
        button1.addActionListener(this);

        button2 = new JButton();
        button2.setBounds(167 , 0 , 167 , 150);
        button2.setFocusable(false);
        button2.addActionListener(this);

        button3 = new JButton();
        button3.setBounds(167+167 , 0 , 167 , 150);
        button3.setFocusable(false);
        button3.addActionListener(this);

        button4 = new JButton();
        button4.setBounds(0 , 150 , 167 , 150);
        button4.setFocusable(false);
        button4.addActionListener(this);

        button5 = new JButton();
        button5.setBounds(167 , 150, 167 , 150);
        button5.setFocusable(false);
        button5.addActionListener(this);

        button6 = new JButton();
        button6.setBounds(167+167 , 150, 167 , 150);
        button6.setFocusable(false);
        button6.addActionListener(this);

        button7 = new JButton();
        button7.setBounds(0 , 300, 167 , 150);
        button7.setFocusable(false);
        button7.addActionListener(this);

        button8 = new JButton();
        button8.setBounds(167 , 150+150, 167 , 150);
        button8.setFocusable(false);
        button8.addActionListener(this);

        button9 = new JButton();
        button9.setBounds(167+167 , 150+150, 167 , 150);
        button9.setFocusable(false);
        button9.addActionListener(this);

        panel1 = new JPanel();
        panel1.setBackground(Color.black);
        panel1.setBounds(0 , 0 , 167 , 150);
        panel1.setVisible(false);
        panel1.setBorder(border);

        panel2 = new JPanel();
        panel2.setBackground(Color.black);
        panel2.setBounds(167 , 0 , 167 , 150);
        panel2.setVisible(false);
        panel2.setBorder(border);

        panel3 = new JPanel();
        panel3.setBackground(Color.black);
        panel3.setBounds(167+167 , 0 , 167 , 150);
        panel3.setVisible(false);
        panel3.setBorder(border);

        panel4 = new JPanel();
        panel4.setBackground(Color.black);
        panel4.setBounds(0 , 150 , 167 , 150);
        panel4.setVisible(false);
        panel4.setBorder(border);

        panel5 = new JPanel();
        panel5.setBackground(Color.black);
        panel5.setBounds(167 , 150, 167 , 150);
        panel5.setVisible(false);
        panel5.setBorder(border);

        panel6 = new JPanel();
        panel6.setBackground(Color.black);
        panel6.setBounds(167+167 , 150, 167 , 150);
        panel6.setVisible(false);
        panel6.setBorder(border);

        panel7 = new JPanel();
        panel7.setBackground(Color.black);
        panel7.setBounds(0 , 300, 167 , 150);
        panel7.setVisible(false);
        panel7.setBorder(border);

        panel8 = new JPanel();
        panel8.setBackground(Color.black);
        panel8.setBounds(167 , 150+150, 167 , 150);
        panel8.setVisible(false);
        panel8.setBorder(border);

        panel9 = new JPanel();
        panel9.setBackground(Color.black);
        panel9.setBounds(167+167 , 150+150, 167 , 150);
        panel9.setVisible(false);
        panel9.setBorder(border);

        panel11 = new JPanel();
        panel11.setBackground(Color.red);
        panel11.setBounds(0 , 0 , 167 , 150);
        panel11.setVisible(false);
        panel11.setBorder(border);

        panel12 = new JPanel();
        panel12.setBackground(Color.red);
        panel12.setBounds(167 , 0 , 167 , 150);
        panel12.setVisible(false);
        panel12.setBorder(border);

        panel13 = new JPanel();
        panel13.setBackground(Color.red);
        panel13.setBounds(167+167 , 0 , 167 , 150);
        panel13.setVisible(false);
        panel13.setBorder(border);

        panel14 = new JPanel();
        panel14.setBackground(Color.red);
        panel14.setBounds(0 , 150 , 167 , 150);
        panel14.setVisible(false);
        panel14.setBorder(border);

        panel15 = new JPanel();
        panel15.setBackground(Color.red);
        panel15.setBounds(167 , 150, 167 , 150);
        panel15.setVisible(false);
        panel15.setBorder(border);

        panel16 = new JPanel();
        panel16.setBackground(Color.red);
        panel16.setBounds(167+167 , 150, 167 , 150);
        panel16.setVisible(false);
        panel16.setBorder(border);

        panel17 = new JPanel();
        panel17.setBackground(Color.red);
        panel17.setBounds(0 , 300, 167 , 150);
        panel17.setVisible(false);
        panel17.setBorder(border);

        panel18 = new JPanel();
        panel18.setBackground(Color.red);
        panel18.setBounds(167 , 150+150, 167 , 150);
        panel18.setVisible(false);
        panel18.setBorder(border);

        panel19 = new JPanel();
        panel19.setBackground(Color.red);
        panel19.setBounds(167+167 , 150+150, 167 , 150);
        panel19.setVisible(false);
        panel19.setBorder(border);

        
        this.setVisible(true);
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);
        this.setTitle("TIC TAC TOE");
        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.add(button4);
        this.add(button5);
        this.add(button6);
        this.add(button7);
        this.add(button8);
        this.add(button9);
        this.add(panel1);
        this.add(panel2);
        this.add(panel3);
        this.add(panel4);
        this.add(panel5);
        this.add(panel6);
        this.add(panel7);
        this.add(panel8);
        this.add(panel9);
        this.add(panel11);
        this.add(panel12);
        this.add(panel13);
        this.add(panel14);
        this.add(panel15);
        this.add(panel16);
        this.add(panel17);
        this.add(panel18);
        this.add(panel19);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (count % 2 != 0) {
            if (e.getSource() == button1) {
                button1.setVisible(false);
                panel1.setVisible(true);
                count++;
                check();
            }
            else if (e.getSource() == button2) {
                button2.setVisible(false);
                panel2.setVisible(true);
                count++;
                check();
            }

            else if (e.getSource() == button3) {
                button3.setVisible(false);
                panel3.setVisible(true);
                count++;
               check();
            }

            else if (e.getSource() == button4) {
                button4.setVisible(false);
                panel4.setVisible(true);
                count++;
                check();
            }

            else if (e.getSource() == button5) {
                button5.setVisible(false);
                panel5.setVisible(true);
                count++;
                check();
            }

            else if (e.getSource() == button6) {
                button6.setVisible(false);
                panel6.setVisible(true);
check();
                count++;
            }

            else if (e.getSource() == button7) {
                button7.setVisible(false);
                panel7.setVisible(true);
                count++;
                check();
            }

            else if (e.getSource() == button8) {
                button8.setVisible(false);
                panel8.setVisible(true);
                count++;
                check();
            }

            else {
                button9.setVisible(false);
                panel9.setVisible(true);
                count++;
             check();
            }
        }

        else  {
            if (e.getSource() == button1) {
                button1.setVisible(false);
                panel11.setVisible(true);
                count++;
                check();
            }
            else if (e.getSource() == button2) {
                button2.setVisible(false);
                panel12.setVisible(true);
                count++;
                check();
            }

            else if (e.getSource() == button3) {
                button3.setVisible(false);
                panel13.setVisible(true);
                count++;
                check();
            }

            else if (e.getSource() == button4) {
                button4.setVisible(false);
                panel14.setVisible(true);
                count++;
                check();
            }

            else if (e.getSource() == button5) {
                button5.setVisible(false);
                panel15.setVisible(true);
                count++;
                check();
            }

            else if (e.getSource() == button6) {
                button6.setVisible(false);
                panel16.setVisible(true);
                count++;
                check();
            }

            else if (e.getSource() == button7) {
                button7.setVisible(false);
                panel17.setVisible(true);
                count++;
                check();
            }

            else if (e.getSource() == button8) {
                button8.setVisible(false);
                panel18.setVisible(true);
                count++;
               check();
            }

            else {
                button9.setVisible(false);
                panel19.setVisible(true);
                count++;
               check();
            }
        }
    }
    public void check() {
    if (panel1.isVisible() && panel2.isVisible()) { 
        if (panel2.isVisible() && panel3.isVisible()) {
            panel1.setBackground(Color.green);
            panel2.setBackground(Color.green);
            panel3.setBackground(Color.green);
            System.out.println("Player 1 wins");
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
        }
            
    }
    if (panel1.isVisible() && panel4.isVisible()) { 
        if (panel4.isVisible() && panel7.isVisible()) {
            panel1.setBackground(Color.green);
            panel4.setBackground(Color.green);
            panel7.setBackground(Color.green);
            System.out.println("Player 1 wins");
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
        }
    }
    if (panel1.isVisible() && panel5.isVisible()) { 
        if (panel5.isVisible() && panel9.isVisible()) {
            panel1.setBackground(Color.green);
            panel5.setBackground(Color.green);
            panel9.setBackground(Color.green);
            System.out.println("Player 1 wins");
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
        }
    }
    if (panel7.isVisible() && panel8.isVisible()) { 
        if (panel8.isVisible() && panel9.isVisible()) {
            panel7.setBackground(Color.green);
            panel8.setBackground(Color.green);
            panel9.setBackground(Color.green);
            System.out.println("Player 1 wins");
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
        }
    }
    if (panel4.isVisible() && panel5.isVisible()) { 
        if (panel5.isVisible() && panel6.isVisible()) {
            panel4.setBackground(Color.green);
            panel5.setBackground(Color.green);
            panel6.setBackground(Color.green);
            System.out.println("Player 1 wins");
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
        }
    }
    if (panel2.isVisible() && panel5.isVisible()) { 
        if (panel5.isVisible() && panel8.isVisible()) {
            panel2.setBackground(Color.green);
            panel5.setBackground(Color.green);
            panel8.setBackground(Color.green);
            System.out.println("Player 1 wins");
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
        }
    }
    if (panel3.isVisible() && panel6.isVisible()) { 
        if (panel6.isVisible() && panel9.isVisible()) {
            panel3.setBackground(Color.green);
            panel6.setBackground(Color.green);
            panel9.setBackground(Color.green);
            System.out.println("Player 1 wins");
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
        }
    }
    if (panel3.isVisible() && panel5.isVisible()) { 
        if (panel5.isVisible() && panel7.isVisible()) {
            panel3.setBackground(Color.green);
            panel5.setBackground(Color.green);
            panel7.setBackground(Color.green);
            System.out.println("Player 1 wins");
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
        }
    }
    if (panel11.isVisible() && panel12.isVisible()) { 
        if (panel12.isVisible() && panel13.isVisible()) {
            panel11.setBackground(Color.green);
            panel12.setBackground(Color.green);
            panel13.setBackground(Color.green);
            System.out.println("Player 2 wins");
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
        }
            
    }
    if (panel11.isVisible() && panel14.isVisible()) { 
        if (panel14.isVisible() && panel17.isVisible()) {
            panel11.setBackground(Color.green);
            panel14.setBackground(Color.green);
            panel17.setBackground(Color.green);
            System.out.println("Player 2 wins");
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
        }
    }
    if (panel11.isVisible() && panel15.isVisible()) { 
        if (panel15.isVisible() && panel19.isVisible()) {
            panel11.setBackground(Color.green);
            panel15.setBackground(Color.green);
            panel19.setBackground(Color.green);
            System.out.println("Player 2 wins");
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
        }
    }
    if (panel17.isVisible() && panel18.isVisible()) { 
        if (panel18.isVisible() && panel19.isVisible()) {
            panel17.setBackground(Color.green);
            panel18.setBackground(Color.green);
            panel19.setBackground(Color.green);
            System.out.println("Player 2 wins");
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
        }
    }
    if (panel14.isVisible() && panel15.isVisible()) { 
        if (panel15.isVisible() && panel16.isVisible()) {
            panel14.setBackground(Color.green);
            panel15.setBackground(Color.green);
            panel16.setBackground(Color.green);
            System.out.println("Player 2 wins");
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
        }
    }
    if (panel12.isVisible() && panel15.isVisible()) { 
        if (panel15.isVisible() && panel18.isVisible()) {
            panel12.setBackground(Color.green);
            panel15.setBackground(Color.green);
            panel18.setBackground(Color.green);
            System.out.println("Player 2 wins");
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
        }
    }
    if (panel13.isVisible() && panel16.isVisible()) { 
        if (panel16.isVisible() && panel19.isVisible()) {
            panel13.setBackground(Color.green);
            panel16.setBackground(Color.green);
            panel19.setBackground(Color.green);
            System.out.println("Player 2 wins");
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
        }
    }
    if (panel13.isVisible() && panel15.isVisible()) { 
        if (panel15.isVisible() && panel17.isVisible()) {
            panel13.setBackground(Color.green);
            panel15.setBackground(Color.green);
            panel17.setBackground(Color.green);
            System.out.println("Player 2 wins");
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
        }
    }
    
    
}
}








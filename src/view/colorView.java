package view;

import controller.colorListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import model.colorModel;

public class colorView extends JFrame {

    private colorModel cm;
    private JLabel jlabel;

    public colorView() {
        this.cm = new colorModel();
        this.init();
        this.setVisible(true);

    }

    public void init() {
        this.setTitle("My Color");
        this.setSize(600, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.jlabel = new JLabel("TEXT", JLabel.CENTER);
       // this.jlabel.setHorizontalAlignment(JLabel.CENTER); // Đặt vị trí căn giữa cho chữ text trong JLabel
      
      
      

        JPanel jpanel = new JPanel();
        jpanel.setLayout(new GridLayout(2, 3));

        Font font = new Font("Arial", Font.BOLD, 40);

        colorListener cl = new colorListener(this);
        
        JButton jbutton_text_red = new JButton("Red Text");
        jbutton_text_red.setFont(font);
        jbutton_text_red.setForeground(Color.RED);
        jbutton_text_red.setOpaque(true);
        jbutton_text_red.setBackground(cm.getBackground());
        jbutton_text_red.addActionListener(cl);

        JButton jbutton_text_yellow = new JButton("Yellow Text");
        jbutton_text_yellow.setFont(font);
        jbutton_text_yellow.setForeground(Color.YELLOW);
        jbutton_text_yellow.setOpaque(true);
        jbutton_text_yellow.setBackground(cm.getBackground());
        jbutton_text_yellow.addActionListener(cl);
         
        JButton jbutton_text_green = new JButton("Green Text");
        jbutton_text_green.setFont(font);
        jbutton_text_green.setForeground(Color.GREEN);
        jbutton_text_green.setOpaque(true);
        jbutton_text_green.setBackground(cm.getBackground());
        jbutton_text_green.addActionListener(cl);

        JButton jbutton_background_red = new JButton("Red Background");
        jbutton_background_red.setFont(font);
        jbutton_background_red.setBackground(Color.red);
        jbutton_background_red.setOpaque(true);
        jbutton_background_red.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        jbutton_background_red.addActionListener(cl);
        
        JButton jbutton_background_yellow = new JButton("Yellow Background");
        jbutton_background_yellow.setFont(font);
        jbutton_background_yellow.setBackground(Color.yellow);
        jbutton_background_yellow.setOpaque(true);
        jbutton_background_yellow.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        jbutton_background_yellow.addActionListener(cl);
         
        JButton jbutton_background_green = new JButton("Green Background");
        jbutton_background_green.setFont(font);
        jbutton_background_green.setBackground(Color.green);
        jbutton_background_green.setOpaque(true);
        jbutton_background_green.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        jbutton_background_green.addActionListener(cl);
        
        jpanel.add(jbutton_text_red);
        jpanel.add(jbutton_text_yellow);
        jpanel.add(jbutton_text_green);
        jpanel.add(jbutton_background_red);
        jpanel.add(jbutton_background_yellow);
        jpanel.add(jbutton_background_green);
        

        this.setLayout(new BorderLayout());
        this.add(jlabel, BorderLayout.NORTH);
        this.add(jpanel, BorderLayout.CENTER);

    }
    
    public void changeTextColor(Color color){
        this.jlabel.setForeground(color);
    }

        public void changeBackgroundColor(Color color){
        this.jlabel.setBackground(color);
        this.jlabel.setOpaque(true);
    }

}

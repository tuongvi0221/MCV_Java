package view;

import controller.mouseListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import model.mouseModel;

public class mouseView extends JFrame {

    private mouseModel mm;
    private JLabel jlabel_position;
    private JLabel jlabel_x;
    private JLabel jlabel_y;
    private JLabel jLabel_count;
    private JLabel jlabel_countValue;
    private JLabel jlabel_checkIn;
    private JLabel jlabel_checkInValue;
    private JLabel jlabel_empty1;
    private JLabel jlabel_empty2;
    private JPanel jpanel_mouse;
    private JPanel jpanel_info;

    public mouseView() {
        this.mm = new mouseModel();
        this.init();
        this.setVisible(true);
    }

    public void init() {
        this.setTitle("Mouse example");
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mouseListener ml = new mouseListener(this);
        
        jpanel_mouse = new JPanel();
        jpanel_mouse.setBackground(Color.magenta);
        jpanel_mouse.setOpaque(true);
        jpanel_mouse.addMouseListener(ml);
        
        jpanel_info = new JPanel();
        jpanel_info.setLayout(new GridLayout(3, 3));

        jlabel_position = new JLabel("Position");
        jlabel_x = new JLabel("x = ");
        jlabel_y = new JLabel("y = ");
        jLabel_count = new JLabel("Number of clicks: ");
        jlabel_countValue = new JLabel("Click");
        jlabel_checkIn = new JLabel("Mouse is in component");
        jlabel_checkInValue = new JLabel("no");
        jlabel_empty1 = new JLabel();
        jlabel_empty2 = new JLabel();

        jpanel_info.add(jlabel_position);
        jpanel_info.add(jlabel_x);
        jpanel_info.add(jlabel_y);
        jpanel_info.add(jLabel_count);
        jpanel_info.add(jlabel_countValue);
          jpanel_info.add(jlabel_empty1);
        jpanel_info.add(jlabel_checkIn);
        jpanel_info.add(jlabel_checkInValue);
  
        jpanel_info.add(jlabel_empty2);

        this.setLayout(new BorderLayout());
        this.add(jpanel_mouse, BorderLayout.CENTER);
        this.add(jpanel_info, BorderLayout.SOUTH);
    }
    
    
}

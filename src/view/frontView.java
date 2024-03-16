package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import model.frontModel;
import java.awt.event.ActionListener;
import controller.frontListener;

public class frontView extends JFrame {
    private frontModel fm;
    private JButton jbutton1;
    private JButton jbutton2;
    private JButton jbutton3;
    private JButton jbutton4;
    private JLabel jlabel;
    
    public frontView(){
        this.fm = new frontModel();
        this.init();
        this.setVisible(true);
    }
    public void init(){
        this.setTitle("Last Button");
        this.setLocationRelativeTo(null);
        this.setSize(300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel jpanelCenter = new JPanel();
        jpanelCenter.setLayout(new GridLayout(2,2));
        
        frontListener ac = new frontListener(this);
        
        Font font = new Font("Arial", Font.BOLD,20);
        jbutton1 = new JButton("1");
        jbutton1.setFont(font);
        jbutton1.addActionListener(ac);
        
        jbutton2 = new JButton("2");
        jbutton2.setFont(font);
        jbutton2.addActionListener(ac);
                
        jbutton3 = new JButton("3");
        jbutton3.setFont(font);
        jbutton3.addActionListener(ac);
        
        jbutton4 = new JButton("4");
        jbutton4.setFont(font);
        jbutton4.addActionListener(ac);
       
        jpanelCenter.add(jbutton1);
        jpanelCenter.add(jbutton2);
        jpanelCenter.add(jbutton3);
        jpanelCenter.add(jbutton4);
        
        JPanel jpanelFooter = new JPanel();
        //bien toan cuc => khong khai bao duoc ơ changeTo_1();
        //JLable jlabel = new JLabel("---------------------------");
        jlabel = new JLabel("---------------------------");// bien toan cuc
        jlabel.setFont(font);
        jpanelFooter.add(jlabel, BorderLayout.CENTER);
        
        this.setLayout(new BorderLayout());
        this.add(jpanelCenter, BorderLayout.CENTER);
        this.add(jpanelFooter, BorderLayout.SOUTH);
        
        
    }
    
    public void changeTo_1(){
        this.fm.setValue_1();
        this.jlabel.setText("Last button: " + this.fm.getValue());
    }
    
    public void changeTo_2(){
        this.fm.setValue_2();
        this.jlabel.setText("Last button: " + this.fm.getValue());
    }
    
    public void changeTo_3(){
        this.fm.setValue_3();
        this.jlabel.setText("Last button: " + this.fm.getValue());
    }
    public void changeTo_4(){
        this.fm.setValue_4();
        this.jlabel.setText("Last button: " + this.fm.getValue());
    }
    
}

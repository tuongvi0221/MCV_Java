
package view;

import controller.counterListener;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import model.counterModel;

public class counterView extends JFrame {
    private counterModel ctm;
    private JButton jbuttonUp ;
    private JButton jbuttonDown;
    private JLabel jlabelValue;
    
            
    public counterView(){
        this.ctm = new counterModel();
        this.init();
        this.setVisible(true);
    }
    
    public void init(){
        this.setTitle("Counter");
        this.setLocationRelativeTo(null);
        this.setSize(300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        counterListener ac = new counterListener(this);
        
        jbuttonUp  = new JButton("Up");
        jbuttonUp.addActionListener(ac);
                
        jbuttonDown  = new JButton("Down");
        jbuttonDown.addActionListener(ac);
        
        jlabelValue  = new JLabel (this.ctm.getValue()+ "", JLabel.CENTER);
      
        
        JPanel jpanel = new JPanel();
        jpanel.setLayout(new BorderLayout());
        jpanel.add(jbuttonUp, BorderLayout.WEST);
        jpanel.add(jbuttonDown, BorderLayout.EAST);
        jpanel.add(jlabelValue,BorderLayout.CENTER );
        
        this.setLayout(new BorderLayout());
        this.add(jpanel, BorderLayout.CENTER);
        
        
    }
    public void increment(){
        this.ctm.increment();
        this.jlabelValue.setText(this.ctm.getValue() + "");
        
    }
    
     public void decrement(){
        this.ctm.decrement();
        this.jlabelValue.setText(this.ctm.getValue() + "");
        
    }
}

   
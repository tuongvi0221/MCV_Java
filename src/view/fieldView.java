package view;

import controller.fieldListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.fieldModel;
import java.awt.event.ActionListener;

public class fieldView extends JFrame {

    private fieldModel fm;
    private JTextField jtextField_firstValue;
    private JTextField jtextField_secondValue;
    private JTextField jtextField_result;
    private JLabel jlable_firstValue;
    private JLabel jlable_secondValue;
    private JLabel jlable_result;
    private JPanel jpanel_firstValue;
    private JPanel jpanel_secondValue;
    private JPanel jpanel_result;

    public fieldView() {
        this.fm = new fieldModel();
        this.init();
        this.setVisible(true);

    }

    public void init() {
        this.setTitle("Mini Caculator");
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        Font font = new Font("Arial", Font.BOLD, 40);

        jlable_firstValue = new JLabel("1st value");
        jlable_firstValue.setFont(font);
        jlable_firstValue.setOpaque(true);
        jlable_firstValue.setBackground(Color.GREEN);

        jlable_secondValue = new JLabel("2nd value");
        jlable_secondValue.setFont(font);
        jlable_secondValue.setOpaque(true);
        jlable_secondValue.setBackground(Color.ORANGE);

        jlable_result = new JLabel("result  value");
        jlable_result.setFont(font);
        jlable_result.setOpaque(true);
        jlable_result.setBackground(Color.lightGray);

        jtextField_firstValue = new JTextField(50); // do rong
        jtextField_firstValue.setFont(font);
        jtextField_firstValue.setForeground(Color.red);

        jtextField_secondValue = new JTextField(50);
        jtextField_secondValue.setFont(font);
        jtextField_secondValue.setForeground(Color.CYAN);

        jtextField_result = new JTextField(50);
        jtextField_result.setFont(font);
        jtextField_result.setForeground(Color.magenta);

        // Create panels for labels
        jpanel_firstValue = new JPanel();
        jpanel_firstValue.setLayout(new BorderLayout());
        jpanel_firstValue.add(jlable_firstValue, BorderLayout.CENTER);

        jpanel_secondValue = new JPanel();
        jpanel_secondValue.setLayout(new BorderLayout());
        jpanel_secondValue.add(jlable_secondValue, BorderLayout.CENTER);

        jpanel_result = new JPanel();
        jpanel_result.setLayout(new BorderLayout());
        jpanel_result.add(jlable_result, BorderLayout.CENTER);

        JPanel jpanelIO = new JPanel();
        jpanelIO.setLayout(new GridLayout(3, 2, 10, 10));
        jpanelIO.add(jpanel_firstValue);
        jpanelIO.add(jtextField_firstValue);

        jpanelIO.add(jpanel_secondValue);
        jpanelIO.add(jtextField_secondValue);

        jpanelIO.add(jpanel_result);
        jpanelIO.add(jtextField_result);

        fieldListener fl = new fieldListener(this);

        JButton jbutton_Plus = new JButton("+");
        jbutton_Plus.setFont(font);
        jbutton_Plus.setBackground(Color.WHITE);
        jbutton_Plus.addActionListener(fl);

        JButton jbutton_Minus = new JButton("-");
        jbutton_Minus.setFont(font);
        jbutton_Minus.setBackground(Color.WHITE);
        jbutton_Minus.addActionListener(fl);

        JButton jbutton_Mutiply = new JButton("*");
        jbutton_Mutiply.setFont(font);
        jbutton_Mutiply.setBackground(Color.WHITE);
        jbutton_Mutiply.addActionListener(fl);

        JButton jbutton_Divide = new JButton("/");
        jbutton_Divide.setFont(font);
        jbutton_Divide.setBackground(Color.WHITE);
        jbutton_Divide.addActionListener(fl);

        JButton jbutton_Pow = new JButton("^");
        jbutton_Pow.setFont(font);
        jbutton_Pow.setBackground(Color.WHITE);
        jbutton_Pow.addActionListener(fl);

        JButton jbutton_Mod = new JButton("%");
        jbutton_Mod.setFont(font);
        jbutton_Mod.setBackground(Color.WHITE);
        jbutton_Mod.addActionListener(fl);

        JPanel jpanel_button = new JPanel();
        jpanel_button.setLayout(new GridLayout(2, 3));

        jpanel_button.add(jbutton_Plus);
        jpanel_button.add(jbutton_Minus);
        jpanel_button.add(jbutton_Mutiply);
        jpanel_button.add(jbutton_Divide);
        jpanel_button.add(jbutton_Pow);
        jpanel_button.add(jbutton_Mod);

        this.setLayout(new BorderLayout());
        this.add(jpanelIO, BorderLayout.CENTER);
        this.add(jpanel_button, BorderLayout.SOUTH);

    }

    public void plus() {
        double firstValue = Double.valueOf(jtextField_firstValue.getText());
        double secondValue = Double.valueOf(jtextField_secondValue.getText());
        this.fm.setFirstValue(firstValue);
        this.fm.setSecondValue(secondValue);
        this.fm.plus();
        this.jtextField_result.setText(this.fm.getResult() + "");
    }

    public void minus() {
        double firstValue = Double.valueOf(jtextField_firstValue.getText());
        double secondValue = Double.valueOf(jtextField_secondValue.getText());
        this.fm.setFirstValue(firstValue);
        this.fm.setSecondValue(secondValue);
        this.fm.minus();
        this.jtextField_result.setText(this.fm.getResult() + "");
    }

    public void multiply() {
        double firstValue = Double.valueOf(jtextField_firstValue.getText());
        double secondeValue = Double.valueOf(jtextField_secondValue.getText());
        this.fm.setFirstValue(firstValue);
        this.fm.setSecondValue(secondeValue);
        this.fm.multiply();
        this.jtextField_result.setText(this.fm.getResult() + "");
    }

    public void divide() {
        double firstValue = Double.valueOf(jtextField_firstValue.getText());
        double secondValue = Double.valueOf(jtextField_secondValue.getText());
        this.fm.setFirstValue(firstValue);
        this.fm.setSecondValue(secondValue);
        this.fm.divide();
        this.jtextField_result.setText(this.fm.getResult() + "");
    }

    public void pow() {
        double firstValue = Double.valueOf(jtextField_firstValue.getText());
        double secondValue = Double.valueOf(jtextField_secondValue.getText());
        this.fm.setFirstValue(firstValue);
        this.fm.setSecondValue(secondValue);
        this.fm.pow();
        this.jtextField_result.setText(this.fm.getResult() + "");
    }

    public void mod() {
        double firstValue = Double.valueOf(jtextField_firstValue.getText());
        double secondValue = Double.valueOf(jtextField_secondValue.getText());
        this.fm.setFirstValue(firstValue);
        this.fm.setSecondValue(secondValue);
        this.fm.mod();
        this.jtextField_result.setText(this.fm.getResult() + "");
    }

    public void changeTextColor(Color color) {
        this.jlable_firstValue.setForeground(color);
        this.jlable_secondValue.setForeground(color);
        this.jlable_result.setForeground(color);
    }

    public void changeBackgroundColor(Color color) {
        this.jlable_firstValue.setBackground(color);
        this.jlable_secondValue.setBackground(color);
        this.jlable_result.setBackground(color);
    }
}

package view;

import controller.areaListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import model.areaModel;

public class areaView extends JFrame {

    private areaModel am;
    private JLabel jlabel_vanBan;
    private JTextArea jtextarea_vanBan;
    private JLabel jlabel_tuKhoa;
    private JTextField jtextfield_tuKhoa;
    private JLabel JLabel_ketQua;

    public areaView() {
        this.am = new areaModel();
        this.init();
        this.setVisible(true);
    }

    public void init() {
        this.setTitle("Tim kiem");
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font = new Font("Arial", Font.BOLD, 40);

        jlabel_vanBan = new JLabel("Van Ban");
        jtextarea_vanBan = new JTextArea(50, 50); // so luong dong, so luong cot
        jlabel_vanBan.setFont(font);
        jtextarea_vanBan.setFont(font);

 //       JScrollPane jscrollpane = new JScrollPane(jtextarea_vanBan,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
 //       JScrollPane jscrollpane = new JScrollPane(jtextarea_vanBan,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
 //         JScrollPane jscrollpane = new JScrollPane(jtextarea_vanBan,JScrollPane.VERTICAL_SCROLLBAR_NEVER, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
          JScrollPane jscrollpane = new JScrollPane(jtextarea_vanBan,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);


//        JPanel jpanel_center = new JPanel();
//        jpanel_center.setLayout(new GridLayout(2,1,10,10));
//        
//        jpanel_center.add(jlabel_vanBan);
//        jpanel_center.add(jtextarea_vanBan);
        jlabel_tuKhoa = new JLabel("Tu Khoa");
        jtextfield_tuKhoa = new JTextField(); // so luong dong, so luong cot
        jlabel_tuKhoa.setFont(font);
        jtextfield_tuKhoa.setFont(font);

        areaListener al = new areaListener(this);

        JButton jbutton_thongKe = new JButton("Thong ke");
        jbutton_thongKe.setFont(font);
        jbutton_thongKe.setBackground(Color.GREEN);
        jbutton_thongKe.setBorderPainted(false);
        jbutton_thongKe.setOpaque(true);

        jbutton_thongKe.addActionListener(al);
        JLabel_ketQua = new JLabel("Ket qua");
        JLabel_ketQua.setForeground(Color.red);
        JLabel_ketQua.setBackground(Color.PINK);
        JLabel_ketQua.setOpaque(true);
        JLabel_ketQua.setVisible(false);

        JPanel jpanel_footer = new JPanel();
        jpanel_footer.setLayout(new GridLayout(2, 2, 10, 10));
        jpanel_footer.add(jlabel_tuKhoa);
        jpanel_footer.add(jtextfield_tuKhoa);
        jpanel_footer.add(jbutton_thongKe);
        jpanel_footer.add(JLabel_ketQua);

        this.setLayout(new BorderLayout());
        this.add(jlabel_vanBan, BorderLayout.NORTH);
        this.add(jscrollpane, BorderLayout.CENTER);
        this.add(jpanel_footer, BorderLayout.SOUTH);

    }

    public void timKiem() {
        this.am.setVanBan(jtextarea_vanBan.getText());
        this.am.setTuKhoa(jtextfield_tuKhoa.getText());
        this.am.timKiem();
        this.JLabel_ketQua.setText(this.am.getKetQua());
        JLabel_ketQua.setVisible(true);

    }

}

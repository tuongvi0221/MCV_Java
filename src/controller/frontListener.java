package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.frontView;

public class frontListener implements ActionListener {

    private frontView fv;

    public frontListener(frontView fv) {
        this.fv = fv;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if (src.equals("1")) {
            this.fv.changeTo_1();
        } else if (src.equals("2")) {
            this.fv.changeTo_2();
        } else if (src.equals("3")) {
            this.fv.changeTo_3();
        } else if (src.equals("4")) {
            this.fv.changeTo_4();

        }
    }
}

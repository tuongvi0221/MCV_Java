package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.fieldView;

public class fieldListener implements ActionListener {

    private fieldView fv;

    public fieldListener(fieldView fv) {
        this.fv = fv;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if (src.equals("+")) {
            this.fv.plus();
            this.fv.changeTextColor(Color.RED);
            this.fv.changeBackgroundColor(Color.BLUE);
        } else if (src.equals("-")) {
            this.fv.minus();
            this.fv.changeTextColor(Color.DARK_GRAY);
            this.fv.changeBackgroundColor(Color.MAGENTA);
        } else if (src.equals("*")) {
            this.fv.multiply();
            this.fv.changeTextColor(Color.YELLOW);
            this.fv.changeBackgroundColor(Color.RED);
        } else if (src.equals("/")) {
            this.fv.divide();
            this.fv.changeTextColor(Color.pink);
            this.fv.changeBackgroundColor(Color.magenta);
        } else if (src.equals("^")) {
            this.fv.pow();
            this.fv.changeTextColor(Color.orange);
            this.fv.changeBackgroundColor(Color.LIGHT_GRAY);
        } else if (src.equals("%")) {
            this.fv.mod();
            this.fv.changeTextColor(Color.red);
            this.fv.changeBackgroundColor(Color.yellow);
        }
    }

}

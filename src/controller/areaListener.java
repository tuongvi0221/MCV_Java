
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.areaView;

public class areaListener implements ActionListener{
    private areaView av;
     
    public areaListener( areaView av){
        this.av = av;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        this.av.timKiem();
    }
}

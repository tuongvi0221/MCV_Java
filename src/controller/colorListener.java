
package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.colorView;

public class colorListener implements ActionListener {
    private colorView cv;
    
    public colorListener(colorView cv){
        this.cv = cv;
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if(src.equals("Red Text")){
            this.cv.changeTextColor(Color.RED);
        }else if(src.equals("Yellow Text")){
             this.cv.changeTextColor(Color.YELLOW);
        } else if(src.equals("Green Text")){
            this.cv.changeTextColor(Color.GREEN);
            
        }else if(src.equals("Red Background")){
            this.cv.changeBackgroundColor(Color.RED);
        }else if(src.equals("Yellow Background")){
              this.cv.changeBackgroundColor(Color.YELLOW);
        }else if(src.equals("Green Background")){
             this.cv.changeBackgroundColor(Color.GREEN);
        }
    }
}

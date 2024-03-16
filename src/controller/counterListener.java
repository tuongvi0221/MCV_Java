
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.counterView;

public class counterListener implements ActionListener {
    private counterView ctv ;
    
    // de biet dang lang nghe ctr nao
    public counterListener(counterView ctv){
        this.ctv = ctv;
    }
    
    @Override
    //lang nghe khi co su kien xay ra
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        System.out.println("Ban da nhan nut " + src );
        
        if(src.equals("Up")){
            this.ctv.increment();
        }else{
            this.ctv.decrement();
        }
    }
  
}

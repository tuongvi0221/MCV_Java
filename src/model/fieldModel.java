
package model;

import java.awt.Color;

public class fieldModel {
   private double firstValue;
   private double secondValue;
   private double result;
  private Color foreground; // mau chu
  private Color background;

   public fieldModel(){
       this.firstValue = 0;
       this.secondValue = 0;
       this.result = 0 ;
       this.foreground = Color.PINK;
       this.background = Color.white;
   }

    public double getFirstValue() {
        return firstValue;
    }

    public double getSecondValue() {
        return secondValue;
    }

    public void setFirstValue(double firstValue) {
        this.firstValue = firstValue;
    }

    public void setSecondValue(double secondValue) {
        this.secondValue = secondValue;
    }

    public double getResult() {
        return result;
    }
    
     public void setBackground(Color background) {
        this.background = background;
    }

      
     public void setForeground(Color foreground ) {
        this.foreground = foreground;
    
     }
    public Color getForeground() {
        return foreground;
    }

    public Color getBackground() {
        return background;
    }

    public void setResult(double result) {
        this.result = result;
    }
    
     public double plus(){
       this.result = this.firstValue + this.secondValue;
       return this.result;
   }
   
    public double minus(){
       this.result = this.firstValue - this.secondValue;
       return this.result;
   }
    
     public double multiply(){
       this.result = this.firstValue * this.secondValue;
       return this.result;
   }
     
       public double divide(){
       this.result = this.firstValue / this.secondValue;
       return this.result;
   }
       
          public double pow(){
       this.result = Math.pow(this.firstValue ,this.secondValue);
       return this.result;
   }
            public double mod(){
       this.result = this.firstValue % this.secondValue;
       return this.result;
   }
        
          
       
}

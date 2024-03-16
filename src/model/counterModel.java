
package model;
public class counterModel {
    private int value;
    
    public counterModel(){
        this.value = 0;
    }
    
    public int getValue(){
        return this.value;
    }
    
    public void setValue(int value){
        this.value = value;
    }
    
    public void increment(){
        this.value ++;
    }
    
    public void decrement(){
        this.value --;
    }
}

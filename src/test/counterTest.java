
package test;

import model.counterModel;
import view.counterView;

public class counterTest {
    public static void main(String agrs[]){
    counterModel ctm = new counterModel();
    ctm.increment();
    ctm.increment();
    ctm.increment();
    System.out.println("Gia tri: " + ctm.getValue());
    ctm.decrement();
    System.out.println("Gia tri: " + ctm.getValue());
    
    counterView ctv = new counterView();
    }
}

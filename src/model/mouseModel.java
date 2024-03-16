
package model;

public class mouseModel {
    private int x;
    private  int y;
    private int count;
    private String checkIn;

    public mouseModel() {
        this.x = 0;
        this.y = 0;
        this.count = 0;
        this.checkIn = "";
        
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getCount() {
        return count;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }
    
    
    public void addClick(){
        this.count ++;
    }
    
    public void enter(){
        System.out.println("Enter event");
    }
    
    public void exit(){
        
    }
    
    
    
}

package com.oop;
class Mobile{
    private int key;
    public void setKey(int key){
        this.key=key;
    }
    public String validate(int key){
        if(this.key == key){
            return new String("login successfull");
        }
        return new String("incorrect key");
    }
}
public class EncapsulationDemo {
    public static void main(String[] args) {
        Mobile apple = new Mobile();
        apple.setKey(1729);
        System.out.println(apple.validate(1729));
    }

}

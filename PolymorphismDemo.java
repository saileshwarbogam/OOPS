package com.oop;

//over-loading
class Validation{
    String username="sailesh";
    String password="1729";
    public void validate(String username){
        if(this.username.equals(username)) System.out.println("Success");
    }
    public void validate(String username,String password){
        if(this.password.equals(password) && this.username.equals(username)) System.out.println("Success");
    }
}

//over-riding
class Dog{
    public void behaviour(){
        System.out.println("Just Barks");
    }
}
class Dog2{
    public void behaviour(){
        System.out.println("Barks and Chases");
    }
}
public class PolymorphismDemo {
    public static void main(String[] args) {
        Validation validate = new Validation();
        validate.validate("sailesh");
        validate.validate("sailesh","1729");
    }
}

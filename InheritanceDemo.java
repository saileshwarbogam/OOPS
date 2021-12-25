package com.oop;

//single level
class Book{
    public String getAuthor(){
        return new String("J.K Rowling");
    }
    public String getName(){
        return new String("HP and the philosopher's stone");
    }
}
class Book2 extends Book{
    public String getName(){
        return new String("HP and the chamber of secrets");
    }
}
//multi level
class Book3 extends Book2{
    public String getName(){
        return new String("HP and the prisoner of askaban");
    }
}

//multiple
interface Mobile1{
    default void call(){
        System.out.println("calling...");
    }
}
interface  Mobile2{
    default void call(){
        System.out.println("calling..");
    }
}
class Apple implements Mobile1,Mobile2{
    @Override
    public void call() {
        Mobile1.super.call();
    }
}

//heirarchical (single parent multiple childs)
class Phone{
    public void call(){
        System.out.println("calling");
    }
    public void message(){
        System.out.println("sending message");
    }
}
class RealMe extends Phone{
    public void click(){
        System.out.println("captured");
    }
}
class MI extends Phone{
    public void browse(){
        System.out.println("browsing");
    }
}
class Oppo extends Phone{
    public void play(){
        System.out.println("playing");
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {

    }
}

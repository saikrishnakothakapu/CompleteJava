

abstract class Car{

    /* 
       When we want to implement methods in child class we make it abstract
       as it should be implemented in every child class 
    */ 

    public abstract void drive();

    public void playMusic(){
        System.out.println("Playing music");
    }

    public void applyBrakes(){
        System.out.println("Brakes Applied and speed became 0");
    }
}

class Calculator{

    public final void show(){
        System.out.println("Final Method");
    }

    public void add(int a, int b){
        System.out.println(a+b);
    }
}

class AdvCalculator extends Calculator{

    // public void show(){
    //     System.out.println("Show method in child class");
    // }

    /* If we try to override final method we get compilation saying

       FinalMethod.java:15: error: show() in AdvCalculator cannot override show() in Calculator
            public void show(){
                ^
            overridden method is final
        1 error

        we can't override final method
    */

   
    public void add(int a, int b){
        System.out.println(a+b);
    }
}


public class FinalMethod {

    public static void main(String[] args){

        Calculator cal = new Calculator();

        AdvCalculator advCal = new AdvCalculator();

        cal.show();
        advCal.show();
    }

    
}



final class Calculator{

    public void add(int a, int b){
        System.out.println(a+b);
    }

}

// class AdvCalculator extends Calculator{

//     public void add(int a, int b){
//         System.out.println(a+b);
//     }
// }

/*

    We cannot extend final class. That means we cannot inherit final class.
    if we try to inherit final class we get compilation error.
    FinalClass.java:12: error: cannot inherit from final Calculator
    class AdvCalculator extends Calculator{
                            ^
    1 error

    */
public class FinalClass {


public static void main(String[] args){

    Calculator cal = new Calculator();

    //AdvCalculator advCal = new AdvCalculator();

    cal.add(10,30);
    //advCal.add(10,20);


}
}


public class Demo{


    public static void main(String[] args){
        
        System.out.println("------------Grand Parent Object------------");
        GrandParent gp = new GrandParent();
        gp.show();
        System.out.println("Adding two numbers using addition method from grandparent used by grandparent Class" + gp.add(3,5));
        System.out.println("==============================================");

        System.out.println("------------Parent Object------------");
        Parent p = new Parent();
        p.show();
        System.out.println("Adding two numbers using addition method from grandparent used by Parent Class" + p.add(3,5));
        System.out.println("Subtract two numbers using subtract method from Parent used by Parent Object" + p.subtract(10,6));
        System.out.println("==============================================");

        System.out.println("------------Child Object------------");
        Child c = new Child();
        c.show();
        System.out.println("Adding two numbers using addition method from grandparent used by Child Class" + c.add(3,5));
        System.out.println("Subtract two numbers using subtract method from Parent used by Child Object" + c.subtract(10,6));
        System.out.println("multiply two numbers using multiply method from child class used by child object "+ c.multiply(10,3));
        System.out.println("==============================================");



    }
}
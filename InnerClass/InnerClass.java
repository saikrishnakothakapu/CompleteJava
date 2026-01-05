

public class InnerClass{

    int age;

    public void show(){
        System.out.println("inside inner class");
    }

    class InsideClass{

        public void show(){
            System.out.println("inside Inside Class");
        }
    }
}
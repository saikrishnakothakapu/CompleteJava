

public class Demo{

    public static void main(String[] args){


        Computer lap = new Laptop();

        Developer dev1 = new Developer();

        dev1.work(lap);

        Computer desk = new Desktop();

        Developer dev2 = new Developer();
        dev2.work(desk);
    }
}
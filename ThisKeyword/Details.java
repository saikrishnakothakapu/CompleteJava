

public class Details {

    /*
        this keyword is used to refer to the current class instance variable.
        It is used to differentiate between instance variables and parameters with the same name.
    */
    private String name;
    private int age;
    private String address;
    private long id;

    /*
        Default Constructor
        It is used to initialize the instance variables with default values.
    */
    public Details(){
        System.out.println("Default Constructor");
    }

    /*
        Parameterized Constructor
        It is used to initialize the instance variables with the provided values.
    */
    public Details(String name, int age, String address, long id){
        this.name = name;
        this.age = age;
        this.address = address;
        this.id = id;
    }

    public void showDetails(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Address: " + this.address);
        System.out.println("ID: " + this.id);
    }
}
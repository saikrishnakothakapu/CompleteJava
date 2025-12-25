

public class Parent {

    private String name;
    private int age;

    public Parent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public void getInfo(){
        System.out.println("Parent Class - getInfo() method called.");
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
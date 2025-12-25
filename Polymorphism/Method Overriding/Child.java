

public class Child extends Parent  {
    private String schoolName;

    public Child(String name, int age, String schoolName) {
        super(name, age);
        this.schoolName = schoolName;
    }

    public void setSchoolName(String schoolName){
        this.schoolName = schoolName;
    }
    public String getSchoolName(){
        return schoolName;
    }

    @Override
    public void getInfo() {
        System.out.println("Child Class - getInfo() method called.");
        System.out.println("Name: " + getName() + ", Age: " + getAge() + ", School Name: " + schoolName);
    }
}
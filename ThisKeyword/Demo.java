

public class Demo {


    public static void main(String[] args) {

        Details defaultDetails = new Details();

        defaultDetails.showDetails();

        System.out.println("--------------------------");

        Details paramDetails = new Details("Saikrishna", 26, "Hyderabad", 12345678L);
        paramDetails.showDetails();


    }


}


public class Demo{

    public static void main(String[] args){

        Mobile newMobile = new Mobile();

        newMobile.playMusic();

        Mobile nMobile = new Mobile(){

            public void playMusic(){
                System.out.println("Playing Music from Anonymus mobile class");
            }
        };

        nMobile.playMusic();
    }
}
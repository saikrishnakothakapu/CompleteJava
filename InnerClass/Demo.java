

public class Demo{

    public static void main(String[] args){

        InnerClass inrCls = new InnerClass();

        inrCls.show();


        InnerClass.InsideClass insdCls = inrCls.new InsideClass();

        insdCls.show();
    }
}


public class OverloadConstuctor {
    OverloadConstuctor( ){
        this("hello");
        System.out.println("In default Constructor");
    }

    OverloadConstuctor(String a){
        System.out.println("In another constructor with parameter string "+a);
    }
    public static void main(String a[])
    {
        OverloadConstuctor object=new OverloadConstuctor();
    }
}



public class OverloadConstuctorDemo {
    OverloadConstuctorDemo( ){
        this("hello");
        System.out.println("In default Constructor");
    }

    OverloadConstuctorDemo(String parameterString){
        System.out.println("In another constructor with parameter string "+parameterString);
    }

    public static void main(String a[])
    {
        OverloadConstuctorDemo overloadConstuctorDemoObject=new OverloadConstuctorDemo();
    }
}

package pavan.assignment.singleton;

public class Class2 {
    String name;
    public  static Class2 initialize(String a)
    {
        Class2 obj=new Class2();
        obj.name=a;
        return obj;
    }
    public void print_name(){
        System.out.println(this.name);
    }

}

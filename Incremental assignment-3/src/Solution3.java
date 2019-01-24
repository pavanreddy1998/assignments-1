
interface I1{
void id();
void name();
}


interface I2{
    void mobile();
    void age();

}


interface I3{
void address();
void country();
}


interface I4 extends I1,I2,I3{
void salary();
}


class Cabin{
    Cabin(){
        System.out.println("cabin Number");
    }

}



class Employee extends Cabin implements I4{
    public void address() {
        System.out.println("address details");
    }
    public void country(){
        System.out.println("country of employee");
    }
    public void salary(){
        System.out.println("salary of employee");
    }
    public void mobile(){
        System.out.println("mobile number");
    }

    public void age(){
        System.out.println("Age of Employee");
    }
    public void id(){
        System.out.println("Id of employee");
    }
    public void name(){
        System.out.println("name of employee");
    }

    void e1(I1 details1){
        details1.name();
    }

    void e2(I2 details2){
        details2.age();
    }

    void e3(I3 details3){
        details3.country();
    }

    void e4(I4 details4){
        details4.salary();
    }
}


public class Solution3 {
public static void main (String arg[]){

    Employee emp = new Employee();
    emp.e1(emp);
    emp.e2(emp);
    emp.e3(emp);
    emp.e4(emp);
}

}

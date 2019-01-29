
interface IdentityDetails{
void id();
void name();
}


interface PerosonalDetails{
    void mobile();
    void age();

}


interface AddressDetails{
void address();
void country();
}


interface JobDetails extends IdentityDetails,PerosonalDetails,AddressDetails{
void salary();
}


class Cabin{
    Cabin(){
        System.out.println("cabin Number");
    }

}


class Employee extends Cabin implements JobDetails{
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

    void fetchIdentityDetails(IdentityDetails employee){
        employee.name();
    }

    void fetchPersonalDetails(PerosonalDetails employee){
        employee.age();
    }

    void fetchAddressDetails(AddressDetails employee){
        employee.country();
    }

    void fetchAddressDetails(JobDetails employee){
        employee.salary();
    }
}


public class Solution3 {
public static void main (String arg[]){

    Employee employee = new Employee();
    employee.fetchIdentityDetails(employee);
    employee.fetchPersonalDetails(employee);
    employee.fetchAddressDetails(employee);
    employee.fetchAddressDetails(employee);
}

}

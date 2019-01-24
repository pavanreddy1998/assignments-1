package pavan.assignment.data;

public class Class1 {
    int global1;
    char global2;
    public void printGlobal(){
        System.out.println(global1);
        System.out.println(global2);
    }
    public  static void printLocal() {
        int local1;
        char local2;
        //System.out.println(local1);
         //System.out.println(local2);
        /*local variables don't have default value,hence it is a compile time error.
*/
    }


}

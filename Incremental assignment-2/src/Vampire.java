import java.util.ArrayList;
import java.util.Arrays;

public class Vampire {
    /**
     * countDigit returns the total number od digits in a given number.
     * @param n
     * @return
     */
    static int countDigit(long n)
    {
        return (int)Math.floor(Math.log10(n)+1);
    }

    /**
     * isVampire function checks if the given number isvampire based on the factors passed.
     * @param number
     * @param factor1
     * @param factor2
     * @return
     */
     static boolean isVamp(long number,long factor1,long factor2){
       //if factors are ending with zero then it cannot be vampire number.
       if(factor1%10==0 && factor2%10==0)
          return false;

        //the fators should be two equal halves of the number
       if(countDigit(factor1)!=countDigit(factor2)||countDigit(factor1)!=countDigit(number)/2)
           return false;

       char numberArray[]=Long.toString(number).toCharArray();
       char factorsArray[]=(""+factor1+factor2).toCharArray();
         Arrays.sort(numberArray);
         Arrays.sort(factorsArray);
         return Arrays.equals(numberArray,factorsArray);

     }




    public static void main(String arg[])
        {
            ArrayList <Long> vampireList=new ArrayList<>();
            for(long number=10;vampireList.size()<=100;number++){

              //if the digits of the current number cannot be divided into two halves
              //increment the number to next least possible even digit number.
               if(countDigit(number)%2!=0){
                number=number*10-1;
                continue;
               }
               for(long factor1=2;factor1<=Math.sqrt(number)+1;factor1++){
                   if(number%factor1==0){
                       long factor2=number/factor1;
                       if(isVamp(number,factor1,factor2)){
                           vampireList.add(number);
                       }
                   }
               }
            }
            System.out.println(vampireList);
        }
}

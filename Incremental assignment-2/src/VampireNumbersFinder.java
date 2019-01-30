import java.util.ArrayList;
import java.util.Arrays;

public class VampireNumbersFinder {
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
     * @param firstFactor
     * @param secondFactor
     * @return
     */
     static boolean isVamp(long number,long firstFactor,long secondFactor){
       //if factors are ending with zero then it cannot be vampire number.
       if(firstFactor%10==0 && secondFactor%10==0)
          return false;

        //the fators should be two equal halves of the number
       if(countDigit(firstFactor)!=countDigit(secondFactor)||countDigit(firstFactor)!=countDigit(number)/2)
           return false;

       char numberArray[]=Long.toString(number).toCharArray();
       char factorsArray[]=(""+firstFactor+secondFactor).toCharArray();
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
               for(long firstFactor=2;firstFactor<=Math.sqrt(number)+1;firstFactor++){
                   if(number%firstFactor==0){
                       long secondFactor=number/firstFactor;
                       if(isVamp(number,firstFactor,secondFactor)){
                           vampireList.add(number);
                       }
                   }
               }
            }
            System.out.println(vampireList);
        }
}



/**
Output:

[1260, 1395, 1435, 1530, 1827, 2187, 6880, 102510, 104260, 105210, 105264, 105750, 108135, 110758, 115672, 116725, 117067, 118440,
120600, 123354, 124483, 125248, 125433, 125460, 125460, 125500, 126027, 126846, 129640, 129775, 131242, 132430, 133245, 134725,
135828, 135837, 136525, 136948, 140350,145314, 146137, 146952, 150300, 152608, 152685, 153436, 156240, 156289, 156915, 162976,
163944, 172822, 173250, 174370, 175329, 180225, 180297, 182250, 182650, 186624, 190260, 192150, 193257, 193945, 197725, 201852,
205785, 211896, 213466, 215860, 216733, 217638, 218488, 226498, 226872, 229648,233896, 241564, 245182, 251896, 253750, 254740,
260338, 262984, 263074, 284598, 284760, 286416, 296320, 304717, 312475, 312975, 315594, 315900, 319059, 319536, 326452, 329346,
 329656, 336550, 336960]



*/

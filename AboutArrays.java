
/**
 * Sample Code for Arrays in Java.
 * 
 * @author Barbara Kleinen
 * @version 25.11.11
 */
public class AboutArrays
{
    public AboutArrays()
    {
    }
    /**
     * Sample Code for Arrays. 
     * Debug this Code to see it working 
     * and to Inspect Variables.
     */
    public void sampleCode()
    {
        
        //Declaring an Array
        boolean[] isEvenNumber;
        // Initializing an Array -NB: This only initializes the Array itself, not the individual fields!
        isEvenNumber = new boolean[100]; 
        // The array Size can also be a variable or computed.
        int x = 10;
        isEvenNumber = new boolean[x*10]; 
        // Array Literals can be used in the initialization:
        int[] someNumbers = { 3, 15, 4, 5 };
        // how to access individual fields
        isEvenNumber[10] = true;
        // they can be used just like variables of the corresponding type.
        if (isEvenNumber[10]) 
            System.out.println("10 is an Even Number.");       
        // a for loop is a usual way to loop through an array.    
        for (int i = 0;i<isEvenNumber.length; i++){
            isEvenNumber[i] = (i % 2) == 0;
        }
        // array indices can also be computed.
       for (int i = 1;i<isEvenNumber.length / 2; i++){
           isEvenNumber[i*2] = true;
        }
      }
}

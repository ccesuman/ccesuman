/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;


/**
 *
 * @author ccesu
 */
public class PrinttheArrayValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array of length : ");
        int size = input.nextInt();
        int[] arr= new int[size];
        for(int i = 0;i<size;i++) {
            arr[i] = input.nextInt();
        }
        int lower = arr[0];
        System.out.println("The Given Array is: ");
        for(int i=0;i<size;i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println("");
        for(int j=0; j<size;j++) {
            if(arr[j] < lower)
                lower= arr[j];
        }
        System.out.println("The lower case is : " + lower);
        input.close();
    }
    
    
}

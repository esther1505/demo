
package app6;

import java.util.Scanner;


public class App6 {

    
    public static void main(String[] args) {
        //any number 1-7->monday
        //3 input ->a,b,c age 
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter any Number: ");
        int number=in.nextInt();
        if(number==1){
            System.out.println("Monday");
        }
        else if(number==2){
            System.out.println("Tuesday");
        }
        else if(number==3){
            System.out.println("wednessday");
        }
        else if(number==4){
            System.out.println("Thursday");
        }
        else if(number==5){
            System.out.println("Friday");
        }
        else if(number==6){
            System.out.println("Saturday");
        }
        else if(number==7){
            System.out.println("Sunday");
        }
        else{
            System.out.println("___________");
        }
            
    } 
}

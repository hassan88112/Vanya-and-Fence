
package vanyaandfence;

import java.util.Scanner;


public class VanyaAndFence {

    
    public static void main(String[] args) {  // num  h   heightperson
        
          Scanner input = new Scanner(System.in);
          
          int n=input.nextInt();
          int h=input.nextInt();
          int result = 0;
          
         
          while(n !=0){
          
              int personheight=input.nextInt();
              result++;
              if (personheight  > h){
              result++;
              }
              n--;
          }
          
          System.out.println(result);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programsSE.datatypes;
import java.util.Scanner;

/**
 *
 * @author Abdullah
 */
public class InputScanner {
    
    public static void main(String[] args) {  
        
        String name;
        int age;
        boolean question;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Entar a Name :");
        name = in.nextLine();
        
        System.out.println("Enter Age :");
        age = in.nextInt();
        
        System.out.println("Are you Egyptian ?(you must the ansewer is true or false)");
        question = in.nextBoolean();
        
        System.out.println("your Name:" + name +"\n" + "Your age:" + age + "\n");
        
        if(question = true){
                    System.out.println("يبن الفقريه تعلي جنب اخوك");
                }else{
                    System.out.println("يبن المحضوظه");
                }
        //Close the scanner object to avoid resource leak
        in.close();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hundredofprograms.parttwo;

/**
 *
 * @author Abdullah
 */
public class SplitString {

    public static void main(String args[]) {
        String s1 = "java string split method by Technolamror";
        String[] words = s1.split("\\d");  
        for (String w : words) {
            System.out.println(w);
        }
    }

}

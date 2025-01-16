/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programsSE.string;

/**
 *
 * @author Abdullah
 */
public class ReplaceString {

    public static void main(String[] args) {

        String s1 = "My name is Rajendra. My name is lamror. My name is Technolamror.";
        String replaceString = s1.replaceAll("is", "was");
        System.out.println(s1);
        System.out.println(replaceString);
    }

}

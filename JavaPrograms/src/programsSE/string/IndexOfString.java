/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programsSE.string;

/**
 *
 * @author Abdullah
 */
public class IndexOfString {

    public static void main(String args[]) {
        String s1 = "this is index of example";
        int index1 = s1.indexOf("is");
        int index2 = s1.indexOf("index");
        System.out.println(index1 + "  " + index2);
        int index3 = s1.indexOf("is", 4);
        System.out.println(index3);
        int index4 = s1.indexOf('s');
        System.out.println(index4);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programsSE.database;

import java.sql.*;
import java.io.*;

/**
 *
 * @author Abdullah
 */
public class InsertImage {

    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
            PreparedStatement ps = con.prepareStatement("insert into imgtable values(?,?)");
            ps.setString(1, "Technolamror");
            FileInputStream fin = new FileInputStream("d:\\g.jpg");
            ps.setBinaryStream(2, fin, fin.available());
            int i = ps.executeUpdate();
            System.out.println(i + " records affected");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

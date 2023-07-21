/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.sql.SQLException;

/**
 *
 * @author sebas
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        Enlace c = new Enlace();

        for (int i = 0; i < c.obtenerDataEstudiantes().size(); i++) {
            System.out.printf("%s", c.obtenerDataEstudiantes().get(i));
        }
    }

}

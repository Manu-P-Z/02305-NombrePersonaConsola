/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Manu Portolés
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {
        String nombre;

        try {

            System.out.print("Me llamo .................: ");

            nombre = SCN.nextLine();

            System.out.printf("%1$s %2$s %2$s %2$s %2$s %2$s %2$s %2$s %2$s %2$s %2$s%n", "Me llamo .................:", nombre);

        } catch (Exception e) {

            System.out.println("ERROR: Entrada incorrecta");

        } finally {

        }

    }

}

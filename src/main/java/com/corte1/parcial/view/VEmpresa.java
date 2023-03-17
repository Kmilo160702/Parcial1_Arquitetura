package com.corte1.parcial.view;

import java.util.Scanner;

import com.corte1.parcial.controller.ControllerEmpresa;

public class VEmpresa {

    public static void inicio() {

        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("\t------ MENÚ DE INICIO -----\t");
            System.out.println("1: Agregar Empresa");
            System.out.println("2: Calcular Impuesto");
            System.out.println("3: Salir");

            int opcion = Integer.parseInt(entrada.nextLine());

            switch (opcion) {
                case 1 -> {
                    ControllerEmpresa a = new ControllerEmpresa();
                    a.main();
                }

                case 2 -> {
                    System.out.println("\t----Calcular impuestos rapido---\t");
                    System.out.println("Ingrese el capital de la empresa: ");
                    int capital = Integer.parseInt(entrada.nextLine());
                    if (capital > 30000000 && capital < 50000000) {
                        System.out.println("El impuesto a pagar es del 3%");
                    } else if (capital > 50000000) {
                        System.out.println("El impuesto a pagar es del 5%");
                    } else {
                        System.out.println("El impuesto a pagar es del 10%");
                    }
                }
                case 3 -> {
                    System.out.println("Saliendo");
                    System.exit(0);
                }
                default -> System.out.println("Opcion no valida.");
            }
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }

}

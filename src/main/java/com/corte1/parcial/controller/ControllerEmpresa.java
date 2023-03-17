package com.corte1.parcial.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.corte1.parcial.model.Empresa;
import com.corte1.parcial.view.VEmpresa;

public class ControllerEmpresa {

    private double valorPagar;
    private Empresa model;
    private VEmpresa view;

    static ArrayList<Empresa> datos = new ArrayList<>();

    public void main() {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("\n------------------------------------");
            System.out.println("\tIngrese una opción\t");
            System.out.println("1: Persona Natural.");
            System.out.println("2. Persona Juridica.");
            System.out.println("3: Mostrar Empresas.");
            System.out.println("4: Salir.");

            int opcion = Integer.parseInt(entrada.nextLine());

            switch (opcion) {
                case 1 -> {
                    Empresa a = new Empresa();

                    System.out.println("Ingrese la cedula: ");
                    a.setCedula(Long.parseLong(entrada.nextLine()));
                    System.out.println("Ingrese nombre de la empresa: ");
                    a.setNombreEmpresa(entrada.nextLine());
                    System.out.println("Ingrese nombre del representante: ");
                    a.setNombreRepresentante(entrada.nextLine());
                    System.out.println("Ingrese la direccion: ");
                    a.setDireccion(entrada.nextLine());
                    System.out.println("Ingrese la fecha de creacion 'dd/mm/aaaa': ");
                    a.setFechaCreacion(entrada.nextLine());
                    System.out.println("Ingrese el correo institucional: ");
                    a.setCorreo(entrada.nextLine());
                    System.out.println("Ingrese el número de telefono: ");
                    a.setTelefono(entrada.nextInt());
                    System.out.println("Ingrese el Certificado de camara de comercio: ");
                    a.setCertificado(entrada.nextInt());
                    System.out.println("\t-------Ingrese su actividad economica----------\t");
                    System.out.println("1. Industrial");
                    System.out.println("2. Comercial");
                    System.out.println("3. Servicios");
                    System.out.println("\t-----------------------------------------------\t");
                    a.setActividadEconomica(entrada.nextInt());
                    System.out.println("Ingrese su capital de trabajo: ");
                    a.setCapital(entrada.nextInt());
                    System.out.println("Ingrese numero de empleados: ");
                    a.setNumEmpleados(entrada.nextInt());
                    System.out.println("Ingrese el estrato: ");
                    a.setEstrato(entrada.nextInt());

                    datos.add(a);

                    System.out.println("\t---------Empresa Registrada------------\t");
                    System.out.println("Cedula: " + a.getCedula());
                    System.out.println("Nombre: " + a.getNombreEmpresa());
                    System.out.println("Representante: " + a.getNombreRepresentante());
                    System.out.println("Direccion: " + a.getDireccion());
                    System.out.println("Fecha: " + a.getFechaCreacion());
                    System.out.println("Correo: " + a.getCorreo());
                    System.out.println("Telefono: " + a.getTelefono());
                    System.out.println("N° Certificado camara de comercio: " + a.getCertificado());
                    System.out.println("Actividad economica: " + a.getActividadEconomica());
                    System.out.println("Capital de trabajo: " + a.getCapital());
                    System.out.println("N° Empleados: " + a.getNumEmpleados());
                    System.out.println("Estrato: " + a.getEstrato());

                    calculaValorPago();
                    main();
                }

                case 2 -> {
                    Empresa a = new Empresa();

                    System.out.println("Ingrese el NIT: ");
                    a.setCedula(Long.parseLong(entrada.nextLine()));
                    System.out.println("Ingrese nombre de la empresa: ");
                    a.setNombreEmpresa(entrada.nextLine());
                    System.out.println("Ingrese nombre del representante: ");
                    a.setNombreRepresentante(entrada.nextLine());
                    System.out.println("Ingrese la direccion: ");
                    a.setDireccion(entrada.nextLine());
                    System.out.println("Ingrese la fecha de creacion 'dd/mm/aaaa': ");
                    a.setFechaCreacion(entrada.nextLine());
                    System.out.println("Ingrese el correo institucional: ");
                    a.setCorreo(entrada.nextLine());
                    System.out.println("Ingrese el número de telefono: ");
                    a.setTelefono(entrada.nextInt());
                    System.out.println("Ingrese el Certificado de camara de comercio: ");
                    a.setCertificado(entrada.nextInt());
                    System.out.println("\t-------Ingrese su actividad economica----------\t");
                    System.out.println("1. Industrial");
                    System.out.println("2. Comercial");
                    System.out.println("3. Servicios");
                    System.out.println("\t-----------------------------------------------\t");
                    a.setActividadEconomica(entrada.nextInt());
                    System.out.println("Ingrese su capital de trabajo: ");
                    a.setCapital(entrada.nextInt());
                    System.out.println("Ingrese numero de empleados: ");
                    a.setNumEmpleados(entrada.nextInt());
                    System.out.println("Ingrese el estrato: ");
                    a.setEstrato(entrada.nextInt());

                    datos.add(a);

                    System.out.println("\t--------------Empresa Registrada----------------\t");
                    System.out.println("NIT: " + a.getCedula());
                    System.out.println("Nombre: " + a.getNombreEmpresa());
                    System.out.println("Representante: " + a.getNombreRepresentante());
                    System.out.println("Direccion: " + a.getDireccion());
                    System.out.println("Fecha: " + a.getFechaCreacion());
                    System.out.println("Correo: " + a.getCorreo());
                    System.out.println("Telefono: " + a.getTelefono());
                    System.out.println("N° Certificado camara de comercio: " + a.getCertificado());
                    System.out.println("Actividad economica: " + a.getActividadEconomica());
                    System.out.println("Capital de trabajo: " + a.getCapital());
                    System.out.println("N° Empleados: " + a.getNumEmpleados());
                    System.out.println("Estrato: " + a.getEstrato());

                    calculaValorPago();

                    main();
                }
                case 3 -> {
                    System.out.println("Ingresar cedula que desea buscar: ");
                    long cedula = entrada.nextLong();

                    for (int i = 0; i < datos.size(); i++) {
                        Empresa persona = datos.get(i);
                        if (cedula == persona.getCedula()) {
                            System.out.println("\t---------Datos encontrados---------\t");
                            System.out.println("Cedula: " + persona.getCedula());
                            System.out.println("Nombre: " + persona.getNombreEmpresa());
                            System.out.println("Representante: " + persona.getNombreRepresentante());
                            System.out.println("Direccion: " + persona.getDireccion());
                            System.out.println("Fecha: " + persona.getFechaCreacion());
                            System.out.println("Correo: " + persona.getCorreo());
                            System.out.println("Telefono: " + persona.getTelefono());
                            System.out.println("N° Certificado camara de comercio: " + persona.getCertificado());
                            System.out.println("Actividad economica: " + persona.getActividadEconomica());
                            System.out.println("Capital de trabajo: " + persona.getCapital());
                            System.out.println("N° Empleados: " + persona.getNumEmpleados());
                            System.out.println("Estrato: " + persona.getEstrato());

                            calculaValorPago();
                        }
                    }
                    main();

                }

                case 4 -> {
                    System.out.println("\tGracias por usar nuestros servicios\t");
                    System.exit(0);
                }
                default -> System.out.println("Opcion no valida.");
            }
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }

    public void calculaValorPago() {
        for (int i = 0; i < datos.size(); i++) {
            Empresa persona = datos.get(i);
            if (persona.getNumEmpleados() >= 1 && persona.getNumEmpleados() <= 5 && persona.getCapital() <= 30000000
                    && persona.getActividadEconomica() == 1
                    || persona.getActividadEconomica() == 2 && persona.getEstrato() == 1 || persona.getEstrato() == 2) {
                setValorPagar(persona.getCapital() * 0.03);
                System.out.println("Valor a pagar: " + valorPagar);
            } else if (persona.getNumEmpleados() >= 6 && persona.getNumEmpleados() <= 20
                    && persona.getCapital() <= 100000000 && persona.getActividadEconomica() == 2
                    || persona.getActividadEconomica() == 3 && persona.getEstrato() == 3 || persona.getEstrato() == 4) {
                setValorPagar(persona.getCapital() * 0.05);
                System.out.println("Valor a pagar: " + valorPagar);
            } else if (persona.getNumEmpleados() > 20 && persona.getCapital() <= 300000000
                    && persona.getActividadEconomica() == 1 || persona.getActividadEconomica() == 2
                    || persona.getActividadEconomica() == 3 && persona.getEstrato() == 5 || persona.getEstrato() == 6) {
                setValorPagar(persona.getCapital() * 0.1);
                System.out.println("Valor a pagar: " + valorPagar);
            } else {
                System.out.println("No se puede calcular el valor a pagar, revise los datos ingresados");
            }

        }
    }

    public Empresa getModel() {
        return model;
    }

    public void setModel(Empresa model) {
        this.model = model;
    }

    public VEmpresa getView() {
        return view;
    }

    public void setView(VEmpresa view) {
        this.view = view;
    }

    public double getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(double valorPagar) {
        this.valorPagar = valorPagar;
    }

}

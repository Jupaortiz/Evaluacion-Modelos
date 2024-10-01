package org.example;

import org.example.Modelos.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Creando el objeto vacio y lleno

        Asegurado asegurado2= new Asegurado("Carlos Perez","Calle 33-12","3126549870","carlos@gnail.com",123456789,35,9876,true,false,false,"1989-11-01","2001-10-10","2024-10-10",50000000);

        Asegurado asegurado1= new Asegurado();
        Scanner leerTeclado= new Scanner(System.in);
        // Ingresando datos por teclado para asegurado1
        System.out.println("Ingrese el nombre:");
        asegurado1.setNombre(leerTeclado.nextLine());

        System.out.println("Ingrese la dirección:");
        asegurado1.setDireccion(leerTeclado.nextLine());

        System.out.println("Ingrese el teléfono:");
        asegurado1.setTelefono(leerTeclado.nextLine());

        System.out.println("Ingrese el email:");
        asegurado1.setEmail(leerTeclado.nextLine());

        System.out.println("Ingrese el ID asegurado:");
        asegurado1.setIdAsegurado(leerTeclado.nextInt());

        System.out.println("Ingrese la edad:");
        asegurado1.setEdad(leerTeclado.nextInt());

        System.out.println("Ingrese el número de póliza:");
        asegurado1.setNumeroPoliza(leerTeclado.nextInt());

        System.out.println("Ingrese el monto asegurado:");
        asegurado1.setMontoAsegurado(leerTeclado.nextInt());

        System.out.println("¿Tiene cobertura médica? (true/false):");
        asegurado1.setTieneCoberturaMedica(leerTeclado.nextBoolean());

        System.out.println("¿Es fumador? (true/false):");
        asegurado1.setEsFumador(leerTeclado.nextBoolean());

        System.out.println("¿Tiene accidentes previos? (true/false):");
        asegurado1.setTieneAccidentesPrevios(leerTeclado.nextBoolean());

        leerTeclado.nextLine();

        System.out.println("Ingrese la fecha de nacimiento (formato yyyy-MM-dd):");
        asegurado1.setFechaNacimiento(leerTeclado.nextLine());

        System.out.println("Ingrese la fecha de inicio de póliza (formato yyyy-MM-dd):");
        asegurado1.setFechaInicioPoliza(leerTeclado.nextLine());

        System.out.println("Ingrese la fecha de vencimiento de póliza (formato yyyy-MM-dd):");
        asegurado1.setFechaVencimientoPoliza(leerTeclado.nextLine());


        // Mostrando los datos ingresados para ambos objetos
        System.out.println(asegurado1);
        System.out.println(asegurado2);




        // Creando el objeto vacío y lleno
        Vehiculo vehiculo2 = new Vehiculo("Toyota", "Corolla", "ABC123", "Rojo", 123456, 2020, 4, true, true, false, "2022-01-15", "2023-01-15", "2024-01-15", 15000);
        Vehiculo vehiculo1 = new Vehiculo();

        // Ingresando datos por teclado para vehiculo1
        System.out.println("Ingrese la marca del vehículo:");
        vehiculo1.setMarca(leerTeclado.nextLine());

        System.out.println("Ingrese el modelo del vehículo:");
        vehiculo1.setModelo(leerTeclado.nextLine());

        System.out.println("Ingrese el número de placa del vehículo:");
        vehiculo1.setNumeroPlaca(leerTeclado.nextLine());

        System.out.println("Ingrese el color del vehículo:");
        vehiculo1.setColor(leerTeclado.nextLine());

        System.out.println("Ingrese el ID del vehículo:");
        vehiculo1.setIdVehiculo(leerTeclado.nextInt());

        System.out.println("Ingrese el año de fabricación del vehículo:");
        vehiculo1.setAñoFabricacion(leerTeclado.nextInt());

        System.out.println("Ingrese el número de puertas del vehículo:");
        vehiculo1.setNumeroPuertas(leerTeclado.nextInt());

        System.out.println("¿Es eléctrico? (true/false):");
        vehiculo1.setEsElectrico(leerTeclado.nextBoolean());

        System.out.println("¿Tiene seguro? (true/false):");
        vehiculo1.setTieneSeguro(leerTeclado.nextBoolean());

        System.out.println("¿Es convertible? (true/false):");
        vehiculo1.setEsConvertible(leerTeclado.nextBoolean());

        leerTeclado.nextLine();

        System.out.println("Ingrese la fecha de compra del vehículo (formato yyyy-MM-dd):");
        vehiculo1.setFechaCompra(leerTeclado.nextLine());

        System.out.println("Ingrese la fecha del último mantenimiento (formato yyyy-MM-dd):");
        vehiculo1.setFechaUltimoMantenimiento(leerTeclado.nextLine());

        System.out.println("Ingrese la fecha de expiración del seguro (formato yyyy-MM-dd):");
        vehiculo1.setFechaExpiracionSeguro(leerTeclado.nextLine());

        System.out.println("Ingrese el precio del vehículo:");
        vehiculo1.setPrecio(leerTeclado.nextInt());

        // Mostrando los datos ingresados para ambos objetos
        System.out.println(vehiculo1);
        System.out.println(vehiculo2);



        // Creando el objeto vacío y lleno
        Accidente accidente2 = new Accidente("Colisión entre dos vehículos", "Calle 15, Ciudad", "Choque", 1001, 3, true, false, "2024-09-20", "2024-09-21", 5000);
        Accidente accidente1 = new Accidente();

        // Ingresando datos por teclado para accidente1
        System.out.println("Ingrese la descripción del accidente:");
        accidente1.setDescripcion(leerTeclado.nextLine());

        System.out.println("Ingrese el lugar del accidente:");
        accidente1.setLugar(leerTeclado.nextLine());

        System.out.println("Ingrese el tipo de accidente:");
        accidente1.setTipoAccidente(leerTeclado.nextLine());

        System.out.println("Ingrese el ID del accidente:");
        accidente1.setIdAccidente(leerTeclado.nextInt());

        System.out.println("Ingrese el número de afectados:");
        accidente1.setNumeroAfectados(leerTeclado.nextInt());

        System.out.println("¿Hubo heridos? (true/false):");
        accidente1.setHuboHeridos(leerTeclado.nextBoolean());

        System.out.println("¿Hubo fallecidos? (true/false):");
        accidente1.setHuboFallecidos(leerTeclado.nextBoolean());

        leerTeclado.nextLine();

        System.out.println("Ingrese la fecha del accidente (formato yyyy-MM-dd):");
        accidente1.setFechaAccidente(leerTeclado.nextLine());

        System.out.println("Ingrese la fecha del reporte (formato yyyy-MM-dd):");
        accidente1.setFechaReporte(leerTeclado.nextLine());

        System.out.println("Ingrese el monto reclamado:");
        accidente1.setMontoReclamado(leerTeclado.nextInt());

        // Mostrando los datos ingresados para ambos objetos
        System.out.println(accidente1);
        System.out.println(accidente2);


        // Creando el objeto vacío y lleno
        Aseguradora aseguradora2 = new Aseguradora("Aseguradora XYZ", "Calle Principal 45", "555123456", "contacto@aseguradoraxyz.com", 123456, 150, true, true, "2000-01-01", "2024-10-01");
        Aseguradora aseguradora1 = new Aseguradora();

        // Ingresando datos por teclado para aseguradora1
        System.out.println("Ingrese el nombre de la aseguradora:");
        aseguradora1.setNombre(leerTeclado.nextLine());

        System.out.println("Ingrese la dirección:");
        aseguradora1.setDireccion(leerTeclado.nextLine());

        System.out.println("Ingrese el teléfono:");
        aseguradora1.setTelefono(leerTeclado.nextLine());

        System.out.println("Ingrese el correo electrónico:");
        aseguradora1.setCorreoElectronico(leerTeclado.nextLine());

        System.out.println("Ingrese el ID de la aseguradora:");
        aseguradora1.setIdAseguradora(leerTeclado.nextInt());

        System.out.println("Ingrese el número de pólizas emitidas:");
        aseguradora1.setNumeroPolizasEmitidas(leerTeclado.nextInt());

        System.out.println("¿Es nacional? (true/false):");
        aseguradora1.setEsNacional(leerTeclado.nextBoolean());

        System.out.println("¿Tiene servicio 24 horas? (true/false):");
        aseguradora1.setTieneServicio24Horas(leerTeclado.nextBoolean());

        leerTeclado.nextLine();

        System.out.println("Ingrese la fecha de fundación (formato yyyy-MM-dd):");
        aseguradora1.setFechaFundacion(leerTeclado.nextLine());

        System.out.println("Ingrese la fecha de la última actualización (formato yyyy-MM-dd):");
        aseguradora1.setFechaUltimaActualizacion(leerTeclado.nextLine());

        // Mostrando los datos ingresados para ambos objetos
        System.out.println(aseguradora1);
        System.out.println(aseguradora2);



        // Creando el objeto vacío y lleno
        Beneficiario beneficiario2 = new Beneficiario("Juan Pérez","Hermano","Calle 123", "3126543210",987654,30,true,false,"1994-05-15","2024-10-01");
        System.out.println(beneficiario2);

        Beneficiario beneficiario1 = new Beneficiario();

        // Ingresando datos por teclado para beneficiario1
        System.out.println("Ingrese el nombre completo del beneficiario:");
        beneficiario1.setNombreCompleto(leerTeclado.nextLine());

        System.out.println("Ingrese la relación con el asegurado:");
        beneficiario1.setRelacionConAsegurado(leerTeclado.nextLine());

        System.out.println("Ingrese la dirección:");
        beneficiario1.setDireccion(leerTeclado.nextLine());

        System.out.println("Ingrese el teléfono:");
        beneficiario1.setTelefono(leerTeclado.nextLine());

        System.out.println("Ingrese el ID del beneficiario:");
        beneficiario1.setIdBeneficiario(leerTeclado.nextInt());

        System.out.println("Ingrese la edad:");
        beneficiario1.setEdad(leerTeclado.nextInt());

        System.out.println("¿Es el beneficiario principal? (true/false):");
        beneficiario1.setEsPrincipal(leerTeclado.nextBoolean());

        System.out.println("¿Es menor de edad? (true/false):");
        beneficiario1.setEsMenorDeEdad(leerTeclado.nextBoolean());

        leerTeclado.nextLine();

        System.out.println("Ingrese la fecha de nacimiento (formato yyyy-MM-dd):");
        beneficiario1.setFechaNacimiento(leerTeclado.nextLine());

        System.out.println("Ingrese la fecha de inclusión (formato yyyy-MM-dd):");
        beneficiario1.setFechaInclusion(leerTeclado.nextLine());

        // Mostrando los datos ingresados para ambos objetos
        System.out.println(beneficiario1);
        System.out.println(beneficiario2);


    }

}
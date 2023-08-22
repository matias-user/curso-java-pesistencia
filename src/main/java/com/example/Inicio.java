package com.example;

import java.util.Scanner;

public class Inicio {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        do{
            System.out.println("------------------------------");
            System.out.println("Aplicación de mensajes");
            System.out.println("1. Crear un mensaje");
            System.out.println("2. Listar mensajes");
            System.out.println("3. Editar un mensaje");
            System.out.println("4. Eliminar un mensaje");
            System.out.println("5. Salir");
            System.out.println("------------------------------");
            option = scanner.nextInt();

            switch(option){
                case 1:
                    MensajeService.crearMensaje();
                break;
                case 2:
                    MensajeService.listarMensajes();
                break;
                case 3:
                    MensajeService.editarMensaje();
                break;
                case 4:
                    MensajeService.borrarMensajes();
                break;
                case 5:
                    System.out.println("Hasta la próxima");
                break;
                default:
            }

        }
        while( option != 5 );
    }       
}

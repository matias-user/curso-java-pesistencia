package com.example;

import java.sql.Connection;

public class Inicio {
    public static void main(String[] args){
        Conexion conexion = new Conexion();
        try ( Connection cn = conexion.getConnection() ) {
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}

package com.dh.banco;

import com.dh.banco.service.EmpleadoBanco;
import com.dh.banco.service.impl.Director;
import com.dh.banco.service.impl.EjecutivoCuenta;
import com.dh.banco.service.impl.Gerente;

public class Main {

    public static void main(String[] args) {

        EmpleadoBanco manejadorBase = new EjecutivoCuenta().setSigEmpleadoBanco(new Gerente().setSigEmpleadoBanco(new Director()));

        manejadorBase.procesarSolicitud(78000);

    }
}
   /*PWP:
    EmpleadoBanco empleado1 = new EjecutivoCuenta();
    EmpleadoBanco empleado2 = new Gerente();
    EmpleadoBanco empleado3 = new Director();
    empleado2.setSigEmpleadoBanco(empleado3);
    empleado1.setSigEmpleadoBanco(empleado2);
    empleado1.procesarSolicitud(78000);*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentasbanco;

/**
 *
 * @author ivandavid
 */
public class Cliente {
    private int cedula;
    private String nombre;
    private double saldo;
    private Cuenta cuenta;

    

    public Cliente(int cedula, String nombre, double saldo, Cuenta cuenta ) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.saldo = saldo;
        this.cuenta= cuenta;
    }
    
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
    @Override
    public String toString() {
        return "Cliente{" + "cedula=" + cedula + ", nombre=" + nombre + ", saldo=" + saldo + ", cuenta=" + cuenta.getTipo_cuenta() + '}';
    }
    
    

}


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
public class Cuenta {
    private int nro_cuenta;
    private String tipo_cuenta;
    private int saldo_cuenta;

    public Cuenta(int nro_cuenta, String tipo_cuenta, int saldo_cuenta) {
        this.nro_cuenta = nro_cuenta;
        this.tipo_cuenta = tipo_cuenta;
        this.saldo_cuenta = saldo_cuenta;
    }
    
    public int getNro_cuenta() {
        return nro_cuenta;
    }

    public void setNro_cuenta(int nro_cuenta) {
        this.nro_cuenta = nro_cuenta;
    }

    public String getTipo_cuenta() {
        return tipo_cuenta;
    }

    public void setTipo_cuenta(String tipo_cuenta) {
        this.tipo_cuenta = tipo_cuenta;
    }

    public int getSaldo_cuenta() {
        return saldo_cuenta;
    }

    public void setSaldo_cuenta(int saldo_cuenta) {
        this.saldo_cuenta = saldo_cuenta;
    }
    
    
}

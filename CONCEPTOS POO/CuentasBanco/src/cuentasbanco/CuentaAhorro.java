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
public class CuentaAhorro extends Cuenta{
    private final double INTERES = 0.10;
    /*final - porq no se va a modificar con nada como el pi de daniel*/
    
    public CuentaAhorro(int nro_cuenta, String tipo_cuenta, int saldo_cuenta) {
        super(nro_cuenta, tipo_cuenta, saldo_cuenta);
    }
    
    public double interes(){
    double interesCuenta = INTERES*super.getSaldo_cuenta();
        return interesCuenta;
    }

    public double getINTERES() {
        return INTERES;
    }
}

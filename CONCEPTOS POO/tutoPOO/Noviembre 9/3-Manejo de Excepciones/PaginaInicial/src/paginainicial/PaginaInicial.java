

package paginainicial;

import java.net.*;

public class PaginaInicial {
    String propietario;
    URL direccion;
    String categoria = "ninguna";

    public PaginaInicial(String enPropietario, String enDireccion)
        throws MalformedURLException {
        propietario = enPropietario;
        direccion = new URL(enDireccion);
    }

    public PaginaInicial(String enPropietario, String enDireccion, String enCategoria)
       throws MalformedURLException {
        this(enPropietario, enDireccion);
        categoria = enCategoria;
    }
}

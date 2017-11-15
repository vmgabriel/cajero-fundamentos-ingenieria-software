package cajero;

import view.FrmPrincipal;

/**
 * @author gabriel
 */
public class Cajero {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FrmPrincipal frm = new FrmPrincipal();
        //FrmClave frm = new FrmClave(new EveFrmClave(new Conexion(), new Historial(),new Cuenta(), tar),new FrmError());
        frm.setVisible(true);
    }
}

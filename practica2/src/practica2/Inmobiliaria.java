
package practica2;

import java.util.ArrayList;

public class Inmobiliaria {
        private ArrayList<Propiedad> propiedades;
        
        public Inmobiliaria()
    {
        propiedades = new ArrayList();
    }

    public ArrayList<Propiedad> getPropiedades() {
        return propiedades;
    }
    public void agregarPropiedad(Propiedad p)
    {
        propiedades.add(p);
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}

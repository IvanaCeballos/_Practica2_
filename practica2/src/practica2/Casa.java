
package practica2;

public class Casa extends Propiedad {
     private boolean garaje;

    public Casa(boolean garaje, String direccion, int cantHabitacion, double precio, boolean usoComercial, int cantInquilinos) {
        super(direccion, cantHabitacion, precio, usoComercial, cantInquilinos);
        this.garaje = garaje;
    }

    public boolean isGaraje() {
        return garaje;
    }
     
     @Override
    public double precioAlquiler(){
        double precio = getPrecio();
        if(isUsoComercial())
            precio += 1000;
        return precio;

    }
    @Override
    public String toString()
    {
        return "Casa: Direccion: " + getDireccion();
    }
}




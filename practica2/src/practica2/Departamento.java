
package practica2;

public class Departamento extends Propiedad {
    
    private double expensas;

    public Departamento(double precioExpensas, String direccion, int cantHabitacion, double precio, boolean usoComercial, int cantInquilinos) {
        super(direccion, cantHabitacion, precio, usoComercial, cantInquilinos);
        this.expensas = precioExpensas;
    }
        @Override
    public double precioAlquiler()
    {
        double precio = getPrecio() + expensas;
        
        if(isUsoComercial())
            precio += 500;
        
        return precio;
    }
    public String toString()
    {
        return "Departamento: Direccion: " + getDireccion();
    }
}


    
    

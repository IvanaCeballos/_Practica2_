
package practica2;

public abstract class Propiedad {
    protected String direccion;
    protected int cantHabitacion;
    protected double precio;
    protected boolean usoComercial;
    protected int cantInquilinos;

    public Propiedad(String direccion, int cantHabitacion, double precio, boolean usoComercial, int cantInquilinos) {
        this.direccion = direccion;
        this.cantHabitacion = cantHabitacion;
        this.precio = precio;
        this.usoComercial = usoComercial;
        this.cantInquilinos = cantInquilinos;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getCantHabitacion() {
        return cantHabitacion;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean isUsoComercial() {
        return usoComercial;
    }

    public int getCantInquilinos() {
        return cantInquilinos;
    }
    public abstract double precioAlquiler();   
    
    
}

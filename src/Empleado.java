public class Empleado {
    private String legajo;
    private String nombre;
    private String apellido;
    private String dirección;
    private String fechaDeNacimiento;

    public Empleado(String legajo, String nombre, String apellido, String dirección, String fechaDeNacimiento) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dirección = dirección;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public float calcularSueldo()
    {
        return 0;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "legajo='" + legajo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dirección='" + dirección + '\'' +
                ", fechaDeNacimiento='" + fechaDeNacimiento + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Empleado aux) {
            return this.legajo.equals(aux.legajo);
        }
        return false;

    }
}



import java.util.Objects;

public class Administrador extends Empleado {
    private String area;

    public String getArea()
    {
        return area;
    }

    public Administrador(String legajo, String nombre, String apellido, String dirección, String fechaDeNacimiento, String area) {
        super(legajo, nombre, apellido, dirección, fechaDeNacimiento);
        this.area = area;
    }
    @Override
    public float calcularSueldo()
    {
        return (float) 15000;
    }

    @Override
    public String toString() {
        return "Administrador{" +
                "area='" + area + '\'' +
                '}';
    }

}

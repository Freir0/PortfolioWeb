import java.util.Objects;

public class Vendedor extends Empleado {
    private float montoMensual;
    private float sueldo;

    public Vendedor(String legajo, String nombre, String apellido, String dirección, String fechaDeNacimiento, float montoMensual) {
        super(legajo, nombre, apellido, dirección, fechaDeNacimiento);
        this.montoMensual = montoMensual;
    }

    public float getMontoMensual() {
        return montoMensual;
    }

    public void setMontoMensual(float montoMensual) {
        this.montoMensual = montoMensual;
    }


    @Override
    public float calcularSueldo()
    {
        float sueldo;
        sueldo = (float) (montoMensual * 0.3);
        return sueldo;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "montoMensual=" + montoMensual +
                '}';
    }


}

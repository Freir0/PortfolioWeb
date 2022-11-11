public class Repartidor {
    private String nombre;
    private String apellido;
    private float kmRecorridos;
    private float sueldo;
    private String legajoR;

    private String dirección;

    public Repartidor(String nombre, String apellido, float kmRecorridos, float sueldo, String legajoR, String dirección) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.kmRecorridos = kmRecorridos;
        this.sueldo = sueldo;
        this.legajoR = legajoR;
        this.dirección = dirección;
    }

    public String getLegajoR() {

        return legajoR;
    }

    public float calcularSueldo()
    {
        return this.kmRecorridos*3000;
    }


}

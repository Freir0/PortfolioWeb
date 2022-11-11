import java.util.ArrayList;

public class Empresa {
    private ArrayList<Empleado> listaEmpleados;

    public Empresa() {
        this.listaEmpleados = new ArrayList<>();
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void agregarVendedor(String legajo, String nombre, String apellido, String dirección, String fechaDeNacimiento,float montoMensual) {
        Vendedor vendedor = new Vendedor(legajo,nombre,apellido,dirección,fechaDeNacimiento,montoMensual);
        listaEmpleados.add(vendedor);
    }

    public void agregarAdministrador(String legajo, String nombre, String apellido, String dirección, String fechaDeNacimiento, String area)
    {
        Administrador admin = new Administrador(legajo,nombre,apellido,dirección,fechaDeNacimiento,area);
        listaEmpleados.add(admin);
    }

    public Empleado buscarPorLegajo(String legajo) {
        Empleado aux = null;
        for (int i = 0; i < listaEmpleados.size(); i++) {
            if (this.listaEmpleados.get(i).equals(legajo)) {
                aux = listaEmpleados.get(i);
            }
        }
        return aux;
    }

    public int contarEmpleados()
    {
        int contador=0;
        for (int i = 0; i < listaEmpleados.size(); i++) {
            contador+=contador;
        }
        return contador;
    }

    public void eliminarPorLegajo(String legajo)
    {
        for (int i = 0; i < listaEmpleados.size(); i++) {
            if (this.listaEmpleados.get(i).equals(legajo)) {
               listaEmpleados.remove(i);
            }
        }
    }

    public float sueldosApagar()
    {
        float sueldo = 0;
        for (int i = 0; i < listaEmpleados.size(); i++) {
            sueldo += listaEmpleados.get(i).calcularSueldo();
        }
        return sueldo;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "listaEmpleados=" + listaEmpleados +
                '}';
    }
}


import java.util.ArrayList;

public class Alumnos extends Personas {
    private int cuenta;
    private String carrera;
    private int aniocarrera;
    private int clasesfaltantes;
    private ArrayList <Pruebas> pruebas = new ArrayList();
    private int index;
    
    public Alumnos(String nombre, String apellido, String usuario, String password, int cuenta, String carrera, int aniocarrera, int clasesfaltantes) {
        super(nombre, apellido, usuario, password);
        this.cuenta = cuenta;
        this.carrera = carrera;
        this.aniocarrera = aniocarrera;
        this.clasesfaltantes = clasesfaltantes;
    }

    public ArrayList<Pruebas> getPruebas() {
        return pruebas;
    }

    public void setPruebas(ArrayList<Pruebas> pruebas) {
        this.pruebas = pruebas;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getAniocarrera() {
        return aniocarrera;
    }

    public void setAniocarrera(int aniocarrera) {
        this.aniocarrera = aniocarrera;
    }

    public int getClasesfaltantes() {
        return clasesfaltantes;
    }

    public void setClasesfaltantes(int clasesfaltantes) {
        this.clasesfaltantes = clasesfaltantes;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return super.getNombre()+" "+super.getApellido();
    }
    
}

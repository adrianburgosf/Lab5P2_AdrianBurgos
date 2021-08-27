public class Alumnos extends Personas {
    private int cuenta;
    private String carrera;
    private int aniocarrera;
    private int clasesfaltantes;

    public Alumnos(int cuenta, String carrera, int aniocarrera, int clasesfaltantes, String nombre, String apellido, String usuario, String password) {
        super(nombre, apellido, usuario, password);
        this.cuenta = cuenta;
        this.carrera = carrera;
        this.aniocarrera = aniocarrera;
        this.clasesfaltantes = clasesfaltantes;
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
}

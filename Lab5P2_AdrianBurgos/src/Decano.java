public class Decano extends Personas{
    private String titulacion;
    private String id;
    private int edad;
    private String tituloU;
    private String tituloM;

    public Decano(String nombre, String apellido, String usuario, String password, String titulacion, String id, int edad, String tituloU, String tituloM) {
        super(nombre, apellido, usuario, password);
        this.titulacion = titulacion;
        this.id = id;
        this.edad = edad;
        this.tituloU = tituloU;
        this.tituloM = tituloM;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTituloU() {
        return tituloU;
    }

    public void setTituloU(String tituloU) {
        this.tituloU = tituloU;
    }

    public String getTituloM() {
        return tituloM;
    }

    public void setTituloM(String tituloM) {
        this.tituloM = tituloM;
    }
    
}

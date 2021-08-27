public class Docente extends Personas{
    private String titulacion;
    private String titulacionM;
    private int alumnos;
    private String nombreclase;
    private String clasedesc;

    public Docente(String nombre, String apellido, String usuario, String password, String titulacion, String titulacionM, int alumnos, String nombreclase, String clasedesc) {
        super(nombre, apellido, usuario, password);
        this.titulacion = titulacion;
        this.titulacionM = titulacionM;
        this.alumnos = alumnos;
        this.nombreclase = nombreclase;
        this.clasedesc = clasedesc;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public String getTitulacionM() {
        return titulacionM;
    }

    public void setTitulacionM(String titulacionM) {
        this.titulacionM = titulacionM;
    }

    public int getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(int alumnos) {
        this.alumnos = alumnos;
    }

    public String getNombreclase() {
        return nombreclase;
    }

    public void setNombreclase(String nombreclase) {
        this.nombreclase = nombreclase;
    }

    public String getClasedesc() {
        return clasedesc;
    }

    public void setClasedesc(String clasedesc) {
        this.clasedesc = clasedesc;
    }
    
}

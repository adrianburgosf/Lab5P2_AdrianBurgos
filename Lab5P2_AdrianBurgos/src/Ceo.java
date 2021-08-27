public class Ceo extends Personas{
    private String titulacion;
    private String id;
    private int experiencia;
    private int edad;

    public Ceo(String nombre, String apellido, String usuario, String password, String titulacion, String id, int experiencia, int edad) {
        super(nombre, apellido, usuario, password);
        this.titulacion = titulacion;
        this.id = id;
        this.experiencia = experiencia;
        this.edad = edad;
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

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}

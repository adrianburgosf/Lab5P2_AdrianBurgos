public class Pruebas {
    private String nombre;
    private String apellido;
    private String equipo;
    private String coop;
    private String participacion;
    private String nota;
    private int general;

    public Pruebas(String nombre, String apellido, String equipo, String coop, String participacion, String nota, int general) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.equipo = equipo;
        this.coop = coop;
        this.participacion = participacion;
        this.nota = nota;
        this.general = general;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getCoop() {
        return coop;
    }

    public void setCoop(String coop) {
        this.coop = coop;
    }

    public String getParticipacion() {
        return participacion;
    }

    public void setParticipacion(String participacion) {
        this.participacion = participacion;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public int getGeneral() {
        return general;
    }

    public void setGeneral(int general) {
        this.general = general;
    }
}

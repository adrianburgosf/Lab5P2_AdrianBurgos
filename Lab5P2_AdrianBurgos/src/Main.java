import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRegisterAlumno = new javax.swing.JDialog();
        jPanel9 = new javax.swing.JPanel();
        jLabel77 = new javax.swing.JLabel();
        jR_Nombre = new javax.swing.JTextField();
        jLabel78 = new javax.swing.JLabel();
        jR_Apellido = new javax.swing.JTextField();
        jLabel79 = new javax.swing.JLabel();
        jR_Carrera = new javax.swing.JTextField();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jR_Aniocarrera = new javax.swing.JTextField();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jR_Clasesfaltantes = new javax.swing.JTextField();
        jR_Usuario = new javax.swing.JTextField();
        jregistrarse = new javax.swing.JButton();
        jR_Password = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jR_Cuenta = new javax.swing.JTextField();
        jRegister = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jOpcionesregistro = new javax.swing.JComboBox<>();
        jB_Registrarse = new javax.swing.JButton();
        jRegisterCEO = new javax.swing.JDialog();
        jPanel10 = new javax.swing.JPanel();
        jLabel85 = new javax.swing.JLabel();
        jR_Nombre1 = new javax.swing.JTextField();
        jLabel86 = new javax.swing.JLabel();
        jR_Apellido1 = new javax.swing.JTextField();
        jLabel87 = new javax.swing.JLabel();
        jR_Titulacion = new javax.swing.JTextField();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jR_ID = new javax.swing.JTextField();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jR_Experiencia = new javax.swing.JTextField();
        jR_Usuario1 = new javax.swing.JTextField();
        jregistrarseCEO = new javax.swing.JButton();
        jR_Password1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jR_Edad = new javax.swing.JTextField();
        jRegisterDecano = new javax.swing.JDialog();
        jPanel11 = new javax.swing.JPanel();
        jLabel93 = new javax.swing.JLabel();
        jR_Nombre2 = new javax.swing.JTextField();
        jLabel94 = new javax.swing.JLabel();
        jR_Apellido2 = new javax.swing.JTextField();
        jLabel95 = new javax.swing.JLabel();
        jR_Titulacion1 = new javax.swing.JTextField();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jR_ID1 = new javax.swing.JTextField();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jR_Experiencia1 = new javax.swing.JTextField();
        jR_Usuario2 = new javax.swing.JTextField();
        jregistrarseCEO1 = new javax.swing.JButton();
        jR_Password2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jR_Edad1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jR_EdadD = new javax.swing.JTextField();
        jRegisterDocente = new javax.swing.JDialog();
        jPanel12 = new javax.swing.JPanel();
        jLabel101 = new javax.swing.JLabel();
        jR_Nombre3 = new javax.swing.JTextField();
        jLabel102 = new javax.swing.JLabel();
        jR_Apellido3 = new javax.swing.JTextField();
        jLabel103 = new javax.swing.JLabel();
        jR_Titulacion2 = new javax.swing.JTextField();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jR_ID2 = new javax.swing.JTextField();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jR_Experiencia2 = new javax.swing.JTextField();
        jR_Usuario3 = new javax.swing.JTextField();
        jregistrarseDocente = new javax.swing.JButton();
        jR_Password3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jR_Edad2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jDescripcion = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jd_Login = new javax.swing.JButton();
        jd_Register = new javax.swing.JButton();

        jLabel77.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel77.setText("Password");

        jLabel78.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel78.setText("Nombre");

        jLabel79.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel79.setText("Apellido");

        jLabel80.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel80.setText("Alumno");

        jLabel81.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel81.setText("Carrera");

        jLabel82.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel82.setText("Año de la carrera");

        jLabel83.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel83.setText("Usuario");

        jLabel84.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel84.setText("Cantidad de clases faltantes");

        jregistrarse.setText("Registrarse");
        jregistrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jregistrarseMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("Cuenta");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel83)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jR_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel9Layout.createSequentialGroup()
                                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel77)
                                        .addComponent(jLabel78)
                                        .addComponent(jLabel79)
                                        .addComponent(jLabel81)
                                        .addComponent(jLabel82))
                                    .addGap(18, 18, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                    .addComponent(jLabel84)
                                    .addGap(84, 84, 84)))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(282, 282, 282)))
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jR_Password)
                            .addComponent(jR_Nombre)
                            .addComponent(jR_Apellido)
                            .addComponent(jR_Carrera)
                            .addComponent(jR_Aniocarrera)
                            .addComponent(jR_Clasesfaltantes)
                            .addComponent(jR_Cuenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(jregistrarse))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(jLabel80))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel80, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel83)
                    .addComponent(jR_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel77)
                    .addComponent(jR_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel78)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jR_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel79)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jR_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel81)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jR_Carrera, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel82)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jR_Aniocarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel84, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jR_Clasesfaltantes))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jR_Cuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jregistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout jRegisterAlumnoLayout = new javax.swing.GroupLayout(jRegisterAlumno.getContentPane());
        jRegisterAlumno.getContentPane().setLayout(jRegisterAlumnoLayout);
        jRegisterAlumnoLayout.setHorizontalGroup(
            jRegisterAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jRegisterAlumnoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jRegisterAlumnoLayout.setVerticalGroup(
            jRegisterAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jRegisterAlumnoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel3.setText("Register");

        jOpcionesregistro.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jOpcionesregistro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir tipo de usuario", "CEO", "Decano", "Docente", "Alumno", " " }));

        jB_Registrarse.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jB_Registrarse.setText("OK");
        jB_Registrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_RegistrarseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jRegisterLayout = new javax.swing.GroupLayout(jRegister.getContentPane());
        jRegister.getContentPane().setLayout(jRegisterLayout);
        jRegisterLayout.setHorizontalGroup(
            jRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jRegisterLayout.createSequentialGroup()
                .addGroup(jRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jRegisterLayout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jB_Registrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jRegisterLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jOpcionesregistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jRegisterLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel3)))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jRegisterLayout.setVerticalGroup(
            jRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jRegisterLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addGap(43, 43, 43)
                .addComponent(jOpcionesregistro, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jB_Registrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jLabel85.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel85.setText("Password");

        jLabel86.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel86.setText("Nombre");

        jLabel87.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel87.setText("Apellido");

        jLabel88.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel88.setText("CEO");

        jLabel89.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel89.setText("Titulacion de pregrado");

        jLabel90.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel90.setText("ID");

        jLabel91.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel91.setText("Usuario");

        jLabel92.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel92.setText("Años de experiencia");

        jregistrarseCEO.setText("Registrarse");
        jregistrarseCEO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jregistrarseCEOMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setText("Edad");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel91)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jR_Usuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                                        .addGap(124, 195, Short.MAX_VALUE)
                                        .addComponent(jLabel88)
                                        .addGap(84, 84, 84))
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel85)
                                            .addComponent(jLabel86)
                                            .addComponent(jLabel87)
                                            .addComponent(jLabel89)
                                            .addComponent(jLabel90)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel92))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jR_Password1)
                                    .addComponent(jR_Nombre1)
                                    .addComponent(jR_Apellido1)
                                    .addComponent(jR_Titulacion)
                                    .addComponent(jR_ID)
                                    .addComponent(jR_Experiencia)
                                    .addComponent(jR_Edad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(jregistrarseCEO)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel88, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel91)
                    .addComponent(jR_Usuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel85)
                    .addComponent(jR_Password1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel86)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jR_Nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel87)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jR_Apellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel89)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jR_Titulacion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel90)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jR_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jR_Experiencia, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel92, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jR_Edad, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jregistrarseCEO, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout jRegisterCEOLayout = new javax.swing.GroupLayout(jRegisterCEO.getContentPane());
        jRegisterCEO.getContentPane().setLayout(jRegisterCEOLayout);
        jRegisterCEOLayout.setHorizontalGroup(
            jRegisterCEOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jRegisterCEOLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jRegisterCEOLayout.setVerticalGroup(
            jRegisterCEOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jRegisterCEOLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel93.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel93.setText("Password");

        jLabel94.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel94.setText("Nombre");

        jLabel95.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel95.setText("Apellido");

        jLabel96.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel96.setText("DECANO");

        jLabel97.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel97.setText("Titulacion de pregrado");

        jLabel98.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel98.setText("ID");

        jLabel99.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel99.setText("Usuario");

        jLabel100.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel100.setText("Titulo universitario");

        jregistrarseCEO1.setText("Registrarse");
        jregistrarseCEO1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jregistrarseCEO1MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setText("Titulo de maestria");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setText("Edad");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(0, 244, Short.MAX_VALUE)
                .addComponent(jLabel96)
                .addGap(224, 224, 224))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel99)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jR_Usuario2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel93)
                                    .addComponent(jLabel94)
                                    .addComponent(jLabel95)
                                    .addComponent(jLabel97)
                                    .addComponent(jLabel98)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel100)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jR_Password2)
                                    .addComponent(jR_Nombre2)
                                    .addComponent(jR_Apellido2)
                                    .addComponent(jR_Titulacion1)
                                    .addComponent(jR_ID1)
                                    .addComponent(jR_Experiencia1)
                                    .addComponent(jR_Edad1, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                    .addComponent(jR_EdadD)))))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(jregistrarseCEO1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel96, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel99)
                    .addComponent(jR_Usuario2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel93)
                    .addComponent(jR_Password2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel94)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jR_Nombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel95)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jR_Apellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel97)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jR_Titulacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel98)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jR_ID1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jR_Experiencia1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel100, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jR_Edad1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jR_EdadD, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jregistrarseCEO1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout jRegisterDecanoLayout = new javax.swing.GroupLayout(jRegisterDecano.getContentPane());
        jRegisterDecano.getContentPane().setLayout(jRegisterDecanoLayout);
        jRegisterDecanoLayout.setHorizontalGroup(
            jRegisterDecanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jRegisterDecanoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jRegisterDecanoLayout.setVerticalGroup(
            jRegisterDecanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jRegisterDecanoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel101.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel101.setText("Password");

        jLabel102.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel102.setText("Nombre");

        jLabel103.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel103.setText("Apellido");

        jLabel104.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel104.setText("DOCENTE");

        jLabel105.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel105.setText("Titulacion de pregrado");

        jLabel106.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel106.setText("Titulacion de maestria");

        jLabel107.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel107.setText("Usuario");

        jLabel108.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel108.setText("Cantidad de alumnos");

        jregistrarseDocente.setText("Registrarse");
        jregistrarseDocente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jregistrarseDocenteMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel7.setText("Nombre de la clase");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel8.setText("Descripcion de la clase");

        jDescripcion.setColumns(20);
        jDescripcion.setRows(5);
        jScrollPane1.setViewportView(jDescripcion);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel107)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jR_Usuario3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel101)
                                    .addComponent(jLabel102)
                                    .addComponent(jLabel103)
                                    .addComponent(jLabel105)
                                    .addComponent(jLabel106)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel108)
                                    .addGroup(jPanel12Layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel8)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jR_Password3)
                                        .addComponent(jR_Nombre3)
                                        .addComponent(jR_Apellido3)
                                        .addComponent(jR_Titulacion2)
                                        .addComponent(jR_ID2)
                                        .addComponent(jR_Experiencia2)
                                        .addComponent(jR_Edad2, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12))))))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jregistrarseDocente)
                            .addComponent(jLabel104))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel107)
                    .addComponent(jR_Usuario3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel101)
                    .addComponent(jR_Password3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel102)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jR_Nombre3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel103)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jR_Apellido3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel105)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jR_Titulacion2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel106)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jR_ID2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jR_Experiencia2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel108, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jR_Edad2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                        .addGap(3, 3, 3)))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel8)))
                .addGap(41, 41, 41)
                .addComponent(jregistrarseDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout jRegisterDocenteLayout = new javax.swing.GroupLayout(jRegisterDocente.getContentPane());
        jRegisterDocente.getContentPane().setLayout(jRegisterDocenteLayout);
        jRegisterDocenteLayout.setHorizontalGroup(
            jRegisterDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jRegisterDocenteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jRegisterDocenteLayout.setVerticalGroup(
            jRegisterDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jRegisterDocenteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setText("UNITEC TGU");

        jd_Login.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jd_Login.setText("Login");
        jd_Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jd_LoginMouseClicked(evt);
            }
        });

        jd_Register.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jd_Register.setText("Register");
        jd_Register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jd_RegisterMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jd_Register, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jd_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel1)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(jd_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jd_Register, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jd_LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jd_LoginMouseClicked
        // TODO add your handling code here:
        System.out.println(usuarios);
    }//GEN-LAST:event_jd_LoginMouseClicked

    private void jd_RegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jd_RegisterMouseClicked
        // TODO add your handling code here:
        jRegister.setModal(true);
        jRegister.pack();
        jRegister.setLocationRelativeTo(this);
        this.setVisible(false);
        jRegister.setVisible(true);
        this.setVisible(true);
    }//GEN-LAST:event_jd_RegisterMouseClicked

    private void jregistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jregistrarseMouseClicked
        // TODO add your handling code here:
        String usuario = jR_Usuario.getText();
        String password = jR_Password.getText();
        String nombre = jR_Nombre.getText();
        String apellido = jR_Apellido.getText();
        int cuenta = Integer.parseInt(jR_Cuenta.getText());
        String carrera = jR_Carrera.getText();
        int aniocarrera = Integer.parseInt(jR_Aniocarrera.getText());
        int clasesfaltantes = Integer.parseInt(jR_Clasesfaltantes.getText());
        Alumnos a = new Alumnos(nombre, apellido, usuario, password, cuenta, carrera, aniocarrera, clasesfaltantes);
        usuarios.add(a);
        jR_Usuario.setText("");
        jR_Password.setText("");
        jR_Nombre.setText("");
        jR_Apellido.setText("");
        jR_Carrera.setText("");
        jR_Aniocarrera.setText("");
        jR_Clasesfaltantes.setText("");
        jR_Cuenta.setText("");
        jRegisterAlumno.setVisible(false);
        jRegister.setVisible(false);
    }//GEN-LAST:event_jregistrarseMouseClicked

    private void jB_RegistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_RegistrarseMouseClicked
        // TODO add your handling code here:
        int opcion = jOpcionesregistro.getSelectedIndex();
        switch (opcion) {
            case 1: {
                jRegisterCEO.setModal(true);
                jRegisterCEO.pack();
                jRegisterCEO.setLocationRelativeTo(this);
                jRegisterCEO.setVisible(true);
                break;
            }
            case 2: {
                jRegisterDecano.setModal(true);
                jRegisterDecano.pack();
                jRegisterDecano.setLocationRelativeTo(this);
                jRegisterDecano.setVisible(true);
                break;
            }
            case 3: {
                jRegisterDocente.setModal(true);
                jRegisterDocente.pack();
                jRegisterDocente.setLocationRelativeTo(this);
                jRegisterDocente.setVisible(true);
                break;
            }
            case 4: {
                jRegisterAlumno.setModal(true);
                jRegisterAlumno.pack();
                jRegisterAlumno.setLocationRelativeTo(this);
                jRegisterAlumno.setVisible(true);
                break;
            }
            default: JOptionPane.showMessageDialog(jRegister, "Porfavor ingrese un tipo de usuario");
        }
    }//GEN-LAST:event_jB_RegistrarseMouseClicked

    private void jregistrarseCEOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jregistrarseCEOMouseClicked
        // TODO add your handling code here:
        String usuario = jR_Usuario.getText();
        String password = jR_Password.getText();
        String nombre = jR_Nombre.getText();
        String apellido = jR_Apellido.getText();
        long ID = Integer.parseInt(jR_ID.getText());
        String titulacion = jR_Titulacion.getText();
        int experiencia = Integer.parseInt(jR_Experiencia.getText());
        int edad = Integer.parseInt(jR_Edad.getText());
        Ceo c = new Ceo(nombre, apellido, usuario, password, titulacion, ID, experiencia, edad);
        usuarios.add(c);
        jR_Usuario1.setText("");
        jR_Password1.setText("");
        jR_Nombre1.setText("");
        jR_Apellido1.setText("");
        jR_Titulacion.setText("");
        jR_ID.setText("");
        jR_Experiencia.setText("");
        jR_Edad.setText("");
        jRegisterCEO.setVisible(false);
        jRegister.setVisible(false);
    }//GEN-LAST:event_jregistrarseCEOMouseClicked

    private void jregistrarseCEO1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jregistrarseCEO1MouseClicked
        // TODO add your handling code here:
        String usuario = jR_Usuario2.getText();
        String password = jR_Password2.getText();
        String nombre = jR_Nombre2.getText();
        String apellido = jR_Apellido2.getText();
        long ID = Integer.parseInt(jR_ID1.getText());
        String titulacion = jR_Titulacion1.getText();
        String tituloU = jR_Experiencia1.getText();
        String tituloM = jR_Edad1.getText();
        int edad = Integer.parseInt(jR_EdadD.getText());
        Decano d = new Decano(nombre, apellido, usuario, password, titulacion, ID, edad, tituloU, tituloM);
        usuarios.add(d);
        jR_Usuario2.setText("");
        jR_Password2.setText("");
        jR_Nombre2.setText("");
        jR_Apellido2.setText("");
        jR_Titulacion1.setText("");
        jR_ID1.setText("");
        jR_Experiencia1.setText("");
        jR_Edad1.setText("");
        jRegister.setVisible(false);
        jRegisterDecano.setVisible(false);
    }//GEN-LAST:event_jregistrarseCEO1MouseClicked

    private void jregistrarseDocenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jregistrarseDocenteMouseClicked
        // TODO add your handling code here:
        String usuario = jR_Usuario3.getText();
        String password = jR_Password3.getText();
        String nombre = jR_Nombre3.getText();
        String apellido = jR_Apellido3.getText();
        String titulacionM = jR_ID2.getText();
        String titulacion = jR_Titulacion2.getText();
        int alumnos = Integer.parseInt(jR_Experiencia2.getText());
        String nombreclase = jR_Edad2.getText();
        String descripcion = jDescripcion.getText();
        Docente dc = new Docente(nombre, apellido, usuario, password, titulacion, titulacionM, alumnos, nombreclase, descripcion);
        usuarios.add(dc);
        jR_Usuario3.setText("");
        jR_Password3.setText("");
        jR_Nombre3.setText("");
        jR_Apellido3.setText("");
        jR_Titulacion2.setText("");
        jR_ID2.setText("");
        jR_Experiencia2.setText("");
        jR_Edad2.setText("");
        jRegister.setVisible(false);
        jRegisterDocente.setVisible(false);
    }//GEN-LAST:event_jregistrarseDocenteMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    
    public ArrayList <Personas> usuarios = new ArrayList();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_Registrarse;
    private javax.swing.JTextArea jDescripcion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JComboBox<String> jOpcionesregistro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jR_Aniocarrera;
    private javax.swing.JTextField jR_Apellido;
    private javax.swing.JTextField jR_Apellido1;
    private javax.swing.JTextField jR_Apellido2;
    private javax.swing.JTextField jR_Apellido3;
    private javax.swing.JTextField jR_Carrera;
    private javax.swing.JTextField jR_Clasesfaltantes;
    private javax.swing.JTextField jR_Cuenta;
    private javax.swing.JTextField jR_Edad;
    private javax.swing.JTextField jR_Edad1;
    private javax.swing.JTextField jR_Edad2;
    private javax.swing.JTextField jR_EdadD;
    private javax.swing.JTextField jR_Experiencia;
    private javax.swing.JTextField jR_Experiencia1;
    private javax.swing.JTextField jR_Experiencia2;
    private javax.swing.JTextField jR_ID;
    private javax.swing.JTextField jR_ID1;
    private javax.swing.JTextField jR_ID2;
    private javax.swing.JTextField jR_Nombre;
    private javax.swing.JTextField jR_Nombre1;
    private javax.swing.JTextField jR_Nombre2;
    private javax.swing.JTextField jR_Nombre3;
    private javax.swing.JTextField jR_Password;
    private javax.swing.JTextField jR_Password1;
    private javax.swing.JTextField jR_Password2;
    private javax.swing.JTextField jR_Password3;
    private javax.swing.JTextField jR_Titulacion;
    private javax.swing.JTextField jR_Titulacion1;
    private javax.swing.JTextField jR_Titulacion2;
    private javax.swing.JTextField jR_Usuario;
    private javax.swing.JTextField jR_Usuario1;
    private javax.swing.JTextField jR_Usuario2;
    private javax.swing.JTextField jR_Usuario3;
    private javax.swing.JDialog jRegister;
    private javax.swing.JDialog jRegisterAlumno;
    private javax.swing.JDialog jRegisterCEO;
    private javax.swing.JDialog jRegisterDecano;
    private javax.swing.JDialog jRegisterDocente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jd_Login;
    private javax.swing.JButton jd_Register;
    private javax.swing.JButton jregistrarse;
    private javax.swing.JButton jregistrarseCEO;
    private javax.swing.JButton jregistrarseCEO1;
    private javax.swing.JButton jregistrarseDocente;
    // End of variables declaration//GEN-END:variables
}

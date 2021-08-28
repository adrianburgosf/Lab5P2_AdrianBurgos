import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultListModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class Main extends javax.swing.JFrame {
    private int currentuser;
    
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
        jLogin = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jUsuario = new javax.swing.JTextField();
        jPassword = new javax.swing.JPasswordField();
        jEnter = new javax.swing.JButton();
        jDocente = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jAlumnos = new javax.swing.JList<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jEquipo = new javax.swing.JTextField();
        jCoop = new javax.swing.JTextField();
        jParticipacion = new javax.swing.JTextField();
        jNota = new javax.swing.JTextField();
        jGeneral = new javax.swing.JSpinner();
        jAplicar = new javax.swing.JButton();
        jAlumno = new javax.swing.JDialog();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPruebas = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel109 = new javax.swing.JLabel();
        jM_Carrera = new javax.swing.JTextField();
        jLabel110 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jM_Aniocarrera = new javax.swing.JTextField();
        jLabel111 = new javax.swing.JLabel();
        jM_Cuenta = new javax.swing.JTextField();
        jLabel113 = new javax.swing.JLabel();
        jM_Nombre = new javax.swing.JTextField();
        jM_Clasesfaltantes = new javax.swing.JTextField();
        jLabel114 = new javax.swing.JLabel();
        jM_Apellido = new javax.swing.JTextField();
        jModificar_alumno = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jDecano = new javax.swing.JDialog();
        jScrollPane4 = new javax.swing.JScrollPane();
        jDecanoalum = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jDecanodocente = new javax.swing.JList<>();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPopupMenu = new javax.swing.JPopupMenu();
        jListar = new javax.swing.JMenuItem();
        jModificar = new javax.swing.JMenuItem();
        jEliminar = new javax.swing.JMenuItem();
        jDialog1 = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        jLabel112 = new javax.swing.JLabel();
        jM_Carrera1 = new javax.swing.JTextField();
        jLabel115 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jM_Aniocarrera1 = new javax.swing.JTextField();
        jLabel116 = new javax.swing.JLabel();
        jM_Cuenta1 = new javax.swing.JTextField();
        jLabel117 = new javax.swing.JLabel();
        jM_Nombre1 = new javax.swing.JTextField();
        jM_Clasesfaltantes1 = new javax.swing.JTextField();
        jLabel118 = new javax.swing.JLabel();
        jM_Apellido1 = new javax.swing.JTextField();
        jModificar_alumno1 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
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

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel9.setText("Login");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel10.setText("Usuario");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel11.setText("Contraseña");

        jEnter.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jEnter.setText("Enter");
        jEnter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jEnterMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel9)
                        .addComponent(jPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                        .addComponent(jUsuario))
                    .addComponent(jEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel9)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jUsuario))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jLoginLayout = new javax.swing.GroupLayout(jLogin.getContentPane());
        jLogin.getContentPane().setLayout(jLoginLayout);
        jLoginLayout.setHorizontalGroup(
            jLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jLoginLayout.setVerticalGroup(
            jLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jAlumnos.setModel(new DefaultListModel());
        jScrollPane2.setViewportView(jAlumnos);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel12.setText("Aplicar Prueba");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setText("Trabajo en equipo");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setText("Cooperacion");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel15.setText("Participacion");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel16.setText("Evaluacion de nota");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel17.setText("Evaluacion general");

        jAplicar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jAplicar.setText("Aplicar");
        jAplicar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jAplicarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel12))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jNota))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jEquipo)
                                    .addComponent(jCoop)
                                    .addComponent(jParticipacion, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jAplicar)
                                    .addComponent(jLabel17))
                                .addGap(35, 35, 35)
                                .addComponent(jGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel12)
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jCoop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jParticipacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jAplicar)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout jDocenteLayout = new javax.swing.GroupLayout(jDocente.getContentPane());
        jDocente.getContentPane().setLayout(jDocenteLayout);
        jDocenteLayout.setHorizontalGroup(
            jDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDocenteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDocenteLayout.setVerticalGroup(
            jDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDocenteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPruebas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre del docente", "Apellido del docente", "Trabajo en equipo", "Cooperacion", "Participacion", "Nota", "Evaluacion general"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jPruebas);

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel18.setText("Pruebas");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(332, 332, 332)
                .addComponent(jLabel18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Ver Pruebas", jPanel4);

        jLabel109.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel109.setText("Apellido");

        jLabel110.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel110.setText("Carrera");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel19.setText("Cuenta");

        jLabel111.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel111.setText("Año de la carrera");

        jLabel113.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel113.setText("Cantidad de clases faltantes");

        jLabel114.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel114.setText("Nombre");

        jModificar_alumno.setText("OK");
        jModificar_alumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jModificar_alumnoMouseClicked(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel20.setText("Modificar Cuenta");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(jLabel20))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(341, 341, 341)
                        .addComponent(jModificar_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(323, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(118, 118, 118)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel114)
                                    .addComponent(jLabel109)
                                    .addComponent(jLabel110)
                                    .addComponent(jLabel111))
                                .addGap(18, 18, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel113)
                                .addGap(84, 84, 84)))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel19)
                            .addGap(282, 282, 282)))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jM_Nombre)
                        .addComponent(jM_Apellido)
                        .addComponent(jM_Carrera)
                        .addComponent(jM_Aniocarrera)
                        .addComponent(jM_Clasesfaltantes)
                        .addComponent(jM_Cuenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(118, 118, 118)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 336, Short.MAX_VALUE)
                .addComponent(jModificar_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(109, 109, 109)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel114)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jM_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1, 1, 1)))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel109)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jM_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1, 1, 1)))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel110)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jM_Carrera, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1, 1, 1)))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel111)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jM_Aniocarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1, 1, 1)))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel113, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jM_Clasesfaltantes))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jM_Cuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                        .addComponent(jLabel19))
                    .addGap(116, 116, 116)))
        );

        jTabbedPane2.addTab("Modificar", jPanel5);

        javax.swing.GroupLayout jAlumnoLayout = new javax.swing.GroupLayout(jAlumno.getContentPane());
        jAlumno.getContentPane().setLayout(jAlumnoLayout);
        jAlumnoLayout.setHorizontalGroup(
            jAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jAlumnoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        jAlumnoLayout.setVerticalGroup(
            jAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jAlumnoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        jDecanoalum.setModel(new DefaultListModel());
        jDecanoalum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDecanoalumMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jDecanoalum);

        jDecanodocente.setModel(new DefaultListModel());
        jScrollPane5.setViewportView(jDecanodocente);

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel21.setText("Alumnos que han");

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel22.setText("Docentes");

        jLabel23.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel23.setText("DECANO");

        jLabel24.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel24.setText(" realizado prueba");

        javax.swing.GroupLayout jDecanoLayout = new javax.swing.GroupLayout(jDecano.getContentPane());
        jDecano.getContentPane().setLayout(jDecanoLayout);
        jDecanoLayout.setHorizontalGroup(
            jDecanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDecanoLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(jDecanoLayout.createSequentialGroup()
                .addGroup(jDecanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDecanoLayout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jLabel23))
                    .addGroup(jDecanoLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(jDecanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addGroup(jDecanoLayout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel22)))))
                .addGap(129, 129, 129))
        );
        jDecanoLayout.setVerticalGroup(
            jDecanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDecanoLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addGap(18, 18, 18)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDecanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel22))
                .addGap(18, 18, 18)
                .addGroup(jDecanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addGap(25, 25, 25))
        );

        jListar.setText("Listar");
        jPopupMenu.add(jListar);

        jModificar.setText("Modificar");
        jModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jModificarActionPerformed(evt);
            }
        });
        jPopupMenu.add(jModificar);

        jEliminar.setText("Eliminar");
        jEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEliminarActionPerformed(evt);
            }
        });
        jPopupMenu.add(jEliminar);

        jLabel112.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel112.setText("Apellido");

        jLabel115.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel115.setText("Carrera");

        jLabel25.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel25.setText("Cuenta");

        jLabel116.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel116.setText("Año de la carrera");

        jLabel117.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel117.setText("Cantidad de clases faltantes");

        jLabel118.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel118.setText("Nombre");

        jModificar_alumno1.setText("OK");
        jModificar_alumno1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jModificar_alumno1MouseClicked(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel26.setText("Modificar Cuenta");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(jLabel26))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(341, 341, 341)
                        .addComponent(jModificar_alumno1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(323, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(118, 118, 118)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel118)
                                    .addComponent(jLabel112)
                                    .addComponent(jLabel115)
                                    .addComponent(jLabel116))
                                .addGap(18, 18, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel117)
                                .addGap(84, 84, 84)))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel25)
                            .addGap(282, 282, 282)))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jM_Nombre1)
                        .addComponent(jM_Apellido1)
                        .addComponent(jM_Carrera1)
                        .addComponent(jM_Aniocarrera1)
                        .addComponent(jM_Clasesfaltantes1)
                        .addComponent(jM_Cuenta1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(118, 118, 118)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 336, Short.MAX_VALUE)
                .addComponent(jModificar_alumno1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(109, 109, 109)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel118)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(jM_Nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1, 1, 1)))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel112)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(jM_Apellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1, 1, 1)))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel115)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(jM_Carrera1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1, 1, 1)))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel116)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(jM_Aniocarrera1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1, 1, 1)))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel117, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jM_Clasesfaltantes1))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jM_Cuenta1, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                        .addComponent(jLabel25))
                    .addGap(116, 116, 116)))
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDialog1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDialog1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
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
        DefaultTableModel model = (DefaultTableModel) jPruebas.getModel();
        model.setRowCount(0);
        jLogin.setModal(true);        
        jLogin.pack();  
        jLogin.setLocationRelativeTo(this);
        this.setVisible(false);
        jLogin.setVisible(true);
        this.setVisible(true);
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
        String usuario = jR_Usuario1.getText();
        String password = jR_Password1.getText();
        String nombre = jR_Nombre1.getText();
        String apellido = jR_Apellido1.getText();
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

    private void jEnterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jEnterMouseClicked
        // TODO add your handling code here:
        boolean flag = false;
        for (int i = 0; i < usuarios.size(); i++) {
            if (jUsuario.getText().equals(usuarios.get(i).getUsuario()) &&
                    jPassword.getText().equals(usuarios.get(i).getPassword())) {
                currentuser = i;
                jUsuario.setText("");
                jPassword.setText("");
                jLogin.setVisible(false);
                checkuser(i);
                flag = true;
            }
        }
        if (!flag) {
            JOptionPane.showMessageDialog(jLogin, "Usuario no encontrado, o no hay usuarios existentes");
            jUsuario.setText("");
            jPassword.setText("");
        }
    }//GEN-LAST:event_jEnterMouseClicked

    private void jAplicarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAplicarMouseClicked
        // TODO add your handling code here:
        ArrayList alum = new ArrayList();
        for (int j = 0; j < usuarios.size(); j++) {
            for (int i = 0; i < usuarios.size(); i++) {
                if (usuarios.get(i) instanceof Alumnos) {
                    alum.add(usuarios.get(i));
                }
            }
        }
        Object temp = alum.get(jAlumnos.getSelectedIndex());
        
        for (int i = 0; i < usuarios.size(); i++) {
            if (temp.equals(usuarios.get(i))) {
                Pruebas p = new Pruebas(usuarios.get(currentuser).getNombre(), usuarios.get(currentuser).getApellido(),
                jEquipo.getText(), jCoop.getText(), jParticipacion.getText(), jNota.getText(), (Integer)jGeneral.getValue());
                ((Alumnos)usuarios.get(i)).getPruebas().add(p);
                JOptionPane.showMessageDialog(jDocente, "Se aplico la prueba con exito");
            }
        }
    }//GEN-LAST:event_jAplicarMouseClicked

    private void jModificar_alumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jModificar_alumnoMouseClicked
        // TODO add your handling code here:
        ((Alumnos)usuarios.get(currentuser)).setNombre(jM_Nombre.getText());
        ((Alumnos)usuarios.get(currentuser)).setApellido(jM_Apellido.getText());
        ((Alumnos)usuarios.get(currentuser)).setCarrera(jM_Carrera.getText());
        ((Alumnos)usuarios.get(currentuser)).setAniocarrera(Integer.parseInt(jM_Aniocarrera.getText()));
        ((Alumnos)usuarios.get(currentuser)).setClasesfaltantes(Integer.parseInt(jM_Clasesfaltantes.getText()));
        ((Alumnos)usuarios.get(currentuser)).setCuenta(Integer.parseInt(jM_Cuenta.getText()));
        setModificaciones();
    }//GEN-LAST:event_jModificar_alumnoMouseClicked

    private void jDecanoalumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDecanoalumMouseClicked
        // TODO add your handling code here:
        if (jDecanoalum.getSelectedIndex() >= 0) {
            if (evt.isMetaDown()) {
                jPopupMenu.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_jDecanoalumMouseClicked

    private void jEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEliminarActionPerformed
        // TODO add your handling code here:
        if (jDecanoalum.getSelectedIndex() >= 0) {
            ArrayList alum = new ArrayList();
            for (int j = 0; j < usuarios.size(); j++) {
                for (int i = 0; i < usuarios.size(); i++) {
                    if (usuarios.get(i) instanceof Alumnos) {
                        alum.add(usuarios.get(i));
                    }
                }
            }
            Object temp = alum.get(jDecanoalum.getSelectedIndex());
            for (int i = 0; i < usuarios.size(); i++) {
                if (temp.equals(usuarios.get(i))) {
                    usuarios.remove(i);
                }
            }
            JOptionPane.showMessageDialog(this, "Eliminado exitosamente");
        }
        listardecano();
    }//GEN-LAST:event_jEliminarActionPerformed

    private void jModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jModificarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jModificarActionPerformed

    private void jModificar_alumno1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jModificar_alumno1MouseClicked
        // TODO add your handling code here:
        jDialog1.setModal(true);
        jDialog1.pack();
        jDialog1.setLocationRelativeTo(this);
        jDialog1.setVisible(true);
    }//GEN-LAST:event_jModificar_alumno1MouseClicked

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
    
    public void checkuser(int i) {
        if (usuarios.get(i) instanceof Ceo) {
            
        }
        else if (usuarios.get(i) instanceof Decano) {
            jDecano.setModal(true);
            jDecano.pack();
            jDecano.setLocationRelativeTo(this);
            listardecano();
            jDecano.setVisible(true);
        }
        else if (usuarios.get(i) instanceof Docente) {
            jDocente.setModal(true);
            jDocente.pack();
            jDocente.setLocationRelativeTo(this);
            listar_alumnos();
            jDocente.setVisible(true);
        } 
        else {
            jAlumno.setModal(true);
            jAlumno.pack();
            jAlumno.setLocationRelativeTo(this);
            listar_pruebas();
            setModificaciones();
            jTabbedPane2.setSelectedIndex(0);
            jAlumno.setVisible(true);
        }
    }
    
    public void listar_alumnos() {
        DefaultListModel modelo = (DefaultListModel) jAlumnos.getModel();
        modelo.removeAllElements();
        modelo.clear();
        jAlumnos.removeAll();
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i) instanceof Alumnos) {
                modelo.addElement(usuarios.get(i));
                jAlumnos.setModel(modelo);
                ((Alumnos)usuarios.get(i)).setIndex(i);
            }
        }
    }
    
    public void listar_pruebas() {
        for (int i = 0; i < ((Alumnos)usuarios.get(currentuser)).getPruebas().size(); i++) {
            Object[] newrow = {
                ((Alumnos)usuarios.get(currentuser)).getPruebas().get(i).getNombre(),
                ((Alumnos)usuarios.get(currentuser)).getPruebas().get(i).getApellido(),
                ((Alumnos)usuarios.get(currentuser)).getPruebas().get(i).getEquipo(),
                ((Alumnos)usuarios.get(currentuser)).getPruebas().get(i).getCoop(),
                ((Alumnos)usuarios.get(currentuser)).getPruebas().get(i).getParticipacion(),
                ((Alumnos)usuarios.get(currentuser)).getPruebas().get(i).getNota(),
                ((Alumnos)usuarios.get(currentuser)).getPruebas().get(i).getGeneral(),
            };
            DefaultTableModel modelo = (DefaultTableModel) jPruebas.getModel();
            modelo.addRow(newrow);
            jPruebas.setModel(modelo);
        }
    }
    
    public void setModificaciones() {
        jM_Nombre.setText(((Alumnos)usuarios.get(currentuser)).getNombre());
        jM_Apellido.setText(((Alumnos)usuarios.get(currentuser)).getApellido());
        jM_Carrera.setText(((Alumnos)usuarios.get(currentuser)).getCarrera());
        jM_Aniocarrera.setText(""+((Alumnos)usuarios.get(currentuser)).getAniocarrera());
        jM_Clasesfaltantes.setText(""+((Alumnos)usuarios.get(currentuser)).getClasesfaltantes());
        jM_Cuenta.setText(""+((Alumnos)usuarios.get(currentuser)).getCuenta());
    }
    
    public void listardecano() {
        DefaultListModel modelo = (DefaultListModel) jDecanoalum.getModel();
        modelo.removeAllElements();
        modelo.clear();
        jDecanoalum.removeAll();
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i) instanceof Alumnos) {
                modelo.addElement(usuarios.get(i));
                jDecanoalum.setModel(modelo);
                ((Alumnos)usuarios.get(i)).setIndex(i);
            }
        }
        DefaultListModel modelod = (DefaultListModel) jDecanodocente.getModel();
        modelod.removeAllElements();
        modelod.clear();
        jDecanodocente.removeAll();
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i) instanceof Docente) {
                modelod.addElement(usuarios.get(i));
                jDecanodocente.setModel(modelod);
                ((Docente)usuarios.get(i)).setIndex(i);
            }
        }
    }
    
    
    public ArrayList <Personas> usuarios = new ArrayList();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog jAlumno;
    private javax.swing.JList<String> jAlumnos;
    private javax.swing.JButton jAplicar;
    private javax.swing.JButton jB_Registrarse;
    private javax.swing.JTextField jCoop;
    private javax.swing.JDialog jDecano;
    private javax.swing.JList<String> jDecanoalum;
    private javax.swing.JList<String> jDecanodocente;
    private javax.swing.JTextArea jDescripcion;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDocente;
    private javax.swing.JMenuItem jEliminar;
    private javax.swing.JButton jEnter;
    private javax.swing.JTextField jEquipo;
    private javax.swing.JSpinner jGeneral;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
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
    private javax.swing.JLabel jLabel9;
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
    private javax.swing.JMenuItem jListar;
    private javax.swing.JDialog jLogin;
    private javax.swing.JTextField jM_Aniocarrera;
    private javax.swing.JTextField jM_Aniocarrera1;
    private javax.swing.JTextField jM_Apellido;
    private javax.swing.JTextField jM_Apellido1;
    private javax.swing.JTextField jM_Carrera;
    private javax.swing.JTextField jM_Carrera1;
    private javax.swing.JTextField jM_Clasesfaltantes;
    private javax.swing.JTextField jM_Clasesfaltantes1;
    private javax.swing.JTextField jM_Cuenta;
    private javax.swing.JTextField jM_Cuenta1;
    private javax.swing.JTextField jM_Nombre;
    private javax.swing.JTextField jM_Nombre1;
    private javax.swing.JMenuItem jModificar;
    private javax.swing.JButton jModificar_alumno;
    private javax.swing.JButton jModificar_alumno1;
    private javax.swing.JTextField jNota;
    private javax.swing.JComboBox<String> jOpcionesregistro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jParticipacion;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JPopupMenu jPopupMenu;
    private javax.swing.JTable jPruebas;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jUsuario;
    private javax.swing.JButton jd_Login;
    private javax.swing.JButton jd_Register;
    private javax.swing.JButton jregistrarse;
    private javax.swing.JButton jregistrarseCEO;
    private javax.swing.JButton jregistrarseCEO1;
    private javax.swing.JButton jregistrarseDocente;
    // End of variables declaration//GEN-END:variables
}

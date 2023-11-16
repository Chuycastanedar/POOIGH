package _p147_TercerExamenParcial;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import javax.swing.table.*;
import java.awt.event.*;
import java.io.File;
import java.util.ArrayList;

public class App extends JFrame implements ActionListener {
    ArrayList<Jugador> datos;
    JMenuBar menuBar;
    JMenu mnuArchivo, mnuAyuda;
    JMenuItem smnAbrir, smnSalir, smnAcercade, smnGuardar;
    JPanel pnlTabla, pnlDatos;
    JDialog jdlAcercaDe;
    JLabel lblDatos, lblNombre, lblEdad, lblSexo, lblEstadoCivil, lblPuesto, lblSalario;
    JTextField txtNombre, txtEdad, txtSexo, txtEstadoCivil, txtPuesto, txtSalario;
    JScrollPane spane;
    JTable table;
    DefaultTableModel modelo;
    JFileChooser fchArchivo;
    JButton btnAgregar, btnGrabar;
    JPanel pnlBotones;

    public App() {
        super("LIGA DE FUTBOL - Control de Jugadores");

        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        mnuArchivo = new JMenu("- Archivo");
        menuBar.add(mnuArchivo);
        smnAbrir = new JMenuItem("- Abrir");
        smnAbrir.addActionListener(this);
        mnuArchivo.add(smnAbrir);
        smnSalir = new JMenuItem("- Salir");
        smnSalir.addActionListener(this);
        smnGuardar = new JMenuItem("- Guardar");
        mnuArchivo.add(smnGuardar);
        smnGuardar.addActionListener(this);
        mnuArchivo.add(new JSeparator());
        mnuArchivo.add(smnSalir);
        mnuAyuda = new JMenu("- Ayuda");
        menuBar.add(mnuAyuda);
        smnAcercade = new JMenuItem("- Acerca de...");
        mnuAyuda.add(smnAcercade);
        smnAcercade.addActionListener(this);
        jdlAcercaDe = new JDialog(this, "- Acerca de...");
        jdlAcercaDe.setSize(320, 120);
        jdlAcercaDe.setLocationRelativeTo(null);
        lblDatos = new JLabel("<html>MATERIA: Programación Orientada a Objetos I<br>ACTIVIDAD: Tercer Exámen Parcial<br>ALUMNO: José de Jesús Castañeda Rodarte</html>",
                JLabel.CENTER);
        jdlAcercaDe.add(lblDatos);

        setLayout(new GridLayout(3, 1, 0, 0));

        pnlTabla = new JPanel();
        pnlTabla.setLayout(new BoxLayout(pnlTabla, BoxLayout.X_AXIS));
        add(pnlTabla);
        spane = new JScrollPane();
        spane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        pnlTabla.add(spane);
        table = new JTable();
        table.getTableHeader().setBackground(Color.BLUE);
        table.getTableHeader().setForeground(Color.white);
        spane.setViewportView(table);

        modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[] { "NOMBRE", "EDAD", "SEXO", "ESTADO CIVIL", "DESCRIPCIÓN", "SALARIO" });
        table.setModel(modelo);
        table.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                int ren = table.rowAtPoint(e.getPoint());
                mostrarDatos(ren);
            }
        });

        pnlDatos = new JPanel();
        getContentPane().add(pnlDatos);
        pnlDatos.setLayout(new GridLayout(3, 3, 0, 0));
        lblNombre = new JLabel("NOMBRE: ");
        lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNombre = new JTextField();
        pnlDatos.add(lblNombre);
        pnlDatos.add(txtNombre);
        lblEdad = new JLabel("EDAD: ");
        lblEdad.setHorizontalAlignment(SwingConstants.RIGHT);
        txtEdad = new JTextField();
        pnlDatos.add(lblEdad);
        pnlDatos.add(txtEdad);
        lblSexo = new JLabel("SEXO: ");
        lblSexo.setHorizontalAlignment(SwingConstants.RIGHT);
        txtSexo = new JTextField();
        pnlDatos.add(lblSexo);
        pnlDatos.add(txtSexo);
        lblEstadoCivil = new JLabel("ESTADO CIVIL: ");
        lblEstadoCivil.setHorizontalAlignment(SwingConstants.RIGHT);
        txtEstadoCivil = new JTextField();
        pnlDatos.add(lblEstadoCivil);
        pnlDatos.add(txtEstadoCivil);
        lblPuesto = new JLabel("PUESTO: ");
        lblPuesto.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPuesto = new JTextField();
        pnlDatos.add(lblPuesto);
        pnlDatos.add(txtPuesto);
        lblSalario = new JLabel("SALARIO: ");
        lblSalario.setHorizontalAlignment(SwingConstants.RIGHT);
        txtSalario = new JTextField();
        pnlDatos.add(lblSalario);
        pnlDatos.add(txtSalario);

        pnlBotones = new JPanel();
        pnlBotones.setLayout(new GridLayout(2, 5, 0, 0));
        btnAgregar = new JButton("AGREGAR: ");
        btnAgregar.addActionListener(this);
        pnlBotones.add(btnAgregar);
        btnGrabar = new JButton("GRABAR: ");
        btnGrabar.setEnabled(false);
        btnGrabar.addActionListener(this);
        pnlBotones.add(btnGrabar);
        add(pnlBotones);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == smnSalir) {
            dispose();

        } else if (e.getSource() == smnAcercade) {
            jdlAcercaDe.setVisible(true);
        } else if (e.getSource() == smnAbrir) {
            fchArchivo = new JFileChooser();
            fchArchivo.setCurrentDirectory(new File("."));
            fchArchivo.setFileFilter(new FileNameExtensionFilter("Archivos de datos(.dat)", new String[] { "dat" }));
            int res = fchArchivo.showOpenDialog(null);
            File archivo = fchArchivo.getSelectedFile();
            if (res == JFileChooser.APPROVE_OPTION) {
                File arch = fchArchivo.getSelectedFile();
                try {
                    datos = Util.desSerializarDatos(arch.getName());
                    this.cargarDatos();
                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(this, "Error al procesar el archivo...", "Error...",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        } else if (e.getSource() == smnGuardar) {
            fchArchivo = new JFileChooser();
            fchArchivo.setFileFilter(new FileNameExtensionFilter("Archivos de datos(.dat)", new String[] { "dat" }));
            fchArchivo.setCurrentDirectory(new File("."));
            int res = fchArchivo.showSaveDialog(this);
            File archivo = fchArchivo.getSelectedFile();
            if (res == JFileChooser.APPROVE_OPTION) {
                File arch = fchArchivo.getSelectedFile();
                try {
                    Util.serializarDatos(arch.getName(), datos);
                    JOptionPane.showMessageDialog(this, "Datos Grabados en : " +
                            arch.getName(), "Correcto...", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(this, "Error al procesar el archivo...", "Error...",
                            JOptionPane.ERROR_MESSAGE);
                }
            }

        } else if (e.getSource() == btnAgregar) {
            activarCampos(true);
            limpiarCampos();
            txtNombre.requestFocus();
            btnAgregar.setEnabled(false);
            btnGrabar.setEnabled(true);
        } else if (e.getSource() == btnGrabar) {
            guardarCampos();
            limpiarCampos();
            activarCampos(false);
            btnGrabar.setEnabled(false);
            btnAgregar.setEnabled(true);
        }
    }

    public void cargarDatos() {
        DefaultTableModel dm = (DefaultTableModel) table.getModel();
        while(dm.getRowCount()>0) dm.removeRow(0);
        Object[] obj = new Object[6];
        for (int i = 0; i < datos.size(); i++) {
            obj[0] = datos.get(i).getNombre();
            obj[1] = datos.get(i).getEdad();
            obj[2] = datos.get(i).getSexo();
            obj[3] = datos.get(i).getEstadoCivil();
            obj[4] = datos.get(i).getPuesto();
            obj[5] = datos.get(i).getSalario();
            modelo.addRow(obj);
        }
    }

    public void mostrarDatos(int ren) {
        txtNombre.setText(datos.get(ren).getNombre());
        txtEdad.setText(Integer.toString((datos.get(ren).getEdad())));
        txtSexo.setText(Character.toString(datos.get(ren).getSexo()));
        txtEstadoCivil.setText(datos.get(ren).getEstadoCivil());
        txtPuesto.setText(datos.get(ren).getPuesto());
        txtSalario.setText(Double.toString((datos.get(ren).getSalario())));
    }

    public void activarCampos(boolean actdes) {
        for (Component cp : pnlDatos.getComponents())
            if (cp instanceof JTextField)
                cp.setEnabled(actdes);
    }

    public void limpiarCampos() {
        for (Component cp : pnlDatos.getComponents())
            if (cp instanceof JTextField)

                ((JTextField) cp).setText("");

    }

    public void guardarCampos() {
        Jugador juga = new Jugador();
        juga.setNombre(txtNombre.getText());
        juga.setEdad(Integer.parseInt(txtEdad.getText()));
        juga.setSexo(txtSexo.getText().charAt(0));
        juga.setEstadoCivil(txtEstadoCivil.getText());
        juga.setPuesto(txtPuesto.getText());
        juga.setSalario(Double.parseDouble(txtSalario.getText()));
        datos.add(juga);
        cargarDatos();
    }

    public static void main(String[] args) {
        App app = new App();
        app.setBounds(20, 20, 700, 450);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.datos = Util.inicializarDatos();
        app.cargarDatos();
        app.activarCampos(false);
    }
}
package _p144_Temperaturas;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;

public class _p144_Temperaturas extends JFrame implements ActionListener, ChangeListener {
    JPanel p1;
    JLabel lblFahrenheit, lblCelcius;
    JTextField txtFahrenheit, txtCelcius;
    ButtonGroup grpOpciones;
    JRadioButton rbtFAH_a_CE, rbtCE_a_FAH;
    JButton btnCalcular, btnSalir;

    public _p144_Temperaturas() {
        super("CONVERTIR GRADOS >> FAHREIT - CELCIUS");
        setLayout(new FlowLayout());

        p1 = new JPanel();
        p1.setLayout(new GridLayout(5, 2));

        lblFahrenheit = new JLabel("FAHRENHEIT: ", JLabel.RIGHT); p1.add(lblFahrenheit);
        txtFahrenheit = new JTextField(); p1.add(txtFahrenheit);
        lblCelcius = new JLabel("CELCIUS: ", JLabel.RIGHT); p1.add(lblCelcius);
        txtCelcius = new JTextField(); p1.add(txtCelcius);

        grpOpciones = new ButtonGroup();
        rbtFAH_a_CE = new JRadioButton("FAHRENHEIT A CELCIUS");
        rbtCE_a_FAH = new JRadioButton("CELCIUS A FAHRENHEIT");
        grpOpciones.add(rbtFAH_a_CE); grpOpciones.add(rbtCE_a_FAH);
        p1.add(rbtFAH_a_CE); p1.add(rbtCE_a_FAH);

        add(p1);

        btnCalcular = new JButton("Aceptar"); add(btnCalcular);
        btnSalir = new JButton("Salir"); add(btnSalir);

        rbtFAH_a_CE.addChangeListener(this);
        rbtCE_a_FAH.addChangeListener(this);

        btnCalcular.addActionListener(this);
        btnSalir.addActionListener(this);
    }

    public void stateChanged(ChangeEvent e) {
        txtFahrenheit.setEnabled(true);
        txtCelcius.setEnabled(true);
        if (rbtFAH_a_CE.isSelected())
            txtCelcius.setEnabled(false);
        else if (rbtCE_a_FAH.isSelected())
            txtFahrenheit.setEnabled(false);
    }

    public void actionPerformed(ActionEvent e) {
        double Fahrenheit, Celcius;
        if (e.getSource() == btnCalcular) {
            try {
                if (rbtFAH_a_CE.isSelected()) {
                    Fahrenheit = Float.parseFloat(txtFahrenheit.getText());
                    Celcius = (Fahrenheit - 32 ) * (0.55555556);
                    txtCelcius.setText(String.format("%.2f", Celcius));
                } else if (rbtCE_a_FAH.isSelected()) {
                    Celcius = Float.parseFloat(txtCelcius.getText());
                    Fahrenheit = (Celcius * 1.8 ) + 32; 
                    txtFahrenheit.setText(String.format("%.2f", Fahrenheit));
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Faltan valores",
                "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == btnSalir) {
            dispose();
        }
    }

    public static void main(String[] args) {
        _p144_Temperaturas app = new _p144_Temperaturas();
        app.setBounds(10, 10, 400, 200);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
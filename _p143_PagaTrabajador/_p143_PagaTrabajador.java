package _p143_PagaTrabajador;
import javax.swing.*;
import java.awt.event.*;

public class _p143_PagaTrabajador extends JFrame implements ActionListener {
    JLabel lblHoras, lblPaga, lblTasa, lblPagaBruta, lblImpuesto, lblPagaNeta;
    JTextField txtHoras, txtPaga, txtTasa;
    JButton btnCalcular, btnSalir;

    public _p143_PagaTrabajador() {
        super("CALCULAR - PAGA TRABAJADOR");
        setLayout(null);

        lblHoras = new JLabel("HORAS TRABAJADAS: ");
        lblHoras.setBounds(10, 20, 200, 30);
        add(lblHoras);       
        txtHoras = new JTextField();
        txtHoras.setBounds(150, 20, 200, 30);
        add(txtHoras);

        lblPaga = new JLabel("PAGA X HORA: ");
        lblPaga.setBounds(10, 60, 200, 30);
        add(lblPaga);
        txtPaga = new JTextField();
        txtPaga.setBounds(150, 60, 200, 30);
        add(txtPaga);

        lblTasa = new JLabel("TASA DE IMPUESTOS: ");
        lblTasa.setBounds(10, 100, 200, 30);
        add(lblTasa);       
        txtTasa = new JTextField();
        txtTasa.setBounds(150, 100, 200, 30);
        add(txtTasa);

        lblPagaBruta = new JLabel(" [ PAGA BRUTA ]");
        lblPagaBruta.setBounds(10, 140, 200, 30);
        add(lblPagaBruta);

        lblImpuesto = new JLabel(" [ IMPUESTO ]");
        lblImpuesto.setBounds(10, 180, 200, 30);
        add(lblImpuesto);

        lblPagaNeta = new JLabel(" [ PAGA NETA ]");
        lblPagaNeta.setBounds(10, 220, 200, 30);
        add(lblPagaNeta);

        btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(15, 305, 100, 40);
        add(btnCalcular);
        btnSalir = new JButton("Salir");
        btnSalir.setBounds(135, 305, 100, 40);
        add(btnSalir);
        
        btnCalcular.addActionListener(this);
        btnSalir.addActionListener(this);
    }

    public float getPagaBruta(float horas, float paga) {
        return horas * paga;
    }

    public float getImpuesto(float pagaBruta, float tasa) {
        return pagaBruta * tasa;
    }

    public float getPagaNeta(float pagaBruta, float impuesto) {
        return pagaBruta - impuesto;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCalcular) {
            float horas = Float.parseFloat(txtHoras.getText());
            float paga = Float.parseFloat(txtPaga.getText());
            float tasa = Float.parseFloat(txtTasa.getText());

            float PagaBruta = getPagaBruta(horas, paga);
            lblPagaBruta.setText(String.format(">> PAGA BRUTA: %.2f", PagaBruta));

            float Impuesto = getPagaBruta(PagaBruta, tasa);
            lblImpuesto.setText(String.format(">> IMPUESTO: %.2f", Impuesto));

            float PagaNeta = getPagaNeta(PagaBruta, Impuesto);
            lblPagaNeta.setText(String.format(">> PAGA NETA: %.2f", PagaNeta));

        } else if (e.getSource() == btnSalir) {
            JOptionPane.showMessageDialog(this, "Gracias por usar este programa...", "Despedida...",
            JOptionPane.INFORMATION_MESSAGE);
            
            dispose();
        }
    }
    
    public static void main(String[] args) {
        _p143_PagaTrabajador app = new _p143_PagaTrabajador();
        app.setBounds(10, 10, 600, 400);    
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
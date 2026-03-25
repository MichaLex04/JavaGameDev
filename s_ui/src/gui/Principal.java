package gui;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal {

    private JFrame frame;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Principal window = new Principal();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Principal() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setTitle("Sistema Clínica");
        frame.setBounds(100, 100, 400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JButton btnRegistro = new JButton("Registro");
        btnRegistro.setBounds(120, 50, 150, 30);
        frame.getContentPane().add(btnRegistro);

        JButton btnClientes = new JButton("Clientes");
        btnClientes.setBounds(120, 100, 150, 30);
        frame.getContentPane().add(btnClientes);

        JButton btnCitas = new JButton("Citas");
        btnCitas.setBounds(120, 150, 150, 30);
        frame.getContentPane().add(btnCitas);

        // Navegación
        btnRegistro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Registro r = new Registro();
                r.getFrame().setVisible(true);
                frame.dispose();
            }
        });

        btnClientes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Clientes c = new Clientes();
                c.getFrame().setVisible(true);
                frame.dispose();
            }
        });

        btnCitas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Citas ci = new Citas();
                ci.getFrame().setVisible(true);
                frame.dispose();
            }
        });
    }
}
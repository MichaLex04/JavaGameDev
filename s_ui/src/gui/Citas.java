package gui;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Citas {

    private JFrame frame;

    public Citas() {
        initialize();
    }

    public JFrame getFrame() {
        return frame;
    }

    private void initialize() {
        frame = new JFrame();
        frame.setTitle("Citas Médicas");
        frame.setBounds(100, 100, 400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JButton btnVolver = new JButton("Volver");
        btnVolver.setBounds(120, 200, 150, 30);
        frame.getContentPane().add(btnVolver);

        btnVolver.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Principal p = new Principal();
                p.main(null);
                frame.dispose();
            }
        });
    }
}
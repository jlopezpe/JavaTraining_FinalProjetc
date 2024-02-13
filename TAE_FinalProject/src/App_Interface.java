import javafx.event.ActionEvent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class App_Interface {
    public static class InterfazPrincipal extends JFrame {

        public InterfazPrincipal() {
            // Configuración de la ventana principal
            setTitle("Globant University");
            setSize(1000, 500);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);

            // Crear un panel para los componentes
            JPanel panel = new JPanel();
            panel.setLayout(new BorderLayout());


            // Crear el mensaje de bienvenida
            JLabel bienvenidaLabel = new JLabel("¡WELCOME TO GLOBANT UNIVERSITY!");
            bienvenidaLabel.setHorizontalAlignment(JLabel.CENTER);
            bienvenidaLabel.setFont(new Font("Arial",Font.PLAIN,35));
            panel.add(bienvenidaLabel, BorderLayout.CENTER);

            // Crear el botón para continuar con el menú
            JButton continuarButton = new JButton("Enter");
            continuarButton.setFont(new Font("Arial",Font.BOLD,35));
            Color mygreen = new Color(0,153,51);
            continuarButton.setBackground(mygreen);
            //continuarButton.setSize(15,100);

            continuarButton.addActionListener(new ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    // Abrir la nueva ventana del menú
                    InterfazMenu menu = new InterfazMenu();
                    menu.setVisible(true);
                    // Cerrar la ventana actual
                    dispose();

                }
            });
            //BorderLayout.SOUTH
            panel.add(continuarButton,BorderLayout.SOUTH);
            // Agregar el panel a la ventana principal
            add(panel);
        }
    }
    static class InterfazMenu extends JFrame {

        public InterfazMenu() {
            // Configuración de la ventana del menú
            setTitle("Menú Principal");
            setSize(1000, 500);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);

            // Crear un panel para los componentes
            JPanel panel = new JPanel();

            // Agregar un mensaje al menú
            JLabel mensajeLabel = new JLabel("¡Please Choose an option");
            panel.add(mensajeLabel);

            // Agregar el panel a la ventana del menú
            add(panel);
        }
    }
}

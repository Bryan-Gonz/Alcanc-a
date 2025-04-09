import java.awt.*;
import javax.swing.*;
//import javax.swing.border.Border;

public class JFPrueba extends JFrame {
    private JPanel pnlMonedas, pnlBotones;
    private JButton btnMoneda100, btnMoneda200, btnMoneda500, btnMoneda1000, btnRomper;
    private JTextField txtF1, txtF2, txtF3, txtF4;
    private JTextArea txtAr1;
    private JLabel lbl1, lbl2, lbl3, lbl4;
    private ImageIcon mnd100, mnd200, mnd500, mnd1000;

    public JFPrueba() {
        setTitle("FORMULARIO ALCANCIA");
        setVisible(true);
        setSize(800,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(new GridLayout(1,2));

        pnlMonedas = new JPanel();
        pnlBotones = new JPanel();

        // Cambiar el layout del panel de botones para mejor centrado
        pnlMonedas.setLayout(new GridBagLayout());
        //pnlMonedas.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Margen interno

        pnlBotones.setLayout(new GridLayout(5,2));
        pnlBotones.setPreferredSize(new Dimension(0,130)); 

        add(pnlMonedas);
        add(pnlBotones);

        // Crear estilo común para los botones
        Color azul = new Color(0, 0, 255);
        //Border bordeAzul = BorderFactory.createLineBorder(azul, 2);

        // Configuración común para todos los botones
        JButton[] botones = {
                btnMoneda100 = new JButton("Agregar Monedas $100"),
                btnMoneda200 = new JButton("Agregar Monedas $200"),
                btnMoneda500 = new JButton("Agregar Monedas $500"),
                btnMoneda1000 = new JButton("Agregar Monedas $1000"),
                btnRomper = new JButton("Romper Alcancía")
            };

        for (JButton boton : botones) {
            // Estilo del botón
            boton.setForeground(azul); // Texto azul
            boton.setBackground(Color.WHITE); // Fondo blanco
            //boton.setBorder(bordeAzul); // Borde azul
            boton.setBorder(BorderFactory.createLineBorder(Color.blue));
            boton.setFocusPainted(false); // Eliminar el borde de enfoque
            //boton.setFont(new Font("Arial", Font.BOLD, 12)); // Fuente

            // Tamaño preferido más pequeño
            boton.setPreferredSize(new Dimension(200, 40));

            // Margen interno
            //boton.setMargin(new Insets(5, 10, 5, 10));
        }

        // Configuración especial para el botón "Romper Alcancía"
        /*btnRomper.setForeground(Color.RED);
        btnRomper.setBorder(BorderFactory.createLineBorder(Color.RED, 2));*/

        // Añadir botones al panel con restricciones para centrado
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 0, 5, 0); // Espaciado vertical

        pnlMonedas.add(btnMoneda100, gbc);
        pnlMonedas.add(btnMoneda200, gbc);
        pnlMonedas.add(btnMoneda500, gbc);
        pnlMonedas.add(btnMoneda1000, gbc);
        pnlMonedas.add(btnRomper, gbc);

        // Resto de tu código original
        txtF1 = new JTextField("0");
        txtF2 = new JTextField("0");
        txtF3 = new JTextField("0");
        txtF4 = new JTextField("0");
        txtAr1 = new JTextArea("Aquí se debe mostrar el total ahorrado\npor cada denominación y el total\ngeneral");
        txtAr1.setEditable(false);

        // Centrar texto en JTextArea
        txtAr1.setLineWrap(true);
        txtAr1.setWrapStyleWord(true);
        txtAr1.setMargin(new Insets(10, 10, 10, 10));

        mnd100 = new ImageIcon("C:/Users/Bryan/Downloads/Moneda100.jpg");
        mnd200 = new ImageIcon("C:/Users/Bryan/Downloads/Moneda200.jpg");
        mnd500 = new ImageIcon("C:/Users/Bryan/Downloads/Moneda500.jpg");
        mnd1000 = new ImageIcon("C:/Users/Bryan/Downloads/Moneda1000.jpg");

        lbl1 = new JLabel(mnd100);
        lbl2 = new JLabel(mnd200);
        lbl3 = new JLabel(mnd500);
        lbl4 = new JLabel(mnd1000);

        // Centrar imágenes y campos de texto
        lbl1.setHorizontalAlignment(JLabel.CENTER);
        lbl2.setHorizontalAlignment(JLabel.CENTER);
        lbl3.setHorizontalAlignment(JLabel.CENTER);
        lbl4.setHorizontalAlignment(JLabel.CENTER);

        txtF1.setHorizontalAlignment(JTextField.CENTER);
        txtF2.setHorizontalAlignment(JTextField.CENTER);
        txtF3.setHorizontalAlignment(JTextField.CENTER);
        txtF4.setHorizontalAlignment(JTextField.CENTER);

        pnlBotones.add(lbl1);
        pnlBotones.add(lbl2);
        pnlBotones.add(txtF1);
        pnlBotones.add(txtF2);
        pnlBotones.add(lbl3);
        pnlBotones.add(lbl4);
        pnlBotones.add(txtF3);
        pnlBotones.add(txtF4);
    }
}
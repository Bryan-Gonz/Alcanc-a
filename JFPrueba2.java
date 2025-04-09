import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class JFPrueba2 extends JFrame {
    private JPanel pnlMonedas, pnlBotones;
    private JButton btnMoneda100, btnMoneda200, btnMoneda500, btnMoneda1000, btnRomper;
    private JTextField txtF1, txtF2, txtF3, txtF4;
    private JTextArea txtAr1;
    private JLabel lbl1, lbl2, lbl3, lbl4;
    private ImageIcon mnd100, mnd200, mnd500, mnd1000;

    public JFPrueba2() {
        setTitle("FORMULARIO ALCANCIA");
        setVisible(true);
        setSize(800, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(new GridLayout(1, 2));

        pnlMonedas = new JPanel();
        pnlBotones = new JPanel();

        pnlMonedas.setLayout(new GridLayout(5, 1));
        pnlMonedas.setPreferredSize(new Dimension(0, 130)); 

        pnlBotones.setLayout(new BorderLayout()); // Cambiado a BorderLayout para mejor organización
        pnlBotones.setPreferredSize(new Dimension(0, 130)); 

        add(pnlMonedas);
        add(pnlBotones);

        // Crear panel para imágenes y campos de texto
        JPanel pnlSuperior = new JPanel(new GridLayout(4, 2));
        
        // Configuración de botones
        btnMoneda100 = new JButton("Agregar Monedas $100");
        btnMoneda200 = new JButton("Agregar Monedas $200");
        btnMoneda500 = new JButton("Agregar Monedas $500");
        btnMoneda1000 = new JButton("Agregar Monedas $1000");
        btnRomper = new JButton("Romper Alcancía");

        pnlMonedas.add(btnMoneda100);
        pnlMonedas.add(btnMoneda200);
        pnlMonedas.add(btnMoneda500);
        pnlMonedas.add(btnMoneda1000);
        pnlMonedas.add(btnRomper);

        // Campos de texto con estilo
        txtF1 = createStyledTextField("0");
        txtF2 = createStyledTextField("0");
        txtF3 = createStyledTextField("0");
        txtF4 = createStyledTextField("0");
        
        // Área de texto con estilo
        txtAr1 = new JTextArea("Aquí se debe mostrar el total ahorrado\npor cada denominación y el total\ngeneral");
        styleTextArea(txtAr1);
        
        // Cargar y redimensionar imágenes
        mnd100 = loadAndResizeImage("C:/Users/Bryan/Downloads/Moneda100.jpg", 80, 80);
        mnd200 = loadAndResizeImage("C:/Users/Bryan/Downloads/Moneda200.jpg", 80, 80);
        mnd500 = loadAndResizeImage("C:/Users/Bryan/Downloads/Moneda500.jpg", 80, 80);
        mnd1000 = loadAndResizeImage("C:/Users/Bryan/Downloads/Moneda1000.jpg", 80, 80);
        
        lbl1 = new JLabel(mnd100);
        lbl2 = new JLabel(mnd200);
        lbl3 = new JLabel(mnd500);
        lbl4 = new JLabel(mnd1000);

        // Agregar componentes al panel superior
        pnlSuperior.add(lbl1);
        pnlSuperior.add(lbl2);
        pnlSuperior.add(txtF1);
        pnlSuperior.add(txtF2);
        pnlSuperior.add(lbl3);
        pnlSuperior.add(lbl4);
        pnlSuperior.add(txtF3);
        pnlSuperior.add(txtF4);
        
        // Agregar componentes al panel principal
        pnlBotones.add(pnlSuperior, BorderLayout.CENTER);
        pnlBotones.add(new JScrollPane(txtAr1), BorderLayout.SOUTH);
    }

    // Método para estilizar los JTextField
    private JTextField createStyledTextField(String text) {
        JTextField textField = new JTextField(text);
        textField.setHorizontalAlignment(JTextField.CENTER); // Texto centrado
        textField.setBorder(new LineBorder(Color.RED, 1)); // Borde rojo
        textField.setBackground(Color.WHITE); // Fondo blanco
        return textField;
    }

    // Método para estilizar el JTextArea
    private void styleTextArea(JTextArea textArea) {
        //textArea.setBorder(BorderFactory.createCompoundBorder(
            //new LineBorder(Color.BLUE, 2), // Borde azul
            //BorderFactory.createEmptyBorder(5, 5, 5, 5))); // Margen interno
        textArea.setBackground(Color.WHITE); // Fondo blanco
        textArea.setFont(new Font("Arial", Font.PLAIN, 14));
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
    }

    // Método para cargar y redimensionar imágenes
    private ImageIcon loadAndResizeImage(String path, int width, int height) {
        ImageIcon icon = new ImageIcon(path);
        Image image = icon.getImage();
        Image scaledImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(scaledImage);
    }

}
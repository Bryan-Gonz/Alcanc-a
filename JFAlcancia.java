import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JFAlcancia extends JFrame implements ActionListener
{
    Alcancia a = new Alcancia();
    
    private JPanel pnlMonedas, pnlBotones;

    private JButton btnMoneda100, btnMoneda200, btnMoneda500, btnMoneda1000, btnRomper;

    private JTextField txtF1, txtF2, txtF3, txtF4;
    private JTextArea txtAr1;
    private JLabel lbl1, lbl2, lbl3, lbl4;
    private ImageIcon mnd100, mnd200, mnd500, mnd1000;

    public JFAlcancia(){
        setTitle("FORMULARIO ALCANCIA");
        setVisible(true);
        setSize(800,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(new GridLayout(1,2));
        setBackground(Color.white);

        pnlMonedas = new JPanel();
        pnlBotones = new JPanel();

        // Cambiar el layout del panel de botones para mejor centrado
        pnlMonedas.setLayout(new GridBagLayout());
        /*pnlMonedas.setLayout(new GridLayout(5,1));
        pnlMonedas.setPreferredSize(new Dimension (0,130)); */

        pnlBotones.setLayout(new BorderLayout()); // Cambiado a BorderLayout para mejor organización
        pnlBotones.setPreferredSize(new Dimension(0, 130)); 
        //pnlBotones.setLayout(new GridLayout(5,2)); 

        add(pnlMonedas);
        add(pnlBotones);

        // Crear panel para imágenes y campos de texto
        JPanel pnlSuperior = new JPanel(new GridLayout(4, 2));

        btnMoneda100 = styledBoton ("Agregar Monedas $100");
        btnMoneda200 = styledBoton ("Agregar Monedas $200");
        btnMoneda500 = styledBoton ("Agregar Monedas $500");
        btnMoneda1000 = styledBoton ("Agregar Monedas $1000");
        btnRomper = styledBoton ("Romper Alcancía");

        //Añadir botones al panel con restricciones para centrado
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 0, 5, 0); // Espaciado vertical

        pnlMonedas.add(btnMoneda100, gbc);
        pnlMonedas.add(btnMoneda200, gbc);
        pnlMonedas.add(btnMoneda500, gbc);
        pnlMonedas.add(btnMoneda1000, gbc);
        pnlMonedas.add(btnRomper, gbc);

        txtF1 = styledTextField ("0");
        txtF2 = styledTextField ("0");
        txtF3 = styledTextField ("0");
        txtF4 = styledTextField ("0");
        txtAr1 = new JTextArea("Aquí se debe mostrar el total ahorrado\npor cada denominación y el total\ngeneral");
        styleTextArea(txtAr1);
        mnd100 = editarImagen("C:/Users/Bryan/Downloads/Moneda100.jpg", 80, 80);
        mnd200 = editarImagen("C:/Users/Bryan/Downloads/Moneda200.jpg", 80, 80);
        mnd500 = editarImagen("C:/Users/Bryan/Downloads/Moneda500.jpg", 80, 80);
        mnd1000 = editarImagen("C:/Users/Bryan/Downloads/Moneda1000.jpg", 80, 80);
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
        
        btnMoneda100.addActionListener(this);
        btnMoneda200.addActionListener(this);
        btnMoneda500.addActionListener(this);
        btnMoneda1000.addActionListener(this);
        btnRomper.addActionListener(this);
    }

    // Método para estilizar los JButton
    private JButton styledBoton(String texto) {
        JButton boton = new JButton(texto);
        // Crear estilo común para los botones
        boton.setForeground(Color.blue); // Texto azul
        boton.setBackground(Color.WHITE); // Fondo blanco
        boton.setBorder(BorderFactory.createLineBorder(Color.blue));
        boton.setFocusPainted(false); // Eliminar el borde de enfoque
        // Tamaño preferido más pequeño
        boton.setPreferredSize(new Dimension(200, 40));
        return boton;
    }

    // Método para estilizar los JTextField
    private JTextField styledTextField(String text) {
        JTextField textField = new JTextField(text);
        textField.setHorizontalAlignment(JTextField.CENTER); // Texto centrado
        textField.setBorder(BorderFactory.createLineBorder(Color.red)); // Borde rojo
        textField.setBackground(Color.WHITE); // Fondo blanco
        return textField;
    }

    // Método para estilizar el JTextArea
    private void styleTextArea(JTextArea textArea) {
        textArea.setBorder(BorderFactory.createLineBorder(Color.blue));// Borde azul
        textArea.setBackground(Color.WHITE); // Fondo blanco
        textArea.setForeground(Color.gray);
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
    }
    
    // Método para cargar y redimensionar imágenes
    private ImageIcon editarImagen(String acceso, int ancho, int alto) {
        ImageIcon icon = new ImageIcon(acceso);
        Image image = icon.getImage();
        Image scaledImage = image.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);
        return new ImageIcon(scaledImage);
    }
    
    public void actionPerformed(ActionEvent evento){
        String comando = evento.getActionCommand();
        
        
        if(comando.equals("Agregar Monedas $100")){
            a.contMnd100++;
            
        }
        
        
        
    }
    
    private void actualizarInterfaz() {
        txtF1.setText(a.contMnd100);
        lblMonedas100.setText("Monedas de $100: " + monedas100);
        lblMonedas200.setText("Monedas de $200: " + monedas200);
        lblMonedas500.setText("Monedas de $500: " + monedas500);
        
        int total = calcularTotal();
        lblTotal.setText("Total ahorrado: $" + total);
    }
}//fin class JFAlcancia

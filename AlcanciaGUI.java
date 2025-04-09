
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AlcanciaGUI extends JFrame {
    // Variables para contar las monedas
    private int monedas50 = 0;
    private int monedas100 = 0;
    private int monedas200 = 0;
    private int monedas500 = 0;
    
    // Componentes de la interfaz
    private JLabel lblMonedas50;
    private JLabel lblMonedas100;
    private JLabel lblMonedas200;
    private JLabel lblMonedas500;
    private JLabel lblTotal;
    
    public AlcanciaGUI() {
        // Configuración de la ventana principal
        setTitle("Alcancía Ahorros");
        setVisible(true);
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2));
        
        // Inicializar componentes
        JButton btnMoneda50 = new JButton("Agregar moneda de $50");
        JButton btnMoneda100 = new JButton("Agregar moneda de $100");
        JButton btnMoneda200 = new JButton("Agregar moneda de $200");
        JButton btnMoneda500 = new JButton("Agregar moneda de $500");
        JButton btnRomper = new JButton("Romper alcancía");
        
        lblMonedas50 = new JLabel("Monedas de $50: 0");
        lblMonedas100 = new JLabel("Monedas de $100: 0");
        lblMonedas200 = new JLabel("Monedas de $200: 0");
        lblMonedas500 = new JLabel("Monedas de $500: 0");
        lblTotal = new JLabel("Total ahorrado: $0");
        
        // Agregar componentes a la ventana
        add(btnMoneda50);
        add(lblMonedas50);
        add(btnMoneda100);
        add(lblMonedas100);
        add(btnMoneda200);
        add(lblMonedas200);
        add(btnMoneda500);
        add(lblMonedas500);
        add(btnRomper);
        add(lblTotal);
        
        // Configurar ActionListeners para los botones
        btnMoneda50.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                monedas50++;
                actualizarInterfaz();
            }
        });
        
        btnMoneda100.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                monedas100++;
                actualizarInterfaz();
            }
        });
        
        btnMoneda200.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                monedas200++;
                actualizarInterfaz();
            }
        });
        
        btnMoneda500.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                monedas500++;
                actualizarInterfaz();
            }
        });
        
        btnRomper.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int total = calcularTotal();
                JOptionPane.showMessageDialog(null, 
                    "¡Alcancía rota!\n" +
                    "Monedas de $50: " + monedas50 + "\n" +
                    "Monedas de $100: " + monedas100 + "\n" +
                    "Monedas de $200: " + monedas200 + "\n" +
                    "Monedas de $500: " + monedas500 + "\n" +
                    "Total ahorrado: $" + total,
                    "Resultados", JOptionPane.INFORMATION_MESSAGE);
                
                // Reiniciar la alcancía
                monedas50 = 0;
                monedas100 = 0;
                monedas200 = 0;
                monedas500 = 0;
                actualizarInterfaz();
            }
        });
    }
    
    private void actualizarInterfaz() {
        lblMonedas50.setText("Monedas de $50: " + monedas50);
        lblMonedas100.setText("Monedas de $100: " + monedas100);
        lblMonedas200.setText("Monedas de $200: " + monedas200);
        lblMonedas500.setText("Monedas de $500: " + monedas500);
        
        int total = calcularTotal();
        lblTotal.setText("Total ahorrado: $" + total);
    }
    
    private int calcularTotal() {
        return (monedas50 * 50) + (monedas100 * 100) + 
               (monedas200 * 200) + (monedas500 * 500);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AlcanciaGUI().setVisible(true);
            }
        });
    }
}
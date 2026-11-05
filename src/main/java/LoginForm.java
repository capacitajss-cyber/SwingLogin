import com.formdev.flatlaf.FlatDarculaLaf;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame {
    private JPanel panelPrincipal;
    private JTextField usuarioTexto;
    private JPasswordField passwordTexto;
    private JButton enviarButton;
    private JPanel contentPane;

    public LoginForm(){
        inicializarForma();
        enviarButton.addActionListener(e -> validar());
    }

    private void validar() {
        //Leer los valores
        var usuario = this.usuarioTexto.getText();
        var password = new String (this.passwordTexto.getPassword());
        if ("root".equals(usuario) && "admin".equals(password))
            mostrarMensaje("Datos correctos, bienvenido !!");
        else if("root".equals(usuario))
            mostrarMensaje("Password incorrecto, corregelo");
        else
            mostrarMensaje("Usuario incorrecto, corregelo");
    }

    private void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this,mensaje);
    }

    private void inicializarForma() {

        setContentPane(panelPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,400);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        FlatDarculaLaf.setup();
        LoginForm forma = new LoginForm();
        forma.setVisible(true);
    }

}

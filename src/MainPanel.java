import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MainPanel extends JPanel implements ActionListener{
    private JButton loginButton;
    private JTextField userNameTextField;
    private JTextField passwordTextField;
    private Person nick = new Person();
    private JLabel outputLabel;
    private JPasswordField passwordField;
    private String password = "";
    private String cmd = "";
    private String OK = "ok";
    
    MainPanel(){
        GridLayout grid = new GridLayout(1,4);
        setLayout(grid);
        
        loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        add(loginButton);
        
        userNameTextField = new JTextField("Enter your user name.");
        add(userNameTextField);
        
//        passwordTextField = new JTextField("Enter your password.");
//        add(passwordTextField);

        passwordField = new JPasswordField(30);
        passwordField.setEchoChar('*');
        passwordField.setActionCommand(OK);
        passwordField.addActionListener(this);
        add(passwordField);
        
        outputLabel = new JLabel("");
        add(outputLabel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton eventSource = (JButton)e.getSource();
        if(eventSource == loginButton){
            char [] pass = passwordField.getPassword();
            password = password + pass;
            if(userNameTextField.getText().equals(nick.getUserName()) && password.equals(nick.getPassword())){
                outputLabel.setText("Login Verified.");
            }
            else{
                outputLabel.setText("Login Not Verified.");
            }
        }
    }
}
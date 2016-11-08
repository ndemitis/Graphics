
import javax.swing.JFrame;

public class MainFrame extends JFrame{
    MainFrame(){
        super("Graphics");
        MainPanel panel = new MainPanel();
        getContentPane().add(panel);
        setSize(600,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
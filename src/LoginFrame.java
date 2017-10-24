import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame{
    private JLabel T1ID = new JLabel("ID");
    private JLabel T1Pass = new JLabel("Pass");
    private JTextField S1ID = new JTextField();
    private JPasswordField S1Pass = new JPasswordField();
    private Container cp;
    private JButton ex1 = new JButton("EXIT");
    private JButton ex2 = new JButton("Login");
    private  Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    private int frmW = 300,frmH = 150,screenW,screenH;
    public LoginFrame (){
        initComp();
    }
    private void initComp(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        screenW = dim.width;
        screenH = dim.height;
        this.setBounds(screenW/2-frmW/2,screenH/2-frmH/2,frmW,frmH);
        cp = this.getContentPane();
        cp.setLayout(new GridLayout(3,3,2,3));
        T1ID.setHorizontalAlignment(JLabel.RIGHT);
        T1Pass.setHorizontalAlignment(JLabel.RIGHT);
        cp.add(T1ID);
        cp.add(S1ID);
        cp.add(T1Pass);
        cp.add(S1Pass);
        cp.add(ex1);
        cp.add(ex2);
        ex2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (S1ID.getText().equals("") && (new String(S1Pass.getPassword())).equals("")) {
                    MainFrame mainframe = new MainFrame();
                    mainframe.setVisible(true);
                    LoginFrame.this.setVisible(false);
                }else{
                    JOptionPane.showMessageDialog(LoginFrame.this,"null");
                }
            }
        });

    }
}

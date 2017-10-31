import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame{
private int  ScreenR  = Toolkit.getDefaultToolkit().getScreenSize().width;
private int  ScreenH = Toolkit.getDefaultToolkit().getScreenSize().height;
private JMenuBar MBT= new JMenuBar();
private JDesktopPane jDesktopPane = new JDesktopPane();
private JInternalFrame jInternalFrame = new JInternalFrame();
private  String options[] ={"PLAIN","ITALICS","BOLD","BOLD+ITALICS"};
private  JComboBox comboBox = new JComboBox(options);
private JMenu jMenu = new JMenu("file");
private JMenuItem jMIt = new JMenuItem("Exit");
private JMenuItem jMIt2 = new JMenuItem("Text");
private JLabel lab1 = new JLabel("Family");
private JLabel lab2 = new JLabel("style");
private JLabel lab3 = new JLabel("size");
private JTextField tFd1 = new JTextField("");
private JTextField tFd2 = new JTextField("");
private JPanel jPl = new JPanel(new GridLayout(6,1,3,3));
private JPanel jP2 = new JPanel(new GridLayout(2,3,3,3));
//private JLabel jLl[] = new JLabel[6];

private int TR = 1000,TH = 800;
public MainFrame(){
    initComp();
    }
    private void initComp(){
    this.setBounds(ScreenR /2 - TR/2,ScreenH/2 - TH/2,TR,TH);
    jInternalFrame.setBounds(50,50,300,200);
    this.setJMenuBar(MBT);
    this.add(jDesktopPane);

    MBT.add(jMenu);
    jMenu.add(jMIt);
    jMenu.add(jMIt2);

    jP2.add(lab1);
    jP2.add(lab2);
    jP2.add(lab3);
    jP2.add(tFd1);
    jP2.add(comboBox);
    jP2.add(tFd2);

    jDesktopPane.add(jInternalFrame);
    jInternalFrame.setLayout(new BorderLayout(3,3));

//   for(int i = 0;i<6;i++){
//
//   }
    jInternalFrame.add(jPl,BorderLayout.CENTER);

    jMIt2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
           int result = JOptionPane.showConfirmDialog(MainFrame.this,jP2,
                   "Font",JOptionPane.OK_CANCEL_OPTION);
           int fontStyle = 0;
           switch(comboBox.getSelectedIndex()){
               case 0:
                   fontStyle = Font.PLAIN;
                   break;
               case 1:
                   fontStyle = Font.BOLD;
                   break;
               case 2:
                   fontStyle = Font.ITALIC;
                   break;
               case 3:
                   fontStyle = Font.BOLD + Font.ITALIC;
           }
           
        }
    });
    jMIt.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            LoginFrame loginFrame = new LoginFrame();
            loginFrame.setVisible(true);
            MainFrame.this.setVisible(false);
        }

    });
    jMIt.setAccelerator(KeyStroke.getKeyStroke('X',Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.setVisible(true);
        MainFrame.this.setVisible(false);
}


}

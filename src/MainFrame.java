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
private JMenu jMenu = new JMenu("file");
private JMenuItem jMIt = new JMenuItem("Exit");
private JMenuItem jMIt2 = new JMenuItem("Text");
private JPanel jPl = new JPanel(new GridLayout(6,1,3,3));
private JLabel jLl[] = new JLabel[6];

private int TR = 800,TH = 200;
public MainFrame(){
    initComp();
    }
    private void initComp(){
    this.setBounds(ScreenR /2 - TR/2,ScreenH/2 - TH/2,TR,TH);
    jInternalFrame.setBounds(50,50,200,100);
    this.setJMenuBar(MBT);
    this.add(jDesktopPane);
    jDesktopPane.add(jInternalFrame);
    MBT.add(jMenu);
    jMenu.add(jMIt);
    jMenu.add(jMIt2);
    jInternalFrame.setLayout(new BorderLayout(3,3));
   for(int i = 0;i<6;i++){
       
   }
    jInternalFrame.add(jPl,BorderLayout.CENTER);
    jMIt2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            jInternalFrame.setVisible(true);
        }
    });
    jMIt.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }

    });
    jMIt.setAccelerator(KeyStroke.getKeyStroke('X',Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
    }

}

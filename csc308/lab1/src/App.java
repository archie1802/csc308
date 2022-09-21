import javax.swing.*;
import java.awt.*;

public class App extends JFrame {
    public App() {
        super("Lab1");
        JMenuBar mb = new JMenuBar();
        JMenu menu1 = new JMenu("Menu1");
        JMenu menu2 = new JMenu("Menu2");
        JMenuItem menu1Item = new JMenuItem("Item 1");
        menu1.add(menu1Item);
        mb.add(menu1);
        mb.add(menu2);
        this.setJMenuBar(mb);

        GridLayout g = new GridLayout(2, 2);
        this.setLayout(g);

        JLabel x = new JLabel(":)");
        this.add(x);
        JLabel y = new JLabel(";)");
        this.add(y);
        JLabel z = new JLabel(":(");
        this.add(z);
        JLabel q = new JLabel(";(");
        this.add(q);

    }
    public static void main(String arg[]) {
        App win = new App();
        win.setSize(800, 800);
        win.setVisible(true);
    }
}

import javax.swing.*;

public class MainWindow extends JFrame {

    public MainWindow(){
        setTitle("Snake");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(640,345);
        setLocation(450,200);
        add(new GameField());
        setVisible(true);
    }

    public static void main(String[] args){
        MainWindow mainWindow = new MainWindow();
    }
}
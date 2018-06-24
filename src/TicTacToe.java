import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TicTacToe extends JFrame {
    final static int DEFAULT_WIDTH = 640;
    final static int DEFAULT_HEIGHT = 480;

    JButton[][] tiles = new JButton[3][3];
    JPanel generalPanel;
    JPanel buttons;
    JPanel playerNames;

    int playerTurn=1;
    int count=0;

    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    double width = screenSize.getWidth();
    double height = screenSize.getHeight();

    public TicTacToe() {
        drawBoard();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setVisible(true);
    }

    public void drawBoard() {
        generalPanel = new JPanel(new BorderLayout());
        buttons = new JPanel(new GridLayout(3, 3));
        playerNames = new JPanel(new FlowLayout());

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                tiles[i][j] = new JButton("");
                buttons.add(tiles[i][j]);
            }
            ButtonListener bton = new ButtonListener();
        playerNames.add(new JButton("Reset"));
        playerNames.add(new JLabel("Player1: "));
        playerNames.add(new JTextField(16));
        playerNames.add(new JLabel("Player2:"));
        playerNames.add(new JTextField(16));
        generalPanel.add(buttons, BorderLayout.CENTER);
        generalPanel.add(playerNames, BorderLayout.SOUTH);
        add(generalPanel);
    }

    public void eventWatch() {

    }


class ButtonListener implements ActionListener {

    public void actionPerformed(ActionEvent event) {
        for (int i = 0; i < 3; i++)
            for (int j=0;j<3;j++) {
                tiles[i][j].addActionListener(this);
            }
            if(event.getSource()==tiles[0][0]){
                System.out.println("1");
            }
    }

}


    public static void main(String args[]) {
        SwingUtilities.invokeLater(() -> new TicTacToe());
    }
}

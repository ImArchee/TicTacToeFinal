import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class TicTacToe extends JFrame {
    final static int DEFAULT_WIDTH = 800;
    final static int DEFAULT_HEIGHT = 600;
    JButton[][] tiles = new JButton[3][3];
    JPanel generalPanel;
    JPanel buttons;
    JPanel playerNames;
    int playerTurn = 1;
    int count = 0;
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    double width = screenSize.getWidth();
    double height = screenSize.getHeight();
    Font buttonFont = new Font("Arial", Font.PLAIN, 200);



    public TicTacToe() {
        drawBoard();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setLocation(((int)width- DEFAULT_WIDTH)/2,((int)height-DEFAULT_HEIGHT)/2);
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
                tiles[i][j].addActionListener(new ButtonListener());
            }
        playerNames.add(new JButton("Reset"));
        playerNames.add(new JLabel("Player1: "));
        playerNames.add(new JTextField(16));
        playerNames.add(new JLabel("Player2:"));
        playerNames.add(new JTextField(16));
        generalPanel.add(buttons, BorderLayout.CENTER);
        generalPanel.add(playerNames, BorderLayout.SOUTH);
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++) {
                tiles[i][j].setFont(buttonFont);
            }
        add(generalPanel);
    }
    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == tiles[0][0] && tiles[0][0].getText().isEmpty()) {
                if (playerTurn == 1) {
                    tiles[0][0].setText("X");
                    tiles[0][0].setForeground(Color.RED);
                    playerTurn = 2;

                } else if (playerTurn == 2) {
                    tiles[0][0].setText("O");
                    tiles[0][0].setForeground(Color.GREEN);
                    playerTurn = 1;
                }
            }

            if (event.getSource() == tiles[0][1] && tiles[0][1].getText().isEmpty()) {
                if (playerTurn == 1) {
                    tiles[0][1].setText("X");
                    tiles[0][1].setForeground(Color.RED);
                    playerTurn = 2;
                } else if (playerTurn == 2) {
                    tiles[0][1].setText("O");
                    tiles[0][1].setForeground(Color.GREEN);
                    playerTurn = 1;
                }
            }
            if (event.getSource() == tiles[0][2] && tiles[0][2].getText().isEmpty()) {
                if (playerTurn == 1) {
                    tiles[0][2].setText("X");
                    tiles[0][2].setForeground(Color.RED);
                    playerTurn = 2;
                } else if (playerTurn == 2) {
                    tiles[0][2].setText("O");
                    tiles[0][2].setForeground(Color.GREEN);
                    playerTurn = 1;
                }
            }
            if (event.getSource() == tiles[1][0] && tiles[1][0].getText().isEmpty()) {
                if (playerTurn == 1) {
                    tiles[1][0].setText("X");
                    tiles[1][0].setForeground(Color.RED);
                    playerTurn = 2;
                } else if (playerTurn == 2) {
                    tiles[1][0].setText("O");
                    tiles[1][0].setForeground(Color.GREEN);
                    playerTurn = 1;
                }
            }
            if (event.getSource() == tiles[1][1] && tiles[1][1].getText().isEmpty()) {
                if (playerTurn == 1) {
                    tiles[1][1].setText("X");
                    tiles[1][1].setForeground(Color.RED);
                    playerTurn = 2;
                } else if (playerTurn == 2) {
                    tiles[1][1].setText("O");
                    tiles[1][1].setForeground(Color.GREEN);
                    playerTurn = 1;
                }
            }
            if (event.getSource() == tiles[1][2] && tiles[1][2].getText().isEmpty()) {
                if (playerTurn == 1) {
                    tiles[1][2].setText("X");
                    tiles[1][2].setForeground(Color.RED);
                    playerTurn = 2;
                } else if (playerTurn == 2) {
                    tiles[1][2].setText("O");
                    tiles[1][2].setForeground(Color.GREEN);
                    playerTurn = 1;
                }
            }
            if (event.getSource() == tiles[2][0] && tiles[2][0].getText().isEmpty()) {
                if (playerTurn == 1) {
                    tiles[2][0].setText("X");
                    tiles[2][0].setForeground(Color.RED);
                    playerTurn = 2;
                } else if (playerTurn == 2) {
                    tiles[2][0].setText("O");
                    tiles[2][0].setForeground(Color.GREEN);
                    playerTurn = 1;
                }
            }
            if (event.getSource() == tiles[2][1] && tiles[2][1].getText().isEmpty()) {
                if (playerTurn == 1) {
                    tiles[2][1].setText("X");
                    tiles[2][1].setForeground(Color.RED);
                    playerTurn = 2;
                } else if (playerTurn == 2) {
                    tiles[2][1].setText("O");
                    tiles[2][1].setForeground(Color.GREEN);
                    playerTurn = 1;
                }
            }
            if (event.getSource() == tiles[2][2] && tiles[2][2].getText().isEmpty()) {
                if (playerTurn == 1) {
                    tiles[2][2].setText("X");
                    tiles[2][2].setForeground(Color.RED);
                    playerTurn = 2;
                } else if (playerTurn == 2) {
                    tiles[2][2].setText("O");
                    tiles[2][2].setForeground(Color.GREEN);
                    playerTurn = 1;
                }
            }
            if (!tiles[0][0].getText().isEmpty() && !tiles[0][1].getText().isEmpty() && !tiles[0][2].getText().isEmpty())
                if (tiles[0][0].getText() == tiles[0][1].getText() && tiles[0][1].getText() == tiles[0][2].getText()) {
                    if (tiles[0][0].getText() == "X")
                    JOptionPane.showMessageDialog(null, "Player 1 won!");
                    else JOptionPane.showMessageDialog(null, "Player 2 won!");
                    System.exit(0);
                }
            if (!tiles[1][0].getText().isEmpty() && !tiles[1][1].getText().isEmpty() && !tiles[1][2].getText().isEmpty())
                    if (tiles[1][0].getText() == tiles[1][1].getText() && tiles[1][1].getText() == tiles[1][2].getText()) {
                        if (tiles[1][0].getText() == "X")
                            JOptionPane.showMessageDialog(null, "Player 1 won!");
                        else JOptionPane.showMessageDialog(null, "Player 2 won!");
                        System.exit(0);
                    }
            if (!tiles[2][0].getText().isEmpty() && !tiles[2][1].getText().isEmpty() && !tiles[2][2].getText().isEmpty())
                if (tiles[2][0].getText() == tiles[2][1].getText() && tiles[2][1].getText() == tiles[2][2].getText()) {
                    if (tiles[2][0].getText() == "X")
                        JOptionPane.showMessageDialog(null, "Player 1 won!");
                    else JOptionPane.showMessageDialog(null, "Player 2 won!");
                    System.exit(0);}
            if (!tiles[0][0].getText().isEmpty() && !tiles[1][1].getText().isEmpty() && !tiles[2][2].getText().isEmpty())
                if (tiles[0][0].getText() == tiles[1][1].getText() && tiles[1][1].getText() == tiles[2][2].getText()) {
                    if (tiles[0][0].getText() == "X")
                        JOptionPane.showMessageDialog(null, "Player 1 won!");
                    else JOptionPane.showMessageDialog(null, "Player 2 won!");
                    System.exit(0);
                }
            if (!tiles[0][2].getText().isEmpty() && !tiles[1][1].getText().isEmpty() && !tiles[2][0].getText().isEmpty())
                if (tiles[0][2].getText() == tiles[1][1].getText() && tiles[1][2].getText() == tiles[2][2].getText()) {
                    if (tiles[0][2].getText() == "X")
                        JOptionPane.showMessageDialog(null, "Player 1 won!");
                    else JOptionPane.showMessageDialog(null, "Player 2 won!");
                    System.exit(0);
                }
            if (!tiles[0][0].getText().isEmpty() && !tiles[1][0].getText().isEmpty() && !tiles[2][0].getText().isEmpty())
                if (tiles[0][0].getText() == tiles[1][0].getText() && tiles[1][0].getText() == tiles[2][0].getText()) {
                    if (tiles[0][0].getText() == "X")
                        JOptionPane.showMessageDialog(null, "Player 1 won!");
                    else JOptionPane.showMessageDialog(null, "Player 2 won!");
                    System.exit(0);
                }
            if (!tiles[0][1].getText().isEmpty() && !tiles[1][1].getText().isEmpty() && !tiles[2][1].getText().isEmpty())
                if (tiles[0][1].getText() == tiles[1][1].getText() && tiles[1][1].getText() == tiles[2][1].getText()) {
                    if (tiles[0][1].getText() == "X")
                        JOptionPane.showMessageDialog(null, "Player 1 won!");
                    else JOptionPane.showMessageDialog(null, "Player 2 won!");
                    System.exit(0);
                }
            if (!tiles[0][2].getText().isEmpty() && !tiles[1][2].getText().isEmpty() && !tiles[2][2].getText().isEmpty())
                if (tiles[0][2].getText() == tiles[1][2].getText() && tiles[1][2].getText() == tiles[2][2].getText()) {
                    if (tiles[0][2].getText() == "X")
                        JOptionPane.showMessageDialog(null, "Player 1 won!");
                    else JOptionPane.showMessageDialog(null, "Player 2 won!");
                    System.exit(0);}
        }

    }
    public static void main(String args[]) {
        SwingUtilities.invokeLater(() -> new TicTacToe());
    }
}
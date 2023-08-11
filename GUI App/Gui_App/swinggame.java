package Gui_App;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class swinggame extends JFrame {
    private JLabel resultLabel;
    private JButton rockButton;
    private JButton paperButton;
    private JButton scissorsButton;

    public swinggame() {
        super("Rock, Paper, Scissors Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 3, 10, 10));

        resultLabel = new JLabel("Choose an option:", SwingConstants.CENTER);
        resultLabel.setFont(new Font("Arial", Font.BOLD, 18));

        rockButton = createGameButton("Rock");
        paperButton = createGameButton("Paper");
        scissorsButton = createGameButton("Scissors");

        buttonPanel.add(rockButton);
        buttonPanel.add(paperButton);
        buttonPanel.add(scissorsButton);

        add(resultLabel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }

    private JButton createGameButton(String label) {
        JButton button = new JButton(label);
        button.setFont(new Font("Arial", Font.PLAIN, 14));
        button.addActionListener(new GameButtonListener(label));
        return button;
    }

    private class GameButtonListener implements ActionListener {
        private String playerChoice;

        public GameButtonListener(String choice) {
            playerChoice = choice;
        }

        public void actionPerformed(ActionEvent event) {
            String[] options = {"Rock", "Paper", "Scissors"};
            String computerChoice = options[new Random().nextInt(options.length)];

            String result = determineWinner(playerChoice, computerChoice);
            resultLabel.setText("<html>Player chose " + playerChoice + ".<br>Computer chose " + computerChoice + ".<br>" + result + "</html>");
        }

        private String determineWinner(String player, String computer) {
            if (player.equals(computer)) {
                return "It's a tie!";
            } else if ((player.equals("Rock") && computer.equals("Scissors")) ||
                    (player.equals("Paper") && computer.equals("Rock")) ||
                    (player.equals("Scissors") && computer.equals("Paper"))) {
                return "Player wins!";
            } else {
                return "Computer wins!";
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception e) {
                e.printStackTrace();
            }

            swinggame game = new swinggame();
            game.setVisible(true);
        });
    }
}

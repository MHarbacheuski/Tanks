package GameMain;

import static GameMain.Menu.loadFont;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JPanel;


/**
 * A class for showing the totalScore
 */
public class ScoreBoard extends JPanel implements ActionListener, KeyListener {

    /**
     * Initialize instance variables for the ScoreBoard
     */
    private GameView theView;
    private int stage, totalTankNum;
    private int totalScore = 0;
    private final int SHIFT = 80;
    private JButton restartButton;
    private JButton exitButton;
    private final ImageUtility imageInstance = ImageUtility.getInstance();
    private int[] tankScoreList = {0, 0, 0, 0};
    private int[] tankNumList = {0, 0, 0, 0};

    /**
     * Constructor for the ScoreBoard. A restart button is added for the player
     * to restart the game
     */
    public ScoreBoard(GameView theView) {
        this.theView = theView;
        this.setFocusable(true);
        theView.setForeground(Color.BLACK);
        this.setLayout(null);

        restartButton = new JButton();
        restartButton.setText("Restart");
        this.add(restartButton);
        restartButton.setBounds(500, 600,
                100, 30);
        restartButton.addActionListener(this);

        exitButton = new JButton();
        exitButton.setText("Exit");
        this.add(exitButton);
        exitButton.setBounds(200, 600,
                100, 30);
        exitButton.addActionListener(this);
    }

    /**
     * Draw the scoreBorad with different types of enemies on the screen.
     */
    @Override
    public void paintComponent(Graphics g) {
        loadScore();
        stage = Board.getStage();
        super.paintComponent(g);
        Font font = loadFont();
        ArrayList<Image> tankList = new ArrayList<>(
                Arrays.asList(imageInstance.getTankBasic(),
                        imageInstance.getTankFast(),
                        imageInstance.getTankPower(),
                        imageInstance.getTankArmor()));

        // Display High totalScore
        g.setFont(font);
        g.setColor(Color.WHITE);
        g.drawString("STAGE   " + String.valueOf(stage), 230 + SHIFT, 200);

        g.setColor(Color.RED);
        g.drawString("1-PLAYER", 235 + SHIFT, 240);

        g.setColor(Color.orange);
        g.drawString("Total points", 180 + SHIFT, 270);

        g.setColor(Color.orange);
        g.drawString(String.valueOf(totalScore), 385 + SHIFT, 272);

        for (int i = 0; i < 4; i++) {
            g.drawImage(tankList.get(i), 380 + SHIFT, 290 + (i * 45), this);
            g.drawImage(imageInstance.getArrow(), 350 + SHIFT, 300 + (i * 45),
                    this);
        }
        for (int i = 0; i < 4; i++) {
            g.setColor(Color.WHITE);
            g.drawString(String.valueOf(tankScoreList[i]), 185 + SHIFT,
                    312 + (i * 45));
            g.drawString("PTS", 250 + SHIFT, 312 + (i * 45));
        }

        for (int i = 0; i < 4; i++) {
            g.setColor(Color.WHITE);
            g.drawString(String.valueOf(tankNumList[i]), 320 + SHIFT,
                    312 + (i * 45));
        }

        // total underline
        g.drawLine(270, 480, 500, 480);

        g.drawString("TOTAL killed", 200 + SHIFT, 500);
        g.drawString(String.valueOf(totalTankNum), 400 + SHIFT, 500);
        g.setFont(font);
        g.setColor(Color.WHITE);
    }

    /**
     * Load the totalScore of the player from the CollisionUtility class.
     */
    public void loadScore() {
        for (int i = 0; i < 4; i++) {
            int[] enemyTankNum = CollisionUtility.getEnemyTankNum();
            tankNumList[i] = enemyTankNum[i];
        }
        for (int i = 0; i < 4; i++) {
            tankScoreList[i] = tankNumList[i] * 100 * (i + 1);
        }
        for (Integer score : tankScoreList) {
            totalScore += score;
        }
        for (Integer num : tankNumList) {
            totalTankNum += num;
        }
    }

    /**
     * Restart the game, load the menu and reset player's totalScore.
     */
    public void restart() {
        Board.gameOver = false;
        CollisionUtility.resetScore();
        loadMenu();
    }

    public void exit() {
        System.exit(0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == restartButton) {
            restart();
        }
        if (e.getSource() == exitButton) {
            exit();
        }
    }

    /**
     * Load the menu to the game panel if the player chooses to restart the
     * game.
     */
    private void loadMenu() {
        theView.getGamePanel().removeAll();
        Menu menu = new Menu(theView);
        menu.revalidate();
        menu.repaint();
        theView.getGamePanel().add(menu);
        menu.requestFocusInWindow();
        theView.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            loadMenu();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            loadMenu();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            loadMenu();
        }
    }
}

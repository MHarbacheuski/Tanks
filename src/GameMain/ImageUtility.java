package GameMain;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 * An class that loads all the images.
 */
public class ImageUtility {
    // Instance vairables for the images
    private final Image lives, flagIcon, enemyIcon;
    private final Image arrow, tankBasic, tankFast, tankPower, tankArmor;
    private final Image background, tank, tree2;
    private static ImageUtility instance;

    /**
     * Get the instance of the ImageUtility
     */
    public static ImageUtility getInstance() {
        if (instance == null) {
            return new ImageUtility();
        }
        return instance;
    }

    private ImageUtility() {
        lives = loadImage("image/lives.png");
        flagIcon = loadImage("image/flag.png");
        enemyIcon = loadImage("image/enemy.png");
        arrow = loadImage("image/arrow.png");
        tankBasic = loadImage("image/tank_basic.png");
        tankFast = loadImage("image/tank_fast.png");
        tankPower = loadImage("image/tank_power.png");
        tankArmor = loadImage("image/tank_armor.png");
        background = loadImage("image/battle_city.png");
        tank = loadImage("image/playerTank_right.png");
        tree2 = loadImage("image/trees2.png");
    }

    /**
     * Load images given the image address
     */
    public Image loadImage(String imageAddress) {
        ImageIcon icon = new ImageIcon(imageAddress);
        return icon.getImage();
    }

    // Getter for different images
    public Image getLives() {
        return lives;
    }


    public Image getFlagIcon() {
        return flagIcon;
    }


    public Image getEnemyIcon() {
        return enemyIcon;
    }


    public Image getArrow() {
        return arrow;
    }


    public Image getTankBasic() {
        return tankBasic;
    }

    public Image getTankFast() {
        return tankFast;
    }


    public Image getTankPower() {
        return tankPower;
    }


    public Image getTankArmor() {
        return tankArmor;
    }

    public Image getBackground() {
        return background;
    }


    public Image getTree2() {
        return tree2;
    }


    public Image getTank() {
        return tank;
    }

}

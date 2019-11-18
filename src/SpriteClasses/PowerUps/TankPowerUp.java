package SpriteClasses.PowerUps;

public class TankPowerUp extends PowerUp {
    public TankPowerUp(int x, int y) {
        super(x, y);
        loadImage("image/powerup_tank.png");
        getImageDimensions();
        setType(7);
        s = "image/powerup_tank.png";
    }

}

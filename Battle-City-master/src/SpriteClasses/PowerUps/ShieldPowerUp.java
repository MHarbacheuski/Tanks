package SpriteClasses.PowerUps;

public class ShieldPowerUp extends PowerUp {
    public ShieldPowerUp(int x, int y) {
        super(x, y);
        loadImage("image/powerup_helmet.png");
        getImageDimensions();
        setType(12);
        s = "image/powerup_helmet.png";
    }

}

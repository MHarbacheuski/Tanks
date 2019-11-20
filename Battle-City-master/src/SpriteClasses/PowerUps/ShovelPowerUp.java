package SpriteClasses.PowerUps;

public class ShovelPowerUp extends PowerUp {
    public ShovelPowerUp(int x, int y) {
        super(x, y);
        loadImage("image/powerup_shovel.png");
        getImageDimensions();
        setType(11);
        s = "image/powerup_shovel.png";
    }

}

package SpriteClasses;

public class Steel extends Block {

    public Steel(int x, int y) {
        super(x, y);
        loadImage("image/wall_steel.png");
        getImageDimensions();
        setHealth(1);
        setType(2);
    }

}

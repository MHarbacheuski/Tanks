
package SpriteClasses;

public class Base extends Block {
    public boolean gameOver = false;

    public Base(int x, int y) {
        super(x, y);
        loadImage("image/base.png");
        getImageDimensions();
        setHealth(1);
        setType(3);

    }

    public void updateAnimation() {
        if (gameOver == true) {
            loadImage("image/base_destroyed.png");
            getImageDimensions();

        }
    }

}

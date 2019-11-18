package SpriteClasses.PowerUps;

import SpriteClasses.Sprite;

public class PowerUp extends Sprite {
    long loadTime;
    private int type;
    boolean flip = false;
    String s;

    public PowerUp(int x, int y) {
        super(x, y);
        loadTime = System.currentTimeMillis();
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public long getLoadTime() {
        return loadTime;
    }

    public void updateAnimation() {
        long timeDifference = (System.currentTimeMillis() - loadTime);
        if (timeDifference > 5000) {

            if (timeDifference % 10 == 0 && flip == false) {
                loadImage("");
                getImageDimensions();
                flip = true;
            } else if (timeDifference % 10 == 0 && flip == true) {
                loadImage(s);
                getImageDimensions();
                flip = false;
            }
        }
    }

}

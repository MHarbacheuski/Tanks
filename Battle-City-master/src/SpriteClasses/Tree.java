package SpriteClasses;

public class Tree extends Block {
    public Tree(int x, int y) {
        super(x, y);
        loadImage("image/trees.png");
        getImageDimensions();
        setType(5);
        setHealth(1);
    }

}

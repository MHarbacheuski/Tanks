package GameMain;


public enum BlockType {

    /**
     * Enum types for blocks on the map
     */
    BLANK(0), BRICK(1), STEEL(2), BASE(3), RIVER(4), TREE(5), EDGE(6), TANK(7), STAR(
            8), BOMB(9), CLOCK(10), SHOVEL(11), SHIELD(12);
    // Integer that represents the value of each enum type
    private final int value;

    /**
     * Constructor of the block type
     */
    private BlockType(int value) {
        this.value = value;
    }

    /**
     * Return integer values that correspond each enum type
     */
    public int getValue() {
        return value;
    }

    /**
     * Return block type given integer value
     */
    public static BlockType getTypeFromInt(int value) {
        return BlockType.values()[value];
    }

}

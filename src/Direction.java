
public enum Direction {
    N("W", "E"),
    E("N", "S"),
    S("E", "W"),
    W("S", "N");

    private String left;
    private String right;

    private Direction(String left, String right) {
        this.left = left;
        this.right = right;
    }

    public Direction left() {
        return Direction.valueOf(this.left);
    }

    public Direction right() {
        return Direction.valueOf(this.right);
    }
}

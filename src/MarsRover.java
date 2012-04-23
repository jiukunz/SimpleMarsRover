public class MarsRover {
    private int x;
    private int y;
    private Direction direction;

    public MarsRover(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void turnLeft() {
        this.direction = this.direction.left();
    }

    public String status() {
        return this.x + " " + this.y + " " + this.direction;
    }

    public void turnRight() {
        this.direction = this.direction.right();
    }
}

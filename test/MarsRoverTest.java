import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class MarsRoverTest {
    @Test
    public void should_return_marsrover_status_when_execute_left_command() {
        MarsRover marsRover = new MarsRover(5,5,Direction.N);

        marsRover.turnLeft();

        assertEquals("5 5 W",marsRover.status());
    }

    @Test
    public void should_return_marsrover_status_when_execute_right_command() {
        MarsRover marsRover = new MarsRover(5,5,Direction.W);

        marsRover.turnRight();

        assertEquals("5 5 N",marsRover.status());
    }
}

package levy.fallingsand;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SandTest {

    @Test
    public void string() {
        //given
        Sand sand = new Sand(3, 3);
        //when
        String actual = sand.toString();
        //then
        assertEquals("000\n000\n000\n", actual);
    }



    @Test
    public void put() {
        //given
        Sand sand = new Sand(3, 3);
        //when
        sand.put(1, 0);
        //then
        assertEquals("010\n000\n000\n", sand.toString());
    }



    @Test
    public void fall() {
        //given
        Sand sand = new Sand(3, 3);
        sand.put(1, 0);
        //when
        sand.fall();
        //then
        assertEquals("000\n010\n000\n", sand.toString());
    }



    @Test
    public void fallonGround() {
        //given
        Sand sand = new Sand(3, 3);
        sand.put(1, 2);
        //when
        sand.fall();
        //then
        assertEquals("000\n000\n010\n", sand.toString());
    }


    @Test
    public void falltoTheRight() {
        //given
        Sand sand = new Sand(3, 3);
        sand.put(1, 1);
        sand.put(1, 2);
        sand.put(0, 2);
        //when
        sand.fall();
        //then
        assertEquals("000\n000\n111\n", sand.toString());
    }


    @Test
    public void falltoTheLeft() {
        //given
        Sand sand = new Sand(3, 3);
        sand.put(1, 1);
        sand.put(1, 2);
        sand.put(2, 2);
        //when
        sand.fall();
        //then
        assertEquals("000\n000\n111\n", sand.toString());
    }


    @Test
    public void fallSimultaneously() {
        //given
        Sand sand = new Sand(3, 3);
        sand.put(1, 0);
        sand.put(1, 1);
        //when
        sand.fall();
        //then
        assertEquals("000\n010\n010\n", sand.toString());
    }

    @Test
    public void fallLeftEdge() {
        // given
        Sand sand = new Sand(3, 3);
        sand.put(0, 1);
        sand.put(0, 2);
        sand.put(1, 2);

        // when
        sand.fall();

        // then
        assertEquals("000\n100\n110\n", sand.toString());
    }

    @Test
    public void fallRightEdge() {
        // given
        Sand sand = new Sand(3, 3);
        sand.put(2, 1);
        sand.put(1, 2);
        sand.put(2, 2);

        // when
        sand.fall();

        // then
        assertEquals("000\n001\n011\n", sand.toString());
    }

}
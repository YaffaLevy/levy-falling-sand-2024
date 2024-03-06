package levy.fallingsand;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SandTest {

    @Test
    public void string() {
        //given
        Sand sand = new Sand();
        //when
        String actual = sand.toString();
        //then
        assertEquals("000\n000\n000\n", actual);
    }


    @Test
    public void put() {
        //given
        Sand sand = new Sand();
        //when
        sand.put(1, 0);
        //then
        assertEquals("010\n000\n000\n", sand.toString());
    }


    @Test
    public void fall() {
        //given
        Sand sand = new Sand();
        sand.put(1,0);
        //when
        sand.fall();
        //then
        assertEquals("000\n010\n000\n", sand.toString());
    }


    @Test
    public void fallonGround() {
        //given
        Sand sand = new Sand();
        sand.put(1, 2);
        //when
        sand.fall();
        //then
        assertEquals("000\n000\n010\n", sand.toString());
    }


    @Test
    public void fallonOtherSand() {
        //given
        Sand sand = new Sand();
        sand.put(1, 1);
        sand.put(1, 2);
        //when
        sand.fall();
        //then
        assertEquals("000\n010\n010\n", sand.toString());
    }

}
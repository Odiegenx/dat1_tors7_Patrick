package Task1TV;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class TVTest {

    TV tv1 = new TV();
    TV tv2 = new TV();
    @BeforeEach
        void setup () {
            tv1.turnOn();
            /*tv1.setChannel(30);
            tv1.setVolume(3);*/

            /*tv2.channelUp();
            tv2.channelUp();
            tv2.turnOn();
            tv2.volumeUp();*/
        }

    @org.junit.jupiter.api.Test
    void setChannel() {
        //tv1.turnOn();
        tv1.setChannel(30);
        assertEquals(30,tv1.getChannel());
    }

    @org.junit.jupiter.api.Test
    void setVolume() {
        //tv1.turnOn();
        tv1.setVolume(3);
        assertEquals(3,tv1.getVolume());
    }

    @org.junit.jupiter.api.Test
    void channelUp() {
        tv2.channelUp();
        assertEquals(0,tv2.getChannel());
        tv2.channelUp();
        assertEquals(0,tv2.getChannel());
    }

    @org.junit.jupiter.api.Test
    void channelDown() {
    }

    @org.junit.jupiter.api.Test
    void volumeUp() {
        tv2.turnOn();
        int tmpgetVolume = tv2.getVolume();
        tv2.volumeUp();
        assertEquals(tmpgetVolume+1,tv2.getVolume());
    }

    @org.junit.jupiter.api.Test
    void volimeDown() {
    }

    @org.junit.jupiter.api.Test
    void turnOn() {
        tv1.turnOn();
        assertTrue(tv1.getOn());
        tv2.turnOn();
        assertTrue(tv2.getOn());
    }


    @org.junit.jupiter.api.Test
    void turnOff() {
    }
}
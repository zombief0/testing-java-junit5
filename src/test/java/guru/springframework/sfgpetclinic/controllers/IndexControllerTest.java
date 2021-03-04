package guru.springframework.sfgpetclinic.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

class IndexControllerTest {
    IndexController indexController;
    @BeforeEach
    void setUp() {
        indexController = new IndexController();
    }

    @DisplayName("Test proper view name is returned")
    @Test
    void index() {
        assertEquals("index",indexController.index());
        assertEquals("index",indexController.index(),() -> "expensive message");
        assertThat(indexController.index()).isEqualTo("index");
    }

    @Test
    void oupsHandler() {
        assertThrows(ValueNotFoundException.class,() ->{
            indexController.oupsHandler();
        });
       // assertTrue("notimplemented".equals(indexController.oupsHandler()));
    }

    @Test
    @Disabled("Demo of timeout")
    void testTimeout(){
        assertTimeout(Duration.ofMillis(100),() ->{
            Thread.sleep(2000);
            System.out.println("I got here");
        });
    }

    @Test
    @Disabled("Demo of timeout prempt")
    void testTimeoutPrempt(){
        assertTimeoutPreemptively(Duration.ofMillis(100),() ->{
            Thread.sleep(2000);
            System.out.println("I got here 25566616");
        });
    }

    @Test
    void testAssumptionTrue(){
        assumeTrue("Guru".equalsIgnoreCase(System.getenv("GURU_RUNTIME")));
    }
}

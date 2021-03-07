package guru.springframework.sfgpetclinic;

import org.junit.jupiter.api.*;

@Tag("repeated")
public interface ModelRepeatedTests {

    @BeforeEach
    @RepeatedTest(value = 10,name = "{displayName} : {currentRepetition} / {totalRepetitions}")
    @DisplayName("Repeated Person Test")
    default void beforeAll(TestInfo testInfo, RepetitionInfo repetitionInfo){
        System.out.println(testInfo.getDisplayName() + ": " + repetitionInfo.getCurrentRepetition());

    }
}

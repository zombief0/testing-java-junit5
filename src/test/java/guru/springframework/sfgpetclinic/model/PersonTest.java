package guru.springframework.sfgpetclinic.model;

import guru.springframework.sfgpetclinic.ModelTests;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@Tag("model")
class PersonTest implements ModelTests {

    @Test
    void groupedAssertions(){
        Person person = new Person(1L,"Joe","Buck");

        assertAll("Test Props Set",
                () -> assertEquals(person.getFirstName(),"Joe"),
                () -> assertEquals(person.getLastName(),"Buck"));
    }

    @Test
    void groupedAssertionsMsgs(){
        Person person = new Person(1L,"Joe","Buck");

        assertAll("Test Props Set",
                () -> assertEquals(person.getFirstName(),"Joe2","First Name Failed"),
                () -> assertEquals(person.getLastName(),"Buckxxx","Last Name Failed"));
    }

    @RepeatedTest(10)
    void myRepeatedTest(){
        //todo - impl
    }

    @RepeatedTest(5)
    void myRepeatedTestWithDI(TestInfo testInfo, RepetitionInfo repetitionInfo){
        //todo - impl
        System.out.println(testInfo.getDisplayName() + ": " +
                repetitionInfo.getCurrentRepetition());
    }

}

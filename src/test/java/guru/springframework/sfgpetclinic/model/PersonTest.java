package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

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
}

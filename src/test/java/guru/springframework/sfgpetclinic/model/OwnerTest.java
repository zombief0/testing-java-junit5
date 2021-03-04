package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

class OwnerTest {

    @Test
    void dependentAssertions(){
        Owner owner = new Owner(1L,"Joe","Buck");
        owner.setCity("Key West");
        owner.setTelephone("1236654523");

        assertAll("Properties Test",
                () -> assertAll("Person Properties",
                        () -> assertEquals("Joe",owner.getFirstName()),
                        () -> assertEquals("Buck", owner.getLastName())),
                () -> assertAll("Owner Properties",
                        () -> assertEquals("Key West",owner.getCity()),
                        () -> assertEquals("1236654523",owner.getTelephone())));
    assertThat(owner.getCity(),is("Key West"));
    }

}

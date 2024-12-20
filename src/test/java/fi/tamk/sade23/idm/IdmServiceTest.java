package fi.tamk.sade23.idm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IdmServiceTest {
    IdmService idmService;

    @BeforeEach
    void setUp() {
        idmService = new IdmService();
    }

    @Test
    void createIdentity() {
        IdentityStrategy strategy = new StudentStrategy(); // Create a StudentStrategy instance without arguments
        String firstName = "Matti";
        String lastName = "Virtanen";
        Identity identity = idmService.createIdentity(firstName, lastName, strategy);

        assertEquals("Matti Virtanen", identity.getDisplayName());
    }
}

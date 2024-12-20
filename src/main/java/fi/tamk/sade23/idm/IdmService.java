package fi.tamk.sade23.idm;

import java.util.HashMap;

public class IdmService {
    private HashMap<Integer, Identity> identityHashMap = new HashMap<>();
    private static Integer idCounter = 1;

    public Identity createIdentity(String firstName, String lastName, IdentityStrategy strategy) {
        Identity identity = new Identity(firstName, lastName, strategy);
        identity.setId(idCounter);
        identityHashMap.put(idCounter, identity);
        idCounter++;
        return identity;
    }
}

package nestedclasses.dns;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameServerTest {

    @Test
    void addEntry() {

        NameServer nameServer = new NameServer();
        nameServer.addEntry("valami.hu", "112.152.201.136");
        nameServer.addEntry("megvalami.com", "98.112.221.36");
        nameServer.addEntry("esmegvalami.org", "2.202.21.148");

        assertEquals(3, nameServer.getDnsEntries().size());

        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                ()-> nameServer.addEntry("megvalami.com", "98.112.221.36"));
        assertEquals("Already exists", iae.getMessage());
    }
}
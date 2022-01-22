package nestedclasses.dns;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameServerTest {

    NameServer nameServer = new NameServer();

    @BeforeEach
    void init() {
        nameServer.addEntry("valami.hu", "112.152.201.136");
        nameServer.addEntry("megvalami.com", "98.112.221.36");
        nameServer.addEntry("esmegvalami.org", "2.202.21.148");
    }

    @Test
    void addEntryTest() {

        assertEquals(3, nameServer.getDnsEntries().size());

        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                ()-> nameServer.addEntry("megvalami.com", "98.112.221.36"));
        assertEquals("Already exists", iae.getMessage());
    }

    @Test
    void removeEntryByNameTest() {
        nameServer.removeEntryByName("megvalami.com");
        assertEquals(2, nameServer.getDnsEntries().size());
        assertEquals("valami.hu", nameServer.getEntryHostNameByIndex(0));
        assertEquals("esmegvalami.org", nameServer.getEntryHostNameByIndex(1));
    }

    @Test
    void removeEntryByIpTest() {
        nameServer.removeEntryByIp("98.112.221.36");
        assertEquals(2, nameServer.getDnsEntries().size());
        assertEquals("112.152.201.136", nameServer.getEntryHostIpByIndex(0));
        assertEquals("2.202.21.148", nameServer.getEntryHostIpByIndex(1));
    }

    @Test
    void getNameByNameTest() {
        assertEquals("98.112.221.36", nameServer.getIpByName("megvalami.com"));
    }

    @Test
    void getNameByIpTest() {
        assertEquals("megvalami.com", nameServer.getNameByIp("98.112.221.36"));
    }
}
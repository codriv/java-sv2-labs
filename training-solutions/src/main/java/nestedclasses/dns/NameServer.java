package nestedclasses.dns;

import java.util.ArrayList;
import java.util.List;

public class NameServer {

    private List<DnsEntry> dnsEntries = new ArrayList<>();

    public List<DnsEntry> getDnsEntries() {
        return dnsEntries;
    }

    private static class DnsEntry {

        private String hostName;
        private String hostIp;

        public DnsEntry(String name, String hostIp) {
            this.hostName = name;
            this.hostIp = hostIp;
        }
    }

    public void addEntry(String hostName, String hostIp) {
        if (isAlreadyInList(hostName, hostIp)) {
            throw new IllegalArgumentException("Already exists");
        } else {
            dnsEntries.add(new DnsEntry(hostName, hostIp));
        }
    }

    private boolean isAlreadyInList(String hostName, String hostIp) {
        for (DnsEntry dnsEntry: dnsEntries) {
            if (hostName.equals(dnsEntry.hostName) || hostIp.equals(dnsEntry.hostIp)) {
                return true;
            }
        }
        return false;
    }
}
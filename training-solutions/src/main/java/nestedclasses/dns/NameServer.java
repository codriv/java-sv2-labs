package nestedclasses.dns;

import java.util.ArrayList;
import java.util.Iterator;
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

        public String getHostName() {
            return hostName;
        }

        public String getHostIp() {
            return hostIp;
        }
    }

    public String getEntryHostNameByIndex(int i) {
        return dnsEntries.get(i).getHostName();
    }

    public String getEntryHostIpByIndex(int i) {
        return dnsEntries.get(i).getHostIp();
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

    public void removeEntryByName(String hostName) {
        Iterator<DnsEntry> iterator = dnsEntries.iterator();
        while (iterator.hasNext()) {
            if (hostName.equals(iterator.next().hostName)) {
                iterator.remove();
            }
        }
    }

    public void removeEntryByIp(String hostIp) {
        Iterator<DnsEntry> iterator = dnsEntries.iterator();
        while (iterator.hasNext()) {
            if (hostIp.equals(iterator.next().hostIp)) {
                iterator.remove();
            }
        }
    }

    public String getIpByName(String hostName) {
        for (DnsEntry dnsEntry: dnsEntries) {
            if (hostName.equals(dnsEntry.hostName)) {
                return dnsEntry.getHostIp();
            }
        }
        throw new IllegalArgumentException("Element not found");
    }

    public String getNameByIp(String hostIp) {
        for (DnsEntry dnsEntry: dnsEntries) {
            if (hostIp.equals(dnsEntry.hostIp)) {
                return dnsEntry.getHostName();
            }
        }
        throw new IllegalArgumentException("Element not found");
    }
}
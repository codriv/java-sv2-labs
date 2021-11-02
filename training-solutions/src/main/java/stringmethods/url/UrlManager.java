package stringmethods.url;

import java.util.Arrays;
import java.util.List;

public class UrlManager {
    public static void main(String[] args) {
//        String url = "https://earthquake.usgs.gov/";
        String url = "https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&starttime=2014-01-01&endtime=2014-01-02";
        UrlManager um = new UrlManager(url);
        System.out.println(um.protocol);
        System.out.println(um.host);
        System.out.println(um.port);
        System.out.println(um.path);
        System.out.println(um.query);
        System.out.println(um.hasProperty("starttime"));
        System.out.println(um.getProperty("format"));
        System.out.println(um.getProperty("starttime"));
        System.out.println(um.getProperty("endtime"));
    }

    private String protocol;
    private Integer port;
    private String host;
    private String path;
    private String query;

    public UrlManager(String url){
        String[] parts = url.split("/");
        setProtocol(url);
        setHost(parts);
        setPort(parts);
        setPath(parts);
        setQuery(url);
    }

    private void setProtocol(String url) {
        protocol = url.split(":")[0].toLowerCase();
    }

    private void setHost(String[] parts){
        host = parts[2].split(":")[0].toLowerCase();
    }

    private void setPort(String[] parts) {
        if (parts[2].contains(":")) {
            port = Integer.parseInt(parts[2].split(":")[1]);
        }
    }

    private void setPath(String[] parts) {
        path = parts.length > 3 ? String.join("/", Arrays.copyOfRange(parts, 3, (parts.length))).split("\\?")[0] : "";
    }

    private void setQuery(String url) {
            query = url.contains("?") ? url.split("\\?")[1] : "";
    }

    private String[] getProperties() {
        return query.equals("") ? new String[0] : query.split("&");
    }

    private String[] getKeys() {
        String[] keys = new String[getProperties().length];
        for (int i = 0; i < getProperties().length; i++) {
            keys[i] = getProperties()[i].split("=")[0];
        }
        return keys;
    }

    private String[] getValues() {
        String[] values = new String[getProperties().length];
        for (int i = 0; i < getProperties().length; i++) {
            values[i] = getProperties()[i].split("=")[1];
        }
        return values;
    }

    public String getProtocol() {
        return protocol;
    }

    public Integer getPort() {
        return port;
    }

    public String getHost() {
        return host;
    }

    public String getPath() {
        return path;
    }

    public boolean hasProperty(String key) {
        return Arrays.asList(getKeys()).contains(key);
    }

    public String getProperty(String key) {
        int index = Arrays.asList(getKeys()).indexOf(key);
        return index < 0 ? "Nincs ilyen" : Arrays.asList(getValues()).get(index);
    }
}

package stringconcat.nameconcat;

public class Name {
    private String familyName;
    private String middleName;
    private String givenName;
    private Title title;

    public Name(String familyName, String middleName, String givenName, Title title) {
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;
        this.title = title;
    }

    public Name(String familyName, String middleName, String givenName) {
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;
        this.title = title;
    }

    public String concatNameWesternStyle(){
        String fullName = "";
        if (title != null) {
            fullName = title.name().substring(0, 1) + title.name().substring(1).toLowerCase();
            fullName += " ";
        }
        fullName += givenName;
        fullName += " ";
        fullName += middleName;
        fullName += " ";
        fullName += familyName;
        fullName += " ";
        return fullName;
    }
    public String concatNameHungarianStyle() {
        String fullName = "";
        if (title != null) {
            fullName = title.name().substring(0, 1) + title.name().substring(1).toLowerCase().concat(" ");
        }
        fullName = fullName.concat(familyName);
        fullName = fullName.concat(" ");
        fullName = fullName.concat(middleName);
        fullName = fullName.concat(" ");
        fullName = fullName.concat(givenName);
        return fullName;
    }
}

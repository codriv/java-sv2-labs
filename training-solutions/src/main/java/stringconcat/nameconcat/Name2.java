package stringconcat.nameconcat;

public class Name2 {
    private String familyName;
    private String middleName;
    private String givenName;
    private Title2 title;

    public Name2(String familyName, String middleName, String givenName, Title2 title) {
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;
        this.title = title;
    }

    public Name2(String familyName, String middleName, String givenName) {
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;
    }

    public String concatNameWesternStyle(){
      String fullName = "";
      if (title != null) {
          fullName += title.getTitle();
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
            fullName = fullName.concat(title.getTitle()).concat(" ");
        }
        fullName = fullName.concat(familyName).concat(" ").concat(middleName).concat(" ").concat(givenName);
        return fullName;
    }
}

package dynamictypes.school;

public class SchoolMain {
    public static void main(String[] args) {
        School school = new School("iskola", 10);
        School primarySchool = new PrimarySchool("PrimarySchool", 8);
        School secondarySchool = new SecondarySchool("SecondarySchool", 6);
        System.out.println(school);
        System.out.println(primarySchool);
        System.out.println(secondarySchool);
    }
}

package interfacestaticmethods.schoolchild;

public interface PrimarySchoolChild {

    static PrimarySchoolChild of(int age) {
        if (6 <= age && age <= 10) {
            return new LowerClassSchoolChild(age);
        }
        if (11 <= age && age <= 14) {
            return new UpperClassSchoolChild(age);
        }
        throw new IllegalArgumentException("Age is not correct!");
    }
}

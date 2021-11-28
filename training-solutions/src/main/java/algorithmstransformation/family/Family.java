package algorithmstransformation.family;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Family {
    private List<FamilyMember> familyMembers;

    public Family() {
        this.familyMembers = new ArrayList<>();
    }

    public List<FamilyMember> getFamilyMembers() {
        return familyMembers;
    }

    public void addFamilyMember(FamilyMember familyMember) {
        familyMembers.add(familyMember);
    }

    public List<Integer> getAgesOfFamilyMembersWithNameGiven(String givenName) {
        List<Integer> agesOfFamilyMembersWithNameGiven = new ArrayList<>();
        for (FamilyMember familyMember: familyMembers) {
            List<String> nameParts = Arrays.asList(familyMember.getName().split(" "));
            if (nameParts.subList(1, nameParts.size()).contains(givenName)) {
                agesOfFamilyMembersWithNameGiven.add(familyMember.getAge());
            }
        }
        return agesOfFamilyMembersWithNameGiven;
    }
}

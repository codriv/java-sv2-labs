package collectionsequalshash;

import java.util.ArrayList;
import java.util.List;

public class RegistryCourt {

    public static void main(String[] args) {
        List<Company> companyList = new ArrayList<>();
        Company company1 = new Company("ceg_1", "123-456");
        Company company2 = new Company("ceg_2", "345-678");
        Company company3 = new Company("ceg_3", "987-654");
        Company company4 = new Company("ceg_2", "345-678");
        Company company5 = new Company("ceg_1", "654-321");
        Company company6 = new Company("ceg_6", "123-456");
        companyList.add(company1);
        companyList.add(company2);
        companyList.add(company3);
        System.out.println(companyList.contains(company4));
        System.out.println(companyList.contains(company5));
        System.out.println(companyList.contains(company6));
    }
}

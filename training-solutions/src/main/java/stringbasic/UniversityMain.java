package stringbasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniversityMain {
    public static void main(String[] args) {
        Person person1 = new Person("Nagy Sándor", "sandor@nagy.hu", "123-258-456", "54865212-00025412-00000000","+3652145874");
        Person person2 = new Person("Kis Mihály", "mihaly@kis.hu", "235-632-852", "21548756-00236518-00000000","+3641256987");
        Person person3 = new Person("Feket Péter", "peter@fekete.hu", "452-369-521", "52412598-23654785-25600014","+3685412547");

        Student student1 = new Student(person1, "SZE981336521", "OA452396125");
        Student student2 = new Student(person2, "SZE526348125", "OA254874523");
        Student student3 = new Student(person3, "SZE526348125", "OA254874523");

        University university = new University();
        university.getList().add(student1);
        university.getList().add(student2);
        university.getList().add(student3);

        System.out.println(university.areEqual(student1, student2));
        System.out.println(university.areEqual(student2, student3));
        System.out.println(university.getList().get(1).getPerson().getName());
        System.out.println(university.getList().get(2).getPerson().getName());

        student3.setEducationIdentifier("OA452632514");
        student3.setNeptunCode("SZE452154215");
        System.out.println(university.areEqual(student2, student3));
    }
}

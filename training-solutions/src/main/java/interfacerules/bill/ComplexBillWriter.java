package interfacerules.bill;

import java.util.List;

public class ComplexBillWriter implements BillWriter{

    public String writeBill(List<String> billItems) {
        StringBuilder itemsList = new StringBuilder();
        for (String line: billItems) {
            String[] parts = line.split(";");
            int price = Integer.parseInt(parts[1]);
            int numberOfItem = Integer.parseInt(parts[2]);
            itemsList.append(
                    parts[0] + "; darabszám: " + parts[2] + ", egységár: " + parts[1] + ", összesen: " + (price * numberOfItem) + " Ft\n");
        }
        return itemsList.toString();
    }
}

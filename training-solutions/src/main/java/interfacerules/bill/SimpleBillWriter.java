package interfacerules.bill;

import java.util.List;

public class SimpleBillWriter implements BillWriter{

    public String writeBill(List<String> billItems) {
        StringBuilder itemsList = new StringBuilder();
        for (String line: billItems) {
            String[] parts = line.split(";");
            int price = Integer.parseInt(parts[1]);
            int numberOfItem = Integer.parseInt(parts[2]);
            itemsList.append(
                    parts[0] + ", " + parts[2] + " * " + parts[1] + " = " + (price * numberOfItem) + " Ft\n");
        }
        return itemsList.toString();
    }
}

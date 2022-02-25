package lambdacomparator.cloud;

import java.util.Comparator;
import java.util.List;

public class Clouds {

    public CloudStorage alphabeticallyFirst(List<CloudStorage> cloudStorages) {
        cloudStorages.sort(new Comparator<CloudStorage>() {
            @Override
            public int compare(CloudStorage o1, CloudStorage o2) {
                return o1.getProvider().toLowerCase().compareTo(o2.getProvider().toLowerCase());
            }
        });
        return cloudStorages.get(0);
    }

    public CloudStorage alphabeticallyFirst2(List<CloudStorage> cloudStorages) {
        cloudStorages.sort(Comparator.comparing(CloudStorage::getProvider, (o1, o2) -> o1.toLowerCase().compareTo(o2.toLowerCase())));
        return cloudStorages.get(0);
    }

    public CloudStorage alphabeticallyFirst3(List<CloudStorage> cloudStorages) {
        cloudStorages.sort(Comparator.comparing(CloudStorage::getProvider, Comparator.comparing(String::toLowerCase)));
        return cloudStorages.get(0);
    }

    public CloudStorage bestPriceForShortestPeriod(List<CloudStorage> cloudStorages) {
        cloudStorages.sort(new Comparator<CloudStorage>() {
            @Override
            public int compare(CloudStorage o1, CloudStorage o2) {
                return (int)Math.round(((o1.getPrice() / o1.getPayPeriod().getLength() / o1.getSpace()) - (o2.getPrice() / o2.getPayPeriod().getLength() / o2.getSpace())) * 100);
            }
        });
        return cloudStorages.get(0);
    }

    public CloudStorage bestPriceForShortestPeriod3(List<CloudStorage> cloudStorages) {
        cloudStorages.sort((o1, o2) -> (int) Math.round(((o1.getPrice() / o1.getPayPeriod().getLength() / o1.getSpace()) - (o2.getPrice() / o2.getPayPeriod().getLength() / o2.getSpace())) * 100));
        return cloudStorages.get(0);
    }

    public List<CloudStorage> worstOffers(List<CloudStorage> cloudStorages) {
        cloudStorages.sort(Comparator.reverseOrder());
        return cloudStorages.subList(0, 3);
    }
}

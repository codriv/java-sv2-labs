package catalog;

import java.util.ArrayList;
import java.util.List;

public class Catalog {

    List<CatalogItem> catalogItems = new ArrayList<>();

    public void addItem(CatalogItem item) {
        catalogItems.add(item);
    }

    public List<CatalogItem> getAudioLibraryItems() {
        List<CatalogItem> audioLibraryItems = new ArrayList<>();
        for (CatalogItem catalogItem: catalogItems) {
            if (catalogItem.hasAudioFeature()) {
                audioLibraryItems.add(catalogItem);
            }
        }
        return audioLibraryItems;
    }

    public List<CatalogItem> getPrintedLibraryItems() {
        List<CatalogItem> printedLibraryItems = new ArrayList<>();
        for (CatalogItem catalogItem: catalogItems) {
            if (catalogItem.hasPrintedFeature()) {
                printedLibraryItems.add(catalogItem);
            }
        }
        return printedLibraryItems;
    }

    public int getAllPageNumber() {
        int allPageNumber = 0;
        for (CatalogItem catalogItem: catalogItems) {
            if (catalogItem.hasPrintedFeature()) {
                allPageNumber += catalogItem.numberOfPagesAtOneItem();
            }
        }
        return allPageNumber;
    }

    public int getFullLength() {
        int fullLength = 0;
        for (CatalogItem catalogItem: catalogItems) {
            if (catalogItem.hasAudioFeature()) {
                fullLength += catalogItem.fullLengthAtOneItem();
            }
        }
        return fullLength;
    }

    public double averagePageNumberOver(int lowLimit) {
        validateLimit(lowLimit);
        int numberOfItems = 0;
        int sumOfPages = 0;
        for (CatalogItem catalogItem: catalogItems) {
            if (catalogItem.hasPrintedFeature() && catalogItem.numberOfPagesAtOneItem() > lowLimit) {
                numberOfItems++;
                sumOfPages += catalogItem.numberOfPagesAtOneItem();
            }
        }
        return sumOfPages / (double)numberOfItems;
    }

    private void validateLimit(int lowLimit) {
        if (lowLimit > getAllPageNumber()) {
            throw new IllegalArgumentException("No page");
        }
        if (lowLimit < 1) {
            throw new IllegalArgumentException("Page number must be positive");
        }
    }

    public List<CatalogItem> findByCriteria(SearchCriteria criteria) {
        List<CatalogItem> itemsByCriteria = new ArrayList<>();
        for (CatalogItem item: catalogItems) {
            if (item.getTitles().contains(criteria.getTitle()) ||
                item.getContributors().contains(criteria.getContributor())) {
                itemsByCriteria.add(item);
            }
        }
        return itemsByCriteria;
    }

    public void deleteItemByRegistrationNumber(String regNumber) {
        CatalogItem itemToDelete = null;
        for (CatalogItem item: catalogItems) {
            if (regNumber.equals(item.getRegistrationNumber())) {
                itemToDelete = item;
            }
        }
        catalogItems.remove(itemToDelete);
    }
}

package stringmethods.filename;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FileNameManipulator {

    public static void main(String[] args) {
        FileNameManipulator fileNameManipulator = new FileNameManipulator();
        System.out.println(fileNameManipulator.findLastCharacter("FileName"));
        System.out.println(fileNameManipulator.findFileExtension("File.name.ext"));
        System.out.println(fileNameManipulator.identifyFilesByExtension("doc", "Dokumentum.doc"));
        System.out.println(fileNameManipulator.identifyFilesByExtension("doc", "Dokumentum.xls"));
        System.out.println(fileNameManipulator.compareFilesByName("File name.one", "File name.two"));
        System.out.println(fileNameManipulator.compareFilesByName("File name one.ext", "File name two.ext"));
        System.out.println(fileNameManipulator.changeExtensionToLowerCase("File name.DOC"));
        System.out.println(fileNameManipulator.replaceStringPart("File name original.ext", "original", "replaced"));
    }

    public char findLastCharacter(String str) {
        return str.charAt(str.length() - 1);
    }

    public String findFileExtension(String fileName) {
        String[] array = fileName.split("\\.");
        return array[array.length - 1];
    }

    public boolean identifyFilesByExtension (String ext, String fileName) {
        return findFileExtension(fileName).equals(ext);
    }

    public boolean compareFilesByName(String searchedFileName, String actualFileName) {
//        return searchedFileName.equals(actualFileName);   // filename includes extension
        int indexOfPointSearched = searchedFileName.lastIndexOf('.');
        int indexOfPointActual = actualFileName.lastIndexOf('.');
        return searchedFileName.substring(0, indexOfPointSearched).equals(actualFileName.substring(0, indexOfPointActual));
    }

    public String changeExtensionToLowerCase(String fileName) {
        int indexOfPoint = fileName.lastIndexOf('.');
        return fileName.substring(indexOfPoint + 1).toLowerCase();
    }

    public String replaceStringPart(String fileName, String present, String target) {
        return fileName.replace(present, target);
    }
}

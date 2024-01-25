package taskFour;

public class Main {
    public static void main(String[] args) {
        ShowFilesInCurrentDir showFilesInCurrentDir = new ShowFilesInCurrentDir();
        showFilesInCurrentDir.printFiles();

        showFilesInCurrentDir.printAllFilesRecursively();
    }
}

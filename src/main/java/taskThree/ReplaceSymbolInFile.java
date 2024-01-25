package taskThree;

import java.io.*;

public class ReplaceSymbolInFile {
    private String filename;

    public ReplaceSymbolInFile(String filename) {
        this.filename = filename;
    }

    public void replaceChar(char targetCharacter, char replacedCharacter) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename));
             BufferedWriter writer = new BufferedWriter(new FileWriter(filename + "_replaced"))) {
            while (reader.ready()) {
                char currentChar = (char) reader.read();
                if (currentChar == targetCharacter) {
                    writer.write(replacedCharacter);
                } else {
                    writer.write(currentChar);
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void replacePhrase(String actualWord, String target) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename));
             BufferedWriter writer = new BufferedWriter(new FileWriter(filename + "_replaced"))) {
            while (reader.ready()) {
                String currentString = reader.readLine();
                if (currentString.contains(actualWord)) {
                    writer.write(currentString.replace(actualWord, target));
                } else {
                    writer.write(currentString);
                }
                writer.newLine();
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

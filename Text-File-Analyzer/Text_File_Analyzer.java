package package1;

import java.io.*;
import java.util.*;

public class TextFileAnalyzer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file path: ");
        String path = sc.nextLine();

        int lines = 0;
        int words = 0;
        int characters = 0;

        try {
            File file = new File(path);
            Scanner fileReader = new Scanner(file);

            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();

                lines++;
                characters += line.length();

                String[] wordArray = line.split(" ");
                words += wordArray.length;
            }

            fileReader.close();

            System.out.println("\n--- File Analysis ---");
            System.out.println("Lines: " + lines);
            System.out.println("Words: " + words);
            System.out.println("Characters: " + characters);

            // Search word
            System.out.print("\nEnter word to search: ");
            String search = sc.nextLine();

            Scanner searchReader = new Scanner(file);
            int count = 0;

            while (searchReader.hasNextLine()) {
                String line = searchReader.nextLine();

                if (line.toLowerCase().contains(search.toLowerCase())) {
                    count++;
                }
            }

            searchReader.close();

            System.out.println("Word found in " + count + " line(s)");

        } catch (Exception e) {
            System.out.println("Error: File not found or cannot read.");
        }

        sc.close();
    }
}

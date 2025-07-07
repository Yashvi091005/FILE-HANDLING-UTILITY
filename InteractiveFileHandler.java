import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

public class InteractiveFileHandler {

    static String filePath = "sample.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n📁 FILE HANDLING MENU");
            System.out.println("1. Write to file");
            System.out.println("2. Read file");
            System.out.println("3. Modify file content");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.print("✍️ Enter content to write: ");
                    String content = scanner.nextLine();
                    writeToFile(content);
                    break;
                case 2:
                    readFile();
                    break;
                case 3:
                    System.out.print("🔍 Enter content to replace: ");
                    String oldText = scanner.nextLine();
                    System.out.print("➡️ Enter new content: ");
                    String newText = scanner.nextLine();
                    modifyFile(oldText, newText);
                    break;
                case 4:
                    System.out.println("👋 Exiting program. Bye BOSS!");
                    break;
                default:
                    System.out.println("❌ Invalid choice. Try again!");
            }

        } while (choice != 4);

        scanner.close();
    }

    public static void writeToFile(String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
            System.out.println("✅ Content written successfully.");
        } catch (IOException e) {
            System.err.println("❌ Error writing to file: " + e.getMessage());
        }
    }

    public static void readFile() {
        System.out.println("\n📖 File Content:");
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("❌ Error reading file: " + e.getMessage());
        }
    }

    public static void modifyFile(String target, String replacement) {
        try {
            String content = new String(Files.readAllBytes(Paths.get(filePath)));
            content = content.replace(target, replacement);

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
                writer.write(content);
            }

            System.out.println("🔁 File modified successfully.");
        } catch (IOException e) {
            System.err.println("❌ Error modifying file: " + e.getMessage());
        }
    }
}

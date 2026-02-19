import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class UT_Main {

    // base
    public static void main() throws IOException {


        System.out.println(getOperatingSys());
        if (getOperatingSys().equals("unknown"))
        {
            System.out.print("CODE: 150");
            System.out.println("Unknown OS or Linux(Unsupported). Exiting.");
            System.exit(0);
        }

        // start
        String os = getOperatingSys();
        String file0dir = "";

        if (os.equals("windows")) {
            file0dir = System.getProperty("user.home") + "\\AppData\\Local\\UNDERTALE\\file0";
        } else if (os.equals("macos")) {
            file0dir = System.getProperty("user.home") + "/Library/Application Support/com.tobyfox.undertale/file0";
        }


        System.out.println("dir: " + file0dir);
        List<String> file0lines = Files.readAllLines(Path.of(file0dir));
        System.out.println("Press Enter to continue or type exit to quit.");
        System.out.println("You can also type edit, to edit your save file.");


        // enter or exit
        Scanner enterinp = new Scanner(System.in);
        String enterinp_str = enterinp.nextLine();
        if (enterinp_str.equals("exit"))
        {
            System.out.print("Exiting.");
            System.exit(0);
        }

        System.out.print("Name: ");
        System.out.println(file0lines.getFirst());

        System.out.print("LV: ");
        System.out.println(file0lines.get(1));

        System.out.print("MaxHP: ");
        System.out.println(file0lines.get(2) + "/ " + file0lines.get(2));

        System.out.print("ATTACK: ");
        System.out.println(file0lines.get(4));

        System.out.print("DEFENSE: ");
        System.out.println(file0lines.get(6));

        System.out.print("XP: ");
        System.out.println(file0lines.get(9));

        System.out.print("GOLD: ");
        System.out.println(file0lines.get(12));

        System.out.print("KILLS: ");
        System.out.println(file0lines.get(11));

        System.out.print("FUN VALUE: ");
        System.out.println(file0lines.get(35));

        System.out.print("CURRENT ROOM: ");
        System.out.println(file0lines.get(547));

        System.out.print("mus_ID: ");
        System.out.println(file0lines.get(546));

        int game_time = Integer.parseInt((file0lines.get(548).trim()));
        game_time = game_time / 30 / 60;
        System.out.print("TIME PLAYED: ");
        System.out.println(game_time + " minutes");



    }

    private static String getOperatingSys()
    {
        String os = System.getProperty("os.name").toLowerCase();

        if (os.contains("win")) {
            System.out.println("windows");
            return "windows";
        } else if (os.contains("mac")) {
            System.out.println("macos");
            return "macos";
        } else {
            System.out.println("Unknown");
            return "unknown";
        }

    }


    public static void editSave() throws IOException {
        System.out.print(".");
    }

}
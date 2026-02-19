import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class UT_Main {

    // base
    public static void main(String[] args) throws IOException {



        // start
        String file0dir = System.getProperty("user.home") + "\\AppData\\Local\\UNDERTALE\\file0";
        System.out.println(file0dir);
        List<String> file0lines = Files.readAllLines(Path.of(file0dir));
        System.out.println("Press Enter to continue or type exit to quit.");


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
        System.out.println(file0lines.get(13));

        System.out.print("FUN VALUE: ");
        System.out.println(file0lines.get(37));

        System.out.print("CURRENT ROOM: ");
        System.out.println(file0lines.get(547));

        System.out.print("mus_ID: ");
        System.out.println(file0lines.get(546));











    }
}
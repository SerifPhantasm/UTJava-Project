import java.util.List;


public class SaveData {

    public String name;
    public int lv;
    public int maxHP;
    public int currentHP;
    public int attack;
    public int defense;
    public int xp;
    public int gold;
    public int kills;
    public int funValue;
    public String currentRoom;
    public int musId;
    public int timePlayed;

    public SaveData(List<String> lines) {
        this.name = lines.get(0);
        this.lv = Integer.parseInt(lines.get(1).trim());
        this.maxHP = Integer.parseInt(lines.get(2).trim());
        this.currentHP = Integer.parseInt(lines.get(3).trim());
        this.attack = Integer.parseInt(lines.get(4).trim());
        this.defense = Integer.parseInt(lines.get(6).trim());
        this.xp = Integer.parseInt(lines.get(9).trim());
        this.gold = Integer.parseInt(lines.get(12).trim());
        this.kills = Integer.parseInt(lines.get(11).trim());
        this.funValue = Integer.parseInt(lines.get(35).trim());
        this.currentRoom = lines.get(547);
        this.musId = Integer.parseInt(lines.get(546).trim());
        this.timePlayed = Integer.parseInt(lines.get(548).trim()) / 30 / 60;
    }
}

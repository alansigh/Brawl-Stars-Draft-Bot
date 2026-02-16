public class Brawler {
    private int id;
    private String name;
    private String rarity;
    private String brawlerClass;

    public Brawler(int id, String name, String rarity, String brawlerClass) {
        this.id = id;
        this.name = name;
        this.rarity = rarity;
        this.brawlerClass = brawlerClass;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRarity() {
        return rarity;
    }

    public String getBrawlerClass() {
        return brawlerClass;
    }

    @Override
    public String toString() {
        return name;
    }
    
    // Keeping this for compatibility with Main.java logic for now, 
    // but it should ideally be moved to a configuration or DB if needed.
    public static int getFirstPickBonus(String st) {
        if(st.equals("Colt")) return 90;
        else if(st.equals("Chuck")) return 100;
        else if(st.equals("8bit")) return 80;
        else if(st.equals("Belle")) return 70;
        else if(st.equals("Melody")) return 85;
        else if(st.equals("Angelo")) return 95;
        else return 0;
    }
}

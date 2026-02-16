import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DatabaseManager dbManager = new DatabaseManager();

        // Load brawlers from database
        List<Brawler> allBrawlers = dbManager.getAllBrawlers();
        if (allBrawlers.isEmpty()) {
            System.out.println("No brawlers found in the database. Please check your connection and data.");
            return;
        }

        // Create a map for easy lookup by name
        Map<String, Brawler> brawlerMap = new HashMap<>();
        for (Brawler b : allBrawlers) {
            brawlerMap.put(b.getName(), b);
        }

        // We'll use a list for the draft pool
        ArrayList<Brawler> draftPool = new ArrayList<>(allBrawlers);

        System.out.println("Are you first pick? (y/n)");
        String x = sc.nextLine();
        
        // Suggest bans (this logic was hardcoded, keeping it simple for now)
        if (x.equals("y")) {
            System.out.println("Ban Collete, Charlie, Eve");
        } else {
            System.out.println("Ban Angelo, Chuck, Melody");
        }
        
        System.out.println("--------------------");
        System.out.println("What were all of the 6 bans? (Format: Brawler1 Brawler2 ...)");
        String input = sc.nextLine();
        String[] bannedNames = input.split(" ");

        for (String bannedName : bannedNames) {
            if (brawlerMap.containsKey(bannedName)) {
                Brawler banned = brawlerMap.get(bannedName);
                draftPool.remove(banned);
            }
        }

        if (x.equals("y")) {
            // First Pick Logic
            Brawler bestFirstPick = null;
            double maxWinRate = -1;

            // Find best first pick based on average win rate from database
            for (Brawler b : draftPool) {
                double winRate = dbManager.getAverageWinRate(b.getId());
                
                if (winRate > maxWinRate) {
                    maxWinRate = winRate;
                    bestFirstPick = b;
                }
            }
            
            if (bestFirstPick != null) {
                System.out.println("Pick " + bestFirstPick.getName() + " (Avg Win Rate: " + String.format("%.2f", maxWinRate) + "%)");
                draftPool.remove(bestFirstPick);
            }

            System.out.println("What is the 2nd Pick?");
            String pick2Name = sc.nextLine();
            removeFromPool(draftPool, pick2Name);

            System.out.println("What is the 3rd Pick?");
            String pick3Name = sc.nextLine();
            removeFromPool(draftPool, pick3Name);

            // Suggest next pick based on matchups
            Brawler bestPick = findBestMatchup(draftPool, pick2Name, pick3Name, dbManager, brawlerMap);
            System.out.println("Pick " + (bestPick != null ? bestPick.getName() : "None"));
            if (bestPick != null) draftPool.remove(bestPick);

            // Suggest another pick
            bestPick = findBestMatchup(draftPool, pick2Name, pick3Name, dbManager, brawlerMap);
            System.out.println("Pick " + (bestPick != null ? bestPick.getName() : "None"));

        } else {
            // Second Pick Logic
            System.out.println("What is the 1st Pick?");
            String pick1Name = sc.nextLine();
            removeFromPool(draftPool, pick1Name);

            // Suggest counter to pick 1
            Brawler bestPick = findBestCounter(draftPool, pick1Name, dbManager, brawlerMap);
            System.out.println("Pick " + (bestPick != null ? bestPick.getName() : "None"));
            if (bestPick != null) draftPool.remove(bestPick);

            // Suggest another counter
            bestPick = findBestCounter(draftPool, pick1Name, dbManager, brawlerMap);
            System.out.println("Pick " + (bestPick != null ? bestPick.getName() : "None"));
            if (bestPick != null) draftPool.remove(bestPick);

            System.out.println("What is the 4th pick?");
            String pick4Name = sc.nextLine();
            removeFromPool(draftPool, pick4Name);

            System.out.println("What is the 5th pick?");
            String pick5Name = sc.nextLine();
            removeFromPool(draftPool, pick5Name);

            // Final pick considering all opponents
            bestPick = findBestCounterAgainstTeam(draftPool, pick1Name, pick4Name, pick5Name, dbManager, brawlerMap);
            System.out.println("Pick " + (bestPick != null ? bestPick.getName() : "None"));
        }
    }

    private static void removeFromPool(List<Brawler> pool, String name) {
        pool.removeIf(b -> b.getName().equalsIgnoreCase(name));
    }

    private static Brawler findBestMatchup(List<Brawler> pool, String enemy1, String enemy2, DatabaseManager db, Map<String, Brawler> map) {
        Brawler best = null;
        double maxScore = -1;

        Brawler e1 = map.get(enemy1);
        Brawler e2 = map.get(enemy2);

        for (Brawler candidate : pool) {
            double score = 0;
            if (e1 != null) score += db.getWinRate(candidate.getId(), e1.getId());
            if (e2 != null) score += db.getWinRate(candidate.getId(), e2.getId());
            
            if (score > maxScore) {
                maxScore = score;
                best = candidate;
            }
        }
        return best;
    }

    private static Brawler findBestCounter(List<Brawler> pool, String enemy, DatabaseManager db, Map<String, Brawler> map) {
        Brawler best = null;
        double maxScore = -1;
        Brawler e = map.get(enemy);

        if (e == null) return pool.isEmpty() ? null : pool.get(0);

        for (Brawler candidate : pool) {
            double score = db.getWinRate(candidate.getId(), e.getId());
            if (score > maxScore) {
                maxScore = score;
                best = candidate;
            }
        }
        return best;
    }

    private static Brawler findBestCounterAgainstTeam(List<Brawler> pool, String e1Name, String e2Name, String e3Name, DatabaseManager db, Map<String, Brawler> map) {
        Brawler best = null;
        double maxScore = -1;

        Brawler e1 = map.get(e1Name);
        Brawler e2 = map.get(e2Name);
        Brawler e3 = map.get(e3Name);

        for (Brawler candidate : pool) {
            double score = 0;
            if (e1 != null) score += db.getWinRate(candidate.getId(), e1.getId());
            if (e2 != null) score += db.getWinRate(candidate.getId(), e2.getId());
            if (e3 != null) score += db.getWinRate(candidate.getId(), e3.getId());

            if (score > maxScore) {
                maxScore = score;
                best = candidate;
            }
        }
        return best;
    }
}

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Angelo Melody Chuck Cordelius Colt Charlie Piper Collete Buzz 8bit Fang
        // Nani Sam Carl Max Eve Griff Belle Amber Ruffs Brock Bonnie Lola Bo Edgar Grom
        //Mandy Byron Bea Bibi Darryl Rico Jessie
        Brawler Angelo = new Brawler("Angelo",30,30,0);
        Brawler Melody = new Brawler("Melody", 30, 70,0);
        Brawler Chuck = new Brawler("Chuck",30,100,0);
        Brawler Cordelius = new Brawler("Cordelius",0,0,10);
        Brawler Colt = new Brawler("Colt",20,100,10);
        Brawler Charlie = new Brawler("Charlie",10,35,10);
        Brawler Piper = new Brawler("Piper",0,30,0);
        Brawler Collete = new Brawler("Collete",20,60,15);
        Brawler Buzz = new Brawler("Buzz",0,50,20);
        Brawler Eightbit = new Brawler("8bit",-20,100,0);
        Brawler Fang = new Brawler("Fang",0,30,10);
        Brawler Nani = new Brawler("Nani",-10,60,0);
        Brawler Sam = new Brawler("Sam",0,60,0);
        Brawler Carl = new Brawler("Carl",0,50,0);
        Brawler Max = new Brawler("Max",15,40,10);
        Brawler Eve = new Brawler("Eve",10,10,0);
        Brawler Griff = new Brawler("Griff",0,50,0);
        Brawler Belle = new Brawler("Belle",10,15,10);
        Brawler Amber = new Brawler("Amber",5,50,0);
        Brawler Ruffs = new Brawler("Ruffs",0,25,0);
        Brawler Brock = new Brawler("Brock",0,100,10);
        Brawler Bonnie = new Brawler("Bonnie",0,50,0);
        Brawler Lola = new Brawler("Lola",0,50,0);
        Brawler Bo = new Brawler("Bo",0,30,0);

        Brawler Grom = new Brawler("Grom",0,60,0);
        Brawler Edgar = new Brawler("Edgar",0,60,0);
        Brawler Crow = new Brawler("Crow",0,60,15);

        ArrayList<Brawler> Brawlers=new ArrayList<>();
        Collections.addAll(Brawlers, Angelo, Melody, Chuck, Cordelius, Colt, Charlie, Piper, Collete, Buzz, Eightbit, Fang, Nani, Sam, Carl, Max, Eve, Griff, Belle, Amber, Ruffs, Brock, Bonnie, Lola, Bo, Edgar);
        ArrayList<Brawler> FirstPicks=new ArrayList<>();
        Collections.addAll(FirstPicks, Angelo,Colt, Chuck, Eightbit, Belle, Melody);

        System.out.println("Are you first pick? (y/n)");
        String x=sc.nextLine();
        if(x.equals("y"))
        {
            System.out.println("Ban Collete, Charlie, Eve");
        }
        else
        {
            System.out.println("Ban Angelo, Chuck, Melody");
        }
        System.out.println("--------------------");
        System.out.println("What were all of the 6 bans? (Do not repeat if there are repeats;format it like:Brawler Brawler2 Brawler3 ");
        String input = sc.nextLine();
        String[] splitArray = input.split(" ");

        // Convert the array into an ArrayList
        ArrayList<String> BannedBrawlers = new ArrayList<>(Arrays.asList(splitArray));
        if(BannedBrawlers.contains("Angelo"))
        {
            Brawlers.remove(Angelo);
            FirstPicks.remove(Angelo);
        }
        if(BannedBrawlers.contains("Melody"))
        {
            Brawlers.remove(Melody);
            FirstPicks.remove(Melody);
        }
        if(BannedBrawlers.contains("Chuck"))
        {
            Brawlers.remove(Chuck);
            FirstPicks.remove(Chuck);
        }
        if(BannedBrawlers.contains("Cordelius"))
        {
            Brawlers.remove(Cordelius);
        }
        if(BannedBrawlers.contains("Colt"))
        {
            Brawlers.remove(Colt);
            FirstPicks.remove(Colt);
        }
        if(BannedBrawlers.contains("Charlie"))
        {
            Brawlers.remove(Charlie);
        }
        if(BannedBrawlers.contains("Piper"))
        {
            Brawlers.remove(Piper);
        }
        if(BannedBrawlers.contains("Collete"))
        {
            Brawlers.remove(Collete);
        }
        if(BannedBrawlers.contains("Buzz"))
        {
            Brawlers.remove(Buzz);
        }
        if(BannedBrawlers.contains("8bit"))
        {
            Brawlers.remove(Eightbit);
            FirstPicks.remove(Eightbit);
        }
        if(BannedBrawlers.contains("Fang"))
        {
            Brawlers.remove(Fang);
        }
        if(BannedBrawlers.contains("Nani"))
        {
            Brawlers.remove(Nani);
        }
        if(BannedBrawlers.contains("Sam"))
        {
            Brawlers.remove(Sam);
        }
        if(BannedBrawlers.contains("Carl"))
        {
            Brawlers.remove(Carl);
        }
        if(BannedBrawlers.contains("Max"))
        {
            Brawlers.remove(Max);
        }
        if(BannedBrawlers.contains("Eve"))
        {
            Brawlers.remove(Eve);
        }
        if(BannedBrawlers.contains("Griff"))
        {
            Brawlers.remove(Griff);
        }
        if(BannedBrawlers.contains("Belle"))
        {
            Brawlers.remove(Belle);
            FirstPicks.remove(Belle);
        }
        if(BannedBrawlers.contains("Amber"))
        {
            Brawlers.remove(Amber);
        }
        if(BannedBrawlers.contains("Ruffs"))
        {
            Brawlers.remove(Ruffs);
        }
        if(BannedBrawlers.contains("Brock"))
        {
            Brawlers.remove(Brock);
        }
        if(BannedBrawlers.contains("Bonnie"))
        {
            Brawlers.remove(Bonnie);
        }
        if(BannedBrawlers.contains("Lola"))
        {
            Brawlers.remove(Lola);
        }
        if(BannedBrawlers.contains("Bo"))
        {
            Brawlers.remove(Bo);
        }
        if(BannedBrawlers.contains("Edgar"))
        {
            Brawlers.remove(Edgar);
        }
        if(BannedBrawlers.contains("Grom"))
        {
            Brawlers.remove(Grom);
        }
        int maxbonus=0;
        Brawler bestbrawler=new Brawler("Angelo",30,40,0);

        if(x.equals("y"))
        {
            for (int i = 0; i < FirstPicks.size(); i++) {

                if (FirstPicks.get(i).getFirstPickBonus(FirstPicks.get(i).getName()) > maxbonus) {
                    maxbonus = FirstPicks.get(i).getFirstPickBonus(FirstPicks.get(i).getName());
                    bestbrawler=FirstPicks.get(i);
                }
            }
            Brawlers.remove(bestbrawler);

            System.out.println("Pick " +bestbrawler.getName());
            System.out.println("What is the 2nd Pick?");
            String fpick2=sc.nextLine();
            for(int i = 0;i<Brawlers.size();i++)
            {
                if(Brawlers.get(i).getName().equals(fpick2))
                {
                    Brawlers.remove(Brawlers.get(i));
                }
            }

            System.out.println("Size"+Brawlers.size());
            System.out.println("What is the 3rd Pick?");

            String fpick3=sc.nextLine();
            for(int i = 0;i<Brawlers.size();i++)
            {
                if(Brawlers.get(i).getName().equals(fpick3))
                {
                    Brawlers.remove(Brawlers.get(i));
                }
            }
            maxbonus=0;
            System.out.println("Size"+Brawlers.size());
            for(int c = 0;c<Brawlers.size();c++)
            {

                if(Brawlers.get(c).getMatchupBonus(fpick2)+Brawlers.get(c).getMatchupBonus(fpick3)+Brawlers.get(c).getMetabonus()+Brawlers.get(c).getHcbonus()>maxbonus)
                {
                    maxbonus=Brawlers.get(c).getMatchupBonus(fpick2)+Brawlers.get(c).getMatchupBonus(fpick3)+Brawlers.get(c).getMetabonus()+Brawlers.get(c).getHcbonus();
                    bestbrawler=Brawlers.get(c);

                }

            }
            System.out.println("Pick "+bestbrawler.getName());


            Brawlers.remove(bestbrawler);
            maxbonus=0;
            for(int c = 0;c<Brawlers.size();c++)
            {

                if(Brawlers.get(c).getMatchupBonus(fpick2)+Brawlers.get(c).getMatchupBonus(fpick3)+Brawlers.get(c).getMetabonus()+Brawlers.get(c).getHcbonus()>maxbonus)
                {
                    maxbonus=Brawlers.get(c).getMatchupBonus(fpick2)+Brawlers.get(c).getMatchupBonus(fpick3)+Brawlers.get(c).getMetabonus()+Brawlers.get(c).getHcbonus();
                    bestbrawler=Brawlers.get(c);

                }

            }
            System.out.println("Pick "+bestbrawler.getName());
        }
        else
        {
            System.out.println("What is the 1st Pick?");
            String lpick1=sc.nextLine();
            for(int i = 0;i<Brawlers.size();i++)
            {
                if(Brawlers.get(i).getName().equals(lpick1))
                {
                    Brawlers.remove(Brawlers.get(i));
                }
            }
            for(int c = 0;c<Brawlers.size();c++)
            {

                if(Brawlers.get(c).getMatchupBonus(lpick1)+Brawlers.get(c).getMetabonus()+Brawlers.get(c).getHcbonus()>maxbonus)
                {
                    maxbonus=Brawlers.get(c).getMatchupBonus(lpick1)+Brawlers.get(c).getMetabonus()+Brawlers.get(c).getHcbonus();
                    bestbrawler=Brawlers.get(c);

                }

            }
            System.out.println("Pick "+bestbrawler.getName());
            Brawlers.remove(bestbrawler);
            maxbonus=0;
            System.out.println(Brawlers.get(9).getMatchupBonus("Belle"));
            for(int c = 0;c<Brawlers.size();c++)
            {

                if(Brawlers.get(c).getMatchupBonus(lpick1)+Brawlers.get(c).getMetabonus()+Brawlers.get(c).getHcbonus()>maxbonus)
                {
                    maxbonus=Brawlers.get(c).getMatchupBonus(lpick1)+Brawlers.get(c).getMetabonus()+Brawlers.get(c).getHcbonus();
                    bestbrawler=Brawlers.get(c);

                }

            }
            System.out.println("Pick "+bestbrawler.getName());
            Brawlers.remove(bestbrawler);
            System.out.println("What is the 4th pick?");
            String lpick4=sc.nextLine();
            for(int i = 0;i<Brawlers.size();i++)
            {
                if(Brawlers.get(i).getName().equals(lpick4))
                {
                    Brawlers.remove(Brawlers.get(i));
                }
            }
            System.out.println("What is the 5th pick?");
            String lpick5=sc.nextLine();
            for(int i = 0;i<Brawlers.size();i++)
            {
                if(Brawlers.get(i).getName().equals(lpick5))
                {
                    Brawlers.remove(Brawlers.get(i));
                }
            }
            for(int c = 0;c<Brawlers.size();c++)
            {

                if(Brawlers.get(c).getMatchupBonus(lpick1)+Brawlers.get(c).getMatchupBonus(lpick4)+Brawlers.get(c).getMatchupBonus(lpick5)+Brawlers.get(c).getMetabonus()+Brawlers.get(c).getHcbonus()>maxbonus)
                {
                    maxbonus=Brawlers.get(c).getMatchupBonus(lpick1)+Brawlers.get(c).getMatchupBonus(lpick4)+Brawlers.get(c).getMatchupBonus(lpick5)+Brawlers.get(c).getMetabonus()+Brawlers.get(c).getHcbonus();
                    bestbrawler=Brawlers.get(c);

                }

            }
            System.out.println("Pick "+bestbrawler.getName());
        }



    }
}
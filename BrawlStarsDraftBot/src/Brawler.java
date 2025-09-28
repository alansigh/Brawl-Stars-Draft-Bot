import java.util.*;
import java.util.Collections;
public class Brawler {
    private int metabonus;
    private ArrayList<Integer> Bonus=new ArrayList<>();

    private int hcbonus;
    private String name;

    private int damage;

    public Brawler(String n,int mv, int d,int h)
    {
        name = n;
        metabonus=mv;
        damage=d;
        hcbonus=h;

        //Meta Brawlers:Angelo Melody Chuck Cordelius Colt Charlie Piper Collete Buzz 8bit Fang
        // Nani Sam Carl Max Eve Griff Belle Amber Ruffs Brock Bonnie Lola Bo Edgar Grom


        if(n.equals("Angelo"))
        {
            Collections.addAll(Bonus, -10000,60,30,90,60,30,50,85,75,60,70,40,60,80,50,20,90,80,85,50,85,80,60,70,70,70);
        }
        else if(n.equals("Melody"))
        {
            //mb 30
            Collections.addAll(Bonus,40,-10000,60,20,40,40,30,70,70,60,70,40,70,60,55,30,60,40,40,40,60,60,40,40,70,80);
        }
        else if(n.equals("Chuck"))
        {
            //mb 30
            Collections.addAll(Bonus, 50,40,-10000,10,60,60,60,40,60,60,20,60,60,60,60,60,60,60,60,60,60,60,60,60,60,70);
        }
        else if(n.equals("Cordelius"))
        {
            Collections.addAll(Bonus, 0,0,90,-10000,0,0,0,70,90,0,70,0,95,40,0,0,0,0,0,0,0,40,0,0,100,50);
        }
        else if(n.equals("Colt"))
        {
            //mb 20
//Meta Brawlers:Angelo Melody Chuck Cordelius Colt Charlie Piper Collete Buzz 8bit Fang
            // Nani Sam Carl Max Eve Griff Belle Amber Ruffs Brock Bonnie Lola Bo Edgar
            Collections.addAll(Bonus,40,60,40,80,-10000,60,40,70,60,60,40,60,60,55,30,40,75,50,50,60,60,60,65,60,70,90);
        }
        else if(n.equals("Charlie"))
        {
            Collections.addAll(Bonus,70,60,40,90,50,-10000,75,85,70,60,90,65,60,20,70,60,70,75,0,60,0,85,50,20,70,0);
        }
        else if(n.equals("Piper"))
        {
            Collections.addAll(Bonus,50,70,20,90,80,25,-10000,80,90,50,60,0,30,50,40,0,85,90,90,50,80,70,60,40,85,60);
        }
        else if(n.equals("Collete"))
        {
            Collections.addAll(Bonus,15,30,60,40,40,10,30,-10000,90,85,90,25,80,80,40,10,20,30,50,20,40,80,20,30,40,20);
        }
        else if(n.equals("Buzz"))
        {
            Collections.addAll(Bonus,20,10,35,10,50,40,20,10,-10000,50,60,35,40,100,30,30,30,50,60,70,40,60,60,65,75,80);
        }
        else if(n.equals("8bit"))
        {
            //Meta Brawlers:Angelo Melody Chuck Cordelius Colt Charlie Piper Collete Buzz 8bit Fang
            // Nani Sam Carl Max Eve Griff Belle Amber Ruffs Brock Bonnie Lola Bo Edgar Grom
            Collections.addAll(Bonus,60,40,20,85,60,60,80,30,50,-10000,65,70,40,75,65,55,85,40,60,30,70,75,75,70,50,20);
        }
        else if(n.equals("Fang"))
        {
            Collections.addAll(Bonus,20,60,85,30,75,0,40,10,40,35,-10000,50,40,85,35,20,30,55,70,30,30,35,40,55,80,65 );
        }
        else if(n.equals("Nani"))
        {
            Collections.addAll(Bonus,70,60,20,80,45,35,90,80,70,30,50,30,80,20,30,80,75,65,55,75,80,80,75,40,50);
        }
        else if(n.equals("Sam"))
        {
            //Meta Brawlers:Angelo Melody Chuck Cordelius Colt Charlie Piper Collete Buzz 8bit Fang
            // Nani Sam Carl Max Eve Griff Belle Amber Ruffs Brock Bonnie Lola Bo Edgar Grom
            Collections.addAll(Bonus,35,40,20,20,75,60,65,40,40,60,60,40,-10000,80,70,80,30,40,80,90,50,60,80,80,70,80);
        }
        else if(n.equals("Carl"))
        {
            Collections.addAll(Bonus, 30,60,20,70,80,85,60,20,0,60,0,35,20,-10000,50,85,75,80,70,85,50,60,80,60,50,80);
        }
        else if(n.equals("Max"))
        {
            Collections.addAll(Bonus, 50,50,20,80,80,50,80,40,70,40,50,90,50,-10000,30,40,70,40,30,85,60,30,60,50,50);
        }
        else if(n.equals("Eve"))
        {

            Collections.addAll(Bonus,90,70,20,90,80,80,90,90,50,70,80,70,20,20,70,-10000,90,80,30,50,20,80,60,30,50,40);
        }
        else if(n.equals("Griff"))
        {
            Collections.addAll(Bonus, 0,30,20,80,40,40,30,80,70,40,80,30,80,40,60,20,-10000,30,40,40,30,50,50,50,70,90);
        }
        else if(n.equals("Belle"))
        {
            Collections.addAll(Bonus,40,80,20,90,75,40,20,85,70,60,70,40,50,70,50,30,80,-10000,70,35,60,60,90,70,20,20);
        }
        else if(n.equals("Amber"))
        {
            Collections.addAll(Bonus, 30,70,20,90,60,90,20,60,30,40,30,75,20,60,50,85,40,-10000,85,60,50,80,50,20,20);
        }
        else if(n.equals("Ruffs"))
        {
            Collections.addAll(Bonus,80,70,20,90,60,70,70,85,30,35,70,60,20,20,60,50,75,40,20,-10000,0,70,60,20,0,30);
        }
        else if(n.equals("Brock"))
        {
            //Meta Brawlers:Angelo Melody Chuck Cordelius Colt Charlie Piper Collete Buzz 8bit Fang
            // Nani Sam Carl Max Eve Griff Belle Amber Ruffs Brock Bonnie Lola Bo Edgar Grom
            Collections.addAll(Bonus, 30,70,20,90,50,85,20,70,70,40,70,30,60,60,15,85,75,50,50,85,-10000,30,70,50,70,100);
        }
        else if(n.equals("Bonnie"))
        {
            Collections.addAll(Bonus, 30,60,20,90,85,30,50,20,40,70,50,40,30,50,50,20,70,50,50,30,70,-10000,30,40,60,60);
        }
        else if(n.equals("Lola"))
        {
            Collections.addAll(Bonus,60,60,20,90,70,65,60,80,20,60,65,40,20,20,70,60,70,20,20,20,70,-10000,40,20,20);
        }
        else if(n.equals("Bo"))
        {
            Collections.addAll(Bonus, 40,60,20,90,60,80,60,60,20,30,20,45,20,30,40,80,80,50,50,80,40,60,60,-10000,20,40);
        }
        else if(n.equals("Edgar"))
        {
            Collections.addAll(Bonus, 20,20,20,0,60,60,20,70,40,60,40,40,30,40,30,20,40,80,80,90,30,50,80,80,-10000,100);
        }
        else if(n.equals("Grom"))
        {
            //Meta Brawlers:Angelo Melody Chuck Cordelius Colt Charlie Piper Collete Buzz 8bit Fang
            // Nani Sam Carl Max Eve Griff Belle Amber Ruffs Brock Bonnie Lola Bo Edgar Grom
            Collections.addAll(Bonus,40,0,0,40,0,90,20,80,50,80,50,40,20,50,80,0,80,80,80,0,50,80,40,0,-10000);
        }

    }
    public int getMatchupBonus(String s)
    {
        if(s.equals("Angelo"))
        {
            return Bonus.get(0);
        }
        else if(s.equals("Melody"))
        {
            return Bonus.get(1);
        }
        else if(s.equals("Chuck"))
        {
            return Bonus.get(2);
        }
        else if(s.equals("Cordelius"))
        {
            return Bonus.get(3);
        }
        else if(s.equals("Colt"))
        {
            return Bonus.get(4);
        }
        else if(s.equals("Charlie"))
        {
            return Bonus.get(5);
        }
        else if(s.equals("Piper"))
        {
            return Bonus.get(6);
        }
        else if(s.equals("Collete"))
        {
            return Bonus.get(7);
        }
        else if(s.equals("Buzz"))
        {
            return Bonus.get(8);
        }
        else if(s.equals("8bit"))
        {
            return Bonus.get(9);
        }
        else if(s.equals("Fang"))
        {
            return Bonus.get(10);
        }
        else if(s.equals("Nani"))
        {
            return Bonus.get(11);
        }
        else if(s.equals("Sam"))
        {
            return Bonus.get(12);
        }
        else if(s.equals("Carl"))
        {
            return Bonus.get(13);
        }
        else if(s.equals("Max"))
        {
            return Bonus.get(14);
        }
        else if(s.equals("Eve"))
        {
            return Bonus.get(15);
        }
        else if(s.equals("Griff"))
        {
            return Bonus.get(16);
        }
        else if(s.equals("Belle"))
        {
            return Bonus.get(17);
        }
        else if(s.equals("Amber"))
        {
            return Bonus.get(18);
        }else if(s.equals("Ruffs"))
        {
            return Bonus.get(19);
        }
        else if(s.equals("Brock"))
        {
            return Bonus.get(20);
        }
        else if(s.equals("Bonnie"))
        {
            return Bonus.get(21);
        }
        else if(s.equals("Lola"))
        {
            return Bonus.get(22);
        }
        else if(s.equals("Bo"))
        {
            return Bonus.get(23);
        }
        else if(s.equals("Edgar"))
        {
            return Bonus.get(24);
        }
        else if(s.equals("Grom"))
        {
            return Bonus.get(25);
        }
        else
        {
            return 50;
        }

    }
    public String getName()
    {
        return name;
    }
    public int getMetabonus()
    {
        return metabonus;
    }
    public int getHcbonus()
    {
        return hcbonus;
    }
    public static int getFirstPickBonus(String st)
    {
        if(st.equals("Colt"))
        {
            return 90;
        }
        else if(st.equals("Chuck"))
        {
            return 100;
        }
        else if(st.equals("8bit"))
        {
            return 80;
        }
        else if(st.equals("Belle"))
        {
            return 70;
        }
        else if(st.equals("Melody"))
        {
            return 85;
        }
        else if(st.equals("Angelo"))
        {
            return 95;
        }
        else
        {
            return 0;
        }
    }



}

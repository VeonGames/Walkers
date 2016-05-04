package walkers;
//pj: Can you read this?
//nic: yes

import java.util.ArrayList;
import java.util.List;

public class Walkers
{
    protected static List<Bot> bot;
    protected static int population;
    private final double pi = Math.PI;
    protected static boolean showJoints = true;
    public static void main(String[] args)
    {
        bot = new ArrayList();
        
        for (int k = 0; k < population; k++)
        {
            bot.add(new Bot(new Joint(pi, ), //add in more variables for limb constructor
                            new Joint(), 
                            50.0, 100, 100));
        }
        
        
        
        
    }
    
}

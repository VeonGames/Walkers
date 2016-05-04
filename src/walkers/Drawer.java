/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package walkers;


/**
 *
 * @author 16_deckhut_nicholas
 */
import java.awt.Color;
import java.awt.Graphics;
import java.util.List;
import javax.swing.JComponent;

public class Drawer extends JComponent
{

    @Override
    public void print(Graphics g) 
    {
        for (int k = 0; k < Walkers.bot.size(); k++)
        {
            Walkers.bot.get(k).draw(g);
        }
        
    }
    
}

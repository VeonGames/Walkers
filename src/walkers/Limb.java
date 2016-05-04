/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package walkers;

import genes.Cell;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.Rectangle;

/**
 *
 * @author 16_deckhut_nicholas
 */
public class Limb extends Cell
{
    protected double x, y;
    protected double l, w;
    protected double angle;
    protected double mass;
    protected Joint up, down;
    protected Polygon shape;  
    
    public Limb(Joint u, Joint d, double mass)
    {
        up = u;
        down = d;
        this.mass = mass;
        //put in angle based on joints along with x,y
        
    }
    
    public Limb()
    {
        
    }
    
    public void draw(Graphics g)
    {
        g.drawPolygon(shape);
        if (down != null)
        {
            down.draw(g);
        }
        
    }
}

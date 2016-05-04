/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package walkers;

import genes.Cell;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author 16_deckhut_nicholas
 */
public class Joint extends Cell
{
    protected double angle; //radians
    protected double x;
    protected double y;
    protected double radius;
    protected Limb up;
    protected Limb down;

    public Joint(double angle, double x, double y, double radius) {
        this.angle = angle;
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    
    public void draw(Graphics g)
    {
        Color c = g.getColor();
        g.setColor(new Color(64, 224, 208));
        g.fillOval(((int) x), ((int) y), ((int) radius), ((int) radius));
        g.setColor(c);
        down.draw(g);
    }
}

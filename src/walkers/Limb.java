/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package walkers;

import genes.Cell;
import java.awt.Rectangle;
import java.awt.Shape;

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
    protected Joint left, right;
    protected Shape shape;  
    
    public Limb(Joint l, Joint r, double mass)
    {
        left = l;
        right = r;
        this.mass = mass;
        //put in angle based on joints along with x,y
        
    }
    
    public Limb()
    {
        
    }
}

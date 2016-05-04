/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package walkers;

import genes.Cell;
import java.awt.Rectangle;

/**
 *
 * @author 16_deckhut_nicholas
 */
public class Limb extends Cell
{
    protected double lx, ly;
    protected double ll, lw;
    protected double angle;
    protected double mass;
    protected Joint joint1, joint2;
    
    public Limb(Joint j1, Joint j2, double mass)
    {
        joint1 = j1;
        joint2 = j2;
        this.mass = mass;
        //put in angle based on joints along with x,y
    }
}

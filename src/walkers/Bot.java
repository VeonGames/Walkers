/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package walkers;
import neuralnet.*;
import genes.*;
import java.awt.Graphics;
import java.awt.Polygon;

/**
 *
 * @author Nicno90
 */
public class Bot extends Cell
{
    NeuralNet brain;
    DNA dna;
    protected Joint left, right;
    protected double mass;
    protected int x, y;
    protected Polygon shape;
    public Bot(Joint l, Joint r, double mass, int sx, int sy)
    {
        left = l;
        right = r;
        x = sx;
        y = sy;
        this.mass = mass;
    }
    
    public Bot(DNA dna, int sx, int sy)
    {
        
    }
    
    public Bot()
    {
        
    }
    
    public DNA getDNA()
    {
        return dna;
    }
    
    public void draw(Graphics g)
    {
        g.setColor(new java.awt.Color(238, 232, 170));
        g.fillPolygon(this.shape);
        right.draw(g);
        left.draw(g);
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package walkers;
import neuralnet.*;
import genes.DNA;

/**
 *
 * @author Nicno90
 */
public class Bot extends Limb
{
    NeuralNet brain;
    DNA dna;
    public Bot(Joint l, Joint r, double mass, int sx, int sy)
    {
        super(l, r, mass);
        
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
}

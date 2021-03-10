
/**
 * Write a description of class Line here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Line
{
    private final int MAXSIZE = 4, MAXNUM = 40;
    private int thisn = 0;
    int[] thisline = new int[MAXSIZE];
    
    public void LineMaker()
    {
        WhatNumbers();
    }
    
    public void WhatNumbers()
    {
        for (int n = 0; n < MAXSIZE; n++)
        {
            thisn = (int) (Math.random() * MAXNUM + 1);
            thisline[n] = thisn;
        }
    }
    
    public void PrintLine()
    {
        System.out.println(thisline);
    }
}

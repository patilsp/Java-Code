/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ten;

import java.awt.*;
public class ChessBoardEx extends java.applet.Applet {

    	public void paint(Graphics g)
	{
		int row,col,x,y;
		for(row=0;row<8;row++)
		{
			for(col=0;col<8;col++)
			{
				x=col*50;
				y=row*50;
				if( (row%2) == (col%2) )
					g.setColor(Color.white);
				else
				{
					g.setColor(Color.black);
					g.fillRect(x,y,50,50);
				}
			}
		}
	}

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new java.awt.BorderLayout());
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

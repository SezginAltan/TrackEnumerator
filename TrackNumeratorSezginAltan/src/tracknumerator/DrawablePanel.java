/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tracknumerator;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Vector;
import javax.swing.JPanel;


/**
 *
 * @author sezgin.altan
 */
public class DrawablePanel extends JPanel{
    
    
    private Vector<Track> TrackList = new Vector();
    public void addTrack(Track track){
        TrackList.add(track);
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int i = 0; i < TrackList.size(); i++) {
            String displayString = "";
            if(TrackList.get(i).getAddress() == -1){
                g.setColor(Color.RED);   
            }else{
                 g.setColor(Color.green);   
                g.drawString(String.format("0x%08X", TrackList.get(i).getAddress()), TrackList.get(i).getX_coordinate()+10, TrackList.get(i).getY_coordinate()+10);
            }
            
            g.fillOval(TrackList.get(i).getX_coordinate(), TrackList.get(i).getY_coordinate(), 10, 10);
        }

    }    
}

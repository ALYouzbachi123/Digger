/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.Timer;
public class Map extends JPanel implements KeyListener, ActionListener {

        
        
       
        
       
        
        private Timer timer;
        private int delay=8;
        private int playerX = 310;
        private int ballposX = 120;
        private int ballposY = 350;
        
        
        public Map(){
            addKeyListener(this);
            setFocusable(true);
            setFocusTraversalKeysEnabled(false);
            timer = new Timer(delay, this);
            timer.start();
            
        }
        public void paint(Graphics g){
            g.setColor(Color.black);
            g.fillRect(1, 1, 692, 592);
            
            g.setColor(Color.red);
            g.fillRect(0, 0, 3, 592);
            g.fillRect(0, 0, 692, 3);
            g.fillRect(691, 0, 20, 592);
            g.fillRect(0, 563, 692, 5);
            
            g.setColor(Color.green);
            g.fillOval(ballposX, ballposY, 25, 25);
            
            g.dispose();

        }
    @Override
    public void keyTyped(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Mob;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author oguyot
 */
public class MobAdvance {
    
    private int i = 0;
    private Timer mobAdvence;
    
    public MobAdvance(Mob mob, MobUI mobUI, int nbY, Model.Tower tower){
        mobAdvence = new Timer(60, (ActionEvent event)-> mooveMob(mob, mobUI, nbY, tower));
           
           mobAdvence.start();
    }
    
    public void mooveMob(Mob mob,MobUI mobUI, int nbY, Model.Tower tower){
        Boolean end = false;
        i++;
        
        if(i<690){
            mobUI.setBounds((int) ((69*9)+265)-1*i,(79*nbY)+80,69 , 100);
            mob.removeHp(tower.viewDamage());
            
            
            System.out.println(mob.viewhp());
            
            if(mob.viewhp()<0 ){
                mobUI.setBounds((int) ((69*9)+265)-1*i,(79*nbY)+80,0 , 0);
                mobAdvence.stop();
                Windows.player.addGold();
                
                for(int i=0; i<Windows.listMob.size(); i++){
                    if(Windows.listMob.get(i).equals(mob)){
                        Windows.listMob.remove(i);
                    }
                }
                
                if(Windows.listMob.size() == 0){
                    JOptionPane.showMessageDialog(null,"Vous avez gagné !");
                    mobAdvence.stop();
                    System.exit(0);
                }
                
            }
            
        } else {
            JOptionPane.showMessageDialog(null,"Vous avez perdu !");
            mobAdvence.stop();
            System.exit(0);

        }
        
        
    }
    
}

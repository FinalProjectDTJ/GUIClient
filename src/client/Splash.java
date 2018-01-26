/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

/**
 *
 * @author Jesse
 */
public class Splash {
    public static void main(String[] args){
        SplashScreen SplashScreen=new SplashScreen();
        
  SplashScreen.setVisible(true);
        
  SplashScreen.setDefaultCloseOperation(SplashScreen.EXIT_ON_CLOSE);
  SplashScreen.setSize(400,400);
  
        guiclientUI guiclientUI=new guiclientUI();
        try {
            for (int i = 0; i < 100; i++) {
               Thread.sleep(75);
                SplashScreen.loadingNum.setText(Integer.toString(i)+"%");
               
               if(i==99){
                    SplashScreen.setVisible(false);
                    guiclientUI.setVisible(true);
                }
            }
    }catch (Exception e){
        }
    }
}

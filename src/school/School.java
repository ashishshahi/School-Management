/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school;

/**
 *
 * @author Ashish Shahi
 */
public class School {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       SplashScreen splash = new SplashScreen();
       splash.setVisible(true);
       Login login = new Login();
       try{
           for (int i = 0; i<=100; i++){
               Thread.sleep(40);
               splash.splashnum.setText(Integer.toString(i)+"%");
               splash.splashprogress.setValue(i);
               if(i==100){
                   splash.setVisible(false);
                   login.setVisible(true);
               }
           }
       }catch(Exception e){
           
       }
    }
    
}

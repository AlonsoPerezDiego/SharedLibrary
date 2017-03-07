/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timer;

/**
 *
 * @author Diego
 */
public class Time {
    
    public static void waitOneSec(){
        int start, end;
        start = (int)(System.currentTimeMillis()*1000);
        do{
            end = (int)(System.currentTimeMillis()*1000);
        }while(end-start<1);
    }
    
}

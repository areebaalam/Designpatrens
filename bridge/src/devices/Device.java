/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devices;



public interface Device {
    boolean isEnabled();

    void enable();

    void disable();

    int getVolume();
    

    void setVolume(int percent);

    int getChannel();
     
    boolean isACPoweredOn();
    void setChannel(int channel);

    void printStatus();
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;


public class university{
      private String name;
    public university(String name){
  this.name=name;}
    public void sendMessage(String message){
   System.out.print(name+"send"+message);
    }
}


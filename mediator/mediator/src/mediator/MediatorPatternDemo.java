/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

public class MediatorPatternDemo {
   public static void main(String[] args) {
      User robert = new User("comsats");
      User john = new User("John");

      robert.sendMessage("Hi! comsians!");
      john.sendMessage("Hello! Robert!");
   }
}
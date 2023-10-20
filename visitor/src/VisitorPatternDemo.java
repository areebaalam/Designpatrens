
import visitor.ComputerPart;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class VisitorPatternDemo {
   public static void main(String[] args) {

      ComputerPart computer = (ComputerPart) new Computer();
      computer.accept(new ComputerPartDisplayVisitor());
   }
}
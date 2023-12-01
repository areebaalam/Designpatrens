package GOF.Lab8.proxy.Image_Proxy;

public class RealImage implements Image {





   @Override
   public void display(String filename) {
      System.out.println("Displaying " + filename);
   }

   // private void loadFromDisk(String fileName){
   //    System.out.println("Loading " + fileName);
   // }
}
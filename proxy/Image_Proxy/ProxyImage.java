package GOF.Lab8.proxy.Image_Proxy;

public class ProxyImage implements Image {

   private RealImage realImage;
   private String fileName;
   String supportedType;

   public ProxyImage(String fileName) {
      this.fileName = fileName;

      supportedType = "jpg,svg";

   }

   @Override
   public void display(String type) {
      if (supportedType.contains(type)) {

         realImage = new RealImage();
         realImage.display(fileName);
      } else {

         System.out.println("Displaying fake image:" + fileName);

      }

   }
}

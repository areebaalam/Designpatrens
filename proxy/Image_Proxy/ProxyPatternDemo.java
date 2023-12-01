package GOF.Lab8.proxy.Image_Proxy;

public class ProxyPatternDemo {

   public static void main(String[] args) {
      Image image = new ProxyImage("test_10mb.jpg");
      image.display("jpg");
      Image remoteimage = new RemoteImageProxy("http");
      remoteimage.display("http");
      Image protectedImage=new ProtectedProxy("nawaz");
      protectedImage.display("test_10mb.jpg");
   }
}
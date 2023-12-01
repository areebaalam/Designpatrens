package GOF.Lab8.proxy.Image_Proxy;

public class ProtectedImage implements Image{
    


    @Override
    public void display(String filename) {
       System.out.println("Displaying " + filename);
    }
}

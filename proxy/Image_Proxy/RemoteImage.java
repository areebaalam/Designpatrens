package GOF.Lab8.proxy.Image_Proxy;

public class RemoteImage implements Image {

 

    @Override
    public void display(String url) {
        System.out.println("Displaying Remote image from url  " + url);
    }
}

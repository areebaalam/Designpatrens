package GOF.Lab8.proxy.Image_Proxy;

public class RemoteImageProxy implements Image {
    private RemoteImage realImage;
    String remoteurl;
    public RemoteImageProxy(String remoteurl) {
        this.remoteurl = remoteurl;
    }
    @Override
    public void display(String url) {

        if (remoteurl.equals(url)) {
            realImage = new RemoteImage();
            realImage.display(url);
        } else {
            System.out.println("Displaying fake image:" + url);
        }
    }
}

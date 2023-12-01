package GOF.Lab8.proxy.Image_Proxy;

public class ProtectedProxy implements Image {

    private RealImage realImage;

    String userName;
    String allowedUsers;

    public ProtectedProxy(String userName) {
        this.userName = userName;

        allowedUsers = "nawaz,irfan";

    }

    @Override
    public void display(String imagetype) {
        if (allowedUsers.contains(userName)) {
            realImage = new RealImage();
            realImage.display(imagetype);
        } else {
            System.out.println("Displaying fake image:" + imagetype);

        }

    }
}

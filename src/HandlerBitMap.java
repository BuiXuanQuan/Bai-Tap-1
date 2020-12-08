import java.awt.image.BufferedImage;

public class HandlerBitMap {
    public static BufferedImage bufferedImage;

    public static void main(String[] args) {
        BitMap bitMapFile = new BitMap();
        bufferedImage = bitMapFile.readImage();
        bitMapFile.saveBitmap("D:\\IT\\NewBitmap\\anhMoi.bmp", bufferedImage, bufferedImage.getWidth(),bufferedImage.getHeight());


    }
}

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        File file= new File("C:\\Users\\ABC\\IdeaProjects\\Bai Tap 1\\BitmapImage\\anh.bmp");

        BufferedImage image = ImageIO.read(file);

        //lấy ra chiều rộng và chiều cai của ảnh
        int chieuRong = image.getWidth();
        int chieuCao = image.getHeight();

        // chuyển màn ảnh từ màu đỏ sang màu xanh
        for (int y = 0;y<chieuCao;y++){
            for (int x = 0;x<chieuRong;x++){

                int mauSac = image.getRGB(x,y); // getRGB () của BufferedImage  trả về giá trị của các color pixel tại  (x,y).

                int alpha = (mauSac>>24)&0xff; // dịch sang phải giá trị của màu sắc 24bits(phép toán thao tác bit) và dùng lấy 8bit
                int mauDo = (mauSac>>16)&0xff;
                int mauXanh = mauSac&0xff;
//                mauDo = 255 - mauDo;
//                mauXanh = 255 - mauXanh;

                mauSac = (mauDo<<16)  | mauXanh;

                image.setRGB(300, 300, mauSac);



            }
        }
        // Lưu ảnh tại 1 file mới
        try {
            file = new File("C:\\Users\\ABC\\IdeaProjects\\Bai Tap 1\\NewBitmapImage\\anhMoi.bmp");
         ImageIO.write(image,"jpg",file);
        }catch (Exception e){
            System.out.println(e);
        }

    }
}

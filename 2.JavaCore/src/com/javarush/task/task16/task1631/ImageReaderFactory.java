package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes image) {
        ImageReader temp = null;
        if (image == ImageTypes.JPG) temp = new JpgReader();
        else if (image == ImageTypes.BMP) temp = new BmpReader();
        else if (image == ImageTypes.PNG) temp = new PngReader();
        else throw new IllegalArgumentException("Неизвестный тип картинки");
        return temp;
    }
}

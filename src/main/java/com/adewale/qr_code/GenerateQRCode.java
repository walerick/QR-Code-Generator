package com.adewale.qr_code;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

import java.io.IOException;
import java.nio.file.Paths;

public class GenerateQRCode {
    void generate() throws IOException, WriterException {
        String data = "https://simplewords.vercel.app/";
        String path = "C:/Users/Adewale/Desktop/HIIT/qrcode.jpg";

        BitMatrix matrix = new MultiFormatWriter().encode(data, BarcodeFormat.QR_CODE, 500, 500);
        MatrixToImageWriter.writeToPath(matrix, "jpg", Paths.get(path));

        System.out.println("QR code successfully created");
    }



}
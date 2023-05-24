package com.adewale.qr_code;

import com.google.zxing.WriterException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class QrCodeApplication {

	public static void main(String[] args) throws IOException, WriterException {
		SpringApplication.run(QrCodeApplication.class, args);
		GenerateQRCode geratecode = new GenerateQRCode();

		try {
			geratecode.generate();
		} catch (IOException e) {
			throw new RuntimeException(e);
		} catch (WriterException e) {
			throw new RuntimeException(e);
		}
	}

}

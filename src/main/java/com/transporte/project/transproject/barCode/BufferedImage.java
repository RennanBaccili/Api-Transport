package com.transporte.project.transproject.barCode;

import java.nio.file.Paths;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.oned.EAN13Writer;


public class BufferedImage {

	public static void generateEAN13BarcodeImage(String barcodeText,String path) throws Exception {
	    EAN13Writer barcodeWriter = new EAN13Writer(); //estancia classe do tipo da barcode
	    BitMatrix bitMatrix = barcodeWriter.encode(barcodeText, BarcodeFormat.EAN_13, 300, 150);
	    MatrixToImageWriter.writeToPath(bitMatrix, "jpg", Paths.get(path));
	}
	
}
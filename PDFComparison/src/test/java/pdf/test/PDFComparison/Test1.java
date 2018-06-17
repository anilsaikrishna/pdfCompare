package pdf.test.PDFComparison;

import java.util.*;
import de.redsix.pdfcompare.PdfComparator;

public class Test1 {
	public static void main(String[] args) throws Exception {
		
		String file1 = "C:\\Users\\adevaras\\Desktop\\Resume~Anil.pdf";
		String file2 = "C:\\Users\\adevaras\\Desktop\\Resume-Anil.pdf";
		String result = "C:\\Users\\adevaras\\Desktop\\Result\\result";
		String ignoreFile = "C:\\Users\\adevaras\\workspace\\PDFComparison\\ignore.conf";
		
		boolean isEquals = new PdfComparator(file1, file2).withIgnore(ignoreFile).compare().writeTo(result);
		System.out.println("Are PDF files similar : " + isEquals);
		System.out.println("Process Completed.");
	}
}

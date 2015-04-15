package nl.hanze.exploring.sonar.design;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

import nl.hanze.exploring.sonar.factory.FileListReaderFactory;
import nl.hanze.exploring.sonar.factory.PrintProductFactory;
import nl.hanze.exploring.sonar.factory.ProductFactory;
import nl.hanze.exploring.sonar.factory.PublicationFactory;
import nl.hanze.exploring.sonar.file.FileListReader;

import org.junit.Test;

public class IntegrationTest {
	
	@Test
	public void doIntegrationTest()
	{
		 Product product = ProductFactory.getProduct("dvhn", "zdo");
		    PrintProduct printProduct = PrintProductFactory.getPrintProduct(product);
		    FileListReader fileReader = FileListReaderFactory.getFileListReader();
		    
		    Calendar cal = Calendar.getInstance();
		    cal.setTime(new Date());
		    cal.add(Calendar.DATE,-2);
		    
		    try {
				Publication publication = PublicationFactory.getPublication(printProduct,cal,fileReader.generateFileList());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   
	}

}

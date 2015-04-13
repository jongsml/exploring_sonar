package nl.hanze.exploring.sonar.file;

import java.io.IOException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.List;


public class FileListReader extends AbstractFileReader implements FileReader
{
	static Logger log = LogManager.getLogger(FileListReader.class.getName());
	private List<String> files;
	

	public FileListReader(String dirname,String filename)
	{
		try 
		{		
			files = readFile(dirname,filename);
		} 
		catch (IOException e)
		{
			log.log(Level.ERROR,e);
		}
	}

	@Override
	public List<String> generateFileList() 
	{
		return files;
	}	
}

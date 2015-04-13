package nl.hanze.exploring.sonar.file;

import java.io.IOException;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


/*
 * 
 * 
 */

public class FileListReader extends AbstractFileReader implements FileReader
{
	
	static Logger log = LogManager.getLogger(FileListReader.class.getName());

	
	private List<String> files;
	public FileListReader(String dirname,String filename)
	{
		try {
			files = readFile(dirname,filename);
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			log.log(Level.ERROR,e);
		}
	}

	@Override
	public List<String> generateFileList() 
	{
		return files;
	}	
}

package nl.hanze.exploring.sonar.file;

import java.io.IOException;
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
	
	private List<String> files;
	public FileListReader(String dirname,String filename)
	{
		files = readFile(dirname,filename);
	}

	@Override
	public List<String> generateFileList() 
	{
		return files;
	}	
}

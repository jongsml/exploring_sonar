package nl.hanze.exploring.sonar.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public abstract class AbstractFileReader 
{
	protected List<String> readFile(String dirname,String filename)
	{
		List<String> filesFromFile = new ArrayList<>();
	    Path path = Paths.get(dirname, filename);
        try (Stream<String> lines = Files.lines(path)) 
        {
            lines.forEach(l -> addFilesToList(filesFromFile,l));
        } catch (IOException e) 
        {
			e.printStackTrace();
		}
        return filesFromFile;
	}

	private List<String> addFilesToList(List<String> filesFromFile, String line) 
	{
	  String[] splits = line.split(",");
	  for(String filename: splits)
	  {
		  filesFromFile.add(filename.trim().toLowerCase());
	  }		 
	  return filesFromFile;
	}
}

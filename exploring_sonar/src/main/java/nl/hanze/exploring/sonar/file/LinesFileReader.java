package nl.hanze.exploring.sonar.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.stream.Stream;

public class LinesFileReader 
{
	@SuppressWarnings("unused")
	private void readStreamOfLinesUsingFilesWithTryBlock() throws IOException
	{
	    Path path = Paths.get("c:/temp", "data.txt");
	    try(Stream<String> filteredLines = Files.lines(path).onClose(() -> System.out.println("File closed")).filter(s -> s.contains("password"))){
	        Optional<String> hasPassword = filteredLines.findFirst();
	        if(hasPassword.isPresent()){
	            System.out.println(hasPassword.get());
	        }
	    }
	}

}

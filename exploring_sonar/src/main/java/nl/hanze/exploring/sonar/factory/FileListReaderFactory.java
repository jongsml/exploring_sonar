package nl.hanze.exploring.sonar.factory;

import nl.hanze.exploring.sonar.design.Product;
import nl.hanze.exploring.sonar.file.FileListReader;

public class FileListReaderFactory {
	
	private FileListReaderFactory() {
		
	}
  public static FileListReader getFileListReader() {
    return new FileListReader("c:\\", "filelist.txt");
  }


}

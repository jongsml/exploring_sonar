package nl.hanze.exploring.sonar.file;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;


public class FileListReaderTest {
  private static FileListReader fileListReader;

  @BeforeClass
  public static void initCalculator() {
    fileListReader = new FileListReader("/home/leon/Dropbox", "filelist.txt");
  }

  @Before
  public void beforeEachTest() {
    System.out.println("FileListReaderTest started");
  }

  @Test
  public void testGenerateFileList() {
    int result = fileListReader.generateFileList().size();
    assertEquals(2135, result);
  }

  @Test
  public void printFiles() {
    List<String> files = fileListReader.generateFileList();
    
    for (String file : files) {
      System.out.println(file);
    }
    int result = fileListReader.generateFileList().size();
    assertEquals(2135, result);
  }

}

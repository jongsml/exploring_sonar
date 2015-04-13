package nl.hanze.exploring.sonar.file;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.List;

public class FileListReader extends AbstractFileReader implements FileReader {
  private static final Logger LOGGER = LogManager.getLogger(FileListReader.class.getName());
  private List<String> files;
  private String dirname;
  private String filename;

  /** initialise reader with a directory name and a filename.
   * @param dirname input directory name
   * @param filename input file name
   */
  public FileListReader(String dirname, String filename) {
    try {
      this.dirname = dirname;
      this.filename = filename;
      files = readFile(this.dirname, this.filename);
    } catch (IOException e) {
    LOGGER.log(Level.ERROR, e);
    }
  }

  @Override
  public final List<String> generateFileList() {
    return files;
  }

  public String getDirname() {
    return dirname;
  }

  public void setDirname(String dirname) {
    this.dirname = dirname;
  }

  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }
  
  
}

package nl.hanze.exploring.sonar.file;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.List;

public class FileListReader extends AbstractFileReader implements FileReader {
  static Logger log = LogManager.getLogger(FileListReader.class.getName());
  private List<String> files;

  /** initialise reader with a directory name and a filename.
   * @param dirname input directory name
   * @param filename input file name
   */
  public FileListReader(String dirname, String filename) {
    try {
      files = readFile(dirname, filename);
    } catch (IOException e) {
      log.log(Level.ERROR, e);
    }
  }

  @Override
  public final List<String> generateFileList() {
    return files;
  }
}

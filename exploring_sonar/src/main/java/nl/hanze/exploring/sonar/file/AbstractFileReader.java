package nl.hanze.exploring.sonar.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/** @author leon.
 *
 */
public abstract class AbstractFileReader {
  /** read file from specified location.
   * @param dirname parameter with directory name
   * @param filename parameter with filename
   * @return readFile return list with string
   * @throws IOException IOException is thrown if file is not found
   */
  protected final List<String> readFile(final String dirname,
      final String filename) throws IOException {
    List<String> filesFromFile = new ArrayList<>();
    Path path = Paths.get(dirname, filename);
    try (Stream<String> lines = Files.lines(path)) {
      lines.forEach(l->addFilesToList(filesFromFile, l));
    }
    return filesFromFile;
  }
/** add Files from line to List.
 * @param filesFromFile list with file names
 * @param line line with files
 * @return enriched list with files
 */
  private List<String> addFilesToList(final List<String> filesFromFile,
      final String line) {

    String[] splits = line.split(",");
    for (String filename: splits) {
      filesFromFile.add(filename.trim().toLowerCase());
    }
    return filesFromFile;
  }
}

package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import javax.swing.JTextArea;
import javax.crypto.SecretKey;

import client.textcrypt.TextCrypt;

/**
 * Takes an input stream and an output stream.
 * Writes the input stream into the output stream.
 * @author Jack Galilee
 * @version 1.0
 */
public class StreamReceiver extends Thread {

  // Stream we are going to read into the output stream.
  private InputStream inputStream;
  private JTextArea useTextArea;
  private SecretKey useKey;
  //private TextCrypt tc;
  /**
   * Constructs the stream swapper.
   * @param input Stream to get data from.
   * @param output Stream to send data to.
   * @throws IOException
   */
  public StreamReceiver(InputStream input, JTextArea jta, String keyseed) throws IOException {
    this.inputStream = input;
    this.useTextArea = jta;
    if (keyseed.equals("")) {
        this.useKey = TextCrypt.getKey("DTJ^#@");
    } else {
        this.useKey = TextCrypt.getKey(keyseed);
    }
  }

  public void writeToServer(PrintWriter pw, String lineBuffer, boolean isCrypt) {
    if ((!lineBuffer.startsWith("@")) && isCrypt) {
        pw.println("^_#" + TextCrypt.encrypt(lineBuffer, useKey));
    } else {
        pw.println(lineBuffer);
    }
  }
  /**
   * Buffers the input stream and writes it to the output stream.
   */
  public void run() {

    // Create a reader for the input stream.
    BufferedReader inputReader = new BufferedReader(new InputStreamReader(inputStream));

    // Create a writer for the output stream.
    //PrintWriter outputWriter = new PrintWriter(outputStream, true);

    // Buffer each new line from the reader and write it to the output stream.
    try {
      String lineBuffer;
      while ((lineBuffer = inputReader.readLine()) != null) {
          int startCifer;
          if ((startCifer = lineBuffer.indexOf("^_#")) != -1) {
            String startText = lineBuffer.substring(0, startCifer);
            //outputWriter.println(startText + TextCrypt.decrypt(lineBuffer.substring(startCifer + 3), useKey'));
            useTextArea.append(startText + TextCrypt.decrypt(lineBuffer.substring(startCifer + 3), useKey) + "\n");
          } else {
            //outputWriter.println(lineBuffer);
            useTextArea.append(lineBuffer + "\n");
          }
      }

      // Close the input reader and output writer when we're finished.
      inputReader.close();

    // Handle any exceptions with the IO data streams.
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}

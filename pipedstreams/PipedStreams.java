package pipedstreams;
import java.io.*;
public class PipedStreams {
    public static void main(String[] args) {
        try {
            // Create PipedInputStream and PipedOutputStream
            PipedInputStream pipedInputStream = new PipedInputStream();
            PipedOutputStream pipedOutputStream = new PipedOutputStream(pipedInputStream);

            // Create and start Writer and Reader threads
            WriterThread writerThread = new WriterThread(pipedOutputStream);
            ReadThread readerThread = new ReadThread(pipedInputStream);

            writerThread.start();
            readerThread.start();

            // Wait for both threads to finish
            writerThread.join();
            readerThread.join();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

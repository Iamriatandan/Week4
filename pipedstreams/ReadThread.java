package pipedstreams;
import java.io.*;
public class ReadThread extends Thread{
    private PipedInputStream pipedInputStream;

    public ReadThread(PipedInputStream pipedInputStream) {
        this.pipedInputStream = pipedInputStream;
    }

    @Override
    public void run() {
        try {
            byte[] buffer = new byte[1024];
            int bytesRead = pipedInputStream.read(buffer); // Read data from the piped input stream
            if (bytesRead != -1) {
                System.out.println("Reader Thread: Data received: " + new String(buffer, 0, bytesRead));
            }
            pipedInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

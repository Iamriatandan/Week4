package pipedstreams;
import java.io.*;
public class WriterThread extends Thread{
    private PipedOutputStream pipedOutputStream;

    public WriterThread(PipedOutputStream pipedOutputStream) {
        this.pipedOutputStream = pipedOutputStream;
    }

    @Override
    public void run() {
        try {
            String data = "Hello from Writer Thread!";
            pipedOutputStream.write(data.getBytes()); // Write data to the piped output stream
            pipedOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package pierau;

import org.apache.log4j.Logger;

import javax.annotation.Nonnull;
import java.io.IOException;

/**
 * Runs application and interactions.
 */
public class Application {
    private static Logger LOG = Logger.getLogger(Application.class);

    /**
     * Holds only the main method an instance is not necessary.
     */
    private Application() {
    }

    public static void main(String[] args) throws IOException {
        LOG.debug("Starting application...");


    }

    private static void print(@Nonnull String message) {
        System.out.println(message);
    }


}
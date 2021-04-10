import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import sun.rmi.runtime.Log;

public class Logs {

    private static final Logger LOGGER = LogManager.getLogger(Log.class);

    public static void main(String[] args) {
        LOGGER.trace("Trace");
    }
}

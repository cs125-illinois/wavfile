/**
 * WavFile-specific exception class.
 */
public class WavFileException extends Exception {

    /**
     * Create a new WavFile-specific exception.
     */
    public WavFileException() {
        super();
    }

    /**
     * Create a new WavFile-specific exception with a given message.
     *
     * @param message the message
     */
    public WavFileException(final String message) {
        super(message);
    }

    /**
     * Create a new WavFile-specific exception with a message and throwable exception.
     *
     * @param message the message
     * @param cause the cause
     */
    public WavFileException(final String message, final Throwable cause) {
        super(message, cause);
    }

    /**
     * Create a new WavFile-specific exception with a throwable exception.
     *
     * @param cause the cause
     */
    public WavFileException(final Throwable cause) {
        super(cause);
    }
}

package lib2017.utils;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.logging.Logger;

public enum Messages {

    Library,
    Book, FILE, BOOKS, EXIT, TITLE, CREATE_BOOK, EMPTY_TITLE, AUTHOR, EMPTY_AUTHOR, DELETE_BOOK, ID, CONNECT, HOST, PORT, CONNECTION, INVALID_PORT, EMPTY_HOST;
    Locale l = new Locale("cs");//Locale.US;

    public String getMessage() {
        ResourceBundle bundle = ResourceBundle.getBundle("lib2017.utils.messages", l);
        String mess;
        try {
            mess = bundle.getString(this.name());
        } catch (MissingResourceException mre) {
            // LOG.warning(mre.toString());
            mess = name().replace("_", " ");
        }
        return mess;

    }
    private static final Logger LOG = Logger.getLogger(Messages.class.getName());

}

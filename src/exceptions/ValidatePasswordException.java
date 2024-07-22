package exceptions;//package exceptions;

import exceptions.ValidateException;

public class ValidatePasswordException extends ValidateException {
    public ValidatePasswordException(final String message) {
        super(message);
    }
}
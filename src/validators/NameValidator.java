

package validators;
import exceptions.ValidateNameException;
public class NameValidator implements Validator {
    ValidateNameException validateNameException = new ValidateNameException("");

    @Override
    public void validate(String value) throws ValidateNameException {
        if (value == null) {
            throw new ValidateNameException("Ошибка валидации имени" + validateNameException.getMessage());
        }
    }
// допишите код класса
}

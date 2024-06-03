package Programmieren3.Adressbuch;

public class AddressExportFileAlreadyExistsException extends Exception{
    public AddressExportFileAlreadyExistsException(String message) {
        super(message);
    }

    public AddressExportFileAlreadyExistsException() {
        super();
    }
}

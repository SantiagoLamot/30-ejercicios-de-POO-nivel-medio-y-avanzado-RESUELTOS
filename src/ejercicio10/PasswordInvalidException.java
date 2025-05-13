// Excepción general
class PasswordInvalidaException extends Exception {
    public PasswordInvalidaException(String mensaje) {//Llama al constructor de Exception pasando el msj
        super(mensaje);
    }
}

class LongitudInvalidaException extends PasswordInvalidaException {
    public LongitudInvalidaException() {
        super("La contraseña debe tener al menos 8 caracteres.");
    }
}

class FaltaMayusculaException extends PasswordInvalidaException {
    public FaltaMayusculaException() {
        super("La contraseña debe tener al menos una letra mayúscula.");
    }
}

class FaltaMinusculaException extends PasswordInvalidaException {
    public FaltaMinusculaException() {
        super("La contraseña debe tener al menos una letra minúscula.");
    }
}

class FaltaNumeroException extends PasswordInvalidaException {
    public FaltaNumeroException() {
        super("La contraseña debe tener al menos un número.");
    }
}

class FaltaCaracterEspecialException extends PasswordInvalidaException {
    public FaltaCaracterEspecialException() {
        super("La contraseña debe tener al menos un carácter especial.");
    }
}
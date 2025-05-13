public class ValidarContrasenia {
    public static void validar(String contrasenia) throws PasswordInvalidaException{
        if (contrasenia.length() < 8) {
            throw new LongitudInvalidaException();
        }

        if (!contrasenia.matches(".*[A-Z].*")) {
            throw new FaltaMayusculaException();
        }

        if (!contrasenia.matches(".*[a-z].*")) {
            throw new FaltaMinusculaException();
        }

        if (!contrasenia.matches(".*\\d.*")) {
            throw new FaltaNumeroException();
        }

        if (!contrasenia.matches(".*[!@#$%^&*().].*")) {
            throw new FaltaCaracterEspecialException();
        }


    }
}

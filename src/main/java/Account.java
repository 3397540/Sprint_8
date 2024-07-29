public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        if (hasBlankValue(name) || startsWithWhiteSpace(name) || endsWithWhiteSpace(name) || !hasOnlyOneWhiteSpace(name)
                || hasLessThan3Chars(name) || hasMoreThan19Chars(name)) {
            return false;
        } else {
            return true;
        }
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
    }

    private boolean hasBlankValue(String name) {
        return name.isBlank();
    }

    private boolean startsWithWhiteSpace(String name) {
        char c = name.charAt(0);
        return Character.isWhitespace(c);
    }

    private boolean endsWithWhiteSpace(String name) {
        char c = name.charAt(name.length() - 1);
        return Character.isWhitespace(c);
    }

    private boolean hasOnlyOneWhiteSpace(String name) {
        int counter = 0;
        boolean result = false;
        for (char c : name.toCharArray()) {
            if (Character.isWhitespace(c)) {
                counter++;
            } else {
                continue;
            }
        }
        if (counter == 1) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    private boolean hasLessThan3Chars(String name) {
        if (name.length() < 3) {
            return true;
        } else {
            return false;
        }
    }

    private boolean hasMoreThan19Chars(String name) {
        if (name.length() > 19) {
            return true;
        } else {
            return false;
        }
    }

}

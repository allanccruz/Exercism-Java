import static java.util.Collections.replaceAll;

class SqueakyClean {
    static String clean(String identifier) {

        StringBuilder str = new StringBuilder();

        for (int i = 0; i < identifier.length(); i++) {

            char c = identifier.charAt(i);

            if (Character.isSpaceChar(c)) {
                str.append('_');
            }

            else if (Character.isISOControl(c)) {
                str.append("CTRL");
            }

            else if (c == '-') {
                identifier = identifier.replace(identifier.charAt(i+1), Character.toUpperCase(identifier.charAt(i+1)));
            }

            else if (!Character.isLetter(c)) {
                str.append("");
            }

            else if (c >= 'α' && c <= 'ω') {
                str.append("");
            }

            else {
                str.append(c);
            }
        }

        return str.toString();

    }

}
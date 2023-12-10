package Lernen.OOP.Practice;

public class Ceasar {
    int n;

    public Ceasar(int n) {
        this.n = n;

    }

    public String codeString(String toCode) {
        StringBuilder coded = new StringBuilder();
        int lastCharValue = 'z';//122
        int alphabetLength = 'z' - 'a' + 1;

        for (char character : toCode.toCharArray()) {
            int charNoRotation = character + n;

            int charVal = charNoRotation < lastCharValue ? charNoRotation : charNoRotation - alphabetLength;
            coded.append((char) charVal);
        }
        return coded.toString();
    }
}

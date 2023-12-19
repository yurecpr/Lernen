package Practic.Pr19_12.Abstrakt;

class Boy extends Student {
    public Boy(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    @Override
    String getActivity() {
        return "Making a stool";
    }
}
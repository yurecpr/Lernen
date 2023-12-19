package Practic.Pr19_12.Abstrakt;

class Girl extends Student {
    public Girl(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    @Override
    String getActivity() {
        return "Cooking soup";
    }
}

public class NotSoVoidClass {
    final int something;

    public NotSoVoidClass(final int something) {
        this.something = something;
    }

    public String giveMeTheAnswer() {
        return this.something + " is The Answer to the Ultimate Question of Life, the Universe, and Everything.";
    }

    public static void main(String[] args) {
        System.out.println(new NotSoVoidClass(42).giveMeTheAnswer());
    }
}

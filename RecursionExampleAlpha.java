class RecursionExampleAlpha {
    public static void main(String[] args) {
        alpha();
    }
    public static void alpha() {
        System.out.println("Alpha");
        alpha();
    }
}
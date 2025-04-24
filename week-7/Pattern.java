abstract class PatternPrinter {
    public int n;
    private String title;

    abstract void PrintPattern(int n);

    public void Patterntitle(String title) {
        System.out.println("\n" + title);
        System.out.println("------------------------");
    }
}
class StarPattern extends PatternPrinter {
    public void PrintPattern(int n) {
        this.n = n;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after inner loop
        }
    }
}
class NumberPattern extends PatternPrinter {
    public void PrintPattern(int n) {
        this.n = n;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println(); // Move to the next line after inner loop
        }
    }
}
class Pattern {
    public static void main(String[] args) {
        StarPattern s = new StarPattern();
        s.Patterntitle("StarPattern");
        s.PrintPattern(5);
        NumberPattern num = new NumberPattern();
        num.Patterntitle("NumberPattern");
        num.PrintPattern(5);
        System.out.println("priyadarshini");
        System.out.println("AV.SC.U4CSE24221");
        System.out.println("CSE-C");
    }
}
class MyClass {
    // Static variable count initialized to zero
    static int count = 0;
    // Constant variable pi initialized to 3.14
    static final double pi = 3.14;

    // Constructor increments the count variable
    public MyClass() {
        count++;
    }

    public static void main(String[] args) {
        // Creating three objects of MyClass
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();
        MyClass obj3 = new MyClass();

        // Printing the final values of count and pi variables
        System.out.println("Final count: " + MyClass.count);
        System.out.println("Value of pi: " + MyClass.pi);
        System.out.println("priya");
    }
}

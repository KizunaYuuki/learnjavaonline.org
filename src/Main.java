class Student {
    private String firstName;
    private String lastName;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Your code goes here
    public void printFullName() {
        System.out.println(this.firstName + " " + this.lastName);
    }
}

class Point {
    int x;
    int y;

    Point() {
        this(0, 0);
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void printPoint() {
        System.out.println("(" + x + "," + y + ")");
    }

    Point center(Point other) {
        // Returns the center between this point the other point
        // Notice we are using integer, we won't get an accurate value
        return new Point((x + other.x) / 2, (y + other.y) / 2);
    }

    public void scale() {
        x = x / 2;
        y = y / 2;
    }
}

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        String a = new String("Wow");
        String b = a;
        String c = a + "!";
        String d = c;

        boolean b1 = a == b;
        boolean b2 = d.equals(b + "!");
        boolean b3 = !c.equals(a);

        if (b1 && b2 && b3) {
            System.out.println("Success!");
        }

        int[] arr = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }

        int[] numbers = {
                951, 402, 984, 651, 360, 69, 408, 319, 601, 485, 980, 507, 725, 547, 544,
                615, 83, 165, 141, 501, 263, 617, 865, 575, 219, 390, 984, 592, 236, 105, 942, 941,
                386, 462, 47, 418, 907, 344, 236, 375, 823, 566, 597, 978, 328, 615, 953, 345,
                399, 162, 758, 219, 918, 237, 412, 566, 826, 248, 866, 950, 626, 949, 687, 217,
                815, 67, 104, 58, 512, 24, 892, 894, 767, 553, 81, 379, 843, 831, 445, 742, 717,
                958, 609, 842, 451, 688, 753, 854, 685, 93, 857, 440, 380, 126, 721, 328, 753, 470,
                743, 527 };

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 237) {
                break;
            }
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }

        }

        Student[] students = new Student[] {
                new Student("Morgan", "Freeman"),
                new Student("Brad", "Pitt"),
                new Student("Kevin", "Spacey"),
        };
        for (Student s : students) {
            s.printFullName();
        }

        Point A = new Point(8, 4);
        A.scale();
        System.out.println(A.y);
    }

}
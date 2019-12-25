package a.level.homework1;

class Uravnenie {

    public static void main(String[] args) {

        double a, b, c;
        double x1, x2;
        a = 7;
        b = 26;
        c = 10;

        double Discriminant = b * b - 4 * a * c;

        if (Discriminant == 0) {
            x1 = (-b + Math.sqrt(Discriminant)) / (2 * a);
            x2 = x1;
            System.out.printf("x1 = x2 = %s", x1);
        } else if (Discriminant > 0) {
            x1 = (-b + Math.sqrt(Discriminant)) / (2 * a);
            x2 = (-b + Math.sqrt(Discriminant)) / (2 * a);
            System.out.printf("x1 = %s, x2 = %s", x1, x2);
        } else {
            System.out.println("Нет целого решения т.к D<0");
        }
    }
}

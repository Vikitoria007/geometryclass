public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        System.out.println("Прямоугольник: Площадь = " + rectangle.area() + ", Периметр = " + rectangle.perimeter());

        Shape circle = new Circle(7);
        System.out.println("Круг: Площадь = " + circle.area() + ", Периметр = " + circle.perimeter());

        Shape triangle = new Triangle(3, 4, 5);
        System.out.println("Треугольник: Площадь = " + triangle.area() + ", Периметр = " + triangle.perimeter());
        Student student1 = new IUStudent("Иванов Иван", 2, 4.5);
        System.out.println(student1.writeExam());

        Student student2 = new MathStudent("Петров Петр", 3, 5.0);
        System.out.println(student2.writeExam());

        StringArray stringArray = new StringArray();
        stringArray.addString("Привет");
        stringArray.addString("Мир");
        stringArray.addString("Java");
        
        System.out.println("Максимальная длина строки: " + stringArray.maxLengthString());
        System.out.println("Средняя длина строк: " + stringArray.averageLength());
    }
}

abstract class Student {
    protected String name;
    protected int course;
    protected double examGrade;

    public Student(String name, int course, double examGrade) {
        this.name = name;
        this.course = course;
        this.examGrade = examGrade;
    }

    abstract String writeExam();
}

class IUStudent extends Student {
    public IUStudent(String name, int course, double examGrade) {
        super(name, course, examGrade);
    }

    @Override
    String writeExam() {
        return name + " из ИУ пишет экзамен.";
    }
}

class MathStudent extends Student {
    public MathStudent(String name, int course, double examGrade) {
        super(name, course, examGrade);
    }

    @Override
    String writeExam() {
        return name + " из математического факультета пишет экзамен.";
    }
}

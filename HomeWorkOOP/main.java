package HomeWorkOOP;

public class main {
    public static void main(String[] args) {  Student student = new Student();
        student.setName("Дима");
        student.setAge(27);
        student.setWeight(80);
        student.setYearOfStudy(3);
        System.out.println("Имя студента: " + student.getName());
        System.out.println("Студенту : " + student.getAge() + " Лет ");
        System.out.println("Вес студента : " + student.getWeight());
        System.out.println("Студент учиться " + student.getYearOfStudy() + " Года ");
        student.increaseYearOfStudy();
        System.out.println( student.getYearOfStudy());
    }
}

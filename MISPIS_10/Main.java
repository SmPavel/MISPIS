import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Collection<Lecturer> lecturers = new LinkedList<>();
        Collection<Course> courses = new LinkedList<>();
        Collection<Institute> institutes = new LinkedList<>();
        Collection<Faculty> faculties = new LinkedList<>();
        Collection<AdminEmployee> adminEmployees = new LinkedList<>();

        Lecturer lecturer = new Lecturer(1, 22, "vlasovIsTheBestTeacher@mail.ru",
                "Власов.С.В", 4);
        lecturers.add(lecturer);

        AdminEmployee adminEmployee = new AdminEmployee("Свиридов Ф.Ю.", 100000.99,
                "vlasovIsTheBestTeacher@mail.ru", 5, 2);
        adminEmployees.add(adminEmployee);

        Project project = new Project("Электронный журнал для военной кафедры",
                new Date(2020, Calendar.APRIL, 11),
                new Date(2020, Calendar.DECEMBER, 11));

        ResearchAssociate assistant = new ResearchAssociate("Сычев.А.В", "IS");

        Dean dean = new Dean("Алгазинов.Э.К", 900000.99,
                "Algazinov@mail.ru", 6, 3);

        Participation participation = new Participation(85.5);

        Course course = new Course("МиСПИС", 69, 420);
        courses.add(course);

        Institute institute = new Institute("ПиИТ", "Россия, г. Воронеж, Университетская пл., д. 1, ауд. 381а");
        institutes.add(institute);

        Faculty faculty = new Faculty(dean, institutes, "ФКН");
        faculties.add(faculty);
    }
}

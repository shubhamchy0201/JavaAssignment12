import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class FindAllDetails {
    public void printDepartmentName(List<Student> list) {
        list.stream().map(Student::getEngDepartment).distinct().forEach(System.out::println);
    }
    public void getDetailsOfMaleStudentOfCSE(List<Student> list) {
        list.stream().filter(student->student.getEngDepartment().equals("Computer Science") && student.getGender().equals("Male")).forEach(x -> System.out.println(x.getName()));
    }

    public void getNames(List<Student> list) {
        List<String> list1= list.stream().filter(student -> student.getYearOfEnrollment()>2018).map(Student::getName).collect(Collectors.toList());
        System.out.println(list1);
    }
    public void countMaleandFemale(List<Student> list) {
        list.stream().collect(groupingBy(Student::getGender)).forEach((k,v)-> System.out.println("Number of "+k+" student is "+v.size()));
    }

    public void averageAgeOfMaleandFemale(List<Student> list) {
        list.stream().collect(groupingBy(Student::getGender,averagingInt(Student::getAge))).forEach((k,v)-> System.out.println("Average age of "+k+" is "+v));
    }

    public void studentHavingHighestPercentage(List<Student> list) {
        Student studentPercentage=list.stream().min(Comparator.comparing(Student::getPercentageTillDate)).orElseThrow(NoSuchElementException::new);
        System.out.println(studentPercentage.getPercentageTillDate());
    }

    public void countStudentInEachDept(List<Student> list) {
        list.stream().collect(groupingBy(Student::getEngDepartment)).forEach((k,v)-> System.out.println(k+"Department has "+v.size()+" Students."));
    }

    public void averageInEachDepartment(List<Student> list) {
        list.stream().collect(groupingBy(Student::getEngDepartment,averagingDouble(Student::getPercentageTillDate))).forEach((k,v)-> System.out.println(k+" Department has average percentage "+v));

    }

    public void findYoungestStudent(List<Student> list) {
        Student youngStudent=list.stream().filter(student->student.getEngDepartment().equals("Electronic") && student.getGender().equals("Male")).min(Comparator.comparingInt(Student::getAge)).orElseThrow(NoSuchElementException::new);
        System.out.println(youngStudent.getId()+" "+youngStudent.getName()+" "+youngStudent.getGender()+" "+youngStudent.getEngDepartment());
    }

    public void getCountOfMaleandFemale(List<Student> list) {
        list.stream().filter(student->student.getEngDepartment().equals("Computer Science")).collect(groupingBy(Student::getGender)).forEach((k,v)-> System.out.println("No of "+k+" Students are: "+v.size()));

    }
}

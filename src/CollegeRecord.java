import java.util.ArrayList;
import java.util.List;

public class CollegeRecord {
    public static void main(String[] args) {

        List<Student> list=new ArrayList<Student>();
        list.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        list.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        list.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        list.add(new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
        list.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        list.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        list.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        list.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        list.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        list.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        list.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        list.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        list.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        list.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        list.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        list.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4));
        list.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));

        FindAllDetails findAllDetails=new FindAllDetails();
        //Part-1:Print the name of all the department
        System.out.println("Get all department name: ");
        findAllDetails.printDepartmentName(list);

        //part-2 Get the names of all students who have enrolled after 2018?
        System.out.println("Get Names of student enroll after 2018");
        findAllDetails.getNames(list);

        //part-3 : Get the details of all male student in the computer sci department?
        System.out.println("Get name of male student from CSE Department");
        findAllDetails.getDetailsOfMaleStudentOfCSE(list);

        //Part-4 :How many male and female student are there ?
        System.out.println("Count No of Male and Female");
        findAllDetails.countMaleandFemale(list);

        //Part-5: average age of male and female students?
        System.out.println("Average age of Male and female is:");
        findAllDetails.averageAgeOfMaleandFemale(list);

        //Part-6 :Get the details of highest student having highest percentage ?
        System.out.println("Student having highest percentage: ");
        findAllDetails.studentHavingHighestPercentage(list);

        //Part-7 Count the number of students in each department
        System.out.println("Display total number of students in each department: ");
        findAllDetails.countStudentInEachDept(list);

        //Part-8 finding average percentage achieved in each department.
        System.out.println("Display average in each department ");
        findAllDetails.averageInEachDepartment(list);

        //Part-9 details of youngest male student in the Electronic department
        System.out.println("Details of Youngest Student: ");
        findAllDetails.findYoungestStudent(list);

        //Part-10 No of male and female students are there in the computer science department.
        System.out.println("No of Male and female in CSE Department: ");
        findAllDetails.getCountOfMaleandFemale(list);
    }
}

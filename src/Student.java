public class Student {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String engDepartment;
    private int yearOfEnrollment;
    private double percentageTillDate;
    Student( int id,String name, int age, String gender,String engDepartment,int yearOfEnrollment ,double percentageTillDate)
    {
    this.id=id;
    this.name=name;
    this.age=age;
    this.gender=gender;
    this.engDepartment=engDepartment;
    this.yearOfEnrollment=yearOfEnrollment;
    this.percentageTillDate=percentageTillDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setEngDepartment(String engDepartment) {
        this.engDepartment = engDepartment;
    }

    public String getEngDepartment() {
        return engDepartment;
    }

    public void setYearOfEnrollment(int yearOfEnrollment) {
        this.yearOfEnrollment = yearOfEnrollment;
    }

    public int getYearOfEnrollment() {
        return yearOfEnrollment;
    }

    public void setPercentageTillDate(double percentageTillDate) {
        this.percentageTillDate = percentageTillDate;
    }

    public double getPercentageTillDate() {
        return percentageTillDate;
    }
}

package design;

import java.util.Scanner;

public class EmployeeInfo extends AbstractClass implements Employee {

    /*
    This class should implement the Employee interface. You can do that by directly implementing it, however you must
        also implement the Employee interface into an abstract class. So create an Abstract class then inherit that
        abstract class into this EmployeeInfo class. Once you're done with designing EmployeeInfo class,
        go to FortuneEmployee class to apply all the fields and attributes.

    Important: YOU MUST USE:
        - OOP (Abstraction, Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
        - Use all kind of keywords (super, this, static, final, etc)
        - Implement nested class below (DateConversion)
        - Use Exception Handling
     */
     // polymorphism (methods overloading)
    @Override
    public void transportationServices() {
        super.transportationServices();
    }

    @Override
    public int employeeId() {
        return 0;
    }

    @Override
    public String employeeName() {
        return null;
    }

    @Override
    public void assignDepartment() {

    }

    @Override
    public int calculateSalary() {
        return 0;
    }

    @Override
    public boolean benefitLayout() {

        return false;
    }

    /*
     * Make sure to declare and use static, non-static & final fields
     */
    int employeeId;
    static String companyName;
    private String name;
    static  int salary ;
    static int performance;

    //Encapsulation (Getter &  Setter )

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*
     You must have/use multiple constructors
     */
    public EmployeeInfo(){

    }
    public EmployeeInfo(int salary,int employeeId) {
        this.salary= salary;

    }

    public EmployeeInfo(String name, String companyName) {
        this.name=name;
        this.companyName=companyName;

    }

    /*
     You need to implement the logic of this method as such:
        It should calculate Employee bonus based on salary and performance.
        It should return the total yearly bonus.
            Example: 10% of salary for best performance, 8% of salary for average performance and so on.
            You can set arbitrary number for performance, so you probably need to send 2 arguments.
     *
     */
    public static double calculateEmployeeBonus(int numberOfYearsWithCompany) {
        double total=0;
        double bonus;

        if(performance >= 7){
            bonus =(int) (salary * (.1));
            System.out.println("Employees bonus best performance = $"+bonus);

            if (numberOfYearsWithCompany >= 3){
                total = salary + bonus;
            }
            System.out.println("total with best performance is: "+total);

        }else{
            bonus = salary*8;
            System.out.println("Employees bonus average performance = $"+bonus);}

        if (numberOfYearsWithCompany < 5){
            total = salary + bonus;
        }
        System.out.println(" total with average performance is: "+total);

        return total;

    }



    /*
     You need to implement the logic of this method as such:
        It should calculate Employee pension based on salary and numbers of years with the company.
        It should return the total pension amount.
            Example: Employee will receive 5% of salary as pension for every year they are with the company
     *
     */
    public static double calculateEmployeePension() {
        double totalPension;
        double  total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter start date in format (example: May,2015): ");
        String joiningDate = sc.nextLine();
        System.out.println("Please enter today's date in format (example: August,2017): ");
        String todaysDate = sc.nextLine();
        String convertedJoiningDate = DateConversion.convertDate(joiningDate);
        String convertedTodaysDate = DateConversion.convertDate(todaysDate);

        // Figure out how to extract the number of years the employee has been with the company, using the above 2 dates
        // Calculate pension
        int StartingDate=2019;
        int CurrentDate=2021;
        if (CurrentDate-StartingDate==1){
            totalPension = salary * .04;


        }else if (CurrentDate - StartingDate >= 2 ){
            totalPension = salary * .1;

        }else totalPension =0;


        System.out.println("this is pension total salary"+totalPension);
        return totalPension;

    }

    private static class DateConversion {

        public DateConversion(Months months) {
        }

        public static String convertDate(String date) {
            String[] extractMonth = date.split(",");
            String givenMonth = extractMonth[0];
            int monthDate = whichMonth(givenMonth);
            String actualDate = monthDate + "/" + extractMonth[1];
            return actualDate;
        }

        public static int whichMonth(String givenMonth) {
            Months months = Months.valueOf(givenMonth);
            int date = 0;
            switch (months) {
                case January:
                    date = 1;
                    break;
                case February:
                    date = 2;
                    break;
                case March:
                    date = 3;
                    break;
                case April:
                    date = 4;
                    break;
                case May:
                    date = 5;
                    break;
                case June:
                    date = 6;
                    break;
                case July:
                    date = 1;
                    break;
                case August:
                    date = 1;
                    break;
                case September:
                    date = 1;
                    break;
                case October:
                    date = 1;
                    break;
                case November:
                    date = 1;
                    break;
                case December:
                    date = 1;
                    break;
                default:
                    date = 0;
                    break;
            }
            return date;

        }
    }
}

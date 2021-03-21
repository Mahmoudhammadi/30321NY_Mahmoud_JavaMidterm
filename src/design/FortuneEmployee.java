package design;

import databases.ConnectToSqlDB;

public class FortuneEmployee {

    /**
     FortuneEmployee class has a main method where you will be able to create Object from
        EmployeeInfo class to use fields and attributes
     <p>
     Demonstrate as many methods as possible to use with proper business work flow.
        Try to think like a Software Architect/Developer.
        This application should provide basic employee information services
     </p>
     <p>
     Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
     </p>
     **/
    public static void main(String[] args) throws Exception {
        EmployeeInfo employee = new EmployeeInfo();
        EmployeeInfo employee1 = new EmployeeInfo(7000,23);
        EmployeeInfo employee2 = new EmployeeInfo("Mahmoud","Harley davidson");
        ConnectToSqlDB dt = new ConnectToSqlDB();
//        dt.readDataBase("test","stName");
//        dt.directDatabaseQueryExecute("select* from test","stID");
        ConnectToSqlDB.readUserProfileFromSqlTable();





        EmployeeInfo employeeInfo = new EmployeeInfo();

        employeeInfo.transportationServices();
        employeeInfo.setName("john");
        employeeInfo.getName();
        employeeInfo.employeeId();
        employeeInfo.calculateEmployeeBonus(3);
        employee.calculateEmployeePension();



    }


}



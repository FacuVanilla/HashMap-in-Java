

public class Employee {
     int empId;
     String empName;


     public Employee(int empId, String empName) {
            super();
            this.empId = empId;
            this.empName = empName;
}



  @Override
  public boolean equals(Object obj) {
    Employee emp = (Employee) obj;
    return this.empId == emp.empId;
  }
}




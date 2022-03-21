package Entities;

import java.util.Vector;

public class Cashier extends User{
    private float salary;
    //private Vector<Shift> shifts = new Vector<>();

    public Cashier(String firstname, String lastname, int age, String gender, float salary) {
        super(firstname, lastname, age, gender);
        this.salary = salary;
    }

    /* public Cashier(String firstname, String lastname, int age, String gender, float salary, Vector<Shift> shifts) {
        this(firstname, lastname, age, gender, salary);
      //  this.shifts = shifts;
    }*/

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

//    public Vector<Shift> getShifts() {return shifts;}

    //public void setShifts(Vector<Shift> shifts) {this.shifts = shifts;}

    //public void appendShift(Shift shift) {this.shifts.add(shift);}

    @Override
    public String toString() {
        return "Cashier{" +
                "salary=" + salary +
              //  ", shifts=" + shifts +
                ", id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}

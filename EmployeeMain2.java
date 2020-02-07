//package com.cg.per;

//public class Employee {
        @SuppressWarnings("unused")
        private String name;
        private double salary;
        private double pfper;
        public Employee(String name, double salary, double pfper) {
                this.name=name;
                this.salary=salary;
                this.pfper=pfper;
        }
        public double calNetPay() {
                if (pfper<=5) {
                        return salary;
                }
                else {
                        return salary-salary*(pfper/100);
                }
        }
}
package com.cg.per;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class EmployeeTest {
        Employee  e1 = new Employee("sohaib",5000,6);
        Employee  e2 = new Employee("sohaib",5000,6);
        
        @Test
        public void test1() {
                assertEquals(e1.calNetPay(),4700);
        }
        @Test
        public void test2() {
                assertEquals(e2.calNetPay(),4700);
        }
}

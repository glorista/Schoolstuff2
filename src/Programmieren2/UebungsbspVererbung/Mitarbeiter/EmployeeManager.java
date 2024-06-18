package Programmieren2.UebungsbspVererbung.Mitarbeiter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EmployeeManager {

    protected List<Employee> empList = new ArrayList<>();

    public EmployeeManager() {
        this.empList = empList;
    }

    public void addEmployee (Employee e){
        if(!empList.contains(e)){
            empList.add(e);
        }
    }

    public double calcTotalSalary(){
        double sum = 0;
        for (Employee e:empList){
            sum= sum +e.getFullSalary();
        }
        return sum;
    }

    public HashMap<String, Double> getSalaryByDepartment(){
        HashMap<String, Double> alleGehaelter = new HashMap<>();
        double sum = 0;
        for (Employee e :empList){
            if(alleGehaelter.containsKey(e.department)){
                sum= alleGehaelter.get(e.department); //inklusive jeglicher Promotions dept.get(e.department)
                alleGehaelter.put(e.department,sum+ e.getFullSalary());
            }else{
                alleGehaelter.put(e.department,e.getFullSalary());
            }
        }
        return alleGehaelter;
    }

    @Override
    public String toString() {
        return "EmployeeManager{" +
                "empList=" + empList +
                '}';
    }
}

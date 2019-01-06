package com.akulcompany;

import com.akulcompany.auditoriya.Students;
import com.akulcompany.interfaces.Profess_StudentInterface;
import com.akulcompany.interfaces.GroupInterface;

import java.util.ArrayList;

public class University_room {

    public static final String UNIVERSITY_NAME = "КДУ Т.Шевченка";

    private ArrayList<String> list_visitor= new ArrayList<String>();// студенти які присутні

    public ArrayList<String> getList_visitor () {
        return list_visitor;
    }

    public void setList_visitor (ArrayList<String> list_visitor) {
        this.list_visitor = list_visitor;
    }

    public static String getUniversityName () {
        return UNIVERSITY_NAME;
    }
// вводимо список присутніх студентів
    public void addList_visitors(String visitor_name){
        list_visitor.add(visitor_name);
}
/*****************************************************
    //private ArrayList<GroupInterface> departmentList = new ArrayList<GroupInterface>();// в каждом департаменте(кафедра
                                                                                        // Університету) є свої групи студентів

   // private ArrayList<Profess_StudentInterface> visitorList = new ArrayList<Profess_StudentInterface>();

   // public ArrayList<GroupInterface> getDepartmentList() {
        return departmentList;
    //}

    //public void addDepartment(GroupInterface department){
        departmentList.add(department);
    }
 /*****************************************************/

}
package com.akulcompany.Groups;

import com.akulcompany.auditoriya.Students;

import java.util.ArrayList;

public class Electronic_group {
    static final String group_name = "група № 103  кафедри ЕЛЕКТРОНіКИ,";

    public Electronic_group () {
    }


    public ArrayList<Students> list_group= new ArrayList<Students>();//список групи можна задати статично або Scaner методом ввода, або з файла




    public void setList_group (ArrayList<Students> list_group) {
        this.list_group = list_group;
    }

    public static String getGroup_name () {
        return group_name;
    }

    public ArrayList<Students> getList_group () {
        return list_group;
    }

    public void addList_group (Students students) {
       list_group.add(students);


    }


    //

}

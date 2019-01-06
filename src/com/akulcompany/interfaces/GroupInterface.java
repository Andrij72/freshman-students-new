package com.akulcompany.interfaces;

import com.akulcompany.enums.Group_numbers;
import com.akulcompany.enums.Кafedra_name;

import java.util.ArrayList;

public interface GroupInterface {
    Group_numbers getNumber();
    Кafedra_name getName_cafedra();



    ArrayList<String> getEmployeeList ();

}


package com.akulcompany.interfaces;



public interface Profess_StudentInterface {
    String getName();

   // GroupInterface getKafedra();

    void getDepartment(GroupInterface group);





    void setDepartment(GroupInterface department);


    GroupInterface getKafedra ();

    void setGroup (GroupInterface group);

    Profess_StudentInterface getDepartment ();

    void setDepartment (Profess_StudentInterface department);

    public   void start_lecture();//професор повинен провести перекличку і провірити чи всі присутні
    public void vout();// голусування за Старосту

    boolean isDuty ();
}

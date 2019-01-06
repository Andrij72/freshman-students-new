package com.akulcompany.auditoriya;

import com.akulcompany.Groups.Electronic_group;
import com.akulcompany.enums.MyVote;

public class Students {

    private String st_name="";// Прізвище студента
    private  int age=0; // вік студента



    private String group_name;//назва кафедри і номер групи
    private int admin_vac=0;// адміністративний досвід, (к-ть місяців перебування на відповідній посаді)
    private int soc_prog=0; // активна громадська позиція,  участь у соцыальних проектах (к-ть  проектів з особистою участю)
    private int group_pro = 0;// наявність соцпрограми-пропозиції розвитку групи(так-"1",ні-"0" )

    //----конструктори--

    public Students ( String name) {
        this.group_name = Electronic_group.getGroup_name();
        this.st_name = name;
    }
    public Students ( String name, int age, int admin_vac, int soc_prog, int group_pro) {
        this.group_name = Electronic_group.getGroup_name();
        this.st_name = name;
        this.age = age;
        this.admin_vac = admin_vac;
        this.soc_prog = soc_prog;
        this.group_pro = group_pro;
    }

    public String getName () {
        return st_name;
    }

    public void setName (String name) {
        this.st_name = name;
    }

    public String getGroup_name () {
        return group_name;
    }
    public int getAge () {
        return age;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public int getAdmin_vac () {
        return admin_vac;
    }

    public void setAdmin_vac (int admin_vac) {
        this.admin_vac = admin_vac;
    }

    public int getSoc_prog () {
        return soc_prog;
    }

    public void setSoc_prog (int soc_prog) {
        this.soc_prog = soc_prog;
    }

    public int getGroup_pro () {
        return group_pro;
    }

    public void setGroup_pro (int  group_pro) {
        this.group_pro = group_pro;
    }


    // ---------студент голосує за старосту групи
    //Правила голосування.    Відповідає якостям: має адміністративний досвід, активна громадська позиція,
    // участь у реалпроектах.  Переможець на посаду <Старости> відповідає всім цим якостям і набрав максимальну к-ть голосів
    public int myVote (int vt) {
        int rez = 0;// тут повидна бути логіка, як голосує Так чи Ні.
        if (vt == 1) {
            rez = 1;
        }
        return rez;
    }



}

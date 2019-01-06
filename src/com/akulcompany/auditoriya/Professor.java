package com.akulcompany.auditoriya;


import com.akulcompany.Groups.Electronic_group;

import java.io.IOException;
import java.util.*;

public class Professor {
private String name;//ПІБ професора

    public Professor (String s) {
        this.name=s;
    }

    //  Професор робить перекличку в групі та визначає присутність

    public  void check_prisutnost(ArrayList<Students> list1, ArrayList<String> list2, ArrayList<String> list3){

        Electronic_group electronic_group = new Electronic_group();


       // electronic_group.getList_group();
        System.out.println("--список групи Електроніки--");
        System.out.println("           ----             ");
        for (Students el_gr : list1) {
            System.out.println(el_gr.getName() + " " + el_gr.getAge() + " " + el_gr.getGroup_name());
            String temp = el_gr.getName();

            if (!list2.contains(temp)) {
                list3.add(temp);
            }
        }







    }//професор оцынює присутність


/******************************************************************************
  // public   void start_lecture() {



       //------ cтуденти які прийшли послухати лекцію

       // cтуденти які прийшли послухати лекцію
       //list1.add(0, "Іванов");
       //list1.add(1, "Степанов");
       //list1.add(2, "Лихар");
       //list1.add(3, "Бородай");
       //list1.add(4, "Лях");
       //Іванов  Степанов  Лихар  Бородай  Лях
       StringBuffer buf = new StringBuffer();
       buf.append("Доброго дня, шановні!" + "\n" + "\n");
       buf.append("-------------------------------------------------------" + "\n");
       buf.append("Проведемо перекличку та звіримо присутність....і так, по списку групи..присутны наступні студенти:..." + "\n");

       System.out.print(buf.toString());


   }

     //----------- проводить звірку по списку групи-------

       //---------професор результує чи всі присутні------




        //for (String process : list1) {
              // System.out.println(process);
               //if (!list2.contains(process)) {
                 //  list3.add(process);
               //}
           //}

//*************************************************************************
           // провірка чи  всі присутні


          /* if (list1.containsAll(list2)&&(list1.size()==list2.size())){
               System.out.println(" Присутня ВСЯ ГРУПА"+ "");
           }
            else {
               System.out.println();
               System.out.printf("%s","***є відсутні****");

                //System.out.println(list3.size());// відсутня   к-ть студентів
           }



**********************************************************************************/


}


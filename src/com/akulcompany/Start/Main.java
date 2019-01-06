
/*************************************************************************************
 *          program  "FRESHNAN STUDENTS"  ( Першокурсники )
 *                                                      athor name: Andrij Kulynych
 *************************************************************************************/

/************************************************************************************
 *             Коротка інстр-я програми:
 *
 * В класі Main  метод  запускаеться
 * public static void main(String[] args) {  imitateWorking_of_students_group().
 * Проводиться голосування за двох кандидатів. Голосують усі студенти групи.
 *
 * На запит програми: "Введите 1 или 0 за кандидата :“ підведіть курсор нижче запиту
 * і введіть відповідно “0”(студент голосує протів  програми кандидата)  та натисніть Enter, або введіть  “1”(голосує за
 * програму кандидата) та також натисніть Enter.
 *
 * Голосує кожний студент із списку групи по кожному із 2-х кандидатів.
 *  В кінці Програми виводиться в консоль "староста групи", якому студенти віддали більшысть голосів.
 * Програма також виводить в консоль присутніх та відсутніх студентів за результатом проведеної професором переклички.
 *
 *
 * Більш об*ємний опис прог-ми додано в окремому файлі
 *
 * */




package com.akulcompany.Start;

import com.akulcompany.Groups.Electronic_group;
import com.akulcompany.University_room;
import com.akulcompany.auditoriya.Professor;
import com.akulcompany.auditoriya.Students;

import java.awt.*;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {  imitateWorking_of_students_group();   }


    //
        private static void imitateWorking_of_students_group() {
            int rezalt1=0;
            int rezalt2=0;


            University_room univer = new University_room();// створюєм аудиторію Университету,

            // сворюэм групу
            Electronic_group electronic_group = new Electronic_group();
            // Kvantelectronic_group kvantelectr_group= new  Kvantelectronic_group();


            // формуэм списки груп(групи електроныки наприклад).

            Students student1 = new Students("Іванов", 25, 12, 2, 1);

            Students student2 = new Students("Петров", 23, 8, 3, 1);
            Students student3 = new Students("Баранов", 20, 11, 2, 1);
            Students student4 = new Students("Левина", 19, 11, 2, 1);
            Students student5 = new Students("Зотова", 19, 11, 2, 1);
            Students student6 = new Students("Ефросинина", 19, 11, 2, 1);
            Students student7 = new Students("Вус", 20, 11, 2, 1);

            electronic_group.addList_group(student1);
            electronic_group.addList_group(student2);
            electronic_group.addList_group(student3);
            electronic_group.addList_group(student4);
            electronic_group.addList_group(student5);
            electronic_group.addList_group(student6);
            electronic_group.addList_group(student7);


            //добавляєм список групи електоніки
            //-----формуэм список групи по якому ведеться перекличка
            // формуєм список студентів, які прийшли послухати лекцію
            ArrayList<String> list2 = new ArrayList<String>();
            ArrayList<String> list3 = new ArrayList<String>();
            list2.add(0, "Іванов");
            list2.add(1, "Баранов");
            list2.add(2, "Левина");
            list2.add(3, "Вус");
            list2.add(4, "Зотова");


            Professor professor = new Professor("Калайда");// создаем професора

                //------ професор проводить перекличку в групі та визначає присутніcть

            professor.check_prisutnost(electronic_group.getList_group(),list2,list3);

            StringBuffer buf = new StringBuffer();
            buf.append("**********************************" + "\n");
            buf.append("       ***********************    " + "\n");
            buf.append("           ***************      " + "\n");
                       System.out.print(buf.toString());
            buf.setLength(0);

            buf.append("Доброго дня, шановні!" + "\n" + "\n");
            buf.append("-------------------------------------------------------" + "\n");
            buf.append("Проведемо перекличку та звіримо присутність....і так, по списку групи..присутны наступні студенти:..." + "\n");

            System.out.print(buf.toString());
            buf.setLength(0);
            buf.append("**********************************" + "\n");
            buf.append("*           Присутні студенти    *" + "\n");
            buf.append("**********************************" + "\n");
            System.out.print(buf.toString());

            for (String prisutn_st : list2) {
                System.out.println(prisutn_st);
            }
            buf.setLength(0);

            buf.append("*******************************************" + "\n");
            buf.append("*          Відсутні на лекції студенти    *" + "\n");
            buf.append("*******************************************" + "\n");
            System.out.print(buf.toString());

            buf.setLength(0);

            for (String prisutn_st : list3) {
                System.out.println(prisutn_st);
            }


            //метод голосування
           buf.append("**********************************" + "\n");
            buf.append("       ***********************    " + "\n");
            buf.append("           ***************      " + "\n");
            buf.append("Увага!! Проведемо голосування за кандитатів" + "\n"+ "\n");
            buf.append("---------------------------------------------" + "\n");
            buf.append("" + "\n");
            System.out.print(buf.toString());
            buf.setLength(0);


            Students candidat1= new Students("Петров");
            Students candidat2= new Students("Левина");

            int count1=0;//кылькысть голосів по кандидату candidat1
            int count2=0;//кылькысть голосів по кандидату candidat2
            String cand_name1 = candidat1.getName();
             String cand_name2 = candidat2.getName();

             //public  void golosovaniye () ;


            for (Students el_gr : electronic_group.getList_group()) {
                          String viboreс_std = el_gr.getName();// ім'я студента вибореця

                          System.out.println("Голосує студент " +viboreс_std);
                          System.out.println("_____________________________ ");


                          System.out.print("Введите 1 или 0 за кандидата : " + cand_name1+"\n");
                          Scanner scan = new Scanner(System.in);
                          int number1 = scan.nextInt();


                           System.out.println("Вы ввели  **" + number1 + "** за кандидата " + cand_name1);
                         //голосування студента за кандидата1
                           rezalt1 = el_gr.myVote(number1);
                           if(rezalt1==1){count1++;}

                            System.out.println("**************");
                             System.out.print("Введите 1 или 0 за кандидата : " + cand_name2+"\n");
                            int number2 = scan.nextInt();
                           System.out.println("Вы ввели --" + number2 + " за кандидата " + candidat2.getName());
                         //голосування студента за кандидата2
                            rezalt2 = el_gr.myVote(number2);
                            if(rezalt2==1){count2++;}

                     }
            buf.append("**********************************" + "\n");
            buf.append("       ***********************    " + "\n");

            buf.append("      Увага!!      " + "\n");
            buf.append("---------------------------------------------" + "\n");

            System.out.print(buf.toString());
            buf.setLength(0);

                     if (rezalt1>rezalt2) {System.out.println(" СТАРОСТОЮ групи" + Electronic_group.getGroup_name()+ " став(ла) ___  "+ cand_name1);}

            else {System.out.println(" СТАРОСТОЮ групи" + Electronic_group.getGroup_name()+ " став(ла):   "+ cand_name2);}

        }

}

package com.company;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class Task3 {
    private String str;
    public void method_one () {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите адрес: www.");
        String temp = in.nextLine();
        Pattern patt = Pattern.compile("\\w+\\.\\w+((\\\\\\w+)+)?");
        Matcher match = patt.matcher(temp);
        if (match.find()) { System.out.println("Является"); }
        else { System.out.println("Не является"); }
        //while (match.find()) { System.out.println(match.start() + " " + match.group()); }
    }
    public void method_two () {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст");
        String temp = in.nextLine();
        Pattern patt = Pattern.compile("\\w+\\.\\w+((\\\\\\w+)+)?");
        Matcher match = patt.matcher(temp);
        if (match.find()) { temp = temp.replaceAll("\\.ru", ".рус"); }
        else { System.out.println("Не является"); }
        System.out.println(temp);
    }
}

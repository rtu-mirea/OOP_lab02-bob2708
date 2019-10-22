package com.company;

public class Task2 {
    private String str;
    Task2 (String str) { this.str = str; }
    public void getStr() {
        System.out.println(str);
    }
    public void swap16 () {
    StringBuffer strBuff = new StringBuffer(str);
        strBuff.append("  ");
    StringBuffer tempBuff = new StringBuffer();
    StringBuffer tempBuff2 = new StringBuffer(strBuff.length());
    char [] temp_char_arr = new char[strBuff.length()];
        strBuff.getChars(0,strBuff.length(),temp_char_arr,0);
        for (int i = 0; i < strBuff.length()-1; i++) {
        if (temp_char_arr[i] != ' ') {
            tempBuff.append(temp_char_arr[i]);
        } else {
            String temp_string = Integer.toHexString(Integer.parseInt(tempBuff.toString()));
            int temp_int = temp_string.indexOf("a") + temp_string.indexOf("b") + temp_string.indexOf("c")
                    + temp_string.indexOf("d") + temp_string.indexOf("e") + temp_string.indexOf("f");
            if (temp_int > -6) {
                tempBuff2.append(temp_string).append(" ");
            } else { tempBuff2.append(tempBuff).append(" "); }
            tempBuff.delete(0,tempBuff.length());
        }
    }
        System.out.println(tempBuff2.toString());
}
    public void add_sum () {
        StringBuffer strBuff = new StringBuffer(str);
        strBuff.append("  ");
        int summ = 0;
        StringBuffer tempBuff = new StringBuffer();
        char [] temp_char_arr = new char[strBuff.length()];
        strBuff.getChars(0,strBuff.length(),temp_char_arr,0);
        for (int i = 0; i < strBuff.length()-1; i++) {
            if (temp_char_arr[i] != ' ') {
                tempBuff.append(temp_char_arr[i]);
            } else {
                summ += Integer.parseInt(tempBuff.toString());
                tempBuff.delete(0,tempBuff.length());
            }
        }
        strBuff.deleteCharAt(strBuff.length()-1);
        strBuff.append(summ);
        System.out.println(strBuff.toString());
    }
    public void change_digits () {
        StringBuffer strBuff = new StringBuffer(str);
        strBuff.append("  ");
        StringBuffer tempBuff = new StringBuffer();
        StringBuffer tempBuff2 = new StringBuffer(strBuff.length());
        char [] temp_char_arr = new char[strBuff.length()];
        strBuff.getChars(0,strBuff.length(),temp_char_arr,0);
        for (int i = 0; i < strBuff.length()-1; i++) {
            if (temp_char_arr[i] != ' ') {
                tempBuff.append(temp_char_arr[i]);
            } else {
                char temp = tempBuff.charAt(0);
                tempBuff.setCharAt(0,tempBuff.charAt(tempBuff.length()-1));
                tempBuff.setCharAt(tempBuff.length()-1,temp);
                tempBuff2.append(tempBuff).append(" ");
                tempBuff.delete(0,tempBuff.length());
            }
        }
        System.out.println(tempBuff2.toString());
    }
}

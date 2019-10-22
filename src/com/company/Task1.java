package com.company;

public class Task1 {
    private String str;
    public void getStr() {
        System.out.print(str.trim());
    }
    public void setStr(String str) {
        this.str = str;
    }
    public void maximumCapacity () {
        String temp = str;
        temp.trim();
        String words[] = temp.split(" ");
        int max = 0;
        for (String word : words) {
            if (max < word.length()) { max = word.length(); }
        }
        System.out.println(max);
    }
    public void massivSlov () {
        int i = 0;  // Счетчик для заполнения массива temp
        String [] words = str.split(" ");        // массив из чисел строки str
        String [] temp = new String[words.length];
        // проверка на вхождение в шестнадцатеричную знапись чисел букв
        for (String word : words) {
            Integer string_to_num = Integer.parseInt(word);
            String num_to_0x_num = Integer.toHexString(string_to_num);
            int temp2 = num_to_0x_num.indexOf("a") + num_to_0x_num.indexOf("b") + num_to_0x_num.indexOf("c")
                    + num_to_0x_num.indexOf("d") + num_to_0x_num.indexOf("e") + num_to_0x_num.indexOf("f");
            // если есть буквы в шестн. записи - добавление во временный массив
            if (temp2 > -6) { temp[i] = num_to_0x_num; i++; }
        }
        // вывод массива на экран
        for (String num : temp) {
            if (num != null) { System.out.print(num + " "); }
        }
    }
    public String[] changeSymbols () {
        String [] words = str.split(" ");
        String [] new_words = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 1) {
                char [] temp = new char[words[i].length()] ;
                temp[0] = words[i].charAt(words[i].length()-1);
                temp[words[i].length()-1] =  words[i].charAt(0);
                words[i].getChars(1,words[i].length() - 1,temp,1);
                String temp_str = String.valueOf(temp);
                new_words[i] = temp_str;
            } else new_words[i] = words[i];
        }
        return new_words;
    }
    public char[] index_array () {
        String [] words = str.split(" ");
        Integer index = Integer.parseInt(words[words.length-1]);
        char [] massiv = new char[words.length-1];
        int j = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > index) { massiv[j] = words[i].charAt(index); j++; }
        }
        return massiv;
    }
}

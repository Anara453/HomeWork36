package com.company;

public enum Days {
    Monday("Понедельник"),Tuesday("Вторник"),Wednesday("Среда"),
    Thursday("Четверг"),Friday("Пятница"), Saturday("Суббота"),Sunday("Восресенье");
   private String translation;
    Days(String translation) {
        this.translation = translation;
    }
    public String getTranslation(){
        return translation;
    }
    public String toString(){
        return "Перевод на русский язык -> " + translation;
    }
}

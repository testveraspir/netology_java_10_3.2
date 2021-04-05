package ru.netology.domain;


public class Comments {
    private String idComments;
    private String textComments;
    private int amountComments; //количество комментариев
    private int canPost; //может ли текущий пользователь комментировать запись
    private int groupsCanPost; //могут ли сообщества комментировать запись
    private boolean canClose; //может ли текущий пользователь закрыть комментарии к записи
    private boolean canOpen; //может ли текущий пользователь открыть комментарии к записи
}

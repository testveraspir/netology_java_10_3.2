package ru.netology.domain;

import javax.xml.crypto.Data;

public class Heart {
    private int amountHeart; //число пользователей, которым понравилась запись
    private int userLikes; //наличие отметки от текущего пользователя
    private int canLike; //информация о том, может ли текущий пользовтель поставить отметку
    private int canPublish; //информация о том, может ли текущий пользователь сделать репост записи
}

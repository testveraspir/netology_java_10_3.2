package ru.netology.domain;

public class Donut {
    private boolean isDonut; //запись доступна только платным подписчикам
    private int paidDuration;//время, в течение которого запись доступна только платным подписчикам
    private boolean canPublishFreeCope; //можно ли открыть запись для всех пользователей
    private String editMode; //информация о том, какие значения VK Donut можно изменить в записи
}

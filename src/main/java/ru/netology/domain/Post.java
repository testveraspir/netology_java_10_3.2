package ru.netology.domain;


public class Post {
    private int postId; //идентификатор записи
    private int ownerId; //идентификатор владельца стены, на котором размещена запись
    private int fromId; //идентификатор автора записи
    private int createdId; //идентификатор администратора, который опубликовал запись
    private int dateCreatePost; //время публикации записи
    private String textBasis; //текст записи
    private int replyOwnerId; //идентификатор владельца записи, в ответ на которую была оставлена текущая
    private int replyPostId; //идентификатор записи, в ответ на которую была оставлена текущая
    private int friendsOnly; //если запсиь была создана с опцией
    private CommentsInfo commentsInfo; //информация о комментариях
    private Copyright copyright; //источник материала
    private Heart elementHeart; //информация о лайках к записи
    private ReportsInfo repostsInfo; //информация о репостах
    private Views views; //информация о просмотрах записи
    private Geo geo; //информация о местоположении
    private int signerId;//идентификатор автора, если запись была опубликована от имени сообщества и подписана пользователем
    private int canPin; //информация о том, может ли текущий пользователь закрепить запись
    private int canDelete;//информация  о том, может ли текущий пользователь удалить запись
    private int canEdit; //информация о том, может ли текущий пользователь редактировать запись
    private int isPinned; //информация о том, что запись закреплена
    private int markedAsAds; //информация о том, содержит ли запись отметку "реклама"
    private boolean isFavorite; //true, если объект добавлен в закладки у текущего пользователя
    private Donut donut; //информация о записи VK Donut
    private int postponedId; //идентификатор отложенной записи

}

package ru.netology.domain.attachment;

public class Market {
    private int id;
    private int ownerId;
    private String title;
    private String description;
    private Price price;
    private Category category;
    private String thumbPhoto;
    private int date;
    private int availability;
    private boolean isFavorite;
    private PhotosInfo photosInfo;
    private boolean canComment;
    private boolean canRepost;
    private Likes likes;
    private String url;
    private String buttonTitle;
}

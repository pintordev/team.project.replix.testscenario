package com.application.review.entity;

public class Review {
    private int id;
    private String regDate;
    private String comment;
    private double score;
    private boolean replyFlag;
    private int userId;
    private int contentId;

    public Review(int id, String regDate, String comment, double score, boolean replyFlag, int userId, int contentId) {
        this.id = id;
        this.regDate = regDate;
        this.comment = comment;
        this.score = score;
        this.replyFlag = replyFlag;
        this.userId = userId;
        this.contentId = contentId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public boolean isReplyFlag() {
        return replyFlag;
    }

    public void setReplyFlag(boolean replyFlag) {
        this.replyFlag = replyFlag;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getContentId() {
        return contentId;
    }

    public void setContentId(int contentId) {
        this.contentId = contentId;
    }
}

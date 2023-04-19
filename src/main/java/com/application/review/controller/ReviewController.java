package com.application.review.controller;

import com.application.Container;
import com.application.content.entity.Content;
import com.application.review.entity.Review;

import java.util.ArrayList;
import java.util.List;

public class ReviewController {
    private List<Review> reviewList;

    public ReviewController() {
        this.reviewList = new ArrayList<>();
    }
    public void post(Content content) {
        // review id 최신 값 받아와야 함
        System.out.printf("  %s에 대한 정보...\n\n", content.getName());

        System.out.println("  리뷰를 남기시겠습니까? (Y/N)");
        System.out.printf("  >> ");
        String answer = Container.getScanner().nextLine().trim().toLowerCase();

        if (answer.equals("n")) {
            return;
        }

        // 리뷰는 id, regDate, comment(입력), score(별점), replyFlag(입력), userId, contentId
        System.out.println("  내용을 입력해주세요.");
        System.out.printf("  >> ");
        String comment = Container.getScanner().nextLine().trim();

        System.out.println("  별점을 입력해주세요.");
        System.out.printf("  >> ");
        String score = Container.getScanner().nextLine().trim();

        System.out.printf("  입력하신 내용\n  >> %s\n", comment);
    }
    public void list() {

    }
}

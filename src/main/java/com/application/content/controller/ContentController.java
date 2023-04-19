package com.application.content.controller;

import com.application.Container;
import com.application.content.entity.Content;
import com.application.review.controller.ReviewController;
import com.application.user.entity.User;

import java.util.ArrayList;
import java.util.List;

public class ContentController {
    private List<Content> contentList;

    public ContentController() {
        this.contentList = new ArrayList<>();
//        Content(int id, String name, String releaseDate, String productionCompany, String director, String plot)
        this.contentList.add(new Content(1, "name1", "2023-04-17", "REPLIX", "김다은", "Lorem ipsum dolor sit amet consectetur adipisicing elit."));
        this.contentList.add(new Content(2, "name2", "2023-04-17", "REPLIX", "김호현", "Lorem ipsum dolor sit amet consectetur adipisicing elit."));
        this.contentList.add(new Content(3, "name3", "2023-04-17", "REPLIX", "서빈", "Lorem ipsum dolor sit amet consectetur adipisicing elit."));
        this.contentList.add(new Content(4, "name4", "2023-04-17", "REPLIX", "송주현", "Lorem ipsum dolor sit amet consectetur adipisicing elit."));
        this.contentList.add(new Content(5, "name5", "2023-04-17", "REPLIX", "황인성", "Lorem ipsum dolor sit amet consectetur adipisicing elit."));
    }

    public Content findById(int id) {
        for (Content content : this.contentList) {
            if (content.getId() == id) {
                return content;
            }
        }
        return null;
    }

    public void search() {
        ReviewController reviewController = new ReviewController();

        System.out.println("-".repeat(24));
        System.out.println("  검색어를 입력해주세요.");
        System.out.printf("  >> ");

        String keyword = Container.getScanner().nextLine().trim();

        System.out.println("-".repeat(24));
        System.out.printf("  입력한 검색어 %s에 대한 검색 결과...\n\n", keyword);
        System.out.println("  번호 / 이름 / 릴리즈 / 줄거리");
        System.out.println("-".repeat(52));

        for (Content content : this.contentList) {
            if (content.getName().contains(keyword)) {
                System.out.printf("  %d / %s / %s / %s\n", content.getId(), content.getName(), content.getReleaseDate(), content.getPlot().substring(0, 20) + "...");
            }
        }

        System.out.println("-".repeat(52));
        System.out.println("  리뷰를 확인할 컨텐츠 번호를 입력해주세요.");
        System.out.printf("  >> ");

        int keyId = Container.getScanner().nextInt();
        Container.getScanner().nextLine();

        reviewController.post(this.findById(keyId));



    }
}
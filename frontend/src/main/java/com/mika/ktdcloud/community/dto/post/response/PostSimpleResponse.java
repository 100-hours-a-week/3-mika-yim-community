package com.mika.ktdcloud.community.dto.post.response;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PostSimpleResponse {

    private final Long id;
    private final String title;
    private final String thumbnailUrl;
    private final String authorNickname;
    private final String authorProfileImageUrl;

    private final LocalDateTime createdAt;
    private final LocalDateTime updatedAt;

    private final Integer viewCount;
    private final Integer likeCount;
    private final Integer commentCount;

    @Builder
    public PostSimpleResponse(
            Long id,
            String title,
            String thumbnailUrl,
            String authorNickname,
            String authorProfileImageUrl,
            LocalDateTime createdAt,
            LocalDateTime updatedAt,
            Integer viewCount,
            Integer likeCount,
            Integer commentCount
    ) {
        this.id = id;
        this.title = title;
        this.thumbnailUrl = thumbnailUrl;
        this.authorNickname = authorNickname;
        this.authorProfileImageUrl = authorProfileImageUrl;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.viewCount = viewCount;
        this.likeCount = likeCount;
        this.commentCount = commentCount;
    }
}


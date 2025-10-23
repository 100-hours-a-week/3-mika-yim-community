package com.mika.ktdcloud.community.dto.comment.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Getter;

@Getter
public class CommentUpdateRequest {

    @NotBlank(message = "댓글을 입력해주세요.")
    private String content;

    @Builder
    public CommentUpdateRequest(String content) {
        this.content = content;
    }
}

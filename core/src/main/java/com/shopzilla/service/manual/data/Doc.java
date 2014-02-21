package com.shopzilla.service.manual.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Collection;

/**
 * Created by divakarbala on 2/20/14.
 */
public class Doc {

    private String pid;
    private String productTitle;
    private Collection<String> commentTitles;

    @JsonProperty("PID")
    public void setPID(String pid) {
        this.pid = pid;
    }

    @JsonProperty("ProductTitle")
    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    @JsonProperty("CommentTitle")
    public void setCommentTitles(Collection<String> commentTitles) {
        this.commentTitles = commentTitles;
    }


    public String getPID() {
        return this.pid;
    }

    public String getProductTitle() {
        return this.productTitle;
    }
}

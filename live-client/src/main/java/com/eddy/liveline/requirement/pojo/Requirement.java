package com.eddy.liveline.requirement.pojo;

import java.util.Date;

public class Requirement {
    private Integer id;

    private Integer accountId;

    private Date requirementNewstime;

    private Integer requirementStatus;

    private String requirementSummary;

    private String requirementThumbnail;

    private String requirementTitle;

    private Integer requirementComment;

    private Date requirementUpdatetime;

    private String requirementUrl;

    private Long requirementViews;

    private String requirementContent;

    private String requirementContentMd;


    public String getRequirementContent() {
        return requirementContent;
    }

    public void setRequirementContent(String requirementContent) {
        this.requirementContent = requirementContent;
    }

    public String getRequirementContentMd() {
        return requirementContentMd;
    }

    public void setRequirementContentMd(String requirementContentMd) {
        this.requirementContentMd = requirementContentMd;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Date getRequirementNewstime() {
        return requirementNewstime;
    }

    public void setRequirementNewstime(Date requirementNewstime) {
        this.requirementNewstime = requirementNewstime;
    }

    public Integer getRequirementStatus() {
        return requirementStatus;
    }

    public void setRequirementStatus(Integer requirementStatus) {
        this.requirementStatus = requirementStatus;
    }

    public String getRequirementSummary() {
        return requirementSummary;
    }

    public void setRequirementSummary(String requirementSummary) {
        this.requirementSummary = requirementSummary == null ? null : requirementSummary.trim();
    }

    public String getRequirementThumbnail() {
        return requirementThumbnail;
    }

    public void setRequirementThumbnail(String requirementThumbnail) {
        this.requirementThumbnail = requirementThumbnail == null ? null : requirementThumbnail.trim();
    }

    public String getRequirementTitle() {
        return requirementTitle;
    }

    public void setRequirementTitle(String requirementTitle) {
        this.requirementTitle = requirementTitle == null ? null : requirementTitle.trim();
    }

    public Integer getRequirementComment() {
        return requirementComment;
    }

    public void setRequirementComment(Integer requirementComment) {
        this.requirementComment = requirementComment;
    }

    public Date getRequirementUpdatetime() {
        return requirementUpdatetime;
    }

    public void setRequirementUpdatetime(Date requirementUpdatetime) {
        this.requirementUpdatetime = requirementUpdatetime;
    }

    public String getRequirementUrl() {
        return requirementUrl;
    }

    public void setRequirementUrl(String requirementUrl) {
        this.requirementUrl = requirementUrl == null ? null : requirementUrl.trim();
    }

    public Long getRequirementViews() {
        return requirementViews;
    }

    public void setRequirementViews(Long requirementViews) {
        this.requirementViews = requirementViews;
    }
}
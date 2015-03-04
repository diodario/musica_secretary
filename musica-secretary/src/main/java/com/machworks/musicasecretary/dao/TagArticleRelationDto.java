package com.machworks.musicasecretary.dao;

import com.worksap.company.access.cassandra.IndexUtil;
import com.worksap.company.dto.annotation.Key;

public class TagArticleRelationDto {
	public int articleId;
	public int tagId;
	@Key
	public String key;

	public TagArticleRelationDto(int articleId, int tagId) {
		this.articleId = articleId;
		this.tagId = tagId;
		setKey();
	}


	public int getArticleId() {
		return articleId;
	}


	public int getTagId() {
		return tagId;
	}


	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}


	public void setTagId(int tagId) {
		this.tagId = tagId;
	}
	
	void setKey(){
		this.key = this.tagId + IndexUtil.IDX_SPR + this.articleId;
	}
}

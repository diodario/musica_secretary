package com.machworks.musicasecretary.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.machworks.musicasecretary.dao.singersearch.SingerDao;

@Qualifier
class DaoFactoryJdbcImpl implements DaoFactory {

	
	private ArticleDao articleDao;
	private TagDao tagDao;
	
	@Autowired
	public DaoFactoryJdbcImpl(ArticleDao articleDao,TagDao tagDao) {
		this.articleDao=articleDao;
		this.tagDao =tagDao;
	}

	
	@Override
	public ArticleDao getArticleDAO() {
		return articleDao;
	}


	@Override
	public TagDao getTagDAO() {
		return tagDao;
	}


	@Override
	public SingerDao getSingerDao() {
		// TODO Auto-generated method stub
		return null;
	}
}

package org.news.dao;

import java.util.List;

import org.news.entity.News;

public interface NewsDao{
	//获取所有新闻
	public List<News> getAllnews();	
	//获取某主题下的所有新闻
	public List<News> getAllnewsByTID(int Tid);	
	//获取单个新闻
	public News getAllnewsByNID(int nid);	
	//获取某主题下的新闻数量
	public int getNewsCountByTID(int Tid);	
	public int updateNews(News s);
	//分页
	public List<News> getAllnews(Object []lim);
	
	
	public int getAllnewsg();
	
}
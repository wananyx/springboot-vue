package com.yx.adx.service;

import com.alibaba.fastjson.JSONObject;

/**
 * @author: jst
 * @date: 2017/10/24 16:06
 */
public interface ArticleService {
	/**
	 * 新增文章
	 */
	JSONObject addArticle(JSONObject jsonObject);

	/**
	 * 文章列表
	 */
	JSONObject listArticle(JSONObject jsonObject);

	/**
	 * 更新文章
	 */
	JSONObject updateArticle(JSONObject jsonObject);
}

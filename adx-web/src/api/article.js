/**
 * article模块接口列表
 */

// import base from './base'; // 导入接口域名列表
import axios from '@/utils/api'; // 导入http中创建的axios实例
import qs from 'qs'; // 根据需求是否导入qs模块,这是使用post请求时传参调用

const article = {

  // eg => base的使用方式
  // articleList () {
  //   return axios.get(`${base.sq}/topics`);
  // },

  // eg => post提交,参数的提交形式
  // login (params) {
  //   return axios.post(`${base.sq}/accesstoken`, qs.stringify(params));
  // }

  // 新闻列表
  articleList (params) {
    return axios.get('/article/listArticle',{
      params: params
    });
  }
}

export default article;

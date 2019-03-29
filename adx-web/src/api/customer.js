/**
 * adv-manage模块接口列表
 */

// import base from './base'; // 导入接口域名列表
import axios from '@/utils/api'; // 导入http中创建的axios实例
import qs from 'qs'; // 根据需求是否导入qs模块,这是使用post请求时传参调用

const customer = {

  /**
   * 获取客户列表
   * @param params
   * @returns {*}
   */
  getList (params) {
    return axios.get('/adv/getList',{
      params: params
    });
  },
  /**
   * 新增客户信息
   * @param params
   * @returns {*}
   */
  save (params) {
    return axios.post('/adv/save', qs.stringify(params))
  },
  /**
   * 更新客户信息
   * @param params
   * @returns {*}
   */
  update (params) {
    return axios.post('/adv/update', qs.stringify(params))
  },
  /**
   * 删除客户信息
   * @param params
   * @returns {*}
   */
  remove (params) {
    return axios.delete('/adv/remove', {
      params:{id:params}
    })
  },
}

export default customer;

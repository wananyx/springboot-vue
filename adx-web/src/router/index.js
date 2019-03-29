import Vue from 'vue'
import Router from 'vue-router'
// in development env not use Lazy Loading,because Lazy Loading too many pages will cause webpack hot update too slow.so only in production use Lazy Loading
/* layout */
import Layout from '../views/layout/Layout'

const _import = require('./_import_' + process.env.NODE_ENV)
Vue.use(Router)
export const constantRouterMap = [
  {path: '/login', component: _import('login/index'), hidden: true},
  {path: '/404', component: _import('404'), hidden: true},
  {
    path: '/',
    component: Layout,
    redirect: '/dashboard',
    name: '首页',
    hidden: true,
    children: [{
      path: 'dashboard', component: _import('dashboard/index')
    }]
  }
]
export default new Router({
  // mode: 'history', //后端支持可开
  scrollBehavior: () => ({y: 0}),
  routes: constantRouterMap
})
export const asyncRouterMap = [
  {
    path: '/system',
    component: Layout,
    redirect: '/system/article',
    name: '功能模块',
    meta: {title: '功能模块', icon: 'tree'},
    children: [
      {
        path: 'article',
        name: '文章',
        component: _import('article/article'),
        meta: {title: '文章', icon: 'example'},
        menu: 'article'
      },
    ]
  },

  {
    path: '/flow',
    component: Layout,
    redirect: '/flow-manage/',
    name: '流量管理',
    meta: {title: '流量管理', icon: 'table'},
    children: [
      {
        path: 'adv',
        name: '广告位管理',
        component: _import('flow-manage/advertisement'),
        meta: {title: '广告位管理', icon: 'user'},
        menu: 'advertisement'
      },
      {
        path: 'media',
        name: '媒体管理',
        component: _import('flow-manage/media'),
        meta: {title: '媒体管理', icon: 'password'},
        menu: 'media'
      },
      {
        path: 'ditch',
        name: '渠道管理',
        component: _import('flow-manage/ditch'),
        meta: {title: '渠道管理', icon: 'password'},
        menu: 'ditch'
      }
    ]
  },
  {
    path: '/adv',
    component: Layout,
    redirect: '/adv-manage/',
    name: '广告管理',
    meta: {title: '广告管理', icon: 'table'},
    children: [
      {
        path: 'adv',
        name: '广告管理1',
        component: _import('adv-manage/adv/adv'),
        meta: {title: '广告管理', navShow: true, icon: 'user'},
        menu: 'adv'
      },
      {
        path: 'material',
        name: '素材管理',
        component: _import('adv-manage/material/material'),
        meta: {title: '素材管理', icon: 'password'},
        menu: 'material'
      },
      {
        path: 'customer',
        name: '客户管理',
        component: _import('adv-manage/customer/customer'),
        meta: {title: '客户管理', icon: 'password'},
        menu: 'customer'
      }]
  },
  {
    path: '/report',
    component: Layout,
    redirect: '/report-center/',
    name: '报表中心',
    meta: {title: '报表中心', icon: 'table'},
    children: [
      {
        path: '1',
        name: '流量时段报表',
        component: _import('report-center/flow-period-report'),
        meta: {title: '流量时段报表', icon: ''},
        menu: 'report'
      },
      {
        path: '2',
        name: '广告位流量明细',
        component: _import('report-center/adv-space-flow'),
        meta: {title: '广告位流量明细', icon: ''},
        menu: 'report'
      },
      {
        path: '3',
        name: '流量填充报表',
        component: _import('report-center/flow-filled-report'),
        meta: {title: '流量填充报表', icon: ''},
        menu: 'report'
      },
      {
        path: '4',
        name: '渠道报表',
        component: _import('report-center/channel-report'),
        meta: {title: '渠道报表', icon: ''},
        menu: 'report'
      },
      {
        path: '5',
        name: '广告时段报表',
        component: _import('report-center/adv-period-report'),
        meta: {title: '广告时段报表', icon: ''},
        menu: 'report'
      },
      {
        path: '6',
        name: '广告投放报表',
        component: _import('report-center/adv-put-report'),
        meta: {title: '广告投放报表', icon: ''},
        menu: 'report'
      },
      {
        path: '7',
        name: '广告流量明细',
        component: _import('report-center/adv-flow-details'),
        meta: {title: '广告流量明细', icon: ''},
        menu: 'report'
      },
      {
        path: '8',
        name: 'RTB平台统计报表',
        component: _import('report-center/RTB-platform-report'),
        meta: {title: 'RTB平台统计报表', icon: ''},
        menu: 'report'
      },
      {
        path: '9',
        name: '对比报表',
        component: _import('report-center/comparison-report'),
        meta: {title: '对比报表', icon: ''},
        menu: 'report'
      },
      {
        path: '10',
        name: 'APK报表',
        component: _import('report-center/APK-report'),
        meta: {title: 'APK报表', icon: ''},
        menu: 'report'
      },
      {
        path: '11',
        name: '媒体域名报表',
        component: _import('report-center/media-domain-report'),
        meta: {title: '媒体域名报表', icon: ''},
        menu: 'report'
      },
      {
        path: '12',
        name: '地域报表',
        component: _import('report-center/regional-report'),
        meta: {title: '地域报表', icon: ''},
        menu: 'report'
      }
    ]
  },
  {
    path: '/user',
    component: Layout,
    redirect: '/user/',
    name: '',
    meta: {title: '用户权限', icon: 'table'},
    children: [
      {
        path: '', name: '用户列表', component: _import('user/user'), meta: {title: '用户列表', icon: 'user'}, menu: 'user'
      },
      {
        path: 'role',
        name: '权限管理',
        component: _import('user/role'),
        meta: {title: '权限管理', icon: 'password'},
        menu: 'role'
      },
    ]
  },
  {path: '*', redirect: '/404', hidden: true}
]

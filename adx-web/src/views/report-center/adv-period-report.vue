<template>
    <div>
      <div id="chart"></div>

      <el-container>
        <el-header height="300px" id="advTop"></el-header>
        <el-header height="300px" id="advTop1"></el-header>
        <el-main  id="advCentre"></el-main>
        <el-main  id="advCentre1"></el-main>
        <el-footer id="advFoot" class="block"></el-footer>


      </el-container>

    </div>
</template>

<script>
  // 引入基本模板
  let echarts = require('echarts/lib/echarts')
  // 引入柱状图组件
  require('echarts/lib/chart/line')
  // 引入提示框和title组件
  require('echarts/lib/component/tooltip')
  require('echarts/lib/component/title')

    export default {
      data() {
        return {
          msg: 'Welcome to Your Vue.js App'
        }
      },
      mounted() {
        this.drawLine();
      },
      methods: {
        drawLine() {
          // 基于准备好的dom，初始化echarts实例
          var myChart = echarts.init(document.getElementById('advTop1'));
          // 绘制图表
          var option = {
            title: {
              text: '堆叠区域图'
            },
            tooltip : {
              trigger: 'axis',
              axisPointer: {
                type: 'cross',
                label: {
                  backgroundColor: '#6a7985'
                }
              }
            },
            legend: {
              label:{
                normal:{
                  formatDate:'',
                  show:true,
                }
              },
              data:['邮件营销','联盟广告','视频广告','直接访问','搜索引擎']
            },
            toolbox: {
              feature: {
                saveAsImage: {}
              }
            },
            grid: {
              left: '3%',
              right: '4%',
              bottom: '3%',
              containLabel: true
            },
            xAxis : [
              {
                type : 'category',
                boundaryGap : false,
                data : ['周一','周二','周三','周四','周五','周六','周日']
              }
            ],
            yAxis : [
              {
                type : 'value'
              }
            ],
            series : [
              {
                name:'邮件营销',
                type:'line',
                stack: '总量',
                areaStyle: {},
                data:[120, 132, 101, 134, 90, 230, 210]
              },
              {
                name:'联盟广告',
                type:'line',
                stack: '总量',
                areaStyle: {},
                data:[220, 182, 191, 234, 290, 330, 310]
              },
              {
                name:'视频广告',
                type:'line',
                stack: '总量',
                areaStyle: {},
                data:[150, 232, 201, 154, 190, 330, 410]
              },
              {
                name:'直接访问',
                type:'line',
                stack: '总量',
                areaStyle: {normal: {}},
                data:[320, 332, 301, 334, 390, 330, 320]
              },
              {
                name:'搜索引擎',
                type:'line',
                stack: '总量',
                label: {
                  normal: {
                    show: true,
                    position: 'top'
                  }
                },
                areaStyle: {normal: {}},
                data:[820, 932, 901, 934, 1290, 1330, 1320]
              }
            ]
          };

          myChart.setOption(option);
          // $(window).resize(function() {
          window.onresize = function(){
            myChart.resize()
          }
        }
      }
    }
</script>

<style scoped>
  #advTop {
    height: 1000px;
  }
</style>

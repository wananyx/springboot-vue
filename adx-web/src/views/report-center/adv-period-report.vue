<template>
  <div>

    <el-container>
      <el-header height="80px" id="advTop1">
        <el-row :gutter="20">

          <el-col :span="6">
            <div class="block">
              <!--<p>组件值：{{ value13 }}</p>-->
              <el-date-picker style="width: 250px"
                              size="small"
                              v-model="value13"
                              type="daterange"
                              start-placeholder="开始日期"
                              end-placeholder="结束日期"
                              :default-time="['00:00:00', '23:59:59']">
              </el-date-picker>
            </div>
          </el-col>

          <el-col :span="4">
            <div class="grid-content bg-purple">
              <el-select class="select1" size="small" v-model="value1" clearable placeholder="全部平台类型">
                <el-option
                  v-for="item in options"
                  :key="item.value"
                  :label="item.label"
                  :value="item.value">
                </el-option>
              </el-select>
            </div>
          </el-col>

          <el-col :span="4">
            <div class="grid-content bg-purple">
              <el-row>
                <el-button class="searchBtn" size="small" type="primary">搜索</el-button>
              </el-row>
            </div>
          </el-col>


          <el-col :span="7" class="searchBtn">
            <div class="grid-content bg-purple">
              <el-row>
                <el-button size="small" type="primary">导出</el-button>
              </el-row>
            </div>
          </el-col>

        </el-row>
      </el-header>

      <el-header id="advTop2" height="20px">
        <el-row class="categoryBtn">
          <el-button style="padding: 5px" size="mini" type="danger" plain>下发数</el-button>
          <el-button style="padding: 5px" size="mini" type="danger" plain>展示数</el-button>
          <el-button style="padding: 5px" size="mini" type="danger" plain>展示率</el-button>
          <el-button style="padding: 5px" size="mini" type="danger" plain>点击数</el-button>
          <el-button style="padding: 5px" size="mini" type="danger" plain>点击率</el-button>
          <el-button style="padding: 5px" size="mini" type="danger" plain>UV</el-button>
          <el-button style="padding: 5px" size="mini" type="danger" plain>IP</el-button>
          <el-button style="padding: 5px" size="mini" type="danger" plain>收入</el-button>
          <el-button style="padding: 5px" size="mini" type="danger" plain>收入eCPM</el-button>
          <el-button style="padding: 5px" size="mini" type="danger" plain>收入eCPC</el-button>
          <el-button style="padding: 5px" size="mini" type="danger" plain>支出</el-button>
          <el-button style="padding: 5px" size="mini" type="danger" plain>支出eCPM</el-button>
          <el-button style="padding: 5px" size="mini" type="danger" plain>支出eCPC</el-button>
          <el-button style="padding: 5px" size="mini" type="danger" plain>利润</el-button>
          <el-button style="padding: 5px" size="mini" type="danger" plain>利润率</el-button>
        </el-row>
      </el-header>
      <el-header style="width: 1100px;padding: 0px" height="300px" id="advTop3"></el-header>
      <el-main id="advCentre">
        <el-table
          :data="tableData6"
          border="false"
          size="medium"
          fit="true"
          stripe="true"
          show-summary
          style="width: 100%">
          <el-table-column
            prop="id"
            label="日期"
            sortable
            width="180">
          </el-table-column>
          <el-table-column
            prop="name"
            sortable
            label="下发">
          </el-table-column>
          <el-table-column
            prop="amount1"
            sortable
            label="展示">
          </el-table-column>
          <el-table-column
            prop="amount2"
            sortable
            label="展示率"
            width="110%">
          </el-table-column>
          <el-table-column
            prop="amount3"
            sortable
            label="点击">
          </el-table-column>
          <el-table-column
            prop="amount3"
            sortable
            label="点击率"
            width="110%">
          </el-table-column>
          <el-table-column
            prop="amount3"
            sortable
            label="UV">
          </el-table-column>
          <el-table-column
            prop="amount3"
            sortable
            label="IP">
          </el-table-column>
          <el-table-column
            prop="amount3"
            sortable
            label="收入">
          </el-table-column>
          <el-table-column
            prop="amount3"
            sortable
            label="收入eCPM"
            width="120%">
          </el-table-column>
          <el-table-column
            prop="amount3"
            sortable
            label="收入eCPC"
            width="120%">
          </el-table-column>
          <el-table-column
            prop="amount3"
            sortable
            label="支出eCPM"
            width="120%">
          </el-table-column>
          <el-table-column
            prop="amount3"
            sortable
            label="支出eCPC"
            width="120%">
          </el-table-column>
          <el-table-column
            prop="amount3"
            sortable
            label="利润">
          </el-table-column>


          <el-table-column
            prop="amount3"
            sortable
            label="利润率"
            width="120%">
          </el-table-column>


        </el-table>
      </el-main>
      <el-footer id="advFoot" class="block">

      </el-footer>


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
        options: [{
          value: '选项1',
          label: '黄金糕'
        }, {
          value: '选项2',
          label: '双皮奶'
        }, {
          value: '选项3',
          label: '蚵仔煎'
        }, {
          value: '选项4',
          label: '龙须面'
        }, {
          value: '选项5',
          label: '北京烤鸭'
        }],
        value1: '',
        value13: '',
        msg: 'Welcome to Your Vue.js App',
        tableData6: [{
          id: '12987122',
          name: '11',
          amount1: '234',
          amount2: '3.2',
          amount3: 10
        }, {
          id: '12987123',
          name: '11',
          amount1: '165',
          amount2: '4.43',
          amount3: 12
        }, {
          id: '12987124',
          name: '11',
          amount1: '324',
          amount2: '1.9',
          amount3: 9
        }, {
          id: '12987125',
          name: '11',
          amount1: '621',
          amount2: '2.2',
          amount3: 17
        }, {
          id: '12987126',
          name: '11',
          amount1: '539',
          amount2: '4.1',
          amount3: 15
        }]
      }
    },
    mounted() {
      this.drawLine();
    },
    methods: {
      drawLine() {
        // 基于准备好的dom，初始化echarts实例
        let myChart = echarts.init(document.getElementById('advTop3'));
        // 绘制图表
        let option = {
          // title: {
          //   text: '堆叠区域图'
          // },
          tooltip: {
            trigger: 'axis',
            axisPointer: {
              type: 'cross',
              label: {
                backgroundColor: '#6a7985'
              }
            }
          },
          legend: {
            data: ['邮件营销', '联盟广告', '视频广告', '直接访问', '搜索引擎']
          },
          toolbox: {
            feature: {
              saveAsImage: {}
            }
          },
          grid: {
            top: 15,
            left: '3%',
            right: '4%',
            bottom: '3%',
            containLabel: true
          },
          xAxis: [
            {
              type: 'category',
              boundaryGap: false,
              data: ['周一', '周二', '周三', '周四', '周五', '周六', '周日']
            }
          ],
          yAxis: [
            {
              type: 'value'
            }
          ],
          series: [
            // {
            //   name:'邮件营销',
            //   type:'line',
            //   stack: '总量',
            //   areaStyle: {},
            //   data:[120, 132, 101, 134, 90, 230, 210]
            // }
            // ,
            // {
            //   name:'联盟广告',
            //   type:'line',
            //   stack: '总量',
            //   areaStyle: {},
            //   data:[220, 182, 191, 234, 290, 330, 310]
            // },
            {
              name: '视频广告',
              type: 'line',
              stack: '总量',
              areaStyle: {},
              data: [150, 232, 201, 154, 190, 330, 1600]
            }
            // ,
            // {
            //   name:'直接访问',
            //   type:'line',
            //   stack: '总量',
            //   areaStyle: {normal: {}},
            //   data:[320, 332, 301, 334, 390, 330, 320]
            // },
            // {
            //   name:'搜索引擎',
            //   type:'line',
            //   stack: '总量',
            //   label: {
            //     normal: {
            //       show: true,
            //       position: 'top'
            //     }
            //   },
            //   areaStyle: {normal: {}},
            //   data:[820, 932, 901, 934, 1290, 1330, 1320]
            // }
          ]
        };

        myChart.setOption(option);
        window.onresize = function () {
          myChart.resize()
        }
      }
    }
  }
</script>

<style scoped>
  #advTop1 {
    margin-top: 50px;
    margin-left: 20px;
  }

  #advTop2 {
    margin-left: 20px;
  }

  #advTop3 {
    margin-top: 10px;
  }
</style>

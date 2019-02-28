<template>
  <div>
    <el-container>
      <el-header id="advTop">

        <el-row :gutter="20">

          <el-col :span="4">
            <div class="grid-content bg-purple">
              <el-select class="select1" size="small" v-model="value1" clearable placeholder="全部渠道">
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
              <el-select class="select2" v-model="value2" size="small" clearable placeholder="全部媒体">
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
              <el-select class="select3" v-model="value3" size="small" clearable placeholder="全部类型">
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
              <el-select class="select4" v-model="value4" size="small" clearable placeholder="全部审核状态">
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
              <el-input class="input" size="small" v-model="input" placeholder="请输入搜索关键字"></el-input>
            </div>
          </el-col>

          <el-col :span="4">
            <div class="grid-content bg-purple">
              <el-row>
                <el-button class="searchBtn" size="small" type="primary">搜索</el-button>
              </el-row>
            </div>
          </el-col>

        </el-row>

      </el-header>

      <el-main id="advCentre">
        <el-table
          :data="tableData"
          style="width: 100%"
          :default-sort="{prop: 'date', order: 'ascending'}"
        >
          <el-table-column
            prop="id"
            label="编号"
            sortable
            width="100">
          </el-table-column>
          <el-table-column
            prop="name"
            label="广告位"
            sortable
            width="180">
          </el-table-column>
          <el-table-column
            prop="type"
            label="类型"
          >
          </el-table-column>
          <el-table-column
            prop="status"
            label="状态"
          >
          </el-table-column>
          <el-table-column
            prop="auditing"
            label="审核状态"
          >
          </el-table-column>
          <el-table-column
            prop="date"
            label="创建时间"
            sortable
            width="180">
          </el-table-column>
          <el-table-column
            prop="operation"
            label="操作"
            align="center"
          >
          </el-table-column>
        </el-table>
      </el-main>

      <el-footer id="advFoot" class="block">
        <!--<span class="demonstration">完整功能</span>-->
        <el-pagination
          @size-change="handleSizeChange"
          @current-change="handleCurrentChange"
          :current-page="1"
          :page-sizes="[10, 20, 30, 40]"
          :page-size="10"
          layout="total, sizes, prev, pager, next, jumper"
          :total="400">
        </el-pagination>
      </el-footer>
    </el-container>
  </div>
</template>

<script>
  export default {
    name: "advertisement",


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
        value2: '',
        value3: '',
        value4: '',
        input: '',
        tableData: [{
          id: 1,
          name: '华育机房',
          type: 'wap横幅',
          status: '开启',
          auditing: '已审核',
          date: '2016-05-01',
          operation: '编辑 预览 统计',
        },
          {
            id: 2,
            name: '太原机房',
            type: 'wap横幅',
            status: '开启',
            auditing: '已审核',
            date: '2016-05-02',
            operation: '编辑 预览 统计',
          },
          {
            id: 3,
            name: '太原机房',
            type: 'wap横幅',
            status: '开启',
            auditing: '已审核',
            date: '2016-05-03',
            operation: '编辑 预览 统计',
          },
          {
            id: 4,
            name: '太原机房',
            type: 'wap横幅',
            status: '开启',
            auditing: '已审核',
            date: '2016-05-04',
            operation: '编辑 预览 统计',
          },
          {
            id: 5,
            name: '太原机房',
            type: 'wap横幅',
            status: '开启',
            auditing: '已审核',
            date: '2016-05-05',
            operation: '编辑 预览 统计',
          },
          {
            id: 6,
            name: '太原机房',
            type: 'wap横幅',
            status: '开启',
            auditing: '已审核',
            date: '2016-05-06',
            operation: '编辑 预览 统计',
          },
          {
            id: 7,
            name: '太原机房',
            type: 'wap横幅',
            status: '开启',
            auditing: '已审核',
            date: '2016-05-07',
            operation: '编辑 预览 统计',
          }]
      }
    },
    methods: {
      formatter(row, column) {
        return row.address;
      },
      handleSizeChange(val) {
        console.log(`每页 ${val} 条`);
      },
      handleCurrentChange(val) {
        console.log(`当前页: ${val}`);
      }
    }
  }
</script>

<style scoped>
  .el-row {
    margin-bottom: 20px;
    /*&:last-child {*/
    /*margin-bottom: 0;*/
    /*}*/
  }

  .el-col {
    border-radius: 1px;
  }

  .grid-content {
    border-radius: 4px;
    min-height: 20px;
  }

  .row-bg {
    padding: 5px;
  }

  #advTop {
    top: 50px;
    left: 20px;
    position: relative;

  }

  .select1, .select2, .select3, .select4, .input {
    width: 180px;
  }

  .select2, .select3, .select4, .input, .searchBtn {
    margin-left: 0px;
  }

  #advCentre {
    margin-top: 30px;
    padding-left: 40px;
  }

  #advFoot {
    text-align: right;
    padding-top: 20px;
    margin-right: 30px;
  }
</style>

<template>
  <div>
    <el-container>
      <el-header id="advTop">

        <el-row :gutter="20">

          <el-col :span="4">
            <div class="grid-content bg-purple">
              <el-select class="select1" filterable size="small" v-model="value1" clearable placeholder="全部类型">
                <el-option
                  v-for="item in options1"
                  :key="item.value"
                  :label="item.label"
                  :value="item.value">
                </el-option>
              </el-select>
            </div>
          </el-col>

          <el-col :span="4">
            <div class="grid-content bg-purple">
              <el-select class="select2" filterable v-model="value2" size="small" clearable placeholder="全部尺寸">
                <el-option
                  v-for="item in options2"
                  :key="item.value"
                  :label="item.label"
                  :value="item.value">
                </el-option>
              </el-select>
            </div>
          </el-col>


          <el-col :span="4">
            <div class="grid-content bg-purple">
              <el-input class="input" size="small" v-model="input" placeholder="请输入素材名称或编号"></el-input>
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
                <el-button  size="small" type="primary">添加</el-button>
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
            label="素材名称"
            sortable
            width="180">
          </el-table-column>
          <el-table-column
            prop="type"
            label="素材类型"
          >
          </el-table-column>
          <el-table-column
            prop="size"
            label="素材尺寸"
          >
          </el-table-column>
          <el-table-column
            prop="source"
            label="广告来源"
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
          :page-sizes="[2, 3, 4, 5]"
          :page-size="10"
          layout="total, sizes, prev, pager, next, jumper"
          :total="tableData.length">
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
        options1: [{
          value: '选项1',
          label: '横幅'
        }, {
          value: '选项2',
          label: '信息流'
        }, {
          value: '选项3',
          label: '视频'
        }],
        options2: [{
          value: '选项1',
          label: '640*120'
        }, {
          value: '选项2',
          label: '120*40'
        }, {
          value: '选项3',
          label: '40*10'
        }],
        value1: '',
        value2: '',
        value3: '',
        value4: '',
        input: '',
        tableData: [{
          id: 1,
          name: '华育机房',
          type: '横幅',
          size: '100*200',
          source: '平台',
          date: '2016-05-01',
          operation: '编辑 预览 统计',
        },
          {
            id: 2,
            name: '太原机房',
            type: '横幅',
            size: '100*200',
            source: '平台',
            date: '2016-05-02',
            operation: '编辑 预览 统计',
          },
          {
            id: 3,
            name: '太原机房',
            type: '横幅',
            size: '100*200',
            source: '平台',
            date: '2016-05-03',
            operation: '编辑 预览 统计',
          },
          {
            id: 4,
            name: '太原机房',
            type: '横幅',
            size: '100*200',
            source: '平台',
            date: '2016-05-04',
            operation: '编辑 预览 统计',
          },
          {
            id: 5,
            name: '太原机房',
            type: '横幅',
            size: '100*200',
            source: '平台',
            date: '2016-05-05',
            operation: '编辑 预览 统计',
          },
          {
            id: 6,
            name: '太原机房',
            type: '横幅',
            size: '100*200',
            source: '平台',
            date: '2016-05-06',
            operation: '编辑 预览 统计',
          },
          {
            id: 7,
            name: '太原机房',
            type: '横幅',
            size: '100*200',
            source: '平台',
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

  .searchBtn {
    text-align: right;
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

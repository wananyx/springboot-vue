<template>
  <div>
    <customer_edit v-show="showEdit" :s-how="showEdit" v-on:showPage="showEditPage"></customer_edit>
    <el-container v-show="!showEdit">
      <el-header id="advTop">

        <el-row :gutter="20">

          <el-col :span="4">
            <div class="grid-content bg-purple">
              <el-select class="select1" filterable size="small" v-model="value1" clearable placeholder="请选择查询方式">
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
              <el-input class="input" size="small" v-model="input" placeholder="请输入查询内容"></el-input>
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
                <el-button size="small" type="primary" @click="showEditPage">添加</el-button>
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
            prop="cusName"
            label="广告主名称"
            sortable
            width="180">
          </el-table-column>
          <el-table-column
            prop="linkman"
            label="联系人"
          >
          </el-table-column>
          <el-table-column
            prop="email"
            label="邮箱"
          >
          </el-table-column>
          <el-table-column
            prop="openBack"
            label="开通后台"
          >
          </el-table-column>
          <el-table-column
            prop="createDate"
            label="创建时间"
            sortable
            width="180">
          </el-table-column>
          <el-table-column
            prop="operation"
            label="操作"
            align="center"
          >
            <template slot-scope="scope">
              <el-button type="text" @click="checkDetail()">编辑</el-button>
            </template>
          </el-table-column>
        </el-table>
      </el-main>

      <el-footer id="advFoot" class="block">
        <el-pagination
          @size-change="handleSizeChange"
          @current-change="handleCurrentChange"
          :current-page="listQuery.pageNum"
          :page-sizes="[2, 3, 20, 30]"
          :page-size="listQuery.pageRow"
          layout="total, sizes, prev, pager, next, jumper"
          :total=tableData.length>
        </el-pagination>
      </el-footer>
    </el-container>
  </div>
</template>

<script>
  import axios from 'axios'
  import customer_edit from './customer_edit'
  export default {
    name: "customer",
    components: {customer_edit},
    data() {
      return {
        listQuery: {
          pageNum: 1,//页码
          pageRow: 2,//每页条数
        },
        showEdit : false,
        options: [{
          value: '选项1',
          label: '广告主名称'
        }, {
          value: '选项2',
          label: '联系人'
        }, {
          value: '选项3',
          label: '邮箱'
        }],
        value1: '',
        input: '',
        tableData: []
      }
    },
    methods: {
      formatter(row, column) {
        return row.address;
      },
      handleSizeChange(val) {
        console.log(`每页 ${val} 条`);
        //改变每页数量
        this.listQuery.pageRow = val
        this.handleFilter();
      },
      handleCurrentChange(val) {
        console.log(`当前页: ${val}`);
        //改变页码
        this.listQuery.pageNum = val
        this.getList();
      },
      handleFilter() {
        //查询事件
        this.listQuery.pageNum = 1
        this.getList()
      },
      showEditPage (){
        this.showEdit = !this.showEdit
      },
      checkDetail(){
        console.log("编辑客户资料")
      },
      //获取客户列表
      getList () {
        // axios.get('/api/adv/getList')
        //   .then(res => {
        //   this.tableData = res.data.data
        // })
        this.apii.customer.getList(this.listQuery)
          .then(res => {
            this.tableData = res.data
            console.log(this.tableData.length)
          })
          .catch(function (e) {
            console.log('catch',e)
          })

      },
    },
    mounted () {
      this.getList()
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

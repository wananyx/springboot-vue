<template>
  <div>
    <customer_edit v-show="showEdit" @showPage="showEditPage" @save="save" :editRow="editRow"></customer_edit>
    <el-container v-show="!showEdit">
      <el-header id="advTop">

        <el-row :gutter="20">

          <el-col :span="4">
            <div class="grid-content bg-purple">
              <el-select class="select1" filterable size="small" v-model="listQuery.selectBy" clearable placeholder="请选择查询方式">
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
              <el-input class="input" size="small" v-model="listQuery.name" placeholder="请输入查询内容"></el-input>
            </div>
          </el-col>

          <el-col :span="4">
            <div class="grid-content bg-purple">
              <el-row>
                <el-button class="searchBtn" size="small" type="primary" @click="handleFilter">搜索</el-button>
              </el-row>
            </div>
          </el-col>

          <el-col :span="7" class="searchBtn">
            <div class="grid-content bg-purple">
              <el-row>
                <el-button size="small" type="primary" @click="showEditPage('add')">添加</el-button>
              </el-row>
            </div>
          </el-col>

        </el-row>

      </el-header>

      <el-main id="advCentre">
        <el-table
          :data="table.tableData"
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
              <el-button type="text" @click="showEditPage(scope.row)">编辑</el-button>
              <el-button type="text" @click="remove(scope.row.id)">删除</el-button>
            </template>
          </el-table-column>
        </el-table>
      </el-main>

      <el-footer id="advFoot" class="block">
        <el-pagination
          @size-change="handleSizeChange"
          @current-change="handleCurrentChange"
          :current-page="listQuery.pageNum"
          :page-sizes="[5, 10, 20, 30]"
          :page-size="listQuery.pageRow"
          layout="total, sizes, prev, pager, next, jumper"
          :total=table.total>
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
        //查询数据参数
        listQuery: {
          pageNum: 1,//页码
          pageRow: 5,//每页条数
          selectBy: '',
          name:''
        },
        //是否展示新增编辑页面
        showEdit : false,
        //下拉框内容
        options: [{
          value: '1',
          label: '广告主名称'
        }, {
          value: '2',
          label: '联系人'
        }, {
          value: '3',
          label: '邮箱'
        }],
        //表格数据
        table:{
          //返回的分页数据
          tableData: [],
          //返回数据的总条数
          total: 0
        },
        editRow:{}
      }
    },
    methods: {
      formatter(row, column) {
        return row.address;
      },
      handleSizeChange(val) {
        // console.log(`每页 ${val} 条`);
        //改变每页数量
        this.listQuery.pageRow = val
        this.handleFilter();
      },
      handleCurrentChange(val) {
        // console.log(`当前页: ${val}`);
        //改变页码
        this.listQuery.pageNum = val
        this.getList();
      },
      handleFilter() {
        //查询事件
        this.listQuery.pageNum = 1
        this.getList()
      },
      showEditPage (row){
        // console.log(rows)
        //传值为add，证明时新增页面，将表单数据清除并跳转页面
        if(row=='add'){
          //清除表单页面，留下单选框默认的false
          this.editRow={openBack: '否'}
          //用true false控制页面展现
          this.showEdit = !this.showEdit
        }else {
          //这是编辑操作
          this.showEdit = !this.showEdit
          //如果有参数，并且不是true，将该行数据传递给编辑页面
          if(row!=undefined){
            this.editRow = row
          }
        }

      },
      //获取客户列表
      getList () {
        this.apii.customer.getList(this.listQuery)
          .then(res => {
            let rows = res.data.rows
            rows.forEach(function (row) {
              if(row.openBack=='false'){
                row.openBack='否'
              }else if(row.openBack=='true'){
                row.openBack='是'
              }
            })
            this.table.tableData = res.data.rows
            this.table.total = res.data.total
          })
          .catch(function (e) {
            console.log('catch',e)
          })

      },
      //保存用户信息成功或失败
      save (str) {
        if(str=='succ'){
          this.open2('保存成功')
          this.handleFilter()
        }else{
          this.open4('保存失败')
          this.handleFilter()
        }
      },
      //弹框提示
      open2(msg) {
        this.$message({
          message: msg,
          type: 'success',
          center:true
        });
      },
      open4(msg) {
        this.$message.error(msg);
      },
      //删除当前行信息
      remove (id) {
        this.$confirm('此操作将永久删除该信息, 是否继续?', '提示', {
          confirmButtonText: '确定',
          cancelButtonText: '取消',
          type: 'warning'
        }).then(() => {
          this.apii.customer.remove(id)
            .then(res => {
              console.log(res)
              this.open2('删除成功')
              this.handleFilter()
            })
            .catch(e => {
              console.log(e)
              this.open2('删除失败')
              this.handleFilter()
            })
        })
      }
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

  .select1, .input {
    width: 180px;
  }

  .input, .searchBtn {
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

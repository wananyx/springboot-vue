<template>
  <div>
    <el-container>
    <div v-show="false" id="advTop1">
      <h3 class="title">媒体添加</h3>
      <el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm">
        <el-form-item label="媒体名称" prop="name">
          <el-input v-model="ruleForm.name"></el-input>
        </el-form-item>
        <el-form-item label="渠道主" prop="region">
          <el-select filterable v-model="ruleForm.region" placeholder="请选择">
            <el-option label="华育" value="shanghai"></el-option>
            <el-option label="太原" value="beijing"></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="布控方式" prop="resource">
          <el-radio-group v-model="ruleForm.resource">
            <el-radio label="客户"></el-radio>
            <el-radio label="云袭pl"></el-radio>
          </el-radio-group>
        </el-form-item>
        <el-form-item label="媒体类型" prop="resource">
          <el-radio-group v-model="ruleForm.resource">
            <el-radio label="wap"></el-radio>
            <el-radio label="PC"></el-radio>
            <el-radio label="Android"></el-radio>
            <el-radio label="IOS"></el-radio>
            <el-radio label="流量包"></el-radio>
          </el-radio-group>
        </el-form-item>
        <el-form-item label="网站分类" prop="region">
          <el-select v-model="ruleForm.region" placeholder="选择网站分类">
            <el-option label="华育" value="shanghai"></el-option>
            <el-option label="太原" value="beijing"></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="网址" prop="name">
          <el-input v-model="ruleForm.name"></el-input>
        </el-form-item>
        <el-form-item label="副网址">
          <el-input v-model="ruleForm.name"></el-input>
        </el-form-item>
        <el-form-item label="备案号">
          <el-input v-model="ruleForm.name"></el-input>
        </el-form-item>
        <el-form-item label="简介">
          <el-input type="textarea" v-model="ruleForm.desc"></el-input>
        </el-form-item>
        <el-form-item>
          <el-button type="primary" @click="submitForm('ruleForm')">保存</el-button>
          <el-button @click="resetForm('ruleForm')">重置</el-button>
        </el-form-item>
      </el-form>
    </div>
      </el-container>

    <div v-show="true">
    <el-container>
      <el-header id="advTop">

        <el-row :gutter="20">
          <el-col :span="4">
            <div class="grid-content bg-purple">
              <el-select class="select1" filterable size="small" v-model="value1" clearable placeholder="全部渠道">
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
              <el-select class="select2" filterable v-model="value2" size="small" clearable placeholder="全部媒体">
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
              <el-select class="select3" filterable v-model="value3" size="small" clearable placeholder="全部媒体类型">
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
              <el-select class="select4" filterable v-model="value4" size="small" clearable placeholder="全部审核状态">
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

          <el-col :span="4" class="searchBtn">
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
            label="名称"
            sortable
            width="180">
          </el-table-column>
          <el-table-column
            prop="owner"
            label="渠道主"
          >
          </el-table-column>
          <el-table-column
            prop="type"
            label="媒介类型"
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


  </div>
</template>

<script>
  export default {
    // name: "media",


    data() {
      return {
        ruleForm: {
          name: '',
          region: '',
          date1: '',
          date2: '',
          delivery: false,
          type: [],
          resource: '',
          desc: ''
        },
        rules: {
          name: [
            { required: true, message: '请输入媒体名称', trigger: 'blur' },
            { min: 3, max: 5, message: '长度在 3 到 5 个字符', trigger: 'blur' }
          ],
          region: [
            { required: true, message: '请选择渠道主', trigger: 'change' }
          ],
          type: [
            { type: 'array', required: true, message: '请至少选择一个活动性质', trigger: 'change' }
          ],
          resource: [
            { required: true, message: '请选择活动资源', trigger: 'change' }
          ],
          desc: [
            { required: true, message: '请填写活动形式', trigger: 'blur' }
          ]
        },
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
          owner: '渠道主1',
          auditing: '已审核',
          date: '2016-05-01',
          operation: '编辑 预览 统计',
        },
          {
            id: 2,
            name: '太原机房',
            type: 'wap横幅',
            owner: '渠道主2',
            auditing: '已审核',
            date: '2016-05-02',
            operation: '编辑 预览 统计',
          },
          {
            id: 3,
            name: '太原机房',
            type: 'wap横幅',
            owner: '渠道主3',
            auditing: '已审核',
            date: '2016-05-03',
            operation: '编辑 预览 统计',
          },
          {
            id: 4,
            name: '太原机房',
            type: 'wap横幅',
            owner: '渠道主4',
            auditing: '已审核',
            date: '2016-05-04',
            operation: '编辑 预览 统计',
          },
          {
            id: 5,
            name: '太原机房',
            type: 'wap横幅',
            owner: '渠道主5',
            auditing: '已审核',
            date: '2016-05-05',
            operation: '编辑 预览 统计',
          },
          {
            id: 6,
            name: '太原机房',
            type: 'wap横幅',
            owner: '渠道主6',
            auditing: '已审核',
            date: '2016-05-06',
            operation: '编辑 预览 统计',
          },
          {
            id: 7,
            name: '太原机房',
            type: 'wap横幅',
            owner: '渠道主7',
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
      },
      submitForm(formName) {
        this.$refs[formName].validate((valid) => {
          if (valid) {
            alert('submit!');
          } else {
            console.log('error submit!!');
            return false;
          }
        });
      },
      resetForm(formName) {
        this.$refs[formName].resetFields();
      }

    }
  }
</script>

<style scoped>


  .grid-content {
    border-radius: 4px;
    min-height: 20px;
  }
  #advTop1 {
    top: 50px;
    left: 100px;
    position: relative;
  }
  .title {
    color: red;
    margin-bottom: 50px;
  }
  #advTop {
    top: 50px;
    left: 20px;
    position: relative;

  }

  .select1, .select2, .select3, .select4 {
    width: 180px;
  }

  .select2, .select3, .select4, .searchBtn {
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



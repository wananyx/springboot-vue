<template>
  <div class="edit" Show="showEdit">

    <h3>基本信息</h3>
    <el-container>
      <!--:model="ruleForm"    ref="ruleForm"  :rules="rules"  prop="cusName"  prop="linkman"  prop="email"-->
    <el-form v-model="ruleForm" :model="ruleForm" ref="ruleForm" :rules="rules" label-width="100px" class="demo-ruleForm">
      <el-form-item label="广告主属性">
        <el-select v-model="ruleForm.cusProperty" clearable placeholder="请选择">
          <el-option label="企业" value="企业"></el-option>
          <el-option label="个人" value="个人"></el-option>
        </el-select>
      </el-form-item>
      <el-form-item label="广告主名称">
        <el-input v-model="ruleForm.cusName"></el-input>
      </el-form-item>
      <el-form-item label="联系人">
        <el-input v-model="ruleForm.linkman"></el-input>
      </el-form-item>
      <el-form-item label="邮箱">
        <el-input v-model="ruleForm.email"></el-input>
      </el-form-item>
      <el-form-item label="电话">
        <el-input v-model="ruleForm.phone"></el-input>
      </el-form-item>
      <el-form-item label="开户行">
        <el-input v-model="ruleForm.bank"></el-input>
      </el-form-item>
      <el-form-item label="开户名">
        <el-input v-model="ruleForm.accountName"></el-input>
      </el-form-item>
      <el-form-item label="银行账号">
        <el-input v-model="ruleForm.bankNum"></el-input>
      </el-form-item>
      <el-form-item label="营业执照号">
        <el-input v-model="ruleForm.busLicense"></el-input>
      </el-form-item>

      <el-form-item label="上传营业执照">
        <el-upload
          class="upload-demo"
          action="https://jsonplaceholder.typicode.com/posts/"
          :on-preview="handlePreview"
          :on-remove="handleRemove"
          :file-list="fileList2"
          list-type="picture">
          <el-button size="small" type="primary">点击上传</el-button>
          <div slot="tip" class="el-upload__tip">只能上传jpg/png文件，且不超过500kb</div>
        </el-upload>
      </el-form-item>

      <el-form-item label="是否开启后台">
        <el-radio-group v-model="ruleForm.openBack">
          <el-radio v-model="ruleForm.openBack" label="是" value="true">是</el-radio>
          <el-radio v-model="ruleForm.openBack" label="否" value="false">否</el-radio>
        </el-radio-group>
      </el-form-item>
      <el-form-item label="销售负责人">
        <el-select v-model="ruleForm.salesman" placeholder="请选择">
          <!--<el-option label="企业" value="企业"></el-option>-->
          <!--<el-option label="个人" value="个人"></el-option>-->
        </el-select>
      </el-form-item>

      <el-form-item>
        <el-button type="primary" @click="submitForm('ruleForm')">保存</el-button>
        <el-button @click="resetForm('ruleForm')">取消</el-button>
      </el-form-item>
    </el-form>
      </el-container>
  </div>
</template>

<script>
  export default {
    name: "customer_edit",
    props: {
      showEdit: Boolean,
      editRow:[Object,Boolean]
    },
    data() {
      return {
        ruleForm: {
          cusProperty: '',
          cusName: '',
          linkman: '',
          email: '',
          phone: '',
          bank: '',
          accountName: '',
          bankNum: '',
          busLicense: '',
          upload: '',
          openBack: '否',
          salesman: ''
        },
        rules: {
          cusName: [
            {required: true, message: '请输入广告主名称', trigger: 'blur'},
            // {min: 3, max: 5, message: '长度在 3 到 5 个字符', trigger: 'blur'}
          ],
          linkman: [
            {required: true, message: '请输入联系人', trigger: 'blur'},
          ],
          email: [
            {required: true, message: '请输入邮箱', trigger: 'blur'},
          ]
        },
        fileList2: [{name: 'food.jpeg', url: 'https://fuss10.elemecdn.com/3/63/4e7f3a15429bfda99bce42a18cdd1jpeg.jpeg?imageMogr2/thumbnail/360x360/format/webp/quality/100'}]
      };
    },
    methods: {
      submitForm(formName) {
        this.$refs[formName].validate((valid) => {
          if (valid) {
            //如果id为undefined则证明是新增，否则是更新
            if(this.ruleForm.id==undefined){
              this.apii.customer.save(this.ruleForm)
                .then(res => {
                  console.log(res)
                  //清空表单内容
                  this.$refs[formName].resetFields();
                  //返回列表页面
                  this.$emit('showPage',!this.show)
                  this.$emit('save','succ')
                })
                .catch(e => {
                  console.log(e)
                  //清空表单内容
                  this.$refs[formName].resetFields();
                  //返回列表页面
                  this.$emit('showPage',!this.show)
                  this.$emit('save','fail')
                })
            }else {
              this.apii.customer.update(this.ruleForm)
                .then(res => {
                  console.log(res)
                  //清空表单内容
                  this.$refs[formName].resetFields();
                  //返回列表页面
                  this.$emit('showPage',!this.show)
                  this.$emit('save','succ')
                })
                .catch(e => {
                  console.log(e)
                  //清空表单内容
                  this.$refs[formName].resetFields();
                  //返回列表页面
                  this.$emit('showPage',!this.show)
                  this.$emit('save','fail')
                })
            }

          } else {
            console.log('error submit!!');
            return false;
          }
        });
      },
      resetForm(formName) {
        this.$refs[formName].resetFields();
        this.$emit('showPage',!this.show)
      },
      handleRemove(file, fileList) {
        console.log(file, fileList);
      },
      handlePreview(file) {
        console.log(file);
      },
    },
    watch: {
      editRow:function (row) {
        if(row!=true){
          this.ruleForm = this.editRow;
        }
      }
    }


  }
</script>

<style scoped>
  .edit {
    top: 50px;
    left: 100px;
    position: relative;
  }
</style>

<template>
  <div class="edit" Show="showEdit">

    <h3>基本信息</h3>
    <el-container>
    <el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm">
      <el-form-item label="广告主属性">
        <el-select v-model="ruleForm.advProperty" placeholder="请选择">
          <el-option label="企业" value="shanghai"></el-option>
          <el-option label="个人" value="beijing"></el-option>
        </el-select>
      </el-form-item>
      <el-form-item label="广告主名称">
        <el-input v-model="ruleForm.advName"></el-input>
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
        <el-input v-model="ruleForm.upload"></el-input>
      </el-form-item>
      <el-form-item label="是否开启后台">
        <el-radio-group v-model="ruleForm.openBack">
          <el-radio v-model="ruleForm.openBack" label="1">是</el-radio>
          <el-radio v-model="ruleForm.openBack" label="2">否</el-radio>
        </el-radio-group>
      </el-form-item>
      <el-form-item label="销售负责人">
        <el-select placeholder="请选择">
          <el-option label="企业" value="shanghai"></el-option>
          <el-option label="个人" value="beijing"></el-option>
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
    props:['Show'],
    data() {
      return {
        ruleForm: {
          advProperty: '',
          advName: '',
          linkman: '',
          email: '',
          phone: '',
          bank: '',
          accountName: '',
          bankNum: '',
          busLicense: '',
          upload: '',
          openBack: '2'
        },
        rules: {
          advName: [
            {required: true, message: '请输入活动名称', trigger: 'blur'},
            {min: 3, max: 5, message: '长度在 3 到 5 个字符', trigger: 'blur'}
          ]
        }
      };
    },
    methods: {
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
        this.$emit('showPage',!this.show)
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

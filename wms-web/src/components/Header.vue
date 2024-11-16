<template>
    <div class="top-header">
        <div style="margin-top: 6px; cursor: pointer;">
            <!-- 收缩图标 -->
            <i :class="icon" @click="collapse" style="font-size: 22px;"></i>
        </div>
        <div class="hello">
            欢迎来到管理系统
        </div>
        <span>王小虎</span>
        <el-dropdown>
            <i class="el-icon-arrow-down" style="margin-left: 8px;"></i>
            <el-dropdown-menu slot="dropdown">
                <!-- native: 告诉 Vue 你希望监听的是子组件内部的原生 DOM 事件，而不是组件自定义的事件 -->
                <el-dropdown-item @click.native="toUser">个人中心</el-dropdown-item>
                <el-dropdown-item @click.native="logout">退出登录</el-dropdown-item>
            </el-dropdown-menu>
        </el-dropdown>
    </div>
</template>

<script>
export default {
    name: "HeaderMenu",
    props: {
        icon: String
    },
    methods: {
        toUser() {
            console.log('to_user');

        },
        logout() {
            console.log('logout');

        },
        collapse() {
            this.$emit('doCollapse')
        }
    }
}
</script>

<style scoped>
.top-header {
    display: flex;
    line-height: 60px;
}

.hello {
    flex: 1;
    text-align: center;
    font-size: 25px;
}
</style>
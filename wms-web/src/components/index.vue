<template>
    <el-container style="height: 100%; border: 1px solid #eee">
        <el-aside :width="aside_width">
            <Aside :isCollapse="is_Collapse"></Aside>
        </el-aside>

        <el-container style="height: 100%;">
            <el-header>
                <Header @doCollapse="do_Collapse" :icon="icon_s"></Header>
            </el-header>

            <el-main>
                <Main></Main>
            </el-main>
        </el-container>
    </el-container>
</template>

<script>
import Aside from './Aside.vue';
import Header from './Header.vue';
import Main from './Main.vue';

export default {
    name: "IndexPage",
    components: {
        Aside,      // 导航
        Header,     // 头部
        Main        // 主菜单
    },
    data() {
        return {
            is_Collapse: false,
            aside_width: '200px',
            icon_s: 'el-icon-s-fold'
        }
    },
    methods: {
        do_Collapse() {
            // console.log("收起or展开");
            this.is_Collapse = !this.is_Collapse
            if (!this.is_Collapse) { // 展开
                this.aside_width = '200px'
                this.icon_s = 'el-icon-s-fold'
            } else {    // 收起
                this.aside_width = '64px'
                this.icon_s = 'el-icon-s-unfold'
            }
        },
    }
};
</script>

<style scoped>
.el-header {
    /* background-color: #B3C0D1; */
    color: #333;
    line-height: 60px;
    text-align: right;
    font-size: 12px;
    height: 100%;
    border-bottom: rgb(168, 168, 168, 0.3) 3px solid;
}

.el-main {
    height: 100%;
    padding: 5px;
}

.el-aside {
    color: #333;
    background-color: rgb(238, 241, 246);
    margin-left: -1px;
}
</style>

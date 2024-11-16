import Vue from 'vue'
import App from './App.vue'
import ElementUI from 'element-ui';   // 全局引用element-ui ↓
import 'element-ui/lib/theme-chalk/index.css';
import './assets/global.css';
import axios from 'axios';

Vue.prototype.$axios=axios;
Vue.prototype.$httpUrl='http://localhost:8099'
Vue.config.productionTip = false
Vue.use(ElementUI, {size: 'small'});     // 使用


new Vue({
  render: h => h(App),
}).$mount('#app')

"use strict";(self["webpackChunkvue3_nb0"]=self["webpackChunkvue3_nb0"]||[]).push([[790],{48790:(e,l,o)=>{o.r(l),o.d(l,{default:()=>b});o(63134),o(10307),o(39524);var a=o(67377),n=o(91370),t=o(98479),u=o(51290),i=function(e){return(0,a.dD)("data-v-8da0f06c"),e=e(),(0,a.Cn)(),e},r={class:"login_view"},s=i((function(){return(0,a._)("div",{class:"title_view"},"c语言学习辅导网站的设计与实现登录",-1)})),v={key:0,class:"list_item"},d=i((function(){return(0,a._)("div",{class:"list_label"}," 账号： ",-1)})),c={key:1,class:"list_item"},m=i((function(){return(0,a._)("div",{class:"list_label"}," 密码： ",-1)})),f=["onKeydown"],p={key:2,class:"list_type"},g={key:3,class:"remember_view"},w={class:"btn_view"};const _={__name:"login",setup:function(e){var l,o=(0,u.iH)([]),i=(0,u.iH)([]),_=(0,u.iH)({role:"",username:"",password:""}),h=(0,u.iH)(""),k=(0,u.iH)(1),b=(0,u.iH)(!0),y=null===(l=(0,a.FN)())||void 0===l?void 0:l.appContext.config.globalProperties,U=function(e){null===y||void 0===y||y.$router.push("/".concat(e,"Register"))},S=function(){if(_.value.username)if(_.value.password){if(o.value.length>1){if(!_.value.role)return null===y||void 0===y||y.$toolUtil.message("请选择角色","error"),void verifySlider.value.reset();for(var e=0;e<i.value.length;e++)i.value[e].roleName==_.value.role&&(h.value=i.value[e].tableName)}else h.value=o.value[0].tableName,_.value.role=o.value[0].roleName;$()}else null===y||void 0===y||y.$toolUtil.message("请输入密码","error");else null===y||void 0===y||y.$toolUtil.message("请输入用户名","error")},$=function(){null===y||void 0===y||y.$http({url:"".concat(h.value,"/login?username=").concat(_.value.username,"&password=").concat(_.value.password),method:"post"}).then((function(e){if(b.value){var l=JSON.parse(JSON.stringify(_.value));delete l.code,null===y||void 0===y||y.$toolUtil.storageSet("loginForm",JSON.stringify(l))}else null===y||void 0===y||y.$toolUtil.storageRemove("loginForm");null===y||void 0===y||y.$toolUtil.storageSet("Token",e.data.token),null===y||void 0===y||y.$toolUtil.storageSet("role",_.value.role),null===y||void 0===y||y.$toolUtil.storageSet("sessionTable",h.value),null===y||void 0===y||y.$toolUtil.storageSet("adminName",_.value.username),null===y||void 0===y||y.$router.push("/")}),(function(e){}))},N=function(){var e={page:1,limit:1,sort:"id"};null===y||void 0===y||y.$http({url:"menu/list",method:"get",params:e}).then((function(e){i.value=JSON.parse(e.data.data.list[0].menujson);for(var l=0;l<i.value.length;l++)"是"==i.value[l].hasBackLogin&&o.value.push(i.value[l]);var a=null===y||void 0===y?void 0:y.$toolUtil.storageGet("loginForm");a||(_.value.role=o.value[0].roleName),null===y||void 0===y||y.$toolUtil.storageSet("menus",JSON.stringify(i.value))}))},V=function(){N();var e=null===y||void 0===y?void 0:y.$toolUtil.storageGet("loginForm");e&&(_.value=JSON.parse(e))};return(0,a.bv)((function(){V()})),function(e,l){var u=(0,a.up)("el-radio"),i=(0,a.up)("el-checkbox"),h=(0,a.up)("el-button"),y=(0,a.up)("el-form"),$=(0,a.up)("Vcode");return(0,a.wg)(),(0,a.iD)("div",null,[(0,a._)("div",r,[(0,a.Wm)(y,{model:_.value,class:"login_form"},{default:(0,a.w5)((function(){return[s,1==k.value?((0,a.wg)(),(0,a.iD)("div",v,[d,(0,a.wy)((0,a._)("input",{class:"list_inp","onUpdate:modelValue":l[0]||(l[0]=function(e){return _.value.username=e}),placeholder:"请输入账号"},null,512),[[n.nr,_.value.username]])])):(0,a.kq)("",!0),1==k.value?((0,a.wg)(),(0,a.iD)("div",c,[m,(0,a.wy)((0,a._)("input",{class:"list_inp","onUpdate:modelValue":l[1]||(l[1]=function(e){return _.value.password=e}),type:"password",placeholder:"请输入密码",onKeydown:(0,n.D2)(S,["enter","native"])},null,40,f),[[n.nr,_.value.password]])])):(0,a.kq)("",!0),o.value.length>1?((0,a.wg)(),(0,a.iD)("div",p,[((0,a.wg)(!0),(0,a.iD)(a.HY,null,(0,a.Ko)(o.value,(function(e,o){return(0,a.wg)(),(0,a.j4)(u,{key:o,modelValue:_.value.role,"onUpdate:modelValue":l[2]||(l[2]=function(e){return _.value.role=e}),label:e.roleName},{default:(0,a.w5)((function(){return[(0,a.Uk)((0,t.zw)(e.roleName),1)]})),_:2},1032,["modelValue","label"])})),128))])):(0,a.kq)("",!0),1==k.value?((0,a.wg)(),(0,a.iD)("div",g,[(0,a.Wm)(i,{modelValue:b.value,"onUpdate:modelValue":l[3]||(l[3]=function(e){return b.value=e}),label:"记住密码",size:"large","true-label":!0,"false-label":!1},null,8,["modelValue"])])):(0,a.kq)("",!0),(0,a._)("div",w,[1==k.value?((0,a.wg)(),(0,a.j4)(h,{key:0,class:"login",type:"success",onClick:S},{default:(0,a.w5)((function(){return[(0,a.Uk)("登录")]})),_:1})):(0,a.kq)("",!0),(0,a.Wm)(h,{class:"register",type:"primary",onClick:l[4]||(l[4]=function(e){return U("jiaoshi")})},{default:(0,a.w5)((function(){return[(0,a.Uk)("注册教师")]})),_:1})])]})),_:1},8,["model"])]),(0,a.Wm)($,{show:e.isShow,onSuccess:e.success,onClose:e.close,onFail:e.fail},null,8,["show","onSuccess","onClose","onFail"])])}}};var h=o(57326);const k=(0,h.Z)(_,[["__scopeId","data-v-8da0f06c"]]),b=k}}]);
//# sourceMappingURL=790.f74d9e67.js.map
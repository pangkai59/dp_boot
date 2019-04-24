/**
 * 新增-项目档案管理js
 */
var vm = new Vue({
	el:'#dpLTE',
	data: {
		goodsRecord: {
			id: 0
		}
	},
	methods : {
		acceptClick: function() {
			if (!$('#form').Validform()) {
		        return false;
		    }
		    $.SaveForm({
		    	url: '../../goods/record/save?_' + $.now(),
		    	param: vm.goodsRecord,
		    	success: function(data) {
		    		$.currentIframe().vm.load();
		    	}
		    });
		}
	}
})

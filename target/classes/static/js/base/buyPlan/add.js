/**
 * 新增-js
 */
var vm = new Vue({
	el:'#dpLTE',
	data: {
		goodsBuyPlan: {
			id: 0
		}
	},
	methods : {
		acceptClick: function() {
			if (!$('#form').Validform()) {
		        return false;
		    }
		    $.SaveForm({
		    	url: '../../goods/buyPlan/save?_' + $.now(),
		    	param: vm.goodsBuyPlan,
		    	success: function(data) {
		    		$.currentIframe().vm.load();
		    	}
		    });
		}
	}
})

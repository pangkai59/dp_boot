/**
 * 新增-施工请销点表js
 */
var vm = new Vue({
	el:'#dpLTE',
	data: {
		workForSite: {
			id: 0
		}
	},
	methods : {
		acceptClick: function() {
			if (!$('#form').Validform()) {
		        return false;
		    }
		    $.SaveForm({
		    	url: '../../work/workForSite/save?_' + $.now(),
		    	param: vm.workForSite,
		    	success: function(data) {
		    		$.currentIframe().vm.load();
		    	}
		    });
		}
	}
})

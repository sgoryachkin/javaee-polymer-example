/**
 *
 */
Polymer({
	is : 'main-menu',

	properties : {
		menuData : {
			type: Object,
			notify: true
		}
	},

	toggleCollapse : function(e) {
		var COLLAPSE_ID_PREFIX = "#collapse";
		var collapseId = COLLAPSE_ID_PREFIX + e.model.index;
		this.$$(collapseId).toggle();
	}

	//handleItemClick : function(e) {
	//	var route = e.currentTarget.getAttribute('route');
	//	MoreRouting.getRoute(route).navigateTo();
	//}
});

/**
 * 
 */
Polymer({
	is : 'main-page',
	toggleCollapse : function(e) {
		this.$$('#collapse' + e.model.index).toggle();
	}
});

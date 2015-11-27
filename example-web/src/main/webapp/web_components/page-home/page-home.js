/**
 *
 */
Polymer({
	is : 'page-home',
	  created: function() {
		    console.log(this.localName + '#' + this.id + ' was created');
		  },

		  attached: function() {
		    console.log(this.localName + '#' + this.id + ' was attached');
		  },

		  detached: function() {
		    console.log(this.localName + '#' + this.id + ' was detached');
		  },
			
			ready: function() {
				console.log(this.localName + '#' + this.id + ' was ready');
			}
});

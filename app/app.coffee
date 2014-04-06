angular.module 'hello', []

.controller 'HelloController', class
		constructor: ($http) ->
			$http.get('/greeting').success (data) =>
				@greeting = 'Hello World'

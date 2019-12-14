//var localurl ="http://localhost:8086/";
var localurl =location.origin;
var app = angular.module("LoginApp", ["angular.filter","ngResource","ngAnimate", "toastr"]);


app.controller('LoginController',function ($scope,$http,$location,$window,toastr) {
$scope.user = {
	        username: '',
	        password: ''
		}
$scope.loginSubmit = function (username,password){
/* $http.get('/checklogin').success(function(data) {
	console.log(data);
	if (data === true)
	$scope.loggedIn = true;
	else
	$scope.loggedIn = false;
})
.error(function(data) {
	console.log('error: ' + data);
}); */
	if (username) {  
		$window.location.href=localurl;
	}
	else{
		alert('Login incorrect');
	}
}
scope=$scope;
});
var app = angular.module("EmployeeManagement", []);

// Controller Part
app.controller("EmployeeController", function($scope, $http) {

	$scope.employees = [];
	$scope.employeeForm = {
		empId : 1,
		empFName : "",
		empLName : "",
		gender : "",
		dob : "",
		Dept : "",
	};

	// Now load the data from server
	_refreshEmployeeData();

	// HTTP POST/PUT methods for add/edit employee  
	// Call: http://localhost:8080/employee
	$scope.submitEmployee = function() {

		var method = "";
		var url = "";

		if ($scope.employeeForm.empId == -1) {
			method = "POST";
			url = '/getEmployee';
		} else {
			method = "PUT";
			url = '/addEmployee';
		}

		$http({
			method : method,
			url : url,
			data : angular.toJson($scope.employeeForm),
			headers : {
				'Content-Type' : 'application/json'
			}
		}).then(_success, _error);
	};

	$scope.createEmployee = function() {
		_clearFormData();
	}

	/ function _refreshEmployeeData() {
		$http({
			method : 'GET',
			url : '/getemployee'
		}).then(function(res) { // success
			$scope.employees = res.data;
		}, function(res) { // error
			console.log("Error: " + res.status + " : " + res.data);
		});
	}

	function _success(res) {
		_refreshEmployeeData();
		_clearFormData();
	}

	function _error(res) {
		var data = res.data;
		var status = res.status;
		var header = res.header;
		var config = res.config;
		alert("Error: " + status + ":" + data);
	}

	// Clear the form
	function _clearFormData() {
		$scope.employeeForm.empId = -1;
		$scope.employeeForm.empFName = "";
		$scope.employeeForm.empLName = ""
		$scope.employeeForm.gender = "";
		$scope.employeeForm.dob = ""
		$scope.employeeForm.Dept = ""

	}
	;
});
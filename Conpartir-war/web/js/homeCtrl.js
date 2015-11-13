/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

angular.module("myapp", ['ngRoute'])
  
  .config(function($routeProvider){
  $routeProvider.when("/",
    {
      templateUrl: "pages/home.html",
      controller: "MainController"
     // controllerAs: "app"
    });
    
    $routeProvider.when("/about",
    {
      templateUrl: "pages/about.html",
      controller: "MainController"
     // controllerAs: "app"
    }
  );
})
  
  
     .controller("MainController", function($scope) {
         
      $scope.hello = "Powered by AngularJs";
      $scope.hasFooter = true;
      
      
      
      
   });
 
   

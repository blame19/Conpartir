/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
(function () {
  'use strict';

  var modPost = angular.module('postModule', []);
        modPost.controller('PostController', ['$scope', function($scope) {
      
      //Array of JSON objects to show "posts" on the page. TODO: import posts from DB       
      $scope.samplePosts =[ 
        { name: "Matteo Rossi",
          car: "Fiat Punto 2014",
          age: 25 ,
          from: "Torino" ,
          to: "Milano"          
      },
      { name: "Marco Verdi",
          car: "Citrone C4 2014",
          age: 33 ,
          from: "Torino" ,
          to: "Milano"          
      },
      { name: "Monica Marconi",
          car: "Citroen Berlingo 2004",
          age: 20 ,
          from: "Torino" ,
          to: "Padova"          
      }, 
      { name: "Michele Ventura",
          car: "Renault kangoo 2004",
          age: 27 ,
          from: "Torino" ,
          to: "Palermo"          
      }  ];
}]);

})();
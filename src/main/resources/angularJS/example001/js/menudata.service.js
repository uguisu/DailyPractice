/**
 * Declare a service called `MenuDataService`.
 */
(function () {
  'use strict';

  angular.module('data', [])
  .service('MenuDataService', MenuDataService)
  .constant('ApiBasePath', "https://davids-restaurant.herokuapp.com")
  ;

  /**
   * Service
   */
   MenuDataService.$inject = ['$http', 'ApiBasePath'];
   function MenuDataService($http, ApiBasePath) {
     // re-define service
     var service = this;

     // Method: getAllCategories
     service.getAllCategories = function () {
       // call Restful API endpoint : https://davids-restaurant.herokuapp.com/categories.json
       return $http({
         method: "GET",
         url: (ApiBasePath + "/categories.json")
       }).then(
         function (result) {
           // return a promise which is a result of using the `$http` service
           return result;
         },
         function (error) {
           // when error occurs
           console.log(error);
         }
       );
     };

     // Method: getItemsForCategory
     service.getItemsForCategory = function (categoryShortName) {
       // call Restful API endpoint : https://davids-restaurant.herokuapp.com/menu_items.json?category=
       return $http({
         method: "GET",
         url: (ApiBasePath + "/menu_items.json"),
         params: {
           category: categoryShortName
         }
       }).then(function (result) {
         // return a promise which is a result of using the `$http` service
         return result;
       });
     };
   };

})();

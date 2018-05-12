/**
 * Declare a controller called `CategoryController`.
 */
(function () {
  'use strict';

  angular.module('MenuApp')
  .controller('CategoryController', CategoryController)
  .constant('ImageURL', "images/link.png")
  ;

  /**
   * Controller
   */
  CategoryController.$inject = ['MenuDataService', 'items', 'ImageURL'];
  function CategoryController(MenuDataService, items, ImageURL) {
    // re-define controller
    var categoryCtrl = this;
    // Load data via service
    categoryCtrl.items = items.data;
    // Assign link image
    categoryCtrl.imageURL = ImageURL;
  }

})();

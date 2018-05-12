/**
 * Declare a controller called `CategoryItemsController`.
 */
(function () {
  'use strict';

  angular.module('MenuApp')
  .controller('CategoryItemsController', CategoryItemsController)
  ;

  /**
   * Controller
   * @items inherity from parent
   */
  CategoryItemsController.$inject = ['MenuDataService', 'items', '$stateParams'];
  function CategoryItemsController(MenuDataService, items, $stateParams) {
    // re-define controller
    var categoryItemsCtrl = this;
    var itemsData = [];
    // Load data via service
    var promise = MenuDataService.getItemsForCategory($stateParams.itemId);
    promise.then(function(response) {
      // console.log("response.data.menu_items=", response.data.menu_items); //DEBUG
      categoryItemsCtrl.itemsData = response.data.menu_items;
    });
  }

})();

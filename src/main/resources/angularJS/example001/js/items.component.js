/**
 * Shows all of the menu items for a particular category.
 */
(function () {
  'use strict';

  angular.module('MenuApp')
  .component('items', {
    templateUrl: './templates/component/items.template.html',
    bindings: {
      itemsdata: '<'
    }
  });

})();

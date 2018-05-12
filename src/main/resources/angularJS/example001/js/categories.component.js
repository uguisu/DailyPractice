/**
 * Shows all available categories in the menu to the user.
 */
(function () {
  'use strict';

  angular.module('MenuApp')
  .component('categories', {
    templateUrl: './templates/component/categoriesList.template.html',
    bindings: {
      items: '<',
      imageurl: '<'
    }
  });

})();

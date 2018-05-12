/**
 * AngularJs router
 */
(function () {
  'use strict';

  // These routes should be defined in the `MenuApp` module.
  angular.module('MenuApp')
  .config(RoutesConfig);

  RoutesConfig.$inject = ['$stateProvider', '$urlRouterProvider'];
  function RoutesConfig($stateProvider, $urlRouterProvider) {

    // Redirect to home page if no other URL matches
    $urlRouterProvider.otherwise('/');

    // *** Set up UI states ***
    $stateProvider

    // Home page
    .state('home', {
      url: '/',
      templateUrl: 'templates/view/home.template.html'
    })
    // Categories list page
    .state('categories', {
      url: '/categories-list',
      templateUrl: 'templates/view/categories.template.html',
      controller: 'CategoryController as categoryCtrl',
      resolve: {
        items: ['MenuDataService', function (MenuDataService) {
          return MenuDataService.getAllCategories();
        }]
      }
    })
    // Item detail page
    .state('categories.items', {
      // url: '/item-detail/{itemId}',
      templateUrl: 'templates/view/categories.items.template.html',
      controller: 'CategoryItemsController as categoryItemsCtrl',
      params: {
        itemId: null
      }
    });

  }
})();

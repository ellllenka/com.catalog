'use strict';

angular.module('core.good').factory('Good', ['$resource',
    function($resource) {
      return $resource('/good', {}, {
        query: {
          method: 'GET', 
          params: '@id',
          isArray: true
        }
      });
    }
  ]);

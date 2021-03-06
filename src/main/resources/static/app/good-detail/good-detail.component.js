'use strict';

// Register `phoneDetail` component, along with its associated controller and template
angular.module('goodDetail').component('goodDetail', {
  templateUrl: 'good-detail/good-detail.template.html',
  controller: ['$routeParams', 'Good',
    function GoodDetailController($routeParams, Good) {
      var self = this;

      // self.good = Good.get({id: $routeParams.id}, function (good) {
      //   self.setImage(good.images[0]);
      // });
      //
      // self.setImage = function setImage(imageUrl) {
      //   self.mainImageUrl = imageUrl;
      // };

      Good.query({id: $routeParams.goodId}).$promise.then(function (result) {
        self.good = result[0];
      });

      // $http.get('goods/' + $routeParams.goodId + '.json').then(function(response) {
      //   self.good = response.data;
      //   self.setImage(self.good.images[0]);
      // });
    }]
  });

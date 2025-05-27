$(document).ready(function () {
  $('#registerBtn').click(function () {
    $('.event-card').fadeOut(200, function () {
      $(this).fadeIn(500);
    });
  });
});

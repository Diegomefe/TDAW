$(document).ready(function () {
  $('#search').on('input', function () {
    const query = $(this).val().trim();

    if (query.length >= 3) {
      $.ajax({
        url: `/api/search/suggestions`,
        method: 'GET',
        data: { query: query },
        success: function (data) {
          const suggestionsList = $('#suggestions');
          suggestionsList.empty();

          data.forEach(function (item) {
            suggestionsList.append(`<li>${item}</li>`);
          });
        },
        error: function (xhr, status, error) {
          console.error('Error de búsqueda:', error);
        }
      });
    } else {
      $('#suggestions').empty();
    }
  });
});

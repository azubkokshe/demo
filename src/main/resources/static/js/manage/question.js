function save() {

    $.ajax({
        type: 'POST',
        url: '/add',
        data: {
            userName: $('#username').val(),
            password: $('#password').val()
         },
         success: function(data) {
            if (data == "200") {
                window.location.href = "/question";
            }
         }
    });
}
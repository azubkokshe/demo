function login() {
    $.ajax({
        type: 'POST',
        url: '/login',
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
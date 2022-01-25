let set_login_button = () => {
    let login_button = document.getElementById('login');
    login_button.addEventListener('click', () => {
        location.href = "/LoginForm/login";
    });
}

let set_submit_button = () => {
    let submit_button =document.getElementById('signup');
    submit_button.addEventListener('click', () => {
       let form = document.getElementById('form');

       if(dup_Check()) {
           document.querySelector(".dup_text").style.visibility = "visible";
           document.querySelector(".dup_label").style.color = "red";
           document.querySelector(".dup_input").style.border = "1px solid red";
       }

       else {
           form.action = "/LoginForm/signup/submit";
           form.method = "POST";
           form.submit();
           alert("회원가입이 완료되었습니다!");
       }
    });

    let dup_Check = () => {
        let userID = $('#userID').val();
        let userPhone = $('#userPhone').val();
        let result;

        let checkData = {
            userID: userID,
            userPhone, userPhone
        };

        $.ajax({
            url: "/LoginForm/signup/dupCheck",
            async: false,
            type: "POST",
            contentType: "application/json",
            data: JSON.stringify(checkData),
            success: (data) => {
                if(data == true) {
                    result = true;
                }
                else {
                    result = false;
                }
            }
        });

        return result;
    }
}

let action_setting = () => {
    set_login_button();
    set_submit_button();
}





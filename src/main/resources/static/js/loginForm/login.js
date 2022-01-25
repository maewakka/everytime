let set_signin_button = () => {
   let signin_button = document.getElementById('signin');
   signin_button.addEventListener('click', () => {
      location.href = "/LoginForm/signup";
   });
}

let set_login_button = () => {
   let login_button = document.getElementById("login_button");
   login_button.addEventListener('click', () => {
      let form = document.getElementById("form");

      form.action = "/LoginForm/login/loginCheck";
      form.method = "POST";
      form.submit();
      alert("로그인이 완료되었습니다.");
   });
}

let action_setting = () => {
   set_signin_button();
   set_login_button();
}

action_setting();



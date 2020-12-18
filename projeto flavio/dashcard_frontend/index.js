function logar(){
    var txtLogin = document.getElementById("txtLogin").value;
    var txtSenha = document.getElementById("txtSenha").value;

    var msgBody = {
        email: txtLogin,
        racf: txtLogin,
        senha: txtSenha
    };

    var cabecalho ={
        method: "POST",
        body: JSON.stringify(msgBody),
        headers: { "content-type": "application/json"}
    }

    fetch("http://localhost:8088/login", cabecalho).then(res => tratastatus(res));
}

function tratastatus(res){
    switch (res.status){
    case 200:       
        document.getElementById("msgErro").innerHTML ="";
        res.json().then(user => registrarUsuario(user));
        break;
    case 401:
        document.getElementById("msgErro").innerHTML = "Usuário ou Senha inválida!";           
        break;
    case 404:
        document.getElementById("msgErro").innerHTML = 'Usuário não encontrado!';
        break;
    default:
        document.getElementById("msgErro").innerHTML = "Erro desconhecido!";
    }
}

function registrarUsuario(usuario){
    localStorage.setItem("usuarioLogado", JSON.stringify(usuario));
    window.location ="agentes.html";
}
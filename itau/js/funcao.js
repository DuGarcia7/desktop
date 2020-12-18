function msn(){
    alert ("Rapa como você é curioso");
    }

function validar(){
    var nome=FormUser.nome.value;
    var email=FormUser.email.value;
    var senha=FormUser.senha.value;

    if(nome==""){
        alert("Preencha o campo Nome")
        FormUser.nome.focus();
        return false;
    }
    if(email=="" || email.indexOf('@')==-1){
        alert("Email inválido")
        FormUser.email.focus();
        return false;
    }
    if(senha=="" || senha.length<=5){
        alert("Preencha o campo Senha com, no mínimo, 6 dígitos")
        FormUser.senha.focus();
        return false;
    }
    alert ("Prezado(a) "+nome+", seus dados foram computados\nIremos enviar nosso portfólio para o email "+email);
}

function carregarInfo(){
   //var idAgente = new URLSearchParams(window.location.search).get("Id");
    var idAgente = new URLSearchParams(window.location.search);    
   
   
    fetch("http://localhost:8088/status?" + idAgente)
        .then (res => res.json())
        .then (lista => preencheLista(lista))
}

function preencheLista(lista){

    if (!lista){
       alert('vazio');
    }
   

    var strLista;


    var sucesso, falha, fraude, volume, agente,i;
    for (i=0; i < lista.length; i++){
        var operacoes = lista[i];
        switch (operacoes.status){
            case 0: 
                sucesso = operacoes.operacoes;
                break;
            case 1: 
                falha = operacoes.operacoes;
                break;
            case 2:
                fraude = operacoes.operacoes;
                break;         
        }
    }
    agente = lista[i-1].nomeAgente;
    volume = new Intl.NumberFormat('pt-BR', "{ style: 'currency', currency: 'BRL' }").format(lista[i-1].volume);
   
    
    document.getElementById("infoAgente").innerHTML = `<br><span style="text-align: right;">${agente} / R$ ${volume} </span><br><br>`;
    document.getElementById("infoSucesso").innerHTML = `<br><span style="text-align: right;">${sucesso}</span><br><br>`;
    document.getElementById("infoFalha").innerHTML = `<br><span style="text-align: right;">${falha}</span><br><br>`;
    document.getElementById("infoFraude").innerHTML = `<br><span style="text-align: right;">${fraude}</span><br><br>`;
    
}

function carregarInfo(){
    var objUser = localStorage.getItem("usuarioLogado");
    if (!objUser){
        window.location="index.html";
    }
    
    
    var user = JSON.parse(objUser);    
    document.getElementById("fotoUser").innerHTML = `<img class="img-fluid" src="${user.linkFoto}" max-width="100%" height:"auto"/>`;    
    document.getElementById("infoUser").innerHTML = `<h3>${user.nome}</h3>
                                                    <strong>RACF: </strong> ${user.racf} <br/>
                                                    <strong>E-Mail: </strong>${user.email}<br/>`;
    
    
    fetch("http://localhost:8088/agentes")
        .then (res => res.json())
        .then (lista => preencheLista(lista))

}

function preencheLista(lista){

    if (!lista){
       alert('vazio');
    }
   

    var strLista = `<table class="table table-hover">
                    <thead>
                        <tr>
                            <th scope="col">#</th>
                            <th scope="col">Agente</th>
                            <th scope="col" style="text-align: right;">Volume (R$) </th>
                        </tr>
                    </thead>
                    <tbody>`;

    for (i=0; i < lista.length; i++){
        var agente = lista[i];

        strLista += `<tr>
                    <th scope="row" id="${agente.id}">${i+1}</th>
                    <td><a href="#" onclick="seleciona(${agente.id});">${agente.nome}</a></td>
                    <td style="text-align: right;">${new Intl.NumberFormat('pt-BR', "{ style: 'currency', currency: 'BRL' }").format(agente.volume)}</td>                
                    </tr>
                    </a>`;

    }
    strLista += `</tbody>
                </table>`;

    document.getElementById("tabelaAgentes").innerHTML = strLista;
}

function seleciona (id){
    var idAgente = document.getElementById(id).value;  
    window.location ="dashboard.html?id="+id;
}

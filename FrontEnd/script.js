// Lista Chamados Do Cliente
async function listaChamados(idcli) {

    let url = "http://localhost:8080/servcliente/listachamadosdto";
    url = url + "?idcli="+idcli;

    try{
        let resposta = await fetch(url);
        if (resposta.ok){
            let dados = await resposta.json();
            return dados;
        }else{
            return null;
        }
    }catch(erro){
        console.log(erro);
    }
}

// --- INICIO ---
document.getElementById("listarchamados").onclick = async function () {
    let idcliente = document.getElementById("idcliente").value;
    let resposta = await listaChamados(idcliente);
    if (resposta != null){
        
        
        let aux =JSON.stringify(resposta);
        var dados = JSON.parse(aux);

        var spc = "&nbsp;&nbsp;&nbsp;&nbsp;"

        document.getElementById('listar').innerHTML = 
            "<p class='inner' id="+i+">"+  "TITULO" +spc+ " | " +spc
                                        + "PRIORIDADE" +spc+ " | " +spc
                                        + "PRAZO SLA" +spc+ " | " +spc
                                        + "CATEGORIA" +spc+ " | " +spc
                                        + "TECNICO" +spc+ " | " +spc
                                        + "CHAMADO" +spc+ " | " +spc
                                        + "DATA ABERTURA" + "<br>";

        for(var i = 0;i < dados.length; i++)
        {
            document.getElementById('listar').innerHTML = document.getElementById('listar').innerHTML + 
            "<p class='inner' id="+i+">"+ dados[i].titulo +spc+ " | " +spc
                                        + dados[i].prioridade +spc+ " | " +spc
                                        + dados[i].prazoSLA +spc+ " | " +spc
                                        + dados[i].habilidadeCategoria +spc+ " | " +spc
                                        + dados[i].nomeTecnico +spc+ " | " +spc
                                        + dados[i].numChamado +spc+ " | " +spc
                                        + dados[i].dataAbertura + "<br>";
        }
        
    }else{
        let lista = document.getElementById("listar");
        lista.innerHTML = " ERRO NA CONSULTA DOS DADOS ";
    }
}

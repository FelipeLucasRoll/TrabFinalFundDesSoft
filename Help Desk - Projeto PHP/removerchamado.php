<STYLE type="text/css">
<!--
BODY {
	scrollbar-face-color: #191919;
	scrollbar-highlight-color: #646464;
	scrollbar-3dlight-color: #191919;
	scrollbar-darkshadow-color: #646464;
	scrollbar-shadow-color: #000000;
	scrollbar-arrow-color: #1D1D1D;
	scrollbar-track-color: #333333;
	background-color: #FFFFFF;
}
-->
</STYLE>
<?php

if( isset($_POST["Submit"])) 
{

require("sessao.inc.php");

include("funcoes.php");

conexao();

$id = $_POST['remover'];






//==========================================================================================================================

// Criacao da query SQL para insercao dos dados
	$sql = "DELETE FROM chamados WHERE id = $id";
						
	// Usa a funcao de query mysql passando a SQL como argumento
	$retorno = mysql_query($sql);

	// Verifica se os dados foram inseridos na base	
	if($retorno)
		echo "<script>alert('Chamado Deletado !')</script><script>history.back(-1);</script>";
	else
	    echo "<script>alert('Erro ao deletar chamado!')</script><script>history.back(-1);</script>";
		
		echo "<meta http-equiv='refresh' content='1;url=consultarchamado.php'>";


}


?>
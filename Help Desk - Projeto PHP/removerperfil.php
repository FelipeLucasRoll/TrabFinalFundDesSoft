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


require("sessao.inc.php");

include("funcoes.php");

conexao();

$id_usuario = $_SESSION["id_usuario"];



//==========================================================================================================================

// Criacao da query SQL para Remover os dados
	$sql = "DELETE FROM usuarios WHERE id = $id_usuario";
						
	// Usa a funcao de query mysql passando a SQL como argumento
	$retorno = mysql_query($sql);

	// Verifica se os dados foram Removidos na base	
	if($retorno)
		echo "<script>alert('Perfil Deletado !')</script><script>history.back(-1);</script>";
		
		
	else
	    echo "<script>alert('Nao foi Possivel Deletar o Perfil!')</script><script>history.back(-1);</script>";
		
		

         echo "<meta http-equiv='refresh' content='1;url=logout.php'>";



?>
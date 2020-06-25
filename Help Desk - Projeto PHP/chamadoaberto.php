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

$id_usuario = $_SESSION['id_usuario'];

$nome = $_POST['nome'];

$email = $_POST['email'];

$celular = $_POST['celular'];

$assunto = $_POST['assunto'];

$mensagem = $_POST['mensagem'];






//==========================================================================================================================


if(empty($mensagem)){echo "<script>alert('Erro !! O campo nao pode ser em branco !')</script><script>history.back(-1);</script>"; exit; }


//==========================================================================================================================

// Criacao da query SQL para insercao dos dados
	$sql = "INSERT INTO chamados (id_usuario, nome, email, celular, assunto, mensagem)
						VALUES ('$id_usuario','$nome','$email','$celular','$assunto', '$mensagem')";
						

	// Usa a funcao de query mysql passando a SQL como argumento
	$retorno = mysql_query($sql);

	// Verifica se os dados foram inseridos na base	
	if($retorno)
		echo "<script>alert('Chamado Aberto com Sucesso !')</script><script>history.back(-1);</script>";
	else
		echo "<script>alert('Erro ao Abrir Chamado !')</script><script>history.back(-1);</script>";


//==========================================================================================================================

//pagina depois do cadastro



echo "<meta http-equiv='refresh' content='1;url=principal.php'>";

}


?>


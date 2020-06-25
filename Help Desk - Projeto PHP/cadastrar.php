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


require("funcoes.php");

conexao();


$nome   = $_POST['nome'];

$nasc   = "$_POST[ano]"."-"."$_POST[mes]"."-"."$_POST[dia]";

$celular = $_POST['celular'];

$email  = $_POST['email'];

$login  = $_POST['login'];

$senha  = $_POST['senha'];

$senha2 = $_POST['senha2'];




//==========================================================================================================================



if(empty($nome)){echo "<script>alert('Preencha todos os espaÁos !')</script><script>history.back(-1);</script>"; exit; }

if(empty($nasc)){echo "<script>alert('Preencha todos os espaÁos !')</script><script>history.back(-1);</script>"; exit; }

if(empty($celular)){echo "<script>alert('Preencha todos os espaÁos !')</script><script>history.back(-1);</script>"; exit; }

if(empty($email)){echo "<script>alert('Preencha todos os espaÁos !')</script><script>history.back(-1);</script>"; exit; }

if(empty($login)){echo "<script>alert('Preencha todos os espaÁos !')</script><script>history.back(-1);</script>"; exit; }

if(empty($senha)){echo "<script>alert('Preencha todos os espaÁos !')</script><script>history.back(-1);</script>"; exit; }



//==========================================================================================================================

if(strlen($email) <= "5"){echo "<script>alert('E-mail inv·lido !')</script><script>history.back(-1);</script>"; exit; }

if(strlen($senha) < "5"){echo "<script>alert('Senha no mÌnimo 5 Caracteres !')</script><script>history.back(-1);</script>"; exit; }

if(strlen($login) < "4"){echo "<script>alert('login no mÌnimo 4 Caracteres !')</script><script>history.back(-1);</script>"; exit; }



//==========================================================================================================================



if($senha != $senha2){ 

echo "<script>alert('Os campos de senha n„o conferem !')</script><script>history.back(-1);</script>"; break; }



//==========================================================================================================================



if(preg_match("/[·‡„ÚÛıÁ¸ÈË¡¿√“”’«‹…»]/i",$email)){

echo "<script>alert('EMAIL Inv·lido !')</script><script>history.back(-1);</script>"; exit; }

if(!preg_match("/[@]/i",$email)){echo "<script>alert('EMAIL Inv·lido !')</script><script>history.back(-1);</script>"; exit; }



//==========================================================================================================================



$senha = base64_encode(md5(($senha)));



//==========================================================================================================================

// Criacao da query SQL para insercao dos dados
	$sql = "INSERT INTO usuarios (nome, nasc, celular, email, login, senha)
						VALUES ('$nome','$nasc','$celular','$email', '$login', '$senha')";
						

	// Usa a funcao de query mysql passando a SQL como argumento
	$retorno = mysql_query($sql);

	// Verifica se os dados foram inseridos na base	
	if($retorno)
		echo "<script>alert('Cadastro Efetuado com Sucesso !')</script><script>history.back(-1);</script>";
	else
		echo "<script>alert('Erro ao Efetuar Cadastro !')</script><script>history.back(-1);</script>";


//==========================================================================================================================

//pagina depois do cadastro



echo "<meta http-equiv='refresh' content='1;url=index.php'>";


}

?>


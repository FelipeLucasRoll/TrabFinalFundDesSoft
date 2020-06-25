
<?php

require("funcoes.php");

error_reporting("E_FATAL");

conexao();
	
$usuario = $_POST['usuario'];

$email  = $_POST['email'];

$consult = "SELECT nome FROM usuarios WHERE login = '$usuario' AND email = '$email' ";

$retorno = mysql_query($consult);
	
$dados = mysql_result($retorno, 0);
	
	if($dados) {
		
	
		echo "Dados foram enviados por email.";

	
	} else {
	
	echo "Usuario e/ou senha invalidos.";
}

?>


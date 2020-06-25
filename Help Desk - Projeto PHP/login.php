<?php

// Reporta somente erros fatais.
error_reporting("E_FATAL");

// Requer que o arquivo funcoes.php exista
require("funcoes.php");

// Verifica se há valor passado por POST para a variavel acao
// Evita que a página execute ao ser acessado diretamente
if( isset($_POST["entrar"])) 
{

	// Chama a funcao para conectar na base de dados
	conexao();

	// Recebe os valores dos inputs do formulario
	$login = $_POST["login"];
	$senha = base64_encode(md5($_POST["senha"]));

	// Criacao da query SQL  para selecao dos dados
	$sql = "SELECT id, nome, nasc, celular, email, login FROM usuarios WHERE login = '$login' AND senha = '$senha' ";
	

	
	// Usa a funcao de query mysql  passando a SQL como argumento
	$retorno = mysql_query($sql);
	$num_regs  = mysql_num_rows($retorno);

 	//for ($i=0;$i<$num_regs;$i++) {
                   $row   = mysql_fetch_row($retorno);
                             $id_usuario  = $row[0];
							 $nome        = $row[1];
                             $nasc        = $row[2];
							 $celular     = $row[3];
                             $email       = $row[4];
							 $login       = $row[5];
		
						
                         
	
	if(!$num_regs) {
		echo "Usuario e/ou senha invalidos.";
		
	} else {

		// A partir daqui a sessao vai iniciar
		session_start();
		
		// Criacao de duas variaveis de sessao
		$_SESSION["id_usuario"] = $id_usuario;
		$_SESSION["nome"]       = $nome;
		$_SESSION["nasc"]       = $nasc;
		$_SESSION["celular"]    = $celular;
		$_SESSION["email"]      = $email;
		$_SESSION["login"]      = $login;
	
		
	
		$_SESSION["idsessao"] = session_id();
		
	header("Location: principal.php");
		
	}
	
}


?>
















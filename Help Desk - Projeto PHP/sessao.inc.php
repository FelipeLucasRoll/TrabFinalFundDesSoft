<?php

session_start();


// Verifica se a variavel de sessao idusuario foi setada
// Se nao estiver setado, manda o usuario para Login
if(!isset($_SESSION["idsessao"]))
	header("Location: index.php");
	

?>
<?php
	
	function conexao() {
	
	// realiza a conexao com o banco de dados MYSQL
	$con = mysql_connect("localhost", "root", "d3e3c3k3");
	if(!$con)
		echo "Conexao Falhou. Causa: ".mysql_error();
		
	// escolher a base de dados
	$base = mysql_select_db("helpdesk");
	if(!$base)
		echo "Erro ao escolher base de dados.";

	}

?>

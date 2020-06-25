<?php

require("sessao.inc.php");

// Destroi a sessao ativa do cliente
session_destroy();

// Manda usuario novamene para a pagina de login
header("Location: index.php");

?>

















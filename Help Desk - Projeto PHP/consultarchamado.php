<?php

require("sessao.inc.php");


include("funcoes.php");

conexao();


$id_usuario = $_SESSION["id_usuario"];

if ($id_usuario != 1){
$sql = "SELECT id, id_usuario, nome, email, celular, assunto, mensagem  FROM chamados WHERE id_usuario = '$id_usuario' ";

$query = mysql_query($sql);

// Insere o início da tabela
echo "<table border='1' align='center' border='1' cellspacing='4' cellpadding='6' cellspacing='3'>";

// Insere o cabeçalho da tabela
echo "<tr align='center'>";
echo "<td><b> CÓDIGO </td>";
echo "<td><b> NOME COMPLETO </td>";
echo "<td><b> EMAIL </td>";
echo "<td><b> CELULAR </td>";
echo "<td><b> ASSUNTO </td>";
echo "<td><b> MENSAGEM </td>";
echo "</tr>";

// Cria o laço de repetição para inserir tantas linhas quanto forem os registros
while($dado = mysql_fetch_array($query))
{
echo "<tr>";
echo "<td>".$dado["id"]."</td>";
echo "<td>".$dado["nome"]."</td>";
echo "<td>".$dado["email"]."</td>";
echo "<td>".$dado["celular"]."</td>";
echo "<td>".$dado["assunto"]."</td>";
echo "<td>".$dado["mensagem"]."</td>";

echo "</tr>";
}

// Insere o fechamento da tabela
echo "</table>";

} 

else {
$sql = "SELECT id, id_usuario, nome, email, celular, assunto, mensagem  FROM chamados "; 

$query = mysql_query($sql);

// Insere o início da tabela
echo "<table border='1' align='center' border='1' cellspacing='4' cellpadding='6' cellspacing='3'>";

// Insere o cabeçalho da tabela
echo "<tr align='center'>";
echo "<td><b> CÓDIGO </td>";
echo "<td><b> NOME COMPLETO </td>";
echo "<td><b> EMAIL </td>";
echo "<td><b> CELULAR </td>";
echo "<td><b> ASSUNTO </td>";
echo "<td><b> MENSAGEM </td>";
echo "</tr>";

// Cria o laço de repetição para inserir tantas linhas quanto forem os registros
while($dado = mysql_fetch_array($query))
{
echo "<tr>";
echo "<td>".$dado["id"]."</td>";
echo "<td>".$dado["nome"]."</td>";
echo "<td>".$dado["email"]."</td>";
echo "<td>".$dado["celular"]."</td>";
echo "<td>".$dado["assunto"]."</td>";
echo "<td>".$dado["mensagem"]."</td>";

echo "</tr>";
}

// Insere o fechamento da tabela
echo "</table>";

?>

<script language="javascript">

function confirmacao() {

    if(confirm('Deseja Realmente !'))
	   return true;
	else
	   return false;
	   
	   

}

</script>

<form action="removerchamado.php" method="post" name="form4" id="form4">
<table border="0" align="center" cellpadding="6" cellspacing="3" >
          <tr>
            <td><span class="style1">Remover ID:</span></td>
            <td><span class="style1">
              <input name="remover" type="text" id="remover" size="10" /> <input type="submit" name="Submit" value="Remover" onclick="return(confirmacao())" />
			  
            </span></td>
         
</table>

 <table border="0" cellpadding="0" cellspacing="0" bgcolor="white" style="border-collapse: collapse; border: 0px solid silver" bordercolor="#111111" align="center">
	  <tr><br>
	  	  <br>
		<td align="center"><a href="principal.php"><img src="imagens/voltar.png" width="50" height="50" border="0"/></a></td>
      </tr>
    </table>

<?php

}

?> 














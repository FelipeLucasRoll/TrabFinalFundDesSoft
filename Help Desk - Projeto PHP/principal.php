
<div align="center">
  <center>
    <table border="0" cellpadding="0" cellspacing="0" bgcolor="white" style="border-collapse: collapse; border: 0px solid silver" bordercolor="#111111" width="900">
    <tr>
      <td width="900" height="128" ><img src="imagens/logoprincipal.jpg" width="900" height="128" /></td>
    </tr>

  </table>
    <table border="0" cellpadding="0" cellspacing="0" bgcolor="white" style="border-collapse: collapse; border: 0px solid silver" bordercolor="#111111" width="900">
      <tr>
        <td width="300" height="10">&nbsp;</td>
        <td width="300" height="10" align="center"><?php

// Requer que o arquivo funcoes.php exista
require("sessao.inc.php");

// Utiliza a variavel de sessao nomeusuario
// Essa variavel dica disponivel em todos as paginas com sessao
echo '<p/><h3><font face="verdana" color="#4476cc"><font color="#000000">&curren;</font>'.$_SESSION["nome"].'<font color="#000000">&curren;</font> <br/><font face="verdana" color="#000000"> Bem Vindo</font></h3>'


?></td>
        <td width="300" height="50">&nbsp;</td>
      </tr>
      <tr>
        <td width="300" height="250"><div align="center"><a href="abrirchamado.php"><img src="imagens/abrirchamado.jpg" width="150" height="166" border="0" /></a></div></td>
        <td width="300" height=""><div align="center"><a href="consultarchamado.php"><img src="imagens/consultarchamado.jpg" alt="" width="193" height="151" border="0" /></a></div></td>
        <td width="300" height="250"><div align="center"><a href="editarperfil.php"><img src="imagens/editarperfil.jpg" width="163" height="152" border="0" /></a></div></td>
      </tr>
      <tr>
        <td align="center">&nbsp;</td>
		<td align="center"><a href="logout.php"><img src="imagens/exitred.png" width="60" height="60" border="0"/></a></td>
		<td align="center">&nbsp;</td>
      </tr>
    </table>
  </center>
</div>














<?php

require("sessao.inc.php");

$nome = $_SESSION["nome"];
$nasc = $_SESSION["nasc"];
$celular = $_SESSION["celular"];
$email = $_SESSION["email"];
$login = $_SESSION["login"];

$nascarray = explode("-", $nasc);
$ano = $nascarray[0]; 
$mes = $nascarray[1];
$dia = $nascarray[2];




 ?>
 
 <script language="javascript">

function confirmacao() {

    if(confirm('Deseja Realmente Remover o Perfil!'))
	   return true;
	else
	   return false;
	   
	   
	   
	   

}

</script>
 
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
.style1 {color: #333333;
		font-size: 12px;}
.style2 {
	color: #FF6600;
	font-weight: bold;
}
body,td,th {
	font-family: Verdana, Arial, Helvetica, sans-serif;
	font-size: 10px;
}
-->
</STYLE><style type="text/css">
<!--
input, button		{font-family: verdana; font-size: 9px; border: 1px solid #E0E0E0; color: #504c50;
}
textarea			{font-family: verdana; font-size: 10px; background-color: #F2F2F2; border: 1px solid #E0E0E0; color: #504c50;
}
form				{font-family: verdana; font-size: 10px
}
htmlarea			{font-family: verdana; font-size: 10px, 12pt; bgcolor="#e8e8e8"; scrollbar-face-color: #e9e9e9; scrollbar-shadow-color: #808080;scrollbar-highlight-color:#ffffff;scrollbar-3dlight-color: #808080;scrollbar-darkshadow-color:#ffffff;scrollbar-track-color:#dbdbdb;scrollbar-arrow-color:#336699
}
select				{font-family: verdana; font-size: 10px; border: 1px solid #E0E0E0; color: #504c50;
}
#Layer1 {
	position:absolute;
	left:40px;
	top:72px;
	width:820px;
	height:26px;
	z-index:1;
}
body,td,th {
	font-size: 10px;
}
.style28 {font-size: 20px}
.style29 {color: #333333}
-->
</style><body>
<form action="perfileditado.php" method="post" name="form2" id="form2">
  <p align="center" class="style2 style28">:: Editar Perfil ::<br>
  Sistema Help Desk </p>
  <div align="left">
    <table width="500px" border="1" cellspacing="4" align="center">
      <tr>
        <td><div align="left">
            <blockquote>
              <blockquote>
                <p>&nbsp;</p>
              </blockquote>
            </blockquote>
          </div>
          <table border="0" align="center" cellpadding="6" cellspacing="3" >
          <tr>
            <td width="32%"><span class="style1">Nome Completo:</span></td>
            <td width="68%"><span class="style1">
              <input name="nome" type="text" id="nome" size="38" value="<?php echo $nome ?>" />
            </span></td>
          </tr>
          <tr>
            <td><span class="style1">Data de Nasc.:</span></td>
            <td><span class="style1">Dia:
                <input name="dia" type="text" id="dia" size="2" value="<?php echo $dia ?>" />
                M&ecirc;s:
                <input name="mes" type="text" id="mes" size="2" value="<?php echo $mes ?>" />
              Ano:
              <input name="ano" type="text" id="ano" size="4" value="<?php echo $ano ?>" />
            </span></td>
          </tr>
          <tr>
            <td><span class="style1">Celular:</span></td>
            <td><span class="style1">
              <input name="celular" type="text" id="celular" value="<?php echo $celular ?>" />
            </span></td>
          </tr>
          <tr>
            <td><span class="style1">E-mail:</span></td>
            <td><span class="style1">
              <input name="email" type="text" id="email" size="38" value="<?php echo $email ?>" />
            </span></td>
          </tr>
          <tr>
            <td><span class="style1">Login:</span></td>
            <td><span class="style1">
              <input name="login" type="text" id="login" value="<?php echo $login ?>"/>
                <font size="1" face="Arial, Helvetica, sans-serif">M&iacute;nimo                    </font></span><span class="style29"><font size="1" face="Arial, Helvetica, sans-serif">4</font></span><span class="style1"><font size="1" face="Arial, Helvetica, sans-serif"> caracteres</font></span></td>
          </tr>
          <tr>
            <td><span class="style1">Senha:</span></td>
            <td><span class="style1">
              <input name="senha" type="password" id="senha" size="12"   />
              <font size="1" face="Arial, Helvetica, sans-serif">M&iacute;nimo 5 caracteres</font></span></td>
          </tr>
          <tr>
            <td><span class="style1">Senha Novamente:</span></td>
            <td><span class="style1">
              <input name="senha2" type="password" id="senha2" size="12" />
            </span></td>
          </tr>
          <tr>
            <td>&nbsp;</td>
            <td><span class="style1">
              <input type="submit" name="Submit" value="Alterar" />
			</span></td>
          </tr>
        </table></td>
      </tr>
    </table>
    <br />
  </div>
	   <table border="0" cellpadding="0" cellspacing="0" bgcolor="white" style="border-collapse: collapse; border: 0px solid silver" bordercolor="#111111" align="center">
	  <tr>
        <td align="center">&nbsp;</td>
		<td align="center"><a href="principal.php"><img src="imagens/voltar.png" width="50" height="50" border="0"/></a></td>
		
		<td align="center">&nbsp;</td><td align="center">&nbsp;</td><td align="center">&nbsp;</td><td align="center">&nbsp;</td>
		<td align="center">&nbsp;</td><td align="center">&nbsp;</td><td align="center">&nbsp;</td><td align="center">&nbsp;</td>
		<td align="center">&nbsp;</td><td align="center">&nbsp;</td><td align="center">&nbsp;</td><td align="center">&nbsp;</td>
		<td align="center">&nbsp;</td><td align="center">&nbsp;</td><td align="center">&nbsp;</td><td align="center">&nbsp;</td>
		<td align="center">&nbsp;</td><td align="center">&nbsp;</td><td align="center">&nbsp;</td><td align="center">&nbsp;</td>
		<td align="center">&nbsp;</td><td align="center">&nbsp;</td><td align="center">&nbsp;</td><td align="center">&nbsp;</td>
		
		
		<td align="center"><a href="removerperfil.php" onClick="return(confirmacao())"><img src="imagens/lixeira.png" width="90" height="90" border="0"/></a></td>
		<td align="center">&nbsp;</td>
      </tr>
    </table>
</form>

<?php

// Requer que o arquivo funcoes.php exista
require("sessao.inc.php");

$nome = $_SESSION["nome"];
$email = $_SESSION["email"];
$celular = $_SESSION["celular"];

?>
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
-->
</style><body>
<form action="chamadoaberto.php" method="post" name="form3" id="form3">
  <p align="center" class="style2 style28">:: Abertura de Chamado::<br>
  Sistema Help Desk </p>
  <div align="left">
    <table width="500px" border="1" cellspacing="4" align="center">
      <tr>
        <td><div align="center" size="1" color="silver">
            <blockquote>
              <blockquote>
                <p><font color="#FF0000">&raquo;</font>&nbsp;Se os dados estiverem incorretos <a href="editarperfil.php">clique aqui</a> &nbsp;<font color="#FF0000">&laquo;</font></p>
              </blockquote>
            </blockquote>
          </div>
          <table width="374" border="0" align="center" cellpadding="7" cellspacing="" >
		  <tr>
             <td width="32%"><span class="style1">Nome: </span></td>
            <td width="68%"><span class="style1">
              <input name="nome"  readonly="readonly" type="text" id="nome" size="38" value="<?php echo $nome ?>"/>
            </span></td>
          </tr>
          <tr>
            <td><span class="style1">E-mail:</span></td>
            <td><span class="style1">
              <input name="email"  readonly="readonly"  type="text" id="email" size="38" value="<?php echo $email ?>" />
            </span></td>
          </tr>
          <tr>
            <td><span class="style1">Celular:</span></td>
            <td><span class="style1">
              <input name="celular"  readonly="readonly" type="text" id="celular" size="38" value="<?php echo $celular ?>" />
            </span></td>
          </tr>
          
		  <tr>
            <td><span class="style1">Assunto:</span></td>
			<td>
			<select class="campos" name="assunto">
			<option value="Selecione uma op&ccedil;&atilde;o" selected>Selecione uma op&ccedil;&atilde;o</option>
			<option value="Hardware">Hardware (pe&ccedil;as)</option>
			<option value="Software">Software (programas)</option>
			<option value="Outros">Outros</option>
			</select>			
			</td>
          </tr>
		  
		  <tr>
			  <td><span class="style1">Mensagem:</span></td>
			  <td><textarea class="campos" name="mensagem" cols="45" rows="7"></textarea></td>
		  </tr>
			  <td></td>
           
			    <td align="right"><span class="style1">
              <input type="submit" name="Submit" id="Submit" value="Enviar" />
			  <input type="reset" name="Reset" value="Limpar" />            
			  </span></td>
          </tr>
        </table>
		</td>
      </tr>
    </table>
	 <table border="0" cellpadding="0" cellspacing="0" bgcolor="white" style="border-collapse: collapse; border: 0px solid silver" bordercolor="#111111" align="center">
	  <tr><br>
	  	  <br>
		<td align="center"><a href="principal.php"><img src="imagens/voltar.png" width="50" height="50" border="0"/></a></td>
      </tr>
    </table>
    <br />
  </div>
</form>

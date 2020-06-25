<?php
if(isset($email)){if(eregi("^([a-z0-9_]|\\-|\\.)+@(([a-z0-9_]|\\-)+\\.)+[a-z]{2,4}$",$email)){echo '<b>E-mail válido</b>';}else{echo "<b>E-mail invalido</b>";}}
?>
<form method="post" action="<?=$PHP_SELF;?>">
  <p>Valida&ccedil;&atilde;o simples de e-mail: esse script verifica se o e-mail 
    digitado est&aacute; no formato v&aacute;lido (usuario@host.xxx.xx).</p>
  <p>Digite o e-mail a ser validado: 
    <input name="email" type="text" id="email">
    <input type="submit" value="Validar">
  </p>
</form>
<p>Leonardo Monteiro<br>
  <a href="http://www.mixgames.cjb.net" target="_top">http://www.mixgames.cjb.net</a></p>

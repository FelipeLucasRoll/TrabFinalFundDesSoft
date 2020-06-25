<?



include "../top.html";
print "<br><br><br><br><br>";
if ($refid == '') {print "<p><font color='#FF0000'><b>O campo matricula é obrigatório !&nbsp;</b></font></p>";}
if ($chkd_email != "" or $refid == '') {print "<b><font color='#FF0000'>Já existe um usuário com esse nome
ou você esqueceu de colocá-lo!</font></b>";}
if ($email == '') {print "<p><font color='#FF0000'><b>O campo email é obrigatório !&nbsp;</b></font></p>";}
if ($pass == '') {print "<p><font color='#FF0000'><b>O campo senha é obrigatório !</b></font></p>";}
print "
<p><br>Por favor clique na seta voltar na parte superior de seu navegador para
acertar seu cadastro.<br><br><br><br><br></p>
"; 
        

 
include "../fot.html"; 
?>
<?



include "../top.html";
print "<br><br><br><br><br>";
if ($refid == '') {print "<p><font color='#FF0000'><b>O campo matricula � obrigat�rio !&nbsp;</b></font></p>";}
if ($chkd_email != "" or $refid == '') {print "<b><font color='#FF0000'>J� existe um usu�rio com esse nome
ou voc� esqueceu de coloc�-lo!</font></b>";}
if ($email == '') {print "<p><font color='#FF0000'><b>O campo email � obrigat�rio !&nbsp;</b></font></p>";}
if ($pass == '') {print "<p><font color='#FF0000'><b>O campo senha � obrigat�rio !</b></font></p>";}
print "
<p><br>Por favor clique na seta voltar na parte superior de seu navegador para
acertar seu cadastro.<br><br><br><br><br></p>
"; 
        

 
include "../fot.html"; 
?>
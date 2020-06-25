<?

/*
Script: Portal da Balada versão 1.0
Autor: Empresa: portaldabalada.com
Site: http://www.portaldabalada.com/  E-mail: portaldabalada@portaldabalada.com.br
Copyright: Não pode ser revendido. Você pode apenas modificar para uso próprio.
Proibido remover este cabeçalho
*/


 include "config.php"; 
 

        mysql_connect($server, $db_user, $db_pass) or die ("Database CONNECT Error (line 18)"); 
  $result = mysql_db_query($database, "select * from escola_aluno where email = '$mail'") or die ("Database INSERT Error (line 19)"); 

    if (mysql_num_rows($result)) {
    while ($qry = mysql_fetch_array($result)) { 




  $msg = "Prezado(a) $qry[nome],
  
  Seus dados são:
  Usuário: $qry[refid]
  Senha: $qry[pass]
  
  Para acessar clique no link abaixo:
  http://$domain/user/index.php?userid=$qry[refid]&password=$qry[pass]
  
  ";
  
   Mail("$mail", "Lembrete de Senha !", "$msg", "From: $emailescola"); 
}}

      
    
    
       

    print "<meta http-equiv='REFRESH'   content='0; URL=index.php'>";  
      
      ?>
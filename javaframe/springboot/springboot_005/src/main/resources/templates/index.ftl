<!DOCTYPE html>
<html>
   <head lang="en">
    <meta charset="utf-8">
       <title></title>
   </head>
   <body>
      ${name}
      
      <#if sex==1>
                       ��
      <#elseif sex==2>
                    Ů
      <#else>
                  ����
      </#if>
      
      <#list userList as user>
         ${user}
      </#list>                               
   </body>
</html>
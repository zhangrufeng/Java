<!DOCTYPE html>
<html>
   <head lang="en">
    <meta charset="utf-8">
       <title></title>
   </head>
   <body>
      ${name}
      
      <#if sex==1>
                       ÄÐ
      <#elseif sex==2>
                    Å®
      <#else>
                  ÆäËû
      </#if>
      
      <#list userList as user>
         ${user}
      </#list>                               
   </body>
</html>
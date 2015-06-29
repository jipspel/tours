program(class, locals_limit, stack_limit, body) ::= <<
.class public <class>
.super java/lang/Object

.method public \<init>()V
    aload_0
    invokenonvirtual java/lang/Object/\<init>()V
    return
.end method

.method public static main([Ljava/lang/String;)V
    .limit locals <locals_limit>
    .limit stack <stack_limit>
    <body>
    return
.end method
>>

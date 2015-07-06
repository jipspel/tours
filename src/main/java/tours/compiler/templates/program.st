program(class, locals_limit, stack_limit, main, functions) ::= <<
.class public <class>
.super java/lang/Object

.method public \<init>()V
    aload_0
    invokenonvirtual java/lang/Object/\<init>()V
    return
.end method

<functions; separator="\n">

.method public static main([Ljava/lang/String;)V
    .limit locals <locals_limit>
    .limit stack <stack_limit>
    <main>
    return
.end method
>>
